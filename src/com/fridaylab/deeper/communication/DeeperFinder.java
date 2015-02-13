package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.telesoftas.deeper.activities.SettingsDeepersActivity;
import com.telesoftas.services.DeeperDevice;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

public class DeeperFinder
  extends BluetoothAgent
  implements Runnable
{
  private static Intent p = new Intent().setAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
  private final Context d;
  private final BluetoothAdapter e;
  private final String f;
  private final boolean g;
  private final ArrayDeque<BluetoothDevice> h = new ArrayDeque();
  private final DeeperFinder.BluetoothObserver i = new DeeperFinder.BluetoothObserver(this);
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m = true;
  private boolean n = false;
  private boolean o;
  private final Runnable q = new DeeperFinder.1(this);
  private final BroadcastReceiver r = new DeeperFinder.2(this);
  
  public DeeperFinder(Context paramContext, CommunicationHandler paramCommunicationHandler, String paramString, boolean paramBoolean)
  {
    super(paramCommunicationHandler);
    this.d = paramContext;
    this.e = BluetoothAdapter.getDefaultAdapter();
    this.f = paramString;
    this.g = paramBoolean;
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.j)
    {
      d();
      return;
    }
    BluetoothDevice localBluetoothDevice = (BluetoothDevice)this.h.pollFirst();
    if (localBluetoothDevice != null)
    {
      CommunicationHandler localCommunicationHandler = this.c;
      if (paramBoolean) {}
      for (int i1 = 4;; i1 = 1)
      {
        localCommunicationHandler.obtainMessage(501, i1, 0, localBluetoothDevice.getAddress()).sendToTarget();
        return;
      }
    }
    if (this.g)
    {
      j();
      return;
    }
    d();
  }
  
  private void i()
  {
    if ((this.o) || (!this.g))
    {
      Iterator localIterator = this.e.getBondedDevices().iterator();
      while (localIterator.hasNext())
      {
        BluetoothDevice localBluetoothDevice = (BluetoothDevice)localIterator.next();
        if (DeeperDevice.a(this.d, localBluetoothDevice)) {
          if (localBluetoothDevice.getAddress().equals(this.f)) {
            this.h.addFirst(localBluetoothDevice);
          } else {
            this.h.addLast(localBluetoothDevice);
          }
        }
      }
    }
    if (this.h.size() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      a(bool);
      return;
    }
  }
  
  private void j()
  {
    this.j = true;
    a(CommunicationProtocol.ConnectionState.c, null);
    this.k = true;
    this.d.registerReceiver(this.r, SettingsDeepersActivity.g(), null, this.c);
    this.e.startDiscovery();
    this.c.postDelayed(this.q, 40000L);
  }
  
  private void k()
  {
    if (!this.k) {
      return;
    }
    this.k = false;
    this.d.unregisterReceiver(this.r);
    this.e.cancelDiscovery();
  }
  
  private void l()
  {
    k();
    BluetoothDevice localBluetoothDevice = (BluetoothDevice)this.h.peekFirst();
    boolean bool;
    if (localBluetoothDevice == null)
    {
      bool = true;
      this.m = bool;
      if (!this.j) {
        break label125;
      }
      if (localBluetoothDevice == null) {
        break label102;
      }
      if (localBluetoothDevice.getBondState() != 12) {
        break label76;
      }
      this.c.obtainMessage(501, 6, 0, localBluetoothDevice.getAddress()).sendToTarget();
      label66:
      d();
    }
    label76:
    label102:
    do
    {
      return;
      bool = false;
      break;
      if (a_()) {
        break label66;
      }
      a(CommunicationProtocol.ConnectionState.d, DeeperModel.a(localBluetoothDevice));
      this.n = true;
      break label66;
      a(CommunicationProtocol.ConnectionState.b, null);
    } while (this.b);
    this.i.a();
    return;
    label125:
    d();
  }
  
  public void a()
  {
    k();
    this.c.removeCallbacks(this);
    if ((!this.l) && (!this.n))
    {
      if ((!this.j) || (this.m)) {
        a(CommunicationProtocol.ConnectionState.b, null);
      }
    }
    else {
      return;
    }
    a(CommunicationProtocol.ConnectionState.g, null);
  }
  
  public void b()
  {
    super.b();
    this.i.b();
    this.c.removeCallbacks(this.q);
    if (this.k) {
      this.q.run();
    }
    k();
    d();
  }
  
  public void e()
  {
    this.o = this.e.isEnabled();
    if ((this.o) || (this.e.enable()))
    {
      a(CommunicationProtocol.ConnectionState.c, null);
      run();
      return;
    }
    d();
  }
  
  public void f()
  {
    a(false);
  }
  
  public void g()
  {
    this.l = true;
    d();
  }
  
  public void run()
  {
    if (this.e.isEnabled())
    {
      i();
      return;
    }
    this.c.postDelayed(this, 100L);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperFinder
 * JD-Core Version:    0.7.0.1
 */