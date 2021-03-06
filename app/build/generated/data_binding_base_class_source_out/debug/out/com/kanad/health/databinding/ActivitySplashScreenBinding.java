// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final TextView app;

  @NonNull
  public final LottieAnimationView lottieAnimationView;

  private ActivitySplashScreenBinding(@NonNull LinearLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull TextView app,
      @NonNull LottieAnimationView lottieAnimationView) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.app = app;
    this.lottieAnimationView = lottieAnimationView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animation_view;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.app;
      TextView app = ViewBindings.findChildViewById(rootView, id);
      if (app == null) {
        break missingId;
      }

      id = R.id.lottieAnimationView;
      LottieAnimationView lottieAnimationView = ViewBindings.findChildViewById(rootView, id);
      if (lottieAnimationView == null) {
        break missingId;
      }

      return new ActivitySplashScreenBinding((LinearLayout) rootView, animationView, app,
          lottieAnimationView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
