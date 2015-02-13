package com.telesoftas.deeper.ui.fragments;

import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.ButterKnife.Finder;

public class QuickSettingsFragment$$ViewInjector
{
  public static void inject(ButterKnife.Finder paramFinder, QuickSettingsFragment paramQuickSettingsFragment, Object paramObject)
  {
    paramQuickSettingsFragment.a = ((RadioButton)paramFinder.a(paramObject, 2131296490, "field '_visualizationBasic'"));
    paramQuickSettingsFragment.b = ((RadioButton)paramFinder.a(paramObject, 2131296489, "field '_visualizationDetailed'"));
    paramQuickSettingsFragment.c = ((RadioButton)paramFinder.a(paramObject, 2131296494, "field '_frequency90'"));
    paramQuickSettingsFragment.d = ((RadioButton)paramFinder.a(paramObject, 2131296495, "field '_frequency290'"));
    paramQuickSettingsFragment.e = ((SeekBar)paramFinder.a(paramObject, 2131296499, "field '_sensitivity'"));
    paramQuickSettingsFragment.f = ((TextView)paramFinder.a(paramObject, 2131296498, "field '_sensitivityLabel'"));
    paramQuickSettingsFragment.g = ((RadioGroup)paramFinder.a(paramObject, 2131296488, "field '_visualizationGroup'"));
    paramQuickSettingsFragment.h = ((RadioGroup)paramFinder.a(paramObject, 2131296493, "field '_frequencyGroup'"));
    paramQuickSettingsFragment.i = ((CheckBox)paramFinder.a(paramObject, 2131296491, "field '_fishIcons'"));
    paramQuickSettingsFragment.aj = ((TextView)paramFinder.a(paramObject, 2131296486, "field '_visualizationTitle'"));
    paramQuickSettingsFragment.ak = paramFinder.a(paramObject, 2131296487, "field '_visualizationInfo'");
    paramQuickSettingsFragment.al = paramFinder.a(paramObject, 2131296497, "field '_sensitivityTitle'");
    paramQuickSettingsFragment.am = paramFinder.a(paramObject, 2131296492, "field '_separator1'");
    paramQuickSettingsFragment.an = paramFinder.a(paramObject, 2131296500, "field '_separator3'");
  }
  
  public static void reset(QuickSettingsFragment paramQuickSettingsFragment)
  {
    paramQuickSettingsFragment.a = null;
    paramQuickSettingsFragment.b = null;
    paramQuickSettingsFragment.c = null;
    paramQuickSettingsFragment.d = null;
    paramQuickSettingsFragment.e = null;
    paramQuickSettingsFragment.f = null;
    paramQuickSettingsFragment.g = null;
    paramQuickSettingsFragment.h = null;
    paramQuickSettingsFragment.i = null;
    paramQuickSettingsFragment.aj = null;
    paramQuickSettingsFragment.ak = null;
    paramQuickSettingsFragment.al = null;
    paramQuickSettingsFragment.am = null;
    paramQuickSettingsFragment.an = null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment..ViewInjector
 * JD-Core Version:    0.7.0.1
 */