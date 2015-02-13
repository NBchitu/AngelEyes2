package com.fridaylab.deeper.ui;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.concurrent.Callable;

public final class ViewTools
{
  public static int a(float paramFloat)
  {
    return (int)(0.5F + paramFloat);
  }
  
  public static int a(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    return Math.max(localDisplay.getWidth(), localDisplay.getHeight());
  }
  
  public static void a(View paramView, Callable<Boolean> paramCallable)
  {
    paramView.getViewTreeObserver().addOnPreDrawListener(new ViewTools.1(paramView, paramCallable));
  }
  
  public static int b(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    return Math.min(localDisplay.getWidth(), localDisplay.getHeight());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.ViewTools
 * JD-Core Version:    0.7.0.1
 */