// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityDoctorShowBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView doctorList;

  @NonNull
  public final TextView dummyForDistrict;

  @NonNull
  public final TextView dummyForState;

  @NonNull
  public final LinearLayout empty1;

  private ActivityDoctorShowBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView doctorList, @NonNull TextView dummyForDistrict,
      @NonNull TextView dummyForState, @NonNull LinearLayout empty1) {
    this.rootView = rootView;
    this.doctorList = doctorList;
    this.dummyForDistrict = dummyForDistrict;
    this.dummyForState = dummyForState;
    this.empty1 = empty1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorShowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorShowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_show, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorShowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.doctor_list;
      RecyclerView doctorList = ViewBindings.findChildViewById(rootView, id);
      if (doctorList == null) {
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

      id = R.id.empty1;
      LinearLayout empty1 = ViewBindings.findChildViewById(rootView, id);
      if (empty1 == null) {
        break missingId;
      }

      return new ActivityDoctorShowBinding((ConstraintLayout) rootView, doctorList,
          dummyForDistrict, dummyForState, empty1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
