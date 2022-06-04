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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kanad.health.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.eazegraph.lib.charts.PieChart;

public final class ActivityCovidTrackerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final PieChart pieChart;

  @NonNull
  public final TextView todayconfirmed;

  @NonNull
  public final TextView todayrecovered;

  @NonNull
  public final TextView todaysdeath;

  @NonNull
  public final TextView totalactive;

  @NonNull
  public final TextView totalconfirmed;

  @NonNull
  public final TextView totaldeaths;

  @NonNull
  public final TextView totalrecovered;

  @NonNull
  public final TextView totaltests;

  @NonNull
  public final TextView updateddate;

  @NonNull
  public final ImageView virus1;

  private ActivityCovidTrackerBinding(@NonNull LinearLayout rootView, @NonNull PieChart pieChart,
      @NonNull TextView todayconfirmed, @NonNull TextView todayrecovered,
      @NonNull TextView todaysdeath, @NonNull TextView totalactive,
      @NonNull TextView totalconfirmed, @NonNull TextView totaldeaths,
      @NonNull TextView totalrecovered, @NonNull TextView totaltests, @NonNull TextView updateddate,
      @NonNull ImageView virus1) {
    this.rootView = rootView;
    this.pieChart = pieChart;
    this.todayconfirmed = todayconfirmed;
    this.todayrecovered = todayrecovered;
    this.todaysdeath = todaysdeath;
    this.totalactive = totalactive;
    this.totalconfirmed = totalconfirmed;
    this.totaldeaths = totaldeaths;
    this.totalrecovered = totalrecovered;
    this.totaltests = totaltests;
    this.updateddate = updateddate;
    this.virus1 = virus1;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCovidTrackerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCovidTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_covid_tracker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCovidTrackerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pie_chart;
      PieChart pieChart = ViewBindings.findChildViewById(rootView, id);
      if (pieChart == null) {
        break missingId;
      }

      id = R.id.todayconfirmed;
      TextView todayconfirmed = ViewBindings.findChildViewById(rootView, id);
      if (todayconfirmed == null) {
        break missingId;
      }

      id = R.id.todayrecovered;
      TextView todayrecovered = ViewBindings.findChildViewById(rootView, id);
      if (todayrecovered == null) {
        break missingId;
      }

      id = R.id.todaysdeath;
      TextView todaysdeath = ViewBindings.findChildViewById(rootView, id);
      if (todaysdeath == null) {
        break missingId;
      }

      id = R.id.totalactive;
      TextView totalactive = ViewBindings.findChildViewById(rootView, id);
      if (totalactive == null) {
        break missingId;
      }

      id = R.id.totalconfirmed;
      TextView totalconfirmed = ViewBindings.findChildViewById(rootView, id);
      if (totalconfirmed == null) {
        break missingId;
      }

      id = R.id.totaldeaths;
      TextView totaldeaths = ViewBindings.findChildViewById(rootView, id);
      if (totaldeaths == null) {
        break missingId;
      }

      id = R.id.totalrecovered;
      TextView totalrecovered = ViewBindings.findChildViewById(rootView, id);
      if (totalrecovered == null) {
        break missingId;
      }

      id = R.id.totaltests;
      TextView totaltests = ViewBindings.findChildViewById(rootView, id);
      if (totaltests == null) {
        break missingId;
      }

      id = R.id.updateddate;
      TextView updateddate = ViewBindings.findChildViewById(rootView, id);
      if (updateddate == null) {
        break missingId;
      }

      id = R.id.virus1;
      ImageView virus1 = ViewBindings.findChildViewById(rootView, id);
      if (virus1 == null) {
        break missingId;
      }

      return new ActivityCovidTrackerBinding((LinearLayout) rootView, pieChart, todayconfirmed,
          todayrecovered, todaysdeath, totalactive, totalconfirmed, totaldeaths, totalrecovered,
          totaltests, updateddate, virus1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}