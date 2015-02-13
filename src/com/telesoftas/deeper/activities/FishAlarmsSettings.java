package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.telesoftas.utilities.ResizeAnimation;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class FishAlarmsSettings
  extends WrapperActivity
  implements View.OnClickListener
{
  private RelativeLayout n;
  private RelativeLayout o;
  private RelativeLayout p;
  private RelativeLayout q;
  private RelativeLayout r;
  private CheckBox s;
  private CheckBox t;
  private CheckBox u;
  private CheckBox v;
  private boolean w = false;
  
  private void a(View paramView, boolean paramBoolean, int paramInt)
  {
    ResizeAnimation localResizeAnimation = new ResizeAnimation(paramView, paramInt, paramBoolean);
    localResizeAnimation.setDuration(100 + 60 * (paramInt / this.s.getHeight()));
    localResizeAnimation.setAnimationListener(new FishAlarmsSettings.1(this, paramBoolean));
    if (!this.w) {
      paramView.startAnimation(localResizeAnimation);
    }
  }
  
  private void g()
  {
    h();
    k();
  }
  
  private void h()
  {
    this.s.setChecked(true);
    this.o.setVisibility(0);
    this.p.setVisibility(0);
    this.q.setVisibility(0);
  }
  
  private void i()
  {
    this.s.setChecked(false);
    this.o.setVisibility(8);
    this.p.setVisibility(8);
    this.q.setVisibility(8);
  }
  
  private void j()
  {
    if (getSharedPreferences("prefs", 0).getInt(SettingsUtils.n, 1) == 1) {
      g();
    }
  }
  
  private void k()
  {
    SharedPreferences localSharedPreferences = getSharedPreferences("prefs", 0);
    int i = localSharedPreferences.getInt(SettingsUtils.o, 1);
    if ((this.s.isChecked()) && (i == 1)) {
      this.t.setChecked(true);
    }
    int j = localSharedPreferences.getInt(SettingsUtils.p, 1);
    if ((this.s.isChecked()) && (j == 1)) {
      this.u.setChecked(true);
    }
    int k = localSharedPreferences.getInt(SettingsUtils.q, 1);
    if ((this.s.isChecked()) && (k == 1)) {
      this.v.setChecked(true);
    }
  }
  
  private void l()
  {
    int i = 1;
    SharedPreferences.Editor localEditor = getSharedPreferences("prefs", 0).edit();
    if ((this.s.isChecked()) && ((this.t.isChecked()) || (this.u.isChecked()) || (this.v.isChecked()))) {}
    for (int j = i;; j = 0)
    {
      localEditor.putInt(SettingsUtils.n, j);
      if (this.t.isChecked()) {}
      for (int k = i;; k = 0)
      {
        localEditor.putInt(SettingsUtils.o, k);
        if (this.u.isChecked()) {}
        for (int m = i;; m = 0)
        {
          localEditor.putInt(SettingsUtils.p, m);
          if (this.v.isChecked()) {}
          for (;;)
          {
            localEditor.putInt(SettingsUtils.q, i);
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
  }
  
  public void onBackPressed()
  {
    l();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    boolean bool1 = true;
    int i = 4 * this.n.getHeight();
    boolean bool3;
    label67:
    boolean bool2;
    label101:
    CheckBox localCheckBox1;
    if (paramView == this.n)
    {
      if (!this.s.isChecked()) {
        a(this.r, bool1, i);
      }
    }
    else
    {
      if (paramView == this.o)
      {
        CheckBox localCheckBox3 = this.t;
        if (this.t.isChecked()) {
          break label152;
        }
        bool3 = bool1;
        localCheckBox3.setChecked(bool3);
      }
      if (paramView == this.p)
      {
        CheckBox localCheckBox2 = this.u;
        if (this.u.isChecked()) {
          break label158;
        }
        bool2 = bool1;
        localCheckBox2.setChecked(bool2);
      }
      if (paramView == this.q)
      {
        localCheckBox1 = this.v;
        if (this.v.isChecked()) {
          break label164;
        }
      }
    }
    for (;;)
    {
      localCheckBox1.setChecked(bool1);
      return;
      a(this.r, false, i);
      break;
      label152:
      bool3 = false;
      break label67;
      label158:
      bool2 = false;
      break label101;
      label164:
      bool1 = false;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903052);
    this.n = ((RelativeLayout)findViewById(2131296295));
    this.o = ((RelativeLayout)findViewById(2131296325));
    this.p = ((RelativeLayout)findViewById(2131296328));
    this.q = ((RelativeLayout)findViewById(2131296331));
    this.r = ((RelativeLayout)findViewById(2131296298));
    this.s = ((CheckBox)findViewById(2131296297));
    this.t = ((CheckBox)findViewById(2131296327));
    this.u = ((CheckBox)findViewById(2131296330));
    this.v = ((CheckBox)findViewById(2131296333));
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.p.setOnClickListener(this);
    this.q.setOnClickListener(this);
    if (paramBundle == null)
    {
      j();
      return;
    }
    if (paramBundle.getBoolean("master")) {
      h();
    }
    this.s.setChecked(paramBundle.getBoolean("master"));
    this.t.setChecked(paramBundle.getBoolean("small"));
    this.u.setChecked(paramBundle.getBoolean("medium"));
    this.v.setChecked(paramBundle.getBoolean("large"));
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("master", this.s.isChecked());
    paramBundle.putBoolean("small", this.t.isChecked());
    paramBundle.putBoolean("medium", this.u.isChecked());
    paramBundle.putBoolean("large", this.v.isChecked());
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.FishAlarmsSettings
 * JD-Core Version:    0.7.0.1
 */