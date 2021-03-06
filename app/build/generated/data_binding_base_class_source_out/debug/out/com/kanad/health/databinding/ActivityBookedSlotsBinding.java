// Generated by view binder compiler. Do not edit!
package com.kanad.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBookedSlotsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView bookingid;

  @NonNull
  public final TextView doctornameonslot;

  @NonNull
  public final LinearLayout empty;

  @NonNull
  public final LinearLayout extras;

  @NonNull
  public final TextView gotohomescreen;

  @NonNull
  public final TextView gotohomescreen1;

  @NonNull
  public final Button intenttovideocall;

  @NonNull
  public final ToolbarbookedslotBinding itsbar;

  @NonNull
  public final LinearLayout noextras;

  @NonNull
  public final RecyclerView recyclerViewSlot;

  @NonNull
  public final TextView slotTiming;

  @NonNull
  public final TextView starttime;

  private ActivityBookedSlotsBinding(@NonNull RelativeLayout rootView, @NonNull TextView bookingid,
      @NonNull TextView doctornameonslot, @NonNull LinearLayout empty, @NonNull LinearLayout extras,
      @NonNull TextView gotohomescreen, @NonNull TextView gotohomescreen1,
      @NonNull Button intenttovideocall, @NonNull ToolbarbookedslotBinding itsbar,
      @NonNull LinearLayout noextras, @NonNull RecyclerView recyclerViewSlot,
      @NonNull TextView slotTiming, @NonNull TextView starttime) {
    this.rootView = rootView;
    this.bookingid = bookingid;
    this.doctornameonslot = doctornameonslot;
    this.empty = empty;
    this.extras = extras;
    this.gotohomescreen = gotohomescreen;
    this.gotohomescreen1 = gotohomescreen1;
    this.intenttovideocall = intenttovideocall;
    this.itsbar = itsbar;
    this.noextras = noextras;
    this.recyclerViewSlot = recyclerViewSlot;
    this.slotTiming = slotTiming;
    this.starttime = starttime;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBookedSlotsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBookedSlotsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_booked_slots, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBookedSlotsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bookingid;
      TextView bookingid = ViewBindings.findChildViewById(rootView, id);
      if (bookingid == null) {
        break missingId;
      }

      id = R.id.doctornameonslot;
      TextView doctornameonslot = ViewBindings.findChildViewById(rootView, id);
      if (doctornameonslot == null) {
        break missingId;
      }

      id = R.id.empty;
      LinearLayout empty = ViewBindings.findChildViewById(rootView, id);
      if (empty == null) {
        break missingId;
      }

      id = R.id.extras;
      LinearLayout extras = ViewBindings.findChildViewById(rootView, id);
      if (extras == null) {
        break missingId;
      }

      id = R.id.gotohomescreen;
      TextView gotohomescreen = ViewBindings.findChildViewById(rootView, id);
      if (gotohomescreen == null) {
        break missingId;
      }

      id = R.id.gotohomescreen1;
      TextView gotohomescreen1 = ViewBindings.findChildViewById(rootView, id);
      if (gotohomescreen1 == null) {
        break missingId;
      }

      id = R.id.intenttovideocall___;
      Button intenttovideocall = ViewBindings.findChildViewById(rootView, id);
      if (intenttovideocall == null) {
        break missingId;
      }

      id = R.id.itsbar;
      View itsbar = ViewBindings.findChildViewById(rootView, id);
      if (itsbar == null) {
        break missingId;
      }
      ToolbarbookedslotBinding binding_itsbar = ToolbarbookedslotBinding.bind(itsbar);

      id = R.id.noextras;
      LinearLayout noextras = ViewBindings.findChildViewById(rootView, id);
      if (noextras == null) {
        break missingId;
      }

      id = R.id.recycler_view_slot;
      RecyclerView recyclerViewSlot = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewSlot == null) {
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

      return new ActivityBookedSlotsBinding((RelativeLayout) rootView, bookingid, doctornameonslot,
          empty, extras, gotohomescreen, gotohomescreen1, intenttovideocall, binding_itsbar,
          noextras, recyclerViewSlot, slotTiming, starttime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
