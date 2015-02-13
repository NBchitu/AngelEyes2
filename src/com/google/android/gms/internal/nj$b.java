package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.b.a;

class nj$b
  extends b.a
{
  private Handler a;
  
  nj$b(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null) {}
    for (nj.a locala = new nj.a(paramLocationListener);; locala = new nj.a(paramLocationListener, paramLooper))
    {
      this.a = locala;
      return;
    }
  }
  
  public void a(Location paramLocation)
  {
    if (this.a == null)
    {
      Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramLocation;
    this.a.sendMessage(localMessage);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nj.b
 * JD-Core Version:    0.7.0.1
 */