// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SendprescriptiontoolbarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView back;

  @NonNull
  public final RelativeLayout relativeLayoutProfile;

  private SendprescriptiontoolbarBinding(@NonNull RelativeLayout rootView, @NonNull TextView back,
      @NonNull RelativeLayout relativeLayoutProfile) {
    this.rootView = rootView;
    this.back = back;
    this.relativeLayoutProfile = relativeLayoutProfile;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SendprescriptiontoolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SendprescriptiontoolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sendprescriptiontoolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SendprescriptiontoolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      TextView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.relative_layout_profile;
      RelativeLayout relativeLayoutProfile = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayoutProfile == null) {
        break missingId;
      }

      return new SendprescriptiontoolbarBinding((RelativeLayout) rootView, back,
          relativeLayoutProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
