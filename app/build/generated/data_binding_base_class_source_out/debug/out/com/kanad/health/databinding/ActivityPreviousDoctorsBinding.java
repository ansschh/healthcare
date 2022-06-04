// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPreviousDoctorsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView doctorListPrevious;

  @NonNull
  public final TextView dummyForDistrict;

  @NonNull
  public final TextView dummyForState;

  @NonNull
  public final LinearLayout empty2;

  @NonNull
  public final ImageView seedoctors;

  private ActivityPreviousDoctorsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView doctorListPrevious, @NonNull TextView dummyForDistrict,
      @NonNull TextView dummyForState, @NonNull LinearLayout empty2,
      @NonNull ImageView seedoctors) {
    this.rootView = rootView;
    this.doctorListPrevious = doctorListPrevious;
    this.dummyForDistrict = dummyForDistrict;
    this.dummyForState = dummyForState;
    this.empty2 = empty2;
    this.seedoctors = seedoctors;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPreviousDoctorsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPreviousDoctorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_previous_doctors, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPreviousDoctorsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.doctor_list_previous;
      RecyclerView doctorListPrevious = ViewBindings.findChildViewById(rootView, id);
      if (doctorListPrevious == null) {
        break missingId;
      }

      id = R.id.dummy_for_district;
      TextView dummyForDistrict = ViewBindings.findChildViewById(rootView, id);
      if (dummyForDistrict == null) {
        break missingId;
      }

      id = R.id.dummy_for_state;
      TextView dummyForState = ViewBindings.findChildViewById(rootView, id);
      if (dummyForState == null) {
        break missingId;
      }

      id = R.id.empty2;
      LinearLayout empty2 = ViewBindings.findChildViewById(rootView, id);
      if (empty2 == null) {
        break missingId;
      }

      id = R.id.seedoctors;
      ImageView seedoctors = ViewBindings.findChildViewById(rootView, id);
      if (seedoctors == null) {
        break missingId;
      }

      return new ActivityPreviousDoctorsBinding((ConstraintLayout) rootView, doctorListPrevious,
          dummyForDistrict, dummyForState, empty2, seedoctors);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}