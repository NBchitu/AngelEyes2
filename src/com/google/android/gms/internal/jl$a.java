package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class jl$a
  extends Handler
{
  public jl$a(jl paramjl, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 1) && (!this.a.f()))
    {
      jl.b localb2 = (jl.b)paramMessage.obj;
      localb2.a();
      localb2.c();
      return;
    }
    if (paramMessage.what == 3)
    {
      jl.a(this.a).a(new ConnectionResult(((Integer)paramMessage.obj).intValue(), null));
      return;
    }
    if (paramMessage.what == 4)
    {
      jl.a(this.a, 4, null);
      jl.a(this.a).a(((Integer)paramMessage.obj).intValue());
      jl.a(this.a, 4, 1, null);
      return;
    }
    if ((paramMessage.what == 2) && (!this.a.c()))
    {
      jl.b localb1 = (jl.b)paramMessage.obj;
      localb1.a();
      localb1.c();
      return;
    }
    if ((paramMessage.what == 2) || (paramMessage.what == 1))
    {
      ((jl.b)paramMessage.obj).b();
      return;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jl.a
 * JD-Core Version:    0.7.0.1
 */