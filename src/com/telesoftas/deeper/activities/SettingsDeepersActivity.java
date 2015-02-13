package com.telesoftas.deeper.activities;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fridaylab.deeper.communication.CommunicationGateway;
import com.fridaylab.deeper.communication.CommunicationService;
import com.telesoftas.services.DeeperDevice;
import java.util.ArrayList;

public class SettingsDeepersActivity
  extends WrapperActivity
{
  BluetoothAdapter n;
  boolean o;
  boolean p;
  BroadcastReceiver q = new SettingsDeepersActivity.7(this);
  private View r;
  private ViewGroup s;
  private final ArrayList<DeeperDevice> t = new ArrayList();
  private View u = null;
  private CommunicationGateway v;
  private final ServiceConnection w = new SettingsDeepersActivity.1(this);
  
  private void a(View paramView, DeeperDevice paramDeeperDevice)
  {
    ImageView localImageView = (ImageView)paramView.findViewById(2131296291);
    if (paramDeeperDevice.a())
    {
      localImageView.setVisibility(0);
      String str = paramDeeperDevice.d();
      if (!TextUtils.isEmpty(str)) {
        ((TextView)paramView.findViewById(2131296293)).setText(getString(2131427634, new Object[] { str }));
      }
      return;
    }
    localImageView.setVisibility(4);
  }
  
  private void a(DeeperDevice paramDeeperDevice)
  {
    for (int i = 0; i < this.t.size(); i++) {
      if (((DeeperDevice)this.t.get(i)).b().equals(paramDeeperDevice.b())) {
        return;
      }
    }
    if (this.r != null) {
      this.s.removeView(this.r);
    }
    this.t.add(paramDeeperDevice);
    View localView = ((LayoutInflater)getSystemService("layout_inflater")).inflate(2130903046, null);
    TextView localTextView1 = (TextView)localView.findViewById(2131296294);
    if (paramDeeperDevice.a())
    {
      localTextView1.setBackgroundResource(2130837554);
      localTextView1.setText(2131427408);
    }
    localView.setTag(paramDeeperDevice);
    localView.setOnClickListener(new SettingsDeepersActivity.5(this, localTextView1));
    localView.setOnTouchListener(new SettingsDeepersActivity.6(this));
    this.s.addView(localView);
    TextView localTextView2 = (TextView)localView.findViewById(2131296292);
    String str = paramDeeperDevice.c();
    if ((str == null) || (str.equals(""))) {
      localTextView2.setText(paramDeeperDevice.b());
    }
    for (;;)
    {
      a(localView, paramDeeperDevice);
      if (this.r != null) {
        this.s.addView(this.r);
      }
      k();
      return;
      localTextView2.setText(str);
    }
  }
  
  public static IntentFilter g()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.bluetooth.device.action.FOUND");
    localIntentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
    localIntentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
    return localIntentFilter;
  }
  
  private void h()
  {
    this.t.clear();
    this.s.removeAllViews();
    this.r = ((LayoutInflater)getSystemService("layout_inflater")).inflate(2130903046, null);
    this.r.setBackgroundResource(2130837549);
    this.r.setOnClickListener(new SettingsDeepersActivity.2(this));
    this.r.setOnTouchListener(new SettingsDeepersActivity.3(this));
    ((TextView)this.r.findViewById(2131296292)).setText(getString(2131427555));
    ImageView localImageView = (ImageView)this.r.findViewById(2131296291);
    localImageView.setVisibility(0);
    localImageView.setImageResource(2130837775);
    this.r.findViewById(2131296294).setVisibility(8);
    this.u = findViewById(2131296289);
    this.u.setVisibility(8);
    this.s.addView(this.r);
  }
  
  private void i()
  {
    if (this.o)
    {
      unbindService(this.w);
      this.o = false;
    }
  }
  
  private void j()
  {
    for (int i = 0; i < this.s.getChildCount(); i++)
    {
      View localView = this.s.getChildAt(i);
      DeeperDevice localDeeperDevice = (DeeperDevice)localView.getTag();
      if (localDeeperDevice != null) {
        a(localView, localDeeperDevice);
      }
    }
  }
  
  private void k()
  {
    int i = this.s.getChildCount();
    int j = 0;
    if (i == 1)
    {
      this.s.getChildAt(0).setBackgroundResource(2130837549);
      return;
    }
    label29:
    View localView;
    if (j < this.s.getChildCount())
    {
      localView = this.s.getChildAt(j);
      if (j != 0) {
        break label65;
      }
      localView.setBackgroundResource(2130837605);
    }
    for (;;)
    {
      j++;
      break label29;
      break;
      label65:
      if (j == -1 + this.s.getChildCount()) {
        localView.setBackgroundResource(2130837597);
      } else {
        localView.setBackgroundResource(2130837601);
      }
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    overridePendingTransition(17432578, 17432579);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setResult(0);
    this.n = BluetoothAdapter.getDefaultAdapter();
    if (this.n == null)
    {
      finish();
      return;
    }
    this.n.enable();
    setContentView(2130903045);
    this.s = ((ViewGroup)findViewById(2131296290));
    this.o = bindService(new Intent(this, CommunicationService.class), this.w, 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    i();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.p = false;
    unregisterReceiver(this.q);
  }
  
  protected void onResume()
  {
    super.onResume();
    registerReceiver(this.q, g());
    new SettingsDeepersActivity.4(this).g();
  }
  
  protected void onStart()
  {
    super.onStart();
    h();
    this.u.setVisibility(0);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.u.setVisibility(8);
    this.n.cancelDiscovery();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity
 * JD-Core Version:    0.7.0.1
 */