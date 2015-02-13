package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class jy
  extends g<ju>
{
  private static final jy a = new jy();
  
  private jy()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }
  
  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a.b(paramContext, paramInt1, paramInt2);
  }
  
  private View b(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      d locald = e.a(paramContext);
      View localView = (View)e.a(((ju)a(paramContext)).a(locald, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
      throw new g.a("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
    }
  }
  
  public ju b(IBinder paramIBinder)
  {
    return ju.a.a(paramIBinder);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jy
 * JD-Core Version:    0.7.0.1
 */