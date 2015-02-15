package com.telesoftas.services;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

public class DeeperDevice
{
  public static String strDeviceName = "deeper";	// a
  public static int iDeviceClass = 1796;	// WEARABLE_WRIST_WATCH // b
  private final BluetoothDevice btDevice;	// c
  private boolean d;
  private String e;
  
  // 构造函数
  public DeeperDevice(BluetoothDevice paramBluetoothDevice)
  {
    this.btDevice = paramBluetoothDevice;
  }
  
  // 判断蓝牙设备是否为 WEARABLE_WRIST_WATCH
  public static boolean a(BluetoothDevice paramBluetoothDevice)
  {
    // 获取DeviceClass 如 WEARABLE_WRIST_WATCH
	BluetoothClass localBluetoothClass = paramBluetoothDevice.getBluetoothClass();
	// 是 WEARABLE_WRIST_WATCH 设备,返回true
    if (localBluetoothClass.getDeviceClass() == iDeviceClass) {
      return true;
    }
    return false;
  }
  
  // 判断蓝牙设备名称是否为deeper开头,或者是否在配置文件里已保存有该蓝牙设备的mac地址
  public static boolean a(Context paramContext, BluetoothDevice paramBluetoothDevice)
  {
    String str = paramBluetoothDevice.getName();	// 获取设备名称
    if (str == null) {		// 设备名称为空,返回false
      return false;
    }
    if (str.toLowerCase(Locale.US).startsWith(strDeviceName)) {	// 若设备名称以"deeper"开头,返回true
      return true;
    }
    // 设备名称不是以Deeper开头的,判断SharedPreferences是否包含特定蓝牙mac地址数据
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
    if (this.btDevice != null) {
      return this.btDevice.getAddress();
    }
    return null;
  }
  
  public String c()
  {
    String str;
    if (this.btDevice == null) {
      str = null;
    }
    do
    {
      return str;
      str = this.btDevice.getName();
    } while (!TextUtils.isEmpty(str));
    return this.btDevice.getAddress();
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