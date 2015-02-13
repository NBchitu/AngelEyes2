package com.telesoftas.services;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import com.fridaylab.deeper.communication.Command;
import com.fridaylab.deeper.communication.DeeperChannel.SignalObserver;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.FishData;
import com.telesoftas.hardware.FishData.FishSizeTypes;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.hardware.NotificationPacket;
import com.telesoftas.utilities.SoundWarningManager;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class DeeperDeviceManager
  implements DeeperChannel.SignalObserver
{
  private final Context a;
  private FileService b;
  private final GlobalBluetoothOutputStream c;
  private final DeeperDataManager d;
  private final SoundWarningManager e;
  private boolean f = true;
  
  public DeeperDeviceManager(Context paramContext, DeeperDataManager paramDeeperDataManager, SoundWarningManager paramSoundWarningManager)
  {
    this.a = paramContext;
    this.d = paramDeeperDataManager;
    this.e = paramSoundWarningManager;
    this.c = GlobalBluetoothOutputStream.a();
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    this.c.a(paramArrayOfByte);
  }
  
  public static boolean a(Context paramContext, float paramFloat)
  {
    int[] arrayOfInt = SettingsUtils.c(paramContext);
    if ((paramFloat != 2.0F) && (arrayOfInt != null))
    {
      double d1 = 41.439999F * paramFloat;
      if ((d1 <= arrayOfInt[0]) || (d1 >= arrayOfInt[1])) {
        return true;
      }
    }
    return false;
  }
  
  private boolean a(FishData[] paramArrayOfFishData)
  {
    boolean[] arrayOfBoolean = SettingsUtils.b(this.a);
    if ((paramArrayOfFishData != null) && (arrayOfBoolean != null))
    {
      int i = paramArrayOfFishData.length;
      for (int j = 0; j < i; j++)
      {
        FishData.FishSizeTypes localFishSizeTypes = paramArrayOfFishData[j].getFishRealSize();
        if ((arrayOfBoolean[0] != 0) && (localFishSizeTypes == FishData.FishSizeTypes.a)) {}
        while (((arrayOfBoolean[1] != 0) && (localFishSizeTypes == FishData.FishSizeTypes.b)) || ((arrayOfBoolean[2] != 0) && (localFishSizeTypes == FishData.FishSizeTypes.c))) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void c(boolean paramBoolean)
  {
    a();
    if (paramBoolean)
    {
      this.b = new FileService(this.a, null, 8.0F, this);
      this.b.a("recording_ice.csv", 1, false);
      return;
    }
    this.b = new FileService(this.a, null, 18.0F, this);
    this.b.a("recording.csv", 19, true);
  }
  
  private void g()
  {
    LocalBroadcastManager.a(this.a).a(new Intent("BROADCAST_NEW_ECHO_AVAILABLE"));
  }
  
  private boolean h()
  {
    return SettingsUtils.a(this.a).getBoolean(SettingsUtils.f, false);
  }
  
  public void a()
  {
    if (this.b != null)
    {
      this.b.d();
      this.b = null;
    }
    if (this.d != null) {
      this.d.e();
    }
  }
  
  public void a(Context paramContext)
  {
    switch (paramContext.getSharedPreferences("prefs", 0).getInt(SettingsUtils.c, 2))
    {
    }
    for (byte[] arrayOfByte = Command.d;; arrayOfByte = Command.c)
    {
      a(arrayOfByte);
      return;
    }
  }
  
  public void a(Signal paramSignal)
  {
    if (paramSignal.c() == 2)
    {
      DeeperFishDataPacket localDeeperFishDataPacket = (DeeperFishDataPacket)paramSignal;
      int i = 1 + this.d.b();
      float[] arrayOfFloat = new float[i];
      arrayOfFloat[(i - 1)] = localDeeperFishDataPacket.a();
      localDeeperFishDataPacket.a(arrayOfFloat);
      this.d.a(localDeeperFishDataPacket);
      g();
      if ((f()) && (a(localDeeperFishDataPacket.j())) && (SettingsUtils.a(this.a).getInt(SettingsUtils.s, 0) == 0)) {
        this.e.a(this.a, 1, 1.0F);
      }
    }
    DeeperRawDataPacket localDeeperRawDataPacket;
    do
    {
      return;
      if (paramSignal.c() != 1) {
        break;
      }
      localDeeperRawDataPacket = (DeeperRawDataPacket)paramSignal;
      this.d.a(localDeeperRawDataPacket);
      g();
    } while ((!f()) || (!h()) || (!a(localDeeperRawDataPacket.j())) || (SettingsUtils.a(this.a).getInt(SettingsUtils.s, 0) != 0));
    this.e.a(this.a, 1, 1.0F);
    return;
    switch (((NotificationPacket)paramSignal).a)
    {
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.d.e();
    this.d.a(2.0F);
    c(paramBoolean);
  }
  
  public String b()
  {
    if ((this.b != null) && (this.b.c())) {
      return this.b.a();
    }
    return null;
  }
  
  public void b(Context paramContext)
  {
    int i = 1;
    int k = paramContext.getSharedPreferences("prefs", 0).getInt(SettingsUtils.b, i);
    byte[] arrayOfByte;
    FileService localFileService;
    if (k == i)
    {
      arrayOfByte = Command.f;
      if (this.b != null)
      {
        localFileService = this.b;
        if (k != i) {
          break label68;
        }
      }
    }
    for (;;)
    {
      localFileService.a(i);
      a(arrayOfByte);
      return;
      arrayOfByte = Command.e;
      break;
      label68:
      int j = 0;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public int c()
  {
    if ((this.b != null) && (this.b.c())) {
      return this.b.b();
    }
    return 5;
  }
  
  public void c(Context paramContext)
  {
    int i = 1;
    if (SettingsUtils.a(paramContext).getInt(SettingsUtils.g, 0) == i) {
      if (i == 0) {
        break label38;
      }
    }
    label38:
    for (byte[] arrayOfByte = Command.i;; arrayOfByte = Command.j)
    {
      a(arrayOfByte);
      return;
      i = 0;
      break;
    }
  }
  
  public void d()
  {
    HardwareJni.resetAnalyzer();
    a(Command.h);
  }
  
  public void e()
  {
    a(Command.g);
  }
  
  public boolean f()
  {
    return this.f;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.services.DeeperDeviceManager
 * JD-Core Version:    0.7.0.1
 */