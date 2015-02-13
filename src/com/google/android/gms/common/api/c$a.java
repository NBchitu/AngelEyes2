package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

class c$a
  extends BroadcastReceiver
{
  private WeakReference<c> a;
  
  c$a(c paramc)
  {
    this.a = new WeakReference(paramc);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Uri localUri = paramIntent.getData();
    String str = null;
    if (localUri != null) {
      str = localUri.getSchemeSpecificPart();
    }
    if ((str == null) || (!str.equals("com.google.android.gms"))) {}
    c localc;
    do
    {
      return;
      localc = (c)this.a.get();
    } while ((localc == null) || (localc.d()) || (localc.e()) || (!localc.f()));
    localc.b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c.a
 * JD-Core Version:    0.7.0.1
 */