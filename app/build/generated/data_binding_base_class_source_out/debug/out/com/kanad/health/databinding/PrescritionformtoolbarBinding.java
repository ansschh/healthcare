// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class PrescritionformtoolbarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView nameontop;

  @NonNull
  public final RelativeLayout relativeLayoutProfile;

  private PrescritionformtoolbarBinding(@NonNull RelativeLayout rootView, @NonNull ImageView back,
      @NonNull TextView nameontop, @NonNull RelativeLayout relativeLayoutProfile) {
    this.rootView = rootView;
    this.back = back;
    this.nameontop = nameontop;
    this.relativeLayoutProfile = relativeLayoutProfile;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PrescritionformtoolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PrescritionformtoolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.prescritionformtoolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PrescritionformtoolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.nameontop;
      TextView nameontop = ViewBindings.findChildViewById(rootView, id);
      if (nameontop == null) {
        break missingId;
      }

      id = R.id.relative_layout_profile;
      RelativeLayout relativeLayoutProfile = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayoutProfile == null) {
        break missingId;
      }

      return new PrescritionformtoolbarBinding((RelativeLayout) rootView, back, nameontop,
          relativeLayoutProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
