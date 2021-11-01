package com.example.navigationactivityrvproducto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MiViewholder> {

    //private Context miCtext;
    List<Producto> listaProductos;

    public Adapter(List<Producto>listaProductos){
        this.listaProductos =listaProductos;
    }

    @NonNull
    @Override
    public MiViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista=LayoutInflater.from(parent.getContext()).inflate(R.layout.listar,parent,false);
        RecyclerView.LayoutParams layoutParams=new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new MiViewholder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewholder holder, int position) {

    holder.txtNombreProducto.setText(listaProductos.get(position).getTxtNombreProducto().toString());

    if (listaProductos.get(position).getImagen()!=null){
        holder.imagen.setImageBitmap(listaProductos.get(position).getImagen());
    }else{
        holder.imagen.setImageResource(R.drawable.barril_m);
    }


    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }
    public class MiViewholder extends RecyclerView.ViewHolder {
        TextView txtNombreProducto;
        ImageView imagen;
        EditText edtCantidad;


        public MiViewholder(@NonNull View itemView) {
            super(itemView);

            txtNombreProducto=(TextView) itemView.findViewById(R.id.txtNombreProducto);
            imagen= (ImageView) itemView.findViewById(R.id.imgProducto);
            edtCantidad=(EditText) itemView.findViewById(R.id.edtCantidad);
        }
    }
}
