package com.example.navigationactivityrvproducto;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/*
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_productos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_productos extends Fragment implements Response.ErrorListener, Response.Listener<JSONObject> {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView imgProducto;

    RecyclerView recyclerProductos;
    ArrayList<Producto> listaProductos;

    ProgressDialog progress;

    RequestQueue request;

    JsonObjectRequest jsonObjectRequest;


    public fragment_productos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_productos.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_productos newInstance(String param1, String param2) {
        fragment_productos fragment = new fragment_productos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View vista=inflater.inflate(R.layout.fragment_productos, container, false);

       listaProductos=new ArrayList<>();

       recyclerProductos=(RecyclerView) vista.findViewById(R.id.reV);
       recyclerProductos.setLayoutManager(new LinearLayoutManager(this.getContext()));
       recyclerProductos.setHasFixedSize(true);

       request = Volley.newRequestQueue(getContext());
       llenarLista();
        return vista;
    }

    private void llenarLista() {
       progress=new ProgressDialog(getContext());
       progress.setMessage("Actualizando...");
       progress.show();

        //String url="http://192.168.43.143:80/WebPHP/cunsultar_lista_producto.php";//celular
        String url="http://192.168.1.80:80/WebPHP/cunsultar_lista_producto.php";//casa


        jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null,this,this);
        request.add(jsonObjectRequest);
    }
    public void onErrorResponse(VolleyError error){
        Toast.makeText(getContext(),"No se puede conectar"+ error.toString(), Toast.LENGTH_LONG).show();
        System.out.println();
        Log.d("ERROR: ", error.toString());
        progress.hide();
    }
    public void onResponse(JSONObject response){
        Producto producto=null;


        JSONArray json=response.optJSONArray("producto");

       try {
           for (int i = 0; i < json.length(); i++) {
               producto = new Producto();//clase producto
               JSONObject jsonObject = null;
               jsonObject = json.getJSONObject(i);

               producto.setTxtNombreProducto(jsonObject.optString("nombreProducto"));
               producto.setDato(jsonObject.optString("imagen"));

               listaProductos.add(producto);
           }
           progress.hide();
           Adapter adapter=new Adapter(listaProductos);
           recyclerProductos.setAdapter(adapter);

       }catch (JSONException e) {
           e.printStackTrace();
           Toast.makeText(getContext(),"No se ha podiddo establecer conexion con el servidor"+" "+ response, Toast.LENGTH_LONG).show();
           progress.hide();
       }

    }
}