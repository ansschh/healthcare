// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BookedslotBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView bookingid;

  @NonNull
  public final ImageView copybutton;

  @NonNull
  public final TextView doctornameonslot1;

  @NonNull
  public final Button intenttovideocall;

  @NonNull
  public final TextView slotTiming;

  @NonNull
  public final TextView starttime;

  private BookedslotBinding(@NonNull CardView rootView, @NonNull TextView bookingid,
      @NonNull ImageView copybutton, @NonNull TextView doctornameonslot1,
      @NonNull Button intenttovideocall, @NonNull TextView slotTiming,
      @NonNull TextView starttime) {
    this.rootView = rootView;
    this.bookingid = bookingid;
    this.copybutton = copybutton;
    this.doctornameonslot1 = doctornameonslot1;
    this.intenttovideocall = intenttovideocall;
    this.slotTiming = slotTiming;
    this.starttime = starttime;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static BookedslotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BookedslotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bookedslot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BookedslotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookingid;
      TextView bookingid = ViewBindings.findChildViewById(rootView, id);
      if (bookingid == null) {
        break missingId;
      }

      id = R.id.copybutton;
      ImageView copybutton = ViewBindings.findChildViewById(rootView, id);
      if (copybutton == null) {
        break missingId;
      }

      id = R.id.doctornameonslot1;
      TextView doctornameonslot1 = ViewBindings.findChildViewById(rootView, id);
      if (doctornameonslot1 == null) {
        break missingId;
      }

      id = R.id.intenttovideocall;
      Button intenttovideocall = ViewBindings.findChildViewById(rootView, id);
      if (intenttovideocall == null) {
        break missingId;
      }

      id = R.id.slot_Timing;
      TextView slotTiming = ViewBindings.findChildViewById(rootView, id);
      if (slotTiming == null) {
        break missingId;
      }

      id = R.id.starttime;
      TextView starttime = ViewBindings.findChildViewById(rootView, id);
      if (starttime == null) {
        break missingId;
      }

      return new BookedslotBinding((CardView) rootView, bookingid, copybutton, doctornameonslot1,
          intenttovideocall, slotTiming, starttime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}