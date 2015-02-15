package com.telesoftas.hardware;

import java.util.Locale;

public class HardwareInfo	// 设备硬件相关 固件等
{
  public static final int ACTION_UNRECOGNIZED = 0;
  public static final int ACTION_UPDATE_BOOTLOADER = 5;
  public static final int ACTION_UPDATE_BOOTLOADER_ASCII = 3;
  public static final int ACTION_UPDATE_FIRMWARE = 2;
  public static final int ACTION_UPDATE_REQUIRES_USB = 4;
  public static final int ACTION_UPTODATE = 1;
  public final int action = 0;
  public final byte[] bootloader = null;
  public final byte[] firmware = null;
  public final byte[] hardware = null;
  public final boolean isInBootloader = false;
  public final boolean parseSuccessful = false;
  public final byte[] protocol = null;
  public final boolean willDisconnectAfterSwitchingToBootloader = false;
  
  public int getAction()
  {
    return this.action;
  }
  
  public String getDisplayVersion()
  {
    if (!this.parseSuccessful) {
      return "";
    }
    if (this.isInBootloader) {
      return "";
    }
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Byte.valueOf(this.firmware[1]);
    arrayOfObject[1] = Byte.valueOf(this.firmware[0]);
    return String.format(localLocale, "%02d.%02d", arrayOfObject);
  }
  
  public boolean isAutoConnectSupported()
  {
    boolean bool = true;
    if (!this.parseSuccessful) {}
    while (this.isInBootloader) {
      return false;
    }
    if ((this.firmware[0] >= 21) && (this.firmware[bool] >= 2)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean isIceFishingSupported()
  {
    boolean bool = true;
    if (!this.parseSuccessful) {}
    while (this.isInBootloader) {
      return false;
    }
    if ((this.firmware[0] >= 22) && (this.firmware[bool] >= 2)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean isNightFishingSupported()
  {
    boolean bool = true;
    if (!this.parseSuccessful) {}
    while (this.isInBootloader) {
      return false;
    }
    if ((this.firmware[0] >= 22) && (this.firmware[bool] >= 2)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean isRawImagingSupported()
  {
    boolean bool = true;
    if (!this.parseSuccessful) {}
    while (this.isInBootloader) {
      return false;
    }
    if ((this.firmware[0] >= 19) && (this.firmware[bool] >= 2)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.HardwareInfo
 * JD-Core Version:    0.7.0.1
 */