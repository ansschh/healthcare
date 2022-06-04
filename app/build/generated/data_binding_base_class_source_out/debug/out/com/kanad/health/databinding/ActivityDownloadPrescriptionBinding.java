// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDownloadPrescriptionBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout empty3;

  @NonNull
  public final RecyclerView rcvfordownloadlink;

  @NonNull
  public final ImageView seedoctors;

  private ActivityDownloadPrescriptionBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout empty3, @NonNull RecyclerView rcvfordownloadlink,
      @NonNull ImageView seedoctors) {
    this.rootView = rootView;
    this.empty3 = empty3;
    this.rcvfordownloadlink = rcvfordownloadlink;
    this.seedoctors = seedoctors;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDownloadPrescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDownloadPrescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_download_prescription, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDownloadPrescriptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.empty3;
      LinearLayout empty3 = ViewBindings.findChildViewById(rootView, id);
      if (empty3 == null) {
        break missingId;
      }

      id = R.id.rcvfordownloadlink;
      RecyclerView rcvfordownloadlink = ViewBindings.findChildViewById(rootView, id);
      if (rcvfordownloadlink == null) {
        break missingId;
      }

      id = R.id.seedoctors___;
      ImageView seedoctors = ViewBindings.findChildViewById(rootView, id);
      if (seedoctors == null) {
        break missingId;
      }

      return new ActivityDownloadPrescriptionBinding((LinearLayout) rootView, empty3,
          rcvfordownloadlink, seedoctors);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
