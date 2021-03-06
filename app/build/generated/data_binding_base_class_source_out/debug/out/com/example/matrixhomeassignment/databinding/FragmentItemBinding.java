// Generated by view binder compiler. Do not edit!
package com.example.matrixhomeassignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.matrixhomeassignment.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CircleImageView backBtn;

  @NonNull
  public final TextView itemDesc;

  @NonNull
  public final TextView itemName;

  @NonNull
  public final CircleImageView itemPicture;

  @NonNull
  public final TextView itemPrice;

  private FragmentItemBinding(@NonNull ConstraintLayout rootView, @NonNull CircleImageView backBtn,
      @NonNull TextView itemDesc, @NonNull TextView itemName, @NonNull CircleImageView itemPicture,
      @NonNull TextView itemPrice) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.itemDesc = itemDesc;
    this.itemName = itemName;
    this.itemPicture = itemPicture;
    this.itemPrice = itemPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      CircleImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.item_desc;
      TextView itemDesc = ViewBindings.findChildViewById(rootView, id);
      if (itemDesc == null) {
        break missingId;
      }

      id = R.id.item_name;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.item_picture;
      CircleImageView itemPicture = ViewBindings.findChildViewById(rootView, id);
      if (itemPicture == null) {
        break missingId;
      }

      id = R.id.item_price;
      TextView itemPrice = ViewBindings.findChildViewById(rootView, id);
      if (itemPrice == null) {
        break missingId;
      }

      return new FragmentItemBinding((ConstraintLayout) rootView, backBtn, itemDesc, itemName,
          itemPicture, itemPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
