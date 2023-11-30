// Generated by view binder compiler. Do not edit!
package com.example.rotations_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rotations_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMenueBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button ArbeitsplazBewerten;

  @NonNull
  public final Button adduser;

  @NonNull
  public final Button immediatrotation;

  @NonNull
  public final Button meineBewertungen;

  @NonNull
  public final Button nextRotation;

  private ActivityMenueBinding(@NonNull LinearLayout rootView, @NonNull Button ArbeitsplazBewerten,
      @NonNull Button adduser, @NonNull Button immediatrotation, @NonNull Button meineBewertungen,
      @NonNull Button nextRotation) {
    this.rootView = rootView;
    this.ArbeitsplazBewerten = ArbeitsplazBewerten;
    this.adduser = adduser;
    this.immediatrotation = immediatrotation;
    this.meineBewertungen = meineBewertungen;
    this.nextRotation = nextRotation;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMenueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMenueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_menue, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMenueBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ArbeitsplazBewerten;
      Button ArbeitsplazBewerten = ViewBindings.findChildViewById(rootView, id);
      if (ArbeitsplazBewerten == null) {
        break missingId;
      }

      id = R.id.adduser;
      Button adduser = ViewBindings.findChildViewById(rootView, id);
      if (adduser == null) {
        break missingId;
      }

      id = R.id.immediatrotation;
      Button immediatrotation = ViewBindings.findChildViewById(rootView, id);
      if (immediatrotation == null) {
        break missingId;
      }

      id = R.id.meineBewertungen;
      Button meineBewertungen = ViewBindings.findChildViewById(rootView, id);
      if (meineBewertungen == null) {
        break missingId;
      }

      id = R.id.nextRotation;
      Button nextRotation = ViewBindings.findChildViewById(rootView, id);
      if (nextRotation == null) {
        break missingId;
      }

      return new ActivityMenueBinding((LinearLayout) rootView, ArbeitsplazBewerten, adduser,
          immediatrotation, meineBewertungen, nextRotation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}