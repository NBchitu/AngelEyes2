package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import com.telesoftas.utilities.ResizeAnimation;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class DepthAlarmsSettingsActivity
  extends WrapperActivity
  implements View.OnClickListener
{
  private int A = 0;
  private boolean B = false;
  private View n;
  private View o;
  private View p;
  private RelativeLayout q;
  private RelativeLayout r;
  private View s;
  private CheckBox t;
  private CheckBox u;
  private CheckBox v;
  private SeekBar w;
  private DepthAlarmsSettingsActivity.ReversedSeekBar x;
  private TextView y;
  private TextView z;
  
  private void a(float paramFloat)
  {
    float f = SettingsUtils.a(paramFloat, this.A);
    String str = " " + SettingsUtils.a(f, this.A, getBaseContext());
    this.y.setText(str);
  }
  
  private void a(View paramView, boolean paramBoolean, int paramInt)
  {
    ResizeAnimation localResizeAnimation = new ResizeAnimation(paramView, paramInt, paramBoolean);
    localResizeAnimation.setDuration(100 + 60 * (paramInt / this.t.getHeight()));
    localResizeAnimation.setAnimationListener(new DepthAlarmsSettingsActivity.3(this, paramBoolean, paramView));
    if (!this.B) {
      paramView.startAnimation(localResizeAnimation);
    }
  }
  
  private void b(float paramFloat)
  {
    float f = SettingsUtils.a(paramFloat, this.A);
    String str = " " + SettingsUtils.a(f, this.A, getBaseContext());
    this.z.setText(str);
  }
  
  private void g()
  {
    int i = getResources().getDimensionPixelOffset(2131230765);
    int j = getResources().getDimensionPixelOffset(2131230761);
    int k = getResources().getDimensionPixelOffset(2131230763);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams1.addRule(15);
    localLayoutParams1.addRule(1, 2131296303);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams2.addRule(15);
    localLayoutParams2.addRule(1, 2131296309);
    this.w = new SeekBar(this, null);
    this.w.setLayoutParams(localLayoutParams1);
    this.w.setPadding(i, k, j, 0);
    this.w.setMax(41);
    this.q.addView(this.w);
    this.q.invalidate();
    this.x = new DepthAlarmsSettingsActivity.ReversedSeekBar(this, null);
    this.x.setLayoutParams(localLayoutParams2);
    this.x.setPadding(j, k, i, 0);
    this.x.setMax(41);
    this.r.addView(this.x);
    this.r.invalidate();
  }
  
  private void h()
  {
    this.w.setOnSeekBarChangeListener(new DepthAlarmsSettingsActivity.1(this));
    this.x.setOnSeekBarChangeListener(new DepthAlarmsSettingsActivity.2(this));
  }
  
  private void i()
  {
    this.t.setChecked(true);
    this.o.setVisibility(0);
    this.p.setVisibility(0);
    this.r.setVisibility(8);
    this.q.setVisibility(8);
    if (this.u.isChecked()) {
      k();
    }
    if (this.v.isChecked()) {
      m();
    }
  }
  
  private void j()
  {
    this.t.setChecked(false);
    this.o.setVisibility(8);
    this.p.setVisibility(8);
    this.r.setVisibility(8);
    this.q.setVisibility(8);
    this.q.setVisibility(8);
    this.r.setVisibility(8);
  }
  
  private void k()
  {
    this.u.setChecked(true);
    this.q.setVisibility(0);
  }
  
  private void l()
  {
    this.u.setChecked(false);
    this.q.setVisibility(8);
  }
  
  private void m()
  {
    this.v.setChecked(true);
    this.r.setVisibility(0);
  }
  
  private void n()
  {
    this.v.setChecked(false);
    this.r.setVisibility(8);
  }
  
  private void o()
  {
    SharedPreferences localSharedPreferences = SettingsUtils.a(this);
    this.A = localSharedPreferences.getInt(SettingsUtils.a, 0);
    int i = localSharedPreferences.getInt(SettingsUtils.h, 1);
    if (i == 1) {
      i();
    }
    int j = localSharedPreferences.getInt(SettingsUtils.k, 1);
    this.u.setChecked(false);
    if (j == 1)
    {
      this.u.setChecked(true);
      if (i == 1) {
        k();
      }
    }
    int k = localSharedPreferences.getInt(SettingsUtils.l, 5);
    this.w.setProgress(k);
    a(k);
    int m = localSharedPreferences.getInt(SettingsUtils.i, 1);
    this.v.setChecked(false);
    if (m == 1)
    {
      this.v.setChecked(true);
      if (i == 1) {
        m();
      }
    }
    int i1 = localSharedPreferences.getInt(SettingsUtils.j, 25);
    this.x.setReverseProgress(i1);
    b(i1);
  }
  
  private void p()
  {
    int i = 1;
    SharedPreferences.Editor localEditor = SettingsUtils.a(this).edit();
    if ((this.t.isChecked()) && ((this.u.isChecked()) || (this.v.isChecked()))) {}
    for (int j = i;; j = 0)
    {
      localEditor.putInt(SettingsUtils.h, j);
      if (this.u.isChecked()) {}
      for (int k = i;; k = 0)
      {
        localEditor.putInt(SettingsUtils.k, k);
        int m = this.w.getProgress();
        localEditor.putInt(SettingsUtils.l, m);
        if (this.v.isChecked()) {}
        for (;;)
        {
          localEditor.putInt(SettingsUtils.i, i);
          int i1 = this.x.getReverseProgress();
          localEditor.putInt(SettingsUtils.j, i1);
          localEditor.apply();
          setResult(-1, new Intent());
          finish();
          overridePendingTransition(17432578, 17432579);
          return;
          i = 0;
        }
      }
    }
  }
  
  public void onBackPressed()
  {
    p();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    int i = this.n.getHeight();
    int j;
    if (paramView == this.n)
    {
      j = i * 6;
      if (!this.v.isChecked()) {
        j -= i;
      }
      if (!this.u.isChecked()) {
        j -= i;
      }
      if (!this.t.isChecked()) {
        a(this.s, true, i * 6);
      }
    }
    else if (paramView == this.o)
    {
      if (this.u.isChecked()) {
        break label142;
      }
      a(this.q, true, i);
    }
    for (;;)
    {
      if (paramView == this.p)
      {
        if (this.v.isChecked()) {
          break label155;
        }
        a(this.r, true, i);
      }
      return;
      a(this.s, false, j);
      break;
      label142:
      a(this.q, false, i);
    }
    label155:
    a(this.r, false, i);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    this.n = findViewById(2131296295);
    this.o = findViewById(2131296299);
    this.p = findViewById(2131296305);
    this.q = ((RelativeLayout)findViewById(2131296302));
    this.r = ((RelativeLayout)findViewById(2131296308));
    this.s = findViewById(2131296298);
    this.t = ((CheckBox)findViewById(2131296297));
    this.u = ((CheckBox)findViewById(2131296300));
    this.v = ((CheckBox)findViewById(2131296306));
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.p.setOnClickListener(this);
    this.y = ((TextView)findViewById(2131296304));
    this.z = ((TextView)findViewById(2131296310));
    g();
    h();
    o();
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    if (paramBundle.getBoolean("master"))
    {
      i();
      if (!paramBundle.getBoolean("max")) {
        break label83;
      }
      m();
      label28:
      if (!paramBundle.getBoolean("min")) {
        break label90;
      }
      k();
    }
    for (;;)
    {
      this.x.setReverseProgress(paramBundle.getInt("maxValue"));
      this.w.setProgress(paramBundle.getInt("minValue"));
      super.onRestoreInstanceState(paramBundle);
      return;
      j();
      break;
      label83:
      n();
      break label28;
      label90:
      l();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("master", this.t.isChecked());
    paramBundle.putBoolean("max", this.v.isChecked());
    paramBundle.putBoolean("min", this.u.isChecked());
    paramBundle.putInt("maxValue", this.x.getReverseProgress());
    paramBundle.putInt("minValue", this.w.getProgress());
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DepthAlarmsSettingsActivity
 * JD-Core Version:    0.7.0.1
 */