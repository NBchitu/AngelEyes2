package com.google.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class DelayedHitSender
  implements HitSender
{
  private static DelayedHitSender a;
  private static final Object b = new Object();
  private String c;
  private String d;
  private RateLimiter e;
  private HitSendingThread f;
  
  private DelayedHitSender(Context paramContext)
  {
    this(HitSendingThreadImpl.a(paramContext), new SendHitRateLimiter());
  }
  
  DelayedHitSender(HitSendingThread paramHitSendingThread, RateLimiter paramRateLimiter)
  {
    this.f = paramHitSendingThread;
    this.e = paramRateLimiter;
  }
  
  public static HitSender a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null) {
        a = new DelayedHitSender(paramContext);
      }
      DelayedHitSender localDelayedHitSender = a;
      return localDelayedHitSender;
    }
  }
  
  public boolean a(String paramString)
  {
    if (!this.e.a())
    {
      Log.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
      return false;
    }
    if ((this.c != null) && (this.d != null)) {}
    try
    {
      paramString = this.c + "?" + this.d + "=" + URLEncoder.encode(paramString, "UTF-8");
      Log.e("Sending wrapped url hit: " + paramString);
      this.f.a(paramString);
      return true;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.b("Error wrapping URL for testing.", localUnsupportedEncodingException);
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DelayedHitSender
 * JD-Core Version:    0.7.0.1
 */