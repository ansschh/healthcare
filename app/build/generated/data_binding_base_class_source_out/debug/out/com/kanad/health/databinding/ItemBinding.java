// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView DoctorName;

  @NonNull
  public final TextView DoctorUidDummy;

  @NonNull
  public final TextView doctorInstituteOnList;

  @NonNull
  public final TextView doctorSpecilizationOnList;

  @NonNull
  public final TextView doctorVerificationOnList;

  @NonNull
  public final CircleImageView imageDoctor;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ImageView verifiedcheck;

  private ItemBinding(@NonNull CardView rootView, @NonNull TextView DoctorName,
      @NonNull TextView DoctorUidDummy, @NonNull TextView doctorInstituteOnList,
      @NonNull TextView doctorSpecilizationOnList, @NonNull TextView doctorVerificationOnList,
      @NonNull CircleImageView imageDoctor, @NonNull ProgressBar progressBar,
      @NonNull ImageView verifiedcheck) {
    this.rootView = rootView;
    this.DoctorName = DoctorName;
    this.DoctorUidDummy = DoctorUidDummy;
    this.doctorInstituteOnList = doctorInstituteOnList;
    this.doctorSpecilizationOnList = doctorSpecilizationOnList;
    this.doctorVerificationOnList = doctorVerificationOnList;
    this.imageDoctor = imageDoctor;
    this.progressBar = progressBar;
    this.verifiedcheck = verifiedcheck;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Doctor_Name;
      TextView DoctorName = ViewBindings.findChildViewById(rootView, id);
      if (DoctorName == null) {
        break missingId;
      }

      id = R.id.Doctor_uid_dummy;
      TextView DoctorUidDummy = ViewBindings.findChildViewById(rootView, id);
      if (DoctorUidDummy == null) {
        break missingId;
      }

      id = R.id.doctor_institute_on_list;
      TextView doctorInstituteOnList = ViewBindings.findChildViewById(rootView, id);
      if (doctorInstituteOnList == null) {
        break missingId;
      }

      id = R.id.doctor_specilization_on_list;
      TextView doctorSpecilizationOnList = ViewBindings.findChildViewById(rootView, id);
      if (doctorSpecilizationOnList == null) {
        break missingId;
      }

      id = R.id.doctor_verification_on_list;
      TextView doctorVerificationOnList = ViewBindings.findChildViewById(rootView, id);
      if (doctorVerificationOnList == null) {
        break missingId;
      }

      id = R.id.image_doctor;
      CircleImageView imageDoctor = ViewBindings.findChildViewById(rootView, id);
      if (imageDoctor == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.verifiedcheck;
      ImageView verifiedcheck = ViewBindings.findChildViewById(rootView, id);
      if (verifiedcheck == null) {
        break missingId;
      }

      return new ItemBinding((CardView) rootView, DoctorName, DoctorUidDummy, doctorInstituteOnList,
          doctorSpecilizationOnList, doctorVerificationOnList, imageDoctor, progressBar,
          verifiedcheck);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}