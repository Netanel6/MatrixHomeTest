// Generated by view binder compiler. Do not edit!
package com.example.matrixhomeassignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.matrixhomeassignment.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FruitSingleCellBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView fruitImageContainer;

  @NonNull
  public final ImageView fruitImageView;

  @NonNull
  public final TextView fruitNameText;

  @NonNull
  public final ConstraintLayout itemSingleCell;

  private FruitSingleCellBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView fruitImageContainer, @NonNull ImageView fruitImageView,
      @NonNull TextView fruitNameText, @NonNull ConstraintLayout itemSingleCell) {
    this.rootView = rootView;
    this.fruitImageContainer = fruitImageContainer;
    this.fruitImageView = fruitImageView;
    this.fruitNameText = fruitNameText;
    this.itemSingleCell = itemSingleCell;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FruitSingleCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FruitSingleCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fruit_single_cell, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FruitSingleCellBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fruit_image_container;
      CardView fruitImageContainer = ViewBindings.findChildViewById(rootView, id);
      if (fruitImageContainer == null) {
        break missingId;
      }

      id = R.id.fruit_image_view;
      ImageView fruitImageView = ViewBindings.findChildViewById(rootView, id);
      if (fruitImageView == null) {
        break missingId;
      }

      id = R.id.fruit_name_text;
      TextView fruitNameText = ViewBindings.findChildViewById(rootView, id);
      if (fruitNameText == null) {
        break missingId;
      }

      ConstraintLayout itemSingleCell = (ConstraintLayout) rootView;

      return new FruitSingleCellBinding((ConstraintLayout) rootView, fruitImageContainer,
          fruitImageView, fruitNameText, itemSingleCell);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
