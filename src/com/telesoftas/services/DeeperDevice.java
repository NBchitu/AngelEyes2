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
  
  // ���캯��
  public DeeperDevice(BluetoothDevice paramBluetoothDevice)
  {
    this.btDevice = paramBluetoothDevice;
  }
  
  // �ж������豸�Ƿ�Ϊ WEARABLE_WRIST_WATCH
  public static boolean a(BluetoothDevice paramBluetoothDevice)
  {
    // ��ȡDeviceClass �� WEARABLE_WRIST_WATCH
	BluetoothClass localBluetoothClass = paramBluetoothDevice.getBluetoothClass();
	// �� WEARABLE_WRIST_WATCH �豸,����true
    if (localBluetoothClass.getDeviceClass() == iDeviceClass) {
      return true;
    }
    return false;
  }
  
  // �ж������豸�����Ƿ�Ϊdeeper��ͷ,�����Ƿ��������ļ����ѱ����и������豸��mac��ַ
  public static boolean a(Context paramContext, BluetoothDevice paramBluetoothDevice)
  {
    String str = paramBluetoothDevice.getName();	// ��ȡ�豸����
    if (str == null) {		// �豸����Ϊ��,����false
      return false;
    }
    if (str.toLowerCase(Locale.US).startsWith(strDeviceName)) {	// ���豸������"deeper"��ͷ,����true
      return true;
    }
    // �豸���Ʋ�����Deeper��ͷ��,�ж�SharedPreferences�Ƿ�����ض�����mac��ַ����
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