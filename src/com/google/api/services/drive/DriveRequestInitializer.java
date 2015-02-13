package com.google.api.services.drive;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;

public class DriveRequestInitializer
  extends CommonGoogleJsonClientRequestInitializer
{
  public final void a(AbstractGoogleJsonClientRequest<?> paramAbstractGoogleJsonClientRequest)
  {
    super.a(paramAbstractGoogleJsonClientRequest);
    a((DriveRequest)paramAbstractGoogleJsonClientRequest);
  }
  
  protected void a(DriveRequest<?> paramDriveRequest) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.DriveRequestInitializer
 * JD-Core Version:    0.7.0.1
 */