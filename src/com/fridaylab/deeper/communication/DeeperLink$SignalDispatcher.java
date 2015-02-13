package com.fridaylab.deeper.communication;

import android.content.Context;
import com.telesoftas.services.Signal;

class DeeperLink$SignalDispatcher
  implements Runnable
{
  private final Context a;
  private final Signal b;
  private final DeeperChannel.SignalObserver c;
  private final TransmissionAssistant[] d;
  
  public DeeperLink$SignalDispatcher(Context paramContext, Signal paramSignal, DeeperChannel.SignalObserver paramSignalObserver, TransmissionAssistant[] paramArrayOfTransmissionAssistant)
  {
    this.a = paramContext;
    this.b = paramSignal;
    this.c = paramSignalObserver;
    this.d = paramArrayOfTransmissionAssistant;
  }
  
  public void run()
  {
    TransmissionAssistant[] arrayOfTransmissionAssistant = this.d;
    int i = arrayOfTransmissionAssistant.length;
    for (int j = 0; j < i; j++) {
      arrayOfTransmissionAssistant[j].a(this.a, this.b);
    }
    this.c.a(this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperLink.SignalDispatcher
 * JD-Core Version:    0.7.0.1
 */