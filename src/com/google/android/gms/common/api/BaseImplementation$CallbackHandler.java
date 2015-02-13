package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

public class BaseImplementation$CallbackHandler<R extends Result>
  extends Handler
{
  public BaseImplementation$CallbackHandler()
  {
    this(Looper.getMainLooper());
  }
  
  public BaseImplementation$CallbackHandler(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void a()
  {
    removeMessages(2);
  }
  
  public void a(ResultCallback<R> paramResultCallback, R paramR)
  {
    sendMessage(obtainMessage(1, new Pair(paramResultCallback, paramR)));
  }
  
  protected void b(ResultCallback<R> paramResultCallback, R paramR)
  {
    try
    {
      paramResultCallback.a(paramR);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      BaseImplementation.a(paramR);
      throw localRuntimeException;
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.wtf("GoogleApi", "Don't know how to handle this message.");
      return;
    case 1: 
      Pair localPair = (Pair)paramMessage.obj;
      b((ResultCallback)localPair.first, (Result)localPair.second);
      return;
    }
    BaseImplementation.AbstractPendingResult.a((BaseImplementation.AbstractPendingResult)paramMessage.obj);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BaseImplementation.CallbackHandler
 * JD-Core Version:    0.7.0.1
 */