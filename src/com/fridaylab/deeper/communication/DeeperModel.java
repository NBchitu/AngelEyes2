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
  private final String b;	// �����豸����
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
      paramString2 = d(paramString1);	// �õ������豸���� 
    }
    this.b = paramString2;	// ���ݴ���������������豸����
  }
  
  // BluetoothDevice��mac_address���ؼ�ֵ���е�DeeperModel
  public static DeeperModel a(BluetoothDevice paramBluetoothDevice)
  {
    String str1 = paramBluetoothDevice.getAddress();	// ��ȡmac_address
    DeeperModel localDeeperModel = (DeeperModel)k.get(str1);	// k Ϊhashmap ��ֵ��,<String,DeeperModel>
    if (localDeeperModel != null) 
    	return localDeeperModel;	// ����DeeperModel
    String str2;
    do
    {
      
      str2 = paramBluetoothDevice.getName();	// ��ȡ��������
      localDeeperModel = new DeeperModel(str1, str2);	// ����DeeperModel
    } while (TextUtils.isEmpty(str2));		// str2Ϊ����ͣ��ȡ,ʲôʱ������˳���
    
    k.put(str1, localDeeperModel);	// ��k HashMap�в����¼�ֵ��
    return localDeeperModel;
  }
  
  // ����mac_address�����ػ����½�DeeperModel
  public static DeeperModel b(String paramString)
  {
    DeeperModel localDeeperModel = (DeeperModel)k.get(paramString);
    if (localDeeperModel != null) {
      return localDeeperModel;
    }
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    // localBluetoothAdapter �ǿ�,������ֻ���������ģ��
    // checkBluetoothAddress ��֤�����豸MAC��ַ�Ƿ���Ч�������豸��ַ��Ӣ����ĸ�����д��48λ�����磺00:43:A8:23:10:F1 
    if ((localBluetoothAdapter == null) || (paramString == null) || (!BluetoothAdapter.checkBluetoothAddress(paramString))) {
      // ���������,���½�DeeperModel
    	return new DeeperModel(paramString, null);	// ����DeeperModel������mac_address������
    }
    // ������
    // getRemoteDevice�Ը�����MAC��ַȥ����һ�� BluetoothDevice ��ʵ��(����Զ������ʵ��)����ʹ��������ַ���ɼ���Ҳ�����
    // һ��BluetoothDevice ��ʵ��
    // �õ�
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
      // ����mac_address�õ�BluetoothDeviceʵ��
      localBluetoothDevice = localBluetoothAdapter.getRemoteDevice(paramString);
    } while (!DeeperDevice.a(localBluetoothDevice));	// �ж������豸�Ƿ�Ϊ WEARABLE_WRIST_WATCH
    return localBluetoothDevice.getName();	// ���ػ�ȡ���������豸Name
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
  
  // �Ƿ�Ϊ�豸�޷�̽�� UnableToDetectGround
  public boolean m()
  {
    return this.d == DeeperModel$OperationMode.i;
  }
  
  // �Ƿ�Ϊ�豸�뿪ˮ�� OutOfWater
  public boolean n()
  {
    return this.d == DeeperModel$OperationMode.d;
  }
  
  // �Ƿ�Ϊû���� EmptyBattery
  public boolean o()
  {
    return this.d == DeeperModel$OperationMode.c;
  }
  
  // �Ƿ�Ϊ�豸���ڳ�� Charging
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