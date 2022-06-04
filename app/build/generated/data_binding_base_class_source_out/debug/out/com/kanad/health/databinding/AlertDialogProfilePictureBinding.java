// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AlertDialogProfilePictureBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView alertVideCamera;

  @NonNull
  public final ImageView alertVideGallery;

  private AlertDialogProfilePictureBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView alertVideCamera, @NonNull ImageView alertVideGallery) {
    this.rootView = rootView;
    this.alertVideCamera = alertVideCamera;
    this.alertVideGallery = alertVideGallery;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AlertDialogProfilePictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AlertDialogProfilePictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.alert_dialog_profile_picture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AlertDialogProfilePictureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alertVide_camera;
      ImageView alertVideCamera = ViewBindings.findChildViewById(rootView, id);
      if (alertVideCamera == null) {
        break missingId;
      }

      id = R.id.alertVide_gallery;
      ImageView alertVideGallery = ViewBindings.findChildViewById(rootView, id);
      if (alertVideGallery == null) {
        break missingId;
      }

      return new AlertDialogProfilePictureBinding((LinearLayout) rootView, alertVideCamera,
          alertVideGallery);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}