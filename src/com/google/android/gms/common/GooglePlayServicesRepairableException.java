package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException
  extends UserRecoverableException
{
  private final int a;
  
  GooglePlayServicesRepairableException(int paramInt, String paramString, Intent paramIntent)
  {
    super(paramString, paramIntent);
    this.a = paramInt;
  }
  
  public int a()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GooglePlayServicesRepairableException
 * JD-Core Version:    0.7.0.1
 */