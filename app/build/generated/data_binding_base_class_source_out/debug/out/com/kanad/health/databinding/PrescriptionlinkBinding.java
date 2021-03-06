// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
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

public final class PrescriptionlinkBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button downloadbutton;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView tvdate;

  private PrescriptionlinkBinding(@NonNull CardView rootView, @NonNull Button downloadbutton,
      @NonNull LinearLayout linearLayout, @NonNull TextView tvdate) {
    this.rootView = rootView;
    this.downloadbutton = downloadbutton;
    this.linearLayout = linearLayout;
    this.tvdate = tvdate;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PrescriptionlinkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrescriptionlinkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prescriptionlink, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrescriptionlinkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.downloadbutton;
      Button downloadbutton = ViewBindings.findChildViewById(rootView, id);
      if (downloadbutton == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.tvdate;
      TextView tvdate = ViewBindings.findChildViewById(rootView, id);
      if (tvdate == null) {
        break missingId;
      }

      return new PrescriptionlinkBinding((CardView) rootView, downloadbutton, linearLayout, tvdate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
