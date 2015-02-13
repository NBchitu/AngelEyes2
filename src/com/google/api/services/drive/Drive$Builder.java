package com.google.api.services.drive;

import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;

public final class Drive$Builder
  extends AbstractGoogleJsonClient.Builder
{
  public Drive$Builder(HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, HttpRequestInitializer paramHttpRequestInitializer)
  {
    super(paramHttpTransport, paramJsonFactory, "https://www.googleapis.com/", "drive/v2/", paramHttpRequestInitializer, false);
  }
  
  public Builder a(DriveRequestInitializer paramDriveRequestInitializer)
  {
    return (Builder)super.b(paramDriveRequestInitializer);
  }
  
  public Builder c(GoogleClientRequestInitializer paramGoogleClientRequestInitializer)
  {
    return (Builder)super.b(paramGoogleClientRequestInitializer);
  }
  
  public Builder g(String paramString)
  {
    return (Builder)super.d(paramString);
  }
  
  public Builder h(String paramString)
  {
    return (Builder)super.e(paramString);
  }
  
  public Builder i(String paramString)
  {
    return (Builder)super.f(paramString);
  }
  
  public Drive j()
  {
    return new Drive(a(), f(), c(), d(), i(), e(), g(), h());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive.Builder
 * JD-Core Version:    0.7.0.1
 */