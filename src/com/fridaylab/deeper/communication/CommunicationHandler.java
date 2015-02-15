package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;

class CommunicationHandler
  extends Handler	// handler用于异步消息的处理
{
  private final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();
  private final Context b;
  private boolean c;
  private boolean d = true;
  private boolean e;
  private DeeperLink f;
  private DeeperFinder g;
  private CommunicationProtocol$ConnectionInfo h;
  
  public CommunicationHandler(Context paramContext)
  {
    this.b = paramContext;
    this.h = new CommunicationProtocol$ConnectionInfo(CommunicationProtocol$ConnectionState.c, DeeperModel.a);
  }	// ConnectionState："Exploring"
  
  private void a(BluetoothAgent paramBluetoothAgent)
  {
    if ((paramBluetoothAgent == null) || (paramBluetoothAgent.a_())) {
      return;
    }
    paramBluetoothAgent.b();
  }
  
  private void a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (this.a == null) {}
    do
    {
      return;
      if (this.d)
      {
        this.c = this.a.isEnabled();
        this.d = false;
      }
    } while (this.f != null);
    if ((paramBoolean) && (this.g != null)) {
      a(this.g);
    }
    this.f = new DeeperLink(this.b, this, paramString, paramInt);
    this.f.e();
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    if (this.a == null) {}
    do
    {
      return;
      if (this.d)
      {
        this.c = this.a.isEnabled();
        this.d = false;
      }
      if ((this.g == null) && (this.f == null)) {
        break;
      }
    } while (!e());
    if (paramBoolean) {}
    for (int i = 0;; i = 1)
    {
      sendMessageDelayed(obtainMessage(502, i, 0, paramString), 80L);
      return;
    }
    this.g = new DeeperFinder(this.b, this, paramString, paramBoolean);
    this.g.e();
  }
  
  private void b()
  {
    if ((this.f == null) && (this.g == null)) {
      c();
    }
    this.e = true;
    d();
  }
  
  private void b(BluetoothAgent paramBluetoothAgent)
  {
    paramBluetoothAgent.a();
    if (paramBluetoothAgent == this.f) {
      this.f = null;
    }
    if (paramBluetoothAgent == this.g) {
      this.g = null;
    }
    if ((this.e) && (this.f == null) && (this.g == null)) {
      c();
    }
  }
  
  private void c()
  {
    if ((!this.d) && (!this.c) && (this.a != null)) {
      this.a.disable();
    }
    getLooper().quit();
  }
  
  private void d()
  {
    if ((this.f == null) && (this.g == null))
    {
      this.h = new CommunicationProtocol$ConnectionInfo(CommunicationProtocol$ConnectionState.g, this.h.b);
      return;
    }
    a(this.f);
    a(this.g);
  }
  
  private boolean e()
  {
    return ((this.g != null) && (this.g.a_())) || ((this.f != null) && (this.f.a_()));
  }
  
  private void f()
  {
    if (this.g != null) {
      this.g.f();
    }
  }
  
  private void g()
  {
    if (this.g != null) {
      this.g.g();
    }
  }
  
  public CommunicationProtocol$ConnectionInfo a()
  {
    return this.h;
  }
  
  public void a(CommunicationProtocol$ConnectionState paramConnectionState, DeeperModel paramDeeperModel)
  {
    if ((paramDeeperModel == null) && (hasMessages(502))) {
      paramConnectionState = CommunicationProtocol$ConnectionState.c;
    }
    if ((this.h.a != paramConnectionState) || (this.h.b != paramDeeperModel)) {
      if (paramDeeperModel != null) {
        break label94;
      }
    }
    label94:
    for (DeeperModel localDeeperModel = this.h.b;; localDeeperModel = paramDeeperModel)
    {
      if (localDeeperModel == null) {
        localDeeperModel = DeeperModel.a;
      }
      this.h = new CommunicationProtocol$ConnectionInfo(paramConnectionState, localDeeperModel);
      LocalBroadcastManager.a(this.b).a(new Intent("com.fridaylab.deeper.STATE_CHANGED"));
      return;
    }
  }
  
  // 处理传入的异步消息
  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    if (paramMessage.what == 501)
    {
      String str2 = (String)paramMessage.obj;
      int j = paramMessage.arg1;
      if (paramMessage.arg2 == i) {
        a(str2, j, i);
      }
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      boolean bool = false;
      break;
      if (paramMessage.what == 502)
      {
        String str1 = (String)paramMessage.obj;
        if (paramMessage.arg1 == 0) {}
        for (;;)
        {
          a(str1, bool);
          break;
          bool = false;
        }
      }
      if (paramMessage.what == 503) {
        d();
      } else if (paramMessage.what == -1) {
        b();
      } else if (paramMessage.what == 504) {
        a(this.g);
      } else if (paramMessage.what == 801) {
        b((BluetoothAgent)paramMessage.obj);
      } else if (paramMessage.what == 803) {
        g();
      } else if (paramMessage.what == 804) {
        f();
      } else if (paramMessage.what == 802) {
        a(CommunicationProtocol$ConnectionState.values()[paramMessage.arg1], (DeeperModel)paramMessage.obj);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.CommunicationHandler
 * JD-Core Version:    0.7.0.1
 */