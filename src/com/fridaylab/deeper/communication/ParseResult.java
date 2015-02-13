package com.fridaylab.deeper.communication;

import com.google.common.base.Supplier;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.FishData;
import com.telesoftas.hardware.NotificationPacket;
import com.telesoftas.services.Signal;

public class ParseResult
{
  private FishData[] _fishList;
  private float _ground;
  private byte[] _packetData;
  private int _packetType;
  private int _parsedCount;
  private int[] _rawAnalysis;
  private byte[] _rawData;
  
  public FishData[] getFishData()
  {
    return this._fishList;
  }
  
  public Signal getSignal()
  {
    if (this._packetType == 0) {
      return null;
    }
    int i = this._packetType;
    this._packetType = 0;
    switch (i)
    {
    default: 
      return new NotificationPacket(i, this._packetData);
    case 13: 
      return new DeeperFishDataPacket(this._ground, this._fishList);
    }
    DeeperRawDataPacket localDeeperRawDataPacket = new DeeperRawDataPacket(this._ground, this._fishList, this._rawData, this._rawAnalysis);
    this._rawData = null;
    return localDeeperRawDataPacket;
  }
  
  public int parsedLength()
  {
    return this._parsedCount;
  }
  
  public void reset(Supplier<byte[]> paramSupplier)
  {
    this._parsedCount = 0;
    this._packetType = 0;
    this._packetData = null;
    this._ground = -1.0F;
    this._fishList = null;
    if (this._rawData == null) {
      this._rawData = ((byte[])paramSupplier.c());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.ParseResult
 * JD-Core Version:    0.7.0.1
 */