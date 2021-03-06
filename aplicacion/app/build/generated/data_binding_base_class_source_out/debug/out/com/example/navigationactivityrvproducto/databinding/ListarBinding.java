// Generated by view binder compiler. Do not edit!
package com.example.navigationactivityrvproducto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.navigationactivityrvproducto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtCantidad;

  @NonNull
  public final ImageView imgProducto;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView txtCantidad;

  @NonNull
  public final TextView txtNombreProducto;

  private ListarBinding(@NonNull LinearLayout rootView, @NonNull EditText edtCantidad,
      @NonNull ImageView imgProducto, @NonNull LinearLayout linearLayout,
      @NonNull TextView txtCantidad, @NonNull TextView txtNombreProducto) {
    this.rootView = rootView;
    this.edtCantidad = edtCantidad;
    this.imgProducto = imgProducto;
    this.linearLayout = linearLayout;
    this.txtCantidad = txtCantidad;
    this.txtNombreProducto = txtNombreProducto;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.listar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtCantidad;
      EditText edtCantidad = ViewBindings.findChildViewById(rootView, id);
      if (edtCantidad == null) {
        break missingId;
      }

      id = R.id.imgProducto;
      ImageView imgProducto = ViewBindings.findChildViewById(rootView, id);
      if (imgProducto == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.txtCantidad;
      TextView txtCantidad = ViewBindings.findChildViewById(rootView, id);
      if (txtCantidad == null) {
        break missingId;
      }

      id = R.id.txtNombreProducto;
      TextView txtNombreProducto = ViewBindings.findChildViewById(rootView, id);
      if (txtNombreProducto == null) {
        break missingId;
      }

      return new ListarBinding((LinearLayout) rootView, edtCantidad, imgProducto, linearLayout,
          txtCantidad, txtNombreProducto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
