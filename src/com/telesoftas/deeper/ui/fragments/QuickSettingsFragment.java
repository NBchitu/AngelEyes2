package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class QuickSettingsFragment
  extends Fragment
{
  RadioButton a;
  TextView aj;
  View ak;
  View al;
  View am;
  View an;
  private SharedPreferences ao;
  RadioButton b;
  RadioButton c;
  RadioButton d;
  SeekBar e;
  TextView f;
  RadioGroup g;
  RadioGroup h;
  CheckBox i;
  
  private void a()
  {
    int j = this.ao.getInt(SettingsUtils.b, 1);
    boolean bool;
    if (j == 1)
    {
      this.a.setChecked(true);
      CheckBox localCheckBox = this.i;
      if (j != 0) {
        break label121;
      }
      bool = true;
      label38:
      localCheckBox.setEnabled(bool);
      this.i.setChecked(this.ao.getBoolean(SettingsUtils.f, false));
      int k = this.ao.getInt(SettingsUtils.c, 2);
      if (!this.c.isEnabled()) {
        k = 2;
      }
      if (k != 1) {
        break label126;
      }
    }
    label121:
    label126:
    for (RadioButton localRadioButton = this.c;; localRadioButton = this.d)
    {
      localRadioButton.setChecked(true);
      return;
      this.b.setChecked(true);
      break;
      bool = false;
      break label38;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    this.e.setEnabled(true);
    if (paramBoolean) {}
    for (int j = this.ao.getInt(SettingsUtils.d, 0);; j = 10)
    {
      this.e.setProgress(20 - j);
      this.e.setEnabled(paramBoolean);
      return;
    }
  }
  
  private String c(int paramInt)
  {
    int j = (int)(100.0F * paramInt / 20.0F);
    return j + "%";
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903076, null);
    ButterKnife.a(this, localView);
    this.e.setMax(20);
    this.e.setOnSeekBarChangeListener(new QuickSettingsFragment.1(this));
    this.i.setOnCheckedChangeListener(new QuickSettingsFragment.2(this));
    this.g.setOnCheckedChangeListener(new QuickSettingsFragment.3(this));
    ((RadioGroup)localView.findViewById(2131296493)).setOnCheckedChangeListener(new QuickSettingsFragment.4(this));
    this.ak.setOnClickListener(new QuickSettingsFragment.5(this));
    return localView;
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ao = i().getSharedPreferences("prefs", 0);
  }
  
  public void b(int paramInt)
  {
    int n;
    int j;
    int k;
    int m;
    switch (paramInt)
    {
    case 1: 
    default: 
      n = 1;
      j = 0;
      k = 2131427458;
      m = 0;
      if (k != 0)
      {
        this.aj.setVisibility(0);
        this.ak.setVisibility(0);
        this.aj.setText(k);
        label67:
        this.g.setVisibility(j);
        this.i.setVisibility(j);
        this.am.setVisibility(j);
        if (n == 0) {
          break label191;
        }
        this.d.setEnabled(true);
        this.c.setEnabled(true);
      }
      break;
    }
    for (;;)
    {
      this.e.setVisibility(m);
      this.al.setVisibility(m);
      this.an.setVisibility(m);
      return;
      m = 8;
      n = 1;
      j = 8;
      k = 0;
      break;
      j = 8;
      k = 2131427456;
      m = 0;
      n = 0;
      break;
      this.aj.setVisibility(8);
      this.ak.setVisibility(8);
      break label67;
      label191:
      this.am.setVisibility(0);
      this.d.setEnabled(false);
      this.c.setEnabled(false);
      this.d.setChecked(true);
      this.c.setChecked(false);
      this.d.setTextColor(-1);
    }
  }
  
  public void t()
  {
    super.t();
    a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment
 * JD-Core Version:    0.7.0.1
 */