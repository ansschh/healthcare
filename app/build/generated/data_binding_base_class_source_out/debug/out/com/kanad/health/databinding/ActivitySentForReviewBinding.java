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
import com.airbnb.lottie.LottieAnimationView;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySentForReviewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final TextView appid;

  @NonNull
  public final TextView gotohomescreen;

  private ActivitySentForReviewBinding(@NonNull RelativeLayout rootView,
      @NonNull LottieAnimationView animationView, @NonNull TextView appid,
      @NonNull TextView gotohomescreen) {
    this.rootView = rootView;
    this.animationView = animationView;
    this.appid = appid;
    this.gotohomescreen = gotohomescreen;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySentForReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySentForReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sent_for_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySentForReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.animation_view;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.appid;
      TextView appid = ViewBindings.findChildViewById(rootView, id);
      if (appid == null) {
        break missingId;
      }

      id = R.id.gotohomescreen;
      TextView gotohomescreen = ViewBindings.findChildViewById(rootView, id);
      if (gotohomescreen == null) {
        break missingId;
      }

      return new ActivitySentForReviewBinding((RelativeLayout) rootView, animationView, appid,
          gotohomescreen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
