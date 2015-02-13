package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;

class nj$a
  extends Handler
{
  private final LocationListener a;
  
  public nj$a(LocationListener paramLocationListener)
  {
    this.a = paramLocationListener;
  }
  
  public nj$a(LocationListener paramLocationListener, Looper paramLooper)
  {
    super(paramLooper);
    this.a = paramLocationListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
      return;
    }
    Location localLocation = new Location((Location)paramMessage.obj);
    this.a.a(localLocation);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nj.a
 * JD-Core Version:    0.7.0.1
 */