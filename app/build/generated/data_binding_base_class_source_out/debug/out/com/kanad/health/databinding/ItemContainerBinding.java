// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContainerBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton delete3R;

  @NonNull
  public final AutoCompleteTextView e1R;

  @NonNull
  public final AutoCompleteTextView s1R;

  @NonNull
  public final TextView slotname;

  @NonNull
  public final TextView to;

  private ItemContainerBinding(@NonNull CardView rootView, @NonNull ImageButton delete3R,
      @NonNull AutoCompleteTextView e1R, @NonNull AutoCompleteTextView s1R,
      @NonNull TextView slotname, @NonNull TextView to) {
    this.rootView = rootView;
    this.delete3R = delete3R;
    this.e1R = e1R;
    this.s1R = s1R;
    this.slotname = slotname;
    this.to = to;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_container, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContainerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete3_r;
      ImageButton delete3R = ViewBindings.findChildViewById(rootView, id);
      if (delete3R == null) {
        break missingId;
      }

      id = R.id.e1_r;
      AutoCompleteTextView e1R = ViewBindings.findChildViewById(rootView, id);
      if (e1R == null) {
        break missingId;
      }

      id = R.id.s1_r;
      AutoCompleteTextView s1R = ViewBindings.findChildViewById(rootView, id);
      if (s1R == null) {
        break missingId;
      }

      id = R.id.slotname;
      TextView slotname = ViewBindings.findChildViewById(rootView, id);
      if (slotname == null) {
        break missingId;
      }

      id = R.id.to;
      TextView to = ViewBindings.findChildViewById(rootView, id);
      if (to == null) {
        break missingId;
      }

      return new ItemContainerBinding((CardView) rootView, delete3R, e1R, s1R, slotname, to);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}