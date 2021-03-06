// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutSectionForReportBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView aboutdisease;

  @NonNull
  public final TextView intenttogooglw;

  @NonNull
  public final ImageButton stoptexttospeech;

  @NonNull
  public final ImageButton texttospeechbutton;

  @NonNull
  public final YouTubePlayerView youtubePlayer;

  private FragmentAboutSectionForReportBinding(@NonNull FrameLayout rootView,
      @NonNull TextView aboutdisease, @NonNull TextView intenttogooglw,
      @NonNull ImageButton stoptexttospeech, @NonNull ImageButton texttospeechbutton,
      @NonNull YouTubePlayerView youtubePlayer) {
    this.rootView = rootView;
    this.aboutdisease = aboutdisease;
    this.intenttogooglw = intenttogooglw;
    this.stoptexttospeech = stoptexttospeech;
    this.texttospeechbutton = texttospeechbutton;
    this.youtubePlayer = youtubePlayer;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutSectionForReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutSectionForReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about_section_for_report, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutSectionForReportBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.aboutdisease;
      TextView aboutdisease = ViewBindings.findChildViewById(rootView, id);
      if (aboutdisease == null) {
        break missingId;
      }

      id = R.id.intenttogooglw;
      TextView intenttogooglw = ViewBindings.findChildViewById(rootView, id);
      if (intenttogooglw == null) {
        break missingId;
      }

      id = R.id.stoptexttospeech;
      ImageButton stoptexttospeech = ViewBindings.findChildViewById(rootView, id);
      if (stoptexttospeech == null) {
        break missingId;
      }

      id = R.id.texttospeechbutton;
      ImageButton texttospeechbutton = ViewBindings.findChildViewById(rootView, id);
      if (texttospeechbutton == null) {
        break missingId;
      }

      id = R.id.youtube_player;
      YouTubePlayerView youtubePlayer = ViewBindings.findChildViewById(rootView, id);
      if (youtubePlayer == null) {
        break missingId;
      }

      return new FragmentAboutSectionForReportBinding((FrameLayout) rootView, aboutdisease,
          intenttogooglw, stoptexttospeech, texttospeechbutton, youtubePlayer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
