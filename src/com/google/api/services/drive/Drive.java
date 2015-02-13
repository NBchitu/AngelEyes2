package com.google.api.services.drive;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

public class Drive
  extends AbstractGoogleJsonClient
{
  static
  {
    Preconditions.b("1.12.0-beta".equals("1.12.0-beta"), "You are currently running with version %s of google-api-client. You need version 1.12.0-beta of google-api-client to run version 1.12.0-beta of the Drive API library.", new Object[] { "1.12.0-beta" });
  }
  
  Drive(HttpTransport paramHttpTransport, HttpRequestInitializer paramHttpRequestInitializer, String paramString1, String paramString2, JsonObjectParser paramJsonObjectParser, GoogleClientRequestInitializer paramGoogleClientRequestInitializer, String paramString3, boolean paramBoolean)
  {
    super(paramHttpTransport, paramHttpRequestInitializer, paramString1, paramString2, paramJsonObjectParser, paramGoogleClientRequestInitializer, paramString3, paramBoolean);
  }
  
  protected void a(AbstractGoogleClientRequest<?> paramAbstractGoogleClientRequest)
  {
    super.a(paramAbstractGoogleClientRequest);
  }
  
  public Drive.Files i()
  {
    return new Drive.Files(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive
 * JD-Core Version:    0.7.0.1
 */