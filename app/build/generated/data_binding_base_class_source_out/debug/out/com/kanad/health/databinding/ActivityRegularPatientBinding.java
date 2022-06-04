// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegularPatientBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button acceptbutton;

  @NonNull
  public final TextView address;

  @NonNull
  public final Button declinebutton;

  @NonNull
  public final TextView dob;

  @NonNull
  public final TextView email;

  @NonNull
  public final RegularpatienttoolbarBinding include;

  @NonNull
  public final LinearLayout norequests;

  @NonNull
  public final CardView notificationcard;

  @NonNull
  public final TextView personname;

  @NonNull
  public final CircleImageView photo;

  @NonNull
  public final RecyclerView recyclerViewRequests;

  @NonNull
  public final TextView regpet;

  @NonNull
  public final TextView sex;

  private ActivityRegularPatientBinding(@NonNull LinearLayout rootView,
      @NonNull Button acceptbutton, @NonNull TextView address, @NonNull Button declinebutton,
      @NonNull TextView dob, @NonNull TextView email, @NonNull RegularpatienttoolbarBinding include,
      @NonNull LinearLayout norequests, @NonNull CardView notificationcard,
      @NonNull TextView personname, @NonNull CircleImageView photo,
      @NonNull RecyclerView recyclerViewRequests, @NonNull TextView regpet, @NonNull TextView sex) {
    this.rootView = rootView;
    this.acceptbutton = acceptbutton;
    this.address = address;
    this.declinebutton = declinebutton;
    this.dob = dob;
    this.email = email;
    this.include = include;
    this.norequests = norequests;
    this.notificationcard = notificationcard;
    this.personname = personname;
    this.photo = photo;
    this.recyclerViewRequests = recyclerViewRequests;
    this.regpet = regpet;
    this.sex = sex;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegularPatientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegularPatientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_regular_patient, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegularPatientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.acceptbutton;
      Button acceptbutton = ViewBindings.findChildViewById(rootView, id);
      if (acceptbutton == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.declinebutton;
      Button declinebutton = ViewBindings.findChildViewById(rootView, id);
      if (declinebutton == null) {
        break missingId;
      }

      id = R.id.dob;
      TextView dob = ViewBindings.findChildViewById(rootView, id);
      if (dob == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.include;
      View include = ViewBindings.findChildViewById(rootView, id);
      if (include == null) {
        break missingId;
      }
      RegularpatienttoolbarBinding binding_include = RegularpatienttoolbarBinding.bind(include);

      id = R.id.norequests;
      LinearLayout norequests = ViewBindings.findChildViewById(rootView, id);
      if (norequests == null) {
        break missingId;
      }

      id = R.id.notificationcard;
      CardView notificationcard = ViewBindings.findChildViewById(rootView, id);
      if (notificationcard == null) {
        break missingId;
      }

      id = R.id.personname;
      TextView personname = ViewBindings.findChildViewById(rootView, id);
      if (personname == null) {
        break missingId;
      }

      id = R.id.photo;
      CircleImageView photo = ViewBindings.findChildViewById(rootView, id);
      if (photo == null) {
        break missingId;
      }

      id = R.id.recyclerViewRequests;
      RecyclerView recyclerViewRequests = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewRequests == null) {
        break missingId;
      }

      id = R.id.regpet;
      TextView regpet = ViewBindings.findChildViewById(rootView, id);
      if (regpet == null) {
        break missingId;
      }

      id = R.id.sex;
      TextView sex = ViewBindings.findChildViewById(rootView, id);
      if (sex == null) {
        break missingId;
      }

      return new ActivityRegularPatientBinding((LinearLayout) rootView, acceptbutton, address,
          declinebutton, dob, email, binding_include, norequests, notificationcard, personname,
          photo, recyclerViewRequests, regpet, sex);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}