package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.jy;
import com.google.android.gms.internal.jz;

public final class SignInButton
  extends FrameLayout
  implements View.OnClickListener
{
  private int a;
  private int b;
  private View c;
  private View.OnClickListener d = null;
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(0, 0);
  }
  
  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    jz localjz = new jz(paramContext);
    localjz.a(paramContext.getResources(), paramInt1, paramInt2);
    return localjz;
  }
  
  private void a(Context paramContext)
  {
    if (this.c != null) {
      removeView(this.c);
    }
    try
    {
      this.c = jy.a(paramContext, this.a, this.b);
      addView(this.c);
      this.c.setEnabled(isEnabled());
      this.c.setOnClickListener(this);
      return;
    }
    catch (g.a locala)
    {
      for (;;)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        this.c = a(paramContext, this.a, this.b);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    boolean bool1;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      jx.a(bool1, "Unknown button size %d", arrayOfObject1);
      if ((paramInt2 < 0) || (paramInt2 >= 2)) {
        break label92;
      }
    }
    label92:
    for (boolean bool2 = true;; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      jx.a(bool2, "Unknown color scheme %s", arrayOfObject2);
      this.a = paramInt1;
      this.b = paramInt2;
      a(getContext());
      return;
      bool1 = false;
      break;
    }
  }
  
  public void onClick(View paramView)
  {
    if ((this.d != null) && (paramView == this.c)) {
      this.d.onClick(this);
    }
  }
  
  public void setColorScheme(int paramInt)
  {
    a(this.a, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
    if (this.c != null) {
      this.c.setOnClickListener(this);
    }
  }
  
  public void setSize(int paramInt)
  {
    a(paramInt, this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.7.0.1
 */