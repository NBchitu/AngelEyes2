package com.google.api.client.googleapis;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;
import com.google.api.client.util.escape.PercentEscaper;

public class GoogleHeaders
  extends HttpHeaders
{
  public static final PercentEscaper a = new PercentEscaper(" !\"#$&'()*+,-./:;<=>?@[\\]^_`{|}~", false);
  @Key(a="X-GData-Client")
  private String gdataClient;
  @Key(a="X-GData-Key")
  private String gdataKey;
  @Key(a="GData-Version")
  private String gdataVersion;
  @Key(a="X-HTTP-Method-Override")
  private String methodOverride;
  @Key(a="Slug")
  private String slug;
  @Key(a="X-Upload-Content-Length")
  private Long uploadContentLength;
  @Key(a="X-Upload-Content-Type")
  private String uploadContentType;
  
  public GoogleHeaders() {}
  
  public GoogleHeaders(HttpHeaders paramHttpHeaders)
  {
    a(paramHttpHeaders);
  }
  
  public final void a(Long paramLong)
  {
    this.uploadContentLength = paramLong;
  }
  
  public final void a(String paramString)
  {
    this.uploadContentType = paramString;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.GoogleHeaders
 * JD-Core Version:    0.7.0.1
 */