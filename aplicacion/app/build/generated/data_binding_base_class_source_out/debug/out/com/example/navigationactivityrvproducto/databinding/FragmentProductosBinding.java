// Generated by view binder compiler. Do not edit!
package com.example.navigationactivityrvproducto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.navigationactivityrvproducto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProductosBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnComprar;

  @NonNull
  public final RecyclerView reV;

  private FragmentProductosBinding(@NonNull FrameLayout rootView, @NonNull Button btnComprar,
      @NonNull RecyclerView reV) {
    this.rootView = rootView;
    this.btnComprar = btnComprar;
    this.reV = reV;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProductosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProductosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_productos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProductosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnComprar;
      Button btnComprar = ViewBindings.findChildViewById(rootView, id);
      if (btnComprar == null) {
        break missingId;
      }

      id = R.id.reV;
      RecyclerView reV = ViewBindings.findChildViewById(rootView, id);
      if (reV == null) {
        break missingId;
      }

      return new FragmentProductosBinding((FrameLayout) rootView, btnComprar, reV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}