package com.google.api.services.drive;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.util.Key;

public abstract class DriveRequest<T>
  extends AbstractGoogleJsonClientRequest<T>
{
  @Key
  private String alt;
  @Key
  private String fields;
  @Key
  private String key;
  @Key(a="oauth_token")
  private String oauthToken;
  @Key
  private Boolean prettyPrint;
  @Key
  private String quotaUser;
  @Key
  private String userIp;
  
  public DriveRequest(Drive paramDrive, String paramString1, String paramString2, Object paramObject, Class<T> paramClass)
  {
    super(paramDrive, paramString1, paramString2, paramObject, paramClass);
  }
  
  public final Drive f()
  {
    return (Drive)super.e();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.DriveRequest
 * JD-Core Version:    0.7.0.1
 */