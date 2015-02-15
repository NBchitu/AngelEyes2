package com.fridaylab.deeper.communication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.telesoftas.hardware.HardwareInfo;
import com.telesoftas.services.DeeperDevice;
import java.util.HashMap;
import java.util.Map;

public class DeeperModel
{
  public static final DeeperModel a = new DeeperModel();
  private static Map<String, DeeperModel> k = new HashMap();
  private final String b;	// 蓝牙设备名字
  private final String c;
  private DeeperModel$OperationMode d = DeeperModel$OperationMode.a;
  private int e = 200;
  private int f = 666;
  private String g;
  private float h = -1.0F;
  private boolean i;
  private HardwareInfo j;
  
  private DeeperModel()
  {
    this.b = null;
    this.c = "FridayLab";
  }
  
  private DeeperModel(String paramString1, String paramString2)
  {
    this.c = paramString1;	// mac_address
    if (paramString2 == null) {
      paramString2 = d(paramString1);	// 得到蓝牙设备名字 
    }
    this.b = paramString2;	// 根据传入参数设置蓝牙设备名字
  }
  
  // BluetoothDevice的mac_address返回键值对中的DeeperModel
  public static DeeperModel a(BluetoothDevice paramBluetoothDevice)
  {
    String str1 = paramBluetoothDevice.getAddress();	// 获取mac_address
    DeeperModel localDeeperModel = (DeeperModel)k.get(str1);	// k 为hashmap 键值对,<String,DeeperModel>
    if (localDeeperModel != null) 
    	return localDeeperModel;	// 返回DeeperModel
    String str2;
    do
    {
      
      str2 = paramBluetoothDevice.getName();	// 获取蓝牙名称
      localDeeperModel = new DeeperModel(str1, str2);	// 创新DeeperModel
    } while (TextUtils.isEmpty(str2));		// str2为空则不停获取,什么时候才能退出啊
    
    k.put(str1, localDeeperModel);	// 在k HashMap中插入新键值对
    return localDeeperModel;
  }
  
  // 根据mac_address来返回或者新建DeeperModel
  public static DeeperModel b(String paramString)
  {
    DeeperModel localDeeperModel = (DeeperModel)k.get(paramString);
    if (localDeeperModel != null) {
      return localDeeperModel;
    }
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    // localBluetoothAdapter 非空,则表明手机具有蓝牙模块
    // checkBluetoothAddress 验证蓝牙设备MAC地址是否有效。所有设备地址的英文字母必须大写，48位，形如：00:43:A8:23:10:F1 
    if ((localBluetoothAdapter == null) || (paramString == null) || (!BluetoothAdapter.checkBluetoothAddress(paramString))) {
      // 如果不满足,则新建DeeperModel
    	return new DeeperModel(paramString, null);	// 设置DeeperModel的蓝牙mac_address和名字
    }
    // 存在则
    // getRemoteDevice以给定的MAC地址去创建一个 BluetoothDevice 类实例(代表远程蓝牙实例)。即使该蓝牙地址不可见，也会产生
    // 一个BluetoothDevice 类实例
    // 得到
    return a(localBluetoothAdapter.getRemoteDevice(paramString));
  }
  
  // 
  @Deprecated
  public static Boolean c(String paramString)
  {
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if ((localBluetoothAdapter == null) || (paramString == null) || (!BluetoothAdapter.checkBluetoothAddress(paramString))) {
      return Boolean.valueOf(false);
    }
    if (!localBluetoothAdapter.isEnabled()) {
      return null;
    }
    int m = localBluetoothAdapter.getRemoteDevice(paramString).getBondState();
    boolean bool = false;
    if (m == 12) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  private static String d(String paramString)
  {
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if ((localBluetoothAdapter == null) || (paramString == null) || (!BluetoothAdapter.checkBluetoothAddress(paramString))) {}
    BluetoothDevice localBluetoothDevice;
    do
    {
      // return null;
      // 根据mac_address得到BluetoothDevice实例
      localBluetoothDevice = localBluetoothAdapter.getRemoteDevice(paramString);
    } while (!DeeperDevice.a(localBluetoothDevice));	// 判断蓝牙设备是否为 WEARABLE_WRIST_WATCH
    return localBluetoothDevice.getName();	// 返回获取到的蓝牙设备Name
  }
  
  public String a()
  {
    if (TextUtils.isEmpty(this.b)) {
      return "Deeper";
    }
    return this.b;
  }
  
  void a(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  void a(DeeperModel$OperationMode paramOperationMode)
  {
    this.d = paramOperationMode;
  }
  
  void a(HardwareInfo paramHardwareInfo)
  {
    this.j = paramHardwareInfo;
  }
  
  void a(String paramString)
  {
    this.g = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public String b()
  {
    if (TextUtils.isEmpty(this.b)) {
      return c();
    }
    return this.b;
  }
  
  void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public DeeperModel$OperationMode d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public boolean g()
  {
    if (this.j == null) {
      return false;
    }
    return this.j.isRawImagingSupported();
  }
  
  public boolean h()
  {
    if (this.j == null) {
      return false;
    }
    return this.j.isNightFishingSupported();
  }
  
  public boolean i()
  {
    if (this.j == null) {
      return false;
    }
    return this.j.isIceFishingSupported();
  }
  
  public boolean j()
  {
    return (this.h >= 0.0F) || (k());
  }
  
  public boolean k()
  {
    return this.i;
  }
  
  public float l()
  {
    return this.h;
  }
  
  // 是否为设备无法探底 UnableToDetectGround
  public boolean m()
  {
    return this.d == DeeperModel$OperationMode.i;
  }
  
  // 是否为设备离开水面 OutOfWater
  public boolean n()
  {
    return this.d == DeeperModel$OperationMode.d;
  }
  
  // 是否为没电了 EmptyBattery
  public boolean o()
  {
    return this.d == DeeperModel$OperationMode.c;
  }
  
  // 是否为设备正在充电 Charging
  public boolean p()
  {
    return this.d == DeeperModel$OperationMode.e;
  }
  
  public String q()
  {
    return this.g;
  }
  
  HardwareInfo r()
  {
    return this.j;
  }
  
  boolean s()
  {
    if (this.j == null) {
      return false;
    }
    return this.j.isAutoConnectSupported();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperModel
 * JD-Core Version:    0.7.0.1
 */