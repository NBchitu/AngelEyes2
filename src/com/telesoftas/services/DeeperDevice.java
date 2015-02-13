package com.telesoftas.services;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

public class DeeperDevice
{
  public static String a = "deeper";
  public static int b = 1796;	// WEARABLE_WRIST_WATCH
  private final BluetoothDevice c;
  private boolean d;
  private String e;
  
  public DeeperDevice(BluetoothDevice paramBluetoothDevice)
  {
    this.c = paramBluetoothDevice;
  }
  
  public static boolean a(BluetoothDevice paramBluetoothDevice)
  {
    BluetoothClass localBluetoothClass = paramBluetoothDevice.getBluetoothClass();
    if (localBluetoothClass == null) {}
    while (localBluetoothClass.getDeviceClass() == b) {
      return true;
    }
    return false;
  }
  
  public static boolean a(Context paramContext, BluetoothDevice paramBluetoothDevice)
  {
    String str = paramBluetoothDevice.getName();
    if (str == null) {
      return false;
    }
    if (str.toLowerCase(Locale.US).startsWith(a)) {
      return true;
    }
    return paramContext.getSharedPreferences("records", 0).contains(paramBluetoothDevice.getAddress());
  }
  
  public void a(boolean paramBoolean, String paramString)
  {
    this.d = paramBoolean;
    this.e = paramString;
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public String b()
  {
    if (this.c != null) {
      return this.c.getAddress();
    }
    return null;
  }
  
  public String c()
  {
    String str;
    if (this.c == null) {
      str = null;
    }
    do
    {
      return str;
      str = this.c.getName();
    } while (!TextUtils.isEmpty(str));
    return this.c.getAddress();
  }
  
  public String d()
  {
    return this.e;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.DeeperDevice
 * JD-Core Version:    0.7.0.1
 */