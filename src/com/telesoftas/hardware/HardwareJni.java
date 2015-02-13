package com.telesoftas.hardware;

import com.fridaylab.deeper.communication.ParseResult;
import java.security.InvalidParameterException;

public class HardwareJni
{
  public static final byte[] a = new byte[0];
  
  static
  {
    System.loadLibrary("hardware-jni");
  }
  
  public static float a(byte paramByte, byte[] paramArrayOfByte, int[] paramArrayOfInt, ParseResult paramParseResult)
  {
    return analyzeRawSignal(paramByte, paramArrayOfByte, paramArrayOfByte.length, paramArrayOfInt, paramParseResult);
  }
  
  public static int a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    if ((paramInt < 0) || (paramInt > paramArrayOfByte1.length)) {
      throw new InvalidParameterException("Incorrect byte input length");
    }
    if (paramArrayOfByte2.length < 260) {
      throw new InvalidParameterException("Incorrect size for packet buffer");
    }
    return formFirmwareSlicePacket(paramArrayOfByte1, paramInt, paramArrayOfByte2);
  }
  
  public static HardwareInfo a(byte[] paramArrayOfByte)
  {
    HardwareInfo localHardwareInfo = new HardwareInfo();
    analyzeVersionInfo(localHardwareInfo, paramArrayOfByte, paramArrayOfByte.length);
    return localHardwareInfo;
  }
  
  public static boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte, ParseResult paramParseResult)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramArrayOfByte.length)) {
      throw new InvalidParameterException("Incorrect byte stream slice [" + paramInt1 + ";" + paramInt2 + ") for |" + paramArrayOfByte.length);
    }
    if ((paramInt2 < paramInt1) || (paramInt2 > paramArrayOfByte.length)) {
      throw new InvalidParameterException("Incorrect byte stream slice [" + paramInt1 + ";" + paramInt2 + ") for |" + paramArrayOfByte.length);
    }
    return retrievePacketData(paramParseResult, paramArrayOfByte, paramInt1, paramInt2, paramByte);
  }
  
  public static byte[] a(byte paramByte, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      paramArrayOfByte = a;
    }
    return createPacket(paramByte, paramArrayOfByte, paramArrayOfByte.length);
  }
  
  private static native float analyzeRawSignal(byte paramByte, byte[] paramArrayOfByte, int paramInt, int[] paramArrayOfInt, ParseResult paramParseResult);
  
  private static native void analyzeVersionInfo(HardwareInfo paramHardwareInfo, byte[] paramArrayOfByte, int paramInt);
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    if ((i < -80) || (i > 80)) {
      i = 666;
    }
    return i;
  }
  
  public static native void buildPacket(byte paramByte, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3);
  
  public static int c(byte[] paramArrayOfByte)
  {
    int i = 0xFF & paramArrayOfByte[1];
    if (i > 100) {
      return 100;
    }
    return i;
  }
  
  public static native String createHandshakeChallenge();
  
  private static native byte[] createPacket(byte paramByte, byte[] paramArrayOfByte, int paramInt);
  
  public static native String decodeHandshakeResponse(byte[] paramArrayOfByte);
  
  private static native int formFirmwareSlicePacket(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2);
  
  public static native void getRawSignalPixels(byte[] paramArrayOfByte, int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2);
  
  public static native void initFirmwareSlicing();
  
  public static native void resetAnalyzer();
  
  public static native void resetPacketParser();
  
  private static native boolean retrievePacketData(ParseResult paramParseResult, byte[] paramArrayOfByte, int paramInt1, int paramInt2, byte paramByte);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.hardware.HardwareJni
 * JD-Core Version:    0.7.0.1
 */