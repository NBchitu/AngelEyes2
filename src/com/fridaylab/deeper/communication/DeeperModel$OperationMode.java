package com.fridaylab.deeper.communication;

public enum DeeperModel$OperationMode
{
  static
  {
    OperationMode[] arrayOfOperationMode = new OperationMode[9];
    arrayOfOperationMode[0] = a; // "Normal"
    arrayOfOperationMode[1] = b; // "WaitingForBootloader"
    arrayOfOperationMode[2] = c; // "EmptyBattery"
    arrayOfOperationMode[3] = d; // "OutOfWater"
    arrayOfOperationMode[4] = e; // "Charging"
    arrayOfOperationMode[5] = f; // "NoVersionResponse"
    arrayOfOperationMode[6] = g; // "FailedAuthentication"
    arrayOfOperationMode[7] = h; // "DoesNotReportStatus"
    arrayOfOperationMode[8] = i; // "UnableToDetectGround"
    j = arrayOfOperationMode;
  }

  private DeeperModel$OperationMode() {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperModel.OperationMode
 * JD-Core Version:    0.7.0.1
 */