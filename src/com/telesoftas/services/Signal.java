package com.telesoftas.services;

import android.content.Context;
import android.content.res.Resources;

public abstract class Signal
{
  private static float a = -1.0F;
  public static final byte[] c = null;
  public static final byte[] d = new byte[0];
  private final long b = System.nanoTime();
  
  public static float a(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (a <= 0.0F)
    {
      // fish_small_height / width_ratio
      a = localResources.getDimension(2131230725) / localResources.getDimension(2131230789);
      a = (float)Math.floor(0.3F + a);
      a = Math.max(a, 2.0F);
    }
    return a;
  }
  
  public float a(Context paramContext)
  {
    return a(paramContext, c());
  }
  
  public boolean a(byte paramByte1, byte paramByte2)
  {
    return false;
  }
  
  public boolean a(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    return false;
  }
  
  public boolean a(byte paramByte, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    return false;
  }
  
  public abstract int c();
  
  public abstract String d();
  
  public final long k()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.Signal
 * JD-Core Version:    0.7.0.1
 */