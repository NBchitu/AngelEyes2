package com.google.api.client.googleapis.services;

public class CommonGoogleClientRequestInitializer
  implements GoogleClientRequestInitializer
{
  private final String a;
  private final String b;
  
  public CommonGoogleClientRequestInitializer()
  {
    this(null);
  }
  
  public CommonGoogleClientRequestInitializer(String paramString)
  {
    this(paramString, null);
  }
  
  public CommonGoogleClientRequestInitializer(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public void a(AbstractGoogleClientRequest<?> paramAbstractGoogleClientRequest)
  {
    if (this.a != null) {
      paramAbstractGoogleClientRequest.put("key", this.a);
    }
    if (this.b != null) {
      paramAbstractGoogleClientRequest.put("userIp", this.b);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer
 * JD-Core Version:    0.7.0.1
 */