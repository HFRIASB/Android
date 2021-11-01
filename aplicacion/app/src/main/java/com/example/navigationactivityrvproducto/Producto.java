package com.example.navigationactivityrvproducto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;


public class Producto {

    String txtNombreProducto, imgProducto, codigoProducto;
    int edtCantidad;
    private String dato;
    Bitmap imagen;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;

        try {
            byte[] byteCode= Base64.decode(dato,Base64.DEFAULT);
            this.imagen= BitmapFactory.decodeByteArray(byteCode,0,byteCode.length);

           /* int alto=100;//alto en pixeles
            int ancho=100;//ancho en pixeles

            Bitmap foto=BitmapFactory.decodeByteArray(byteCode,0,byteCode.length);
            this.imagen=Bitmap.createScaledBitmap(foto,alto,ancho,true);*/


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public String getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public void setTxtNombreProducto(String txtNombreProducto) {
        this.txtNombreProducto = txtNombreProducto;
    }


    public int getEdtCantidad() {
        return edtCantidad;
    }

    public void setEdtCantidad(int edtCantidad) {
        this.edtCantidad = edtCantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

}
