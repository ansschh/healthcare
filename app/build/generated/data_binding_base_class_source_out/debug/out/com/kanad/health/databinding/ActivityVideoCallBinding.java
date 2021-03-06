// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVideoCallBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final VideocalltoolbarBinding include;

  @NonNull
  public final Button joinmeeting;

  @NonNull
  public final EditText secretcode;

  @NonNull
  public final Button share;

  private ActivityVideoCallBinding(@NonNull ConstraintLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull VideocalltoolbarBinding include,
      @NonNull Button joinmeeting, @NonNull EditText secretcode, @NonNull Button share) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.include = include;
    this.joinmeeting = joinmeeting;
    this.secretcode = secretcode;
    this.share = share;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVideoCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVideoCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_video_call, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVideoCallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animation_view;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      VideocalltoolbarBinding binding_include = VideocalltoolbarBinding.bind(include);

      id = R.id.joinmeeting;
      Button joinmeeting = ViewBindings.findChildViewById(rootView, id);
      if (joinmeeting == null) {
        break missingId;
      }

      id = R.id.secretcode;
      EditText secretcode = ViewBindings.findChildViewById(rootView, id);
      if (secretcode == null) {
        break missingId;
      }

      id = R.id.share;
      Button share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      return new ActivityVideoCallBinding((ConstraintLayout) rootView, animationView,
          binding_include, joinmeeting, secretcode, share);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
