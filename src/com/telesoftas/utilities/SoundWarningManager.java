package com.telesoftas.utilities;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseIntArray;

public class SoundWarningManager
{
  private static final String a = SoundWarningManager.class.getSimpleName();
  private SoundPool b = new SoundPool(2, 3, 0);
  private final SparseIntArray c = new SparseIntArray();
  private final AudioManager d;
  
  public SoundWarningManager(Context paramContext)
  {
    this.d = ((AudioManager)paramContext.getSystemService("audio"));
    a(paramContext);
  }
  
  public void a(Context paramContext)
  {
    this.c.put(1, this.b.load(paramContext, 2131034115, 1));
  }
  
  public void a(Context paramContext, int paramInt, float paramFloat)
  {
    if ((this.d == null) || (((TelephonyManager)paramContext.getSystemService("phone")).getCallState() != 0)) {}
    float f;
    do
    {
      return;
      f = this.d.getStreamVolume(3) / this.d.getStreamMaxVolume(3);
    } while (this.b.play(this.c.get(paramInt), f, f, 1, 0, paramFloat) != 0);
    Log.e(a, "playing sound failed");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.SoundWarningManager
 * JD-Core Version:    0.7.0.1
 */