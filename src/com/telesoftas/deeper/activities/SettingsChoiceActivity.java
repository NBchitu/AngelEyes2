package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.DeeperDeviceManager;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class SettingsChoiceActivity
  extends WrapperActivity
  implements View.OnClickListener
{
  private CheckBox A;
  private SeekBar B;
  private RelativeLayout C;
  private TextView D;
  private Float J;
  private int K = 0;
  private int L = 0;
  private TextView n;
  private TextView o;
  private RelativeLayout p;
  private RelativeLayout q;
  private RelativeLayout r;
  private RelativeLayout s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private CheckBox x;
  private CheckBox y;
  private CheckBox z;
  
  private void a(int paramInt)
  {
    int i = 1;
    this.K = paramInt;
    CheckBox localCheckBox1 = this.x;
    label45:
    label69:
    CheckBox localCheckBox4;
    if (this.K == 0)
    {
      int k = i;
      localCheckBox1.setChecked(k);
      CheckBox localCheckBox2 = this.y;
      if (this.K != i) {
        break label103;
      }
      int i1 = i;
      localCheckBox2.setChecked(i1);
      CheckBox localCheckBox3 = this.z;
      if (this.K != 2) {
        break label109;
      }
      int i3 = i;
      localCheckBox3.setChecked(i3);
      localCheckBox4 = this.A;
      if (this.K != 3) {
        break label115;
      }
    }
    for (;;)
    {
      localCheckBox4.setChecked(i);
      return;
      int m = 0;
      break;
      label103:
      int i2 = 0;
      break label45;
      label109:
      int i4 = 0;
      break label69;
      label115:
      int j = 0;
    }
  }
  
  private int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 2131427428;
    case 19: 
      return 2131427539;
    case 18: 
      return 2131427635;
    }
    return 2131427456;
  }
  
  private String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return SettingsUtils.r;
    case 19: 
      return SettingsUtils.g;
    case 18: 
      return SettingsUtils.t;
    }
    return SettingsUtils.s;
  }
  
  private int e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 1;
    }
    return 0;
  }
  
  private void g()
  {
    a(0);
  }
  
  private void h()
  {
    a(1);
  }
  
  private void i()
  {
    a(2);
  }
  
  private void j()
  {
    this.q.setBackgroundResource(2130837601);
    int i = getResources().getDimensionPixelOffset(2131230759);
    this.q.setPadding(i, this.q.getPaddingTop(), this.q.getPaddingRight(), this.q.getPaddingBottom());
    this.r.setVisibility(0);
  }
  
  private void k()
  {
    j();
    this.r.setBackgroundResource(2130837601);
    int i = getResources().getDimensionPixelOffset(2131230759);
    this.r.setPadding(i, this.r.getPaddingTop(), this.r.getPaddingRight(), this.r.getPaddingBottom());
    this.s.setVisibility(0);
  }
  
  private void l()
  {
    ((LinearLayout)findViewById(2131296525)).setVisibility(8);
  }
  
  private void m()
  {
    this.C.setVisibility(0);
    this.J = Float.valueOf((10 + this.B.getProgress()) / 100.0F);
    this.B.setOnSeekBarChangeListener(new SettingsChoiceActivity.1(this));
  }
  
  private void n()
  {
    try
    {
      if (Settings.System.getInt(getContentResolver(), "screen_brightness_mode") == 1) {
        Settings.System.putInt(getContentResolver(), "screen_brightness_mode", 0);
      }
      return;
    }
    catch (Settings.SettingNotFoundException localSettingNotFoundException) {}
  }
  
  private void o()
  {
    SharedPreferences localSharedPreferences = getSharedPreferences("prefs", 0);
    switch (this.L)
    {
    case 11: 
    case 12: 
    case 13: 
    default: 
    case 10: 
    case 17: 
    case 14: 
    case 18: 
    case 19: 
    case 20: 
    case 15: 
      int j;
      do
      {
        int m;
        do
        {
          return;
          k();
          this.n.setText(2131427632);
          this.t.setText(2131427515);
          this.u.setText(2131427463);
          this.v.setText(2131427423);
          this.w.setText(2131427425);
          m = localSharedPreferences.getInt(SettingsUtils.a, 0);
          if (m == 0) {
            g();
          }
          if (m == 1) {
            h();
          }
          if (m == 2) {
            i();
          }
        } while (m != 3);
        a(3);
        return;
        this.n.setText(getString(2131427432));
        this.t.setText(getString(2131427467));
        this.u.setText(getString(2131427465));
        switch (localSharedPreferences.getInt(SettingsUtils.c, 2))
        {
        default: 
          return;
        case 1: 
          g();
          return;
        }
        h();
        return;
        this.n.setText(b(this.L));
        this.t.setText(getString(2131427552));
        this.u.setText(getString(2131427550));
        String str = c(this.L);
        int k = e(this.L);
        if (this.L == 19)
        {
          this.o.setVisibility(0);
          this.o.setText(2131427540);
        }
        if (localSharedPreferences.getInt(str, k) == 0)
        {
          h();
          return;
        }
        g();
        return;
        j();
        this.n.setText(getString(2131427384));
        this.t.setText(Integer.toString(5) + " " + getString(2131427519));
        this.u.setText(Integer.toString(10) + " " + getString(2131427519));
        this.v.setText(Integer.toString(15) + " " + getString(2131427519));
        j = localSharedPreferences.getInt(SettingsUtils.u, 15);
        if (j == 5) {
          g();
        }
        if (j == 10) {
          h();
        }
      } while (j != 15);
      i();
      return;
    }
    this.n.setText(getString(2131427337));
    int i = DisplayUtils.d(this);
    this.B.setProgress(i - 10);
    this.D.setText(Integer.toString(i) + "%");
    l();
    m();
  }
  
  private void p()
  {
    int i = 2;
    int j = 1;
    SharedPreferences.Editor localEditor = getSharedPreferences("prefs", 0).edit();
    switch (this.L)
    {
    case 11: 
    case 12: 
    case 13: 
    default: 
      localEditor.apply();
      setResult(-1, new Intent());
      finish();
      overridePendingTransition(17432578, 17432579);
      return;
    case 10: 
      if (this.K != j) {
        break;
      }
    }
    for (;;)
    {
      if (this.K == i) {
        j = i;
      }
      if (this.K == 3) {
        j = 3;
      }
      localEditor.putInt(SettingsUtils.a, j);
      break;
      if (this.K == 0) {}
      for (int i11 = j;; i11 = i)
      {
        if (this.K == j) {}
        for (;;)
        {
          localEditor.putInt(SettingsUtils.c, i);
          break;
          int i9 = this.K;
          int i10 = 0;
          if (i9 == j) {}
          for (;;)
          {
            localEditor.putInt(SettingsUtils.r, i10);
            break;
            int i7 = this.K;
            int i8 = 0;
            if (i7 == j) {}
            for (;;)
            {
              localEditor.putInt(SettingsUtils.t, i8);
              break;
              int i5 = this.K;
              int i6 = 0;
              if (i5 == j) {}
              for (;;)
              {
                localEditor.putInt(SettingsUtils.g, i6);
                break;
                int i3 = this.K;
                int i4 = 0;
                if (i3 == j) {}
                for (;;)
                {
                  this.I.d().a();
                  localEditor.putInt(SettingsUtils.s, i4);
                  break;
                  int i2 = 15;
                  if (this.K == 0) {
                    i2 = 5;
                  }
                  if (this.K == j) {
                    i2 = 10;
                  }
                  localEditor.putInt(SettingsUtils.u, i2);
                  this.G.a(i2);
                  break;
                  int k = this.K;
                  int m = 0;
                  if (k == j) {}
                  for (;;)
                  {
                    localEditor.putInt("brigtness", m);
                    int i1 = (int)(255.0D * (0.01D + this.J.floatValue()));
                    if (i1 > 255) {
                      i1 = 255;
                    }
                    Settings.System.putInt(getContentResolver(), "screen_brightness", i1);
                    EasyTracker.a(this).a(MapBuilder.a("Settings", "change_brightness", null, null).a());
                    break;
                    m = j;
                  }
                  i4 = j;
                }
                i6 = j;
              }
              i8 = j;
            }
            i10 = j;
          }
          i = i11;
        }
      }
      j = 0;
    }
  }
  
  public void onBackPressed()
  {
    p();
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    if ((paramView == this.p) && (!this.x.isChecked())) {
      g();
    }
    if ((paramView == this.q) && (!this.y.isChecked())) {
      h();
    }
    if ((paramView == this.r) && (!this.z.isChecked())) {
      i();
    }
    if ((paramView == this.s) && (!this.A.isChecked())) {
      a(3);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903082);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {
      this.L = localBundle.getInt("choice type");
    }
    this.o = ((TextView)findViewById(2131296526));
    this.p = ((RelativeLayout)findViewById(2131296527));
    this.q = ((RelativeLayout)findViewById(2131296530));
    this.r = ((RelativeLayout)findViewById(2131296533));
    this.s = ((RelativeLayout)findViewById(2131296536));
    this.x = ((CheckBox)findViewById(2131296529));
    this.y = ((CheckBox)findViewById(2131296532));
    this.z = ((CheckBox)findViewById(2131296535));
    this.A = ((CheckBox)findViewById(2131296538));
    this.t = ((TextView)findViewById(2131296528));
    this.u = ((TextView)findViewById(2131296531));
    this.v = ((TextView)findViewById(2131296534));
    this.w = ((TextView)findViewById(2131296537));
    this.n = ((TextView)findViewById(2131296278));
    this.B = ((SeekBar)findViewById(2131296542));
    this.C = ((RelativeLayout)findViewById(2131296539));
    this.D = ((TextView)findViewById(2131296541));
    this.p.setOnClickListener(this);
    this.q.setOnClickListener(this);
    this.r.setOnClickListener(this);
    this.s.setOnClickListener(this);
    o();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsChoiceActivity
 * JD-Core Version:    0.7.0.1
 */