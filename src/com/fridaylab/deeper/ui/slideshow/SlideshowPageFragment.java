package com.fridaylab.deeper.ui.slideshow;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.fridaylab.deeper.ui.ViewTools;

public class SlideshowPageFragment
  extends Fragment
{
  protected View a;
  protected Handler b;
  protected float c;
  protected float d;
  protected float e;
  protected float f;
  protected float g;
  
  protected static Bundle a(int paramInt1, int paramInt2, int paramInt3)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("layoutId", paramInt1);
    localBundle.putInt("width", paramInt2);
    localBundle.putInt("height", paramInt3);
    return localBundle;
  }
  
  public void P() {}
  
  public void Q() {}
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(h().getInt("layoutId"), paramViewGroup, false);
    this.b = new Handler();
    this.c = h().getInt("width");
    this.d = h().getInt("height");
    this.e = Math.max(this.c / 1848.0F, this.d / 1236.0F);
    this.f = (0.5F * (this.c - 1848.0F * this.e));
    this.g = (0.5F * (this.d - 1236.0F * this.e));
    a();
    return this.a;
  }
  
  protected final RelativeLayout.LayoutParams a(float paramFloat)
  {
    int i = ViewTools.a(paramFloat * this.e + this.g);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(0, i, 0, 0);
    localLayoutParams.addRule(14);
    return localLayoutParams;
  }
  
  protected final RelativeLayout.LayoutParams a(float paramFloat1, float paramFloat2)
  {
    int i = ViewTools.a(paramFloat1 * this.e + this.f);
    int j = ViewTools.a(paramFloat2 * this.e + this.g);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(i, j, 0, 0);
    return localLayoutParams;
  }
  
  protected final RelativeLayout.LayoutParams a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = -2;
    int j = ViewTools.a(paramFloat1 * this.e + this.f);
    int k = ViewTools.a(paramFloat2 * this.e + this.g);
    int m;
    if (paramFloat3 == -2.0F)
    {
      m = i;
      if (paramFloat4 != -2.0F) {
        break label96;
      }
    }
    for (;;)
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(m, i);
      localLayoutParams.setMargins(j, k, 0, 0);
      return localLayoutParams;
      m = ViewTools.a(paramFloat3 * this.e);
      break;
      label96:
      i = ViewTools.a(paramFloat4 * this.e);
    }
  }
  
  protected boolean a()
  {
    return false;
  }
  
  protected final float b(float paramFloat)
  {
    return paramFloat * this.e;
  }
  
  public final View b(int paramInt)
  {
    return this.a.findViewById(paramInt);
  }
  
  protected final RelativeLayout.LayoutParams b(float paramFloat1, float paramFloat2)
  {
    return c(paramFloat1, paramFloat2, -2.0F, -2.0F);
  }
  
  protected final RelativeLayout.LayoutParams b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = ViewTools.a(paramFloat1 * this.e + this.f);
    int j = ViewTools.a(paramFloat2 * this.e + this.g);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(ViewTools.a(paramFloat3 * this.e), j + ViewTools.a(paramFloat4 * this.e));
    localLayoutParams.setMargins(i, 0, 0, 0);
    return localLayoutParams;
  }
  
  public void b() {}
  
  protected final RelativeLayout.LayoutParams c(float paramFloat1, float paramFloat2)
  {
    return d(paramFloat1, paramFloat2, -2.0F, -2.0F);
  }
  
  protected final RelativeLayout.LayoutParams c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    RelativeLayout.LayoutParams localLayoutParams = a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    localLayoutParams.setMargins(localLayoutParams.leftMargin, 0, 0, localLayoutParams.topMargin);
    localLayoutParams.addRule(12);
    return localLayoutParams;
  }
  
  protected final RelativeLayout.LayoutParams d(float paramFloat1, float paramFloat2)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, ViewTools.a(paramFloat1 * this.e + this.g) + ViewTools.a(paramFloat2 * this.e));
    localLayoutParams.setMargins(0, 0, 0, 0);
    localLayoutParams.addRule(14);
    return localLayoutParams;
  }
  
  protected final RelativeLayout.LayoutParams d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    RelativeLayout.LayoutParams localLayoutParams = a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    localLayoutParams.setMargins(0, 0, localLayoutParams.leftMargin, localLayoutParams.topMargin);
    localLayoutParams.addRule(12);
    localLayoutParams.addRule(11);
    return localLayoutParams;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPageFragment
 * JD-Core Version:    0.7.0.1
 */