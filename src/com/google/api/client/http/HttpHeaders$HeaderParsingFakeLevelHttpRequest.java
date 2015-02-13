package com.google.api.client.http;

class HttpHeaders$HeaderParsingFakeLevelHttpRequest
  extends LowLevelHttpRequest
{
  private final HttpHeaders a;
  private final HttpHeaders.ParseHeaderState b;
  
  HttpHeaders$HeaderParsingFakeLevelHttpRequest(HttpHeaders paramHttpHeaders, HttpHeaders.ParseHeaderState paramParseHeaderState)
  {
    this.a = paramHttpHeaders;
    this.b = paramParseHeaderState;
  }
  
  public LowLevelHttpResponse a()
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(HttpContent paramHttpContent)
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a.a(paramString1, paramString2, this.b);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpHeaders.HeaderParsingFakeLevelHttpRequest
 * JD-Core Version:    0.7.0.1
 */