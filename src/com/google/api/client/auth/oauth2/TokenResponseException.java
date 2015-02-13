package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.StringUtils;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.IOException;

public class TokenResponseException
  extends HttpResponseException
{
  private final transient TokenErrorResponse a;
  
  private TokenResponseException(HttpResponse paramHttpResponse, TokenErrorResponse paramTokenErrorResponse, String paramString)
  {
    super(paramHttpResponse, paramString);
    this.a = paramTokenErrorResponse;
  }
  
  public static TokenResponseException a(JsonFactory paramJsonFactory, HttpResponse paramHttpResponse)
  {
    Preconditions.a(paramJsonFactory);
    String str1 = paramHttpResponse.a();
    for (;;)
    {
      TokenErrorResponse localTokenErrorResponse1;
      IOException localIOException2;
      try
      {
        if ((!paramHttpResponse.c()) && (str1 != null) && (HttpMediaType.b(Json.a, str1))) {
          localTokenErrorResponse1 = (TokenErrorResponse)new JsonObjectParser(paramJsonFactory).a(paramHttpResponse.g(), paramHttpResponse.l(), TokenErrorResponse.class);
        }
      }
      catch (IOException localIOException1)
      {
        String str3;
        StringBuilder localStringBuilder;
        String str2;
        localIOException2 = localIOException1;
        localTokenErrorResponse1 = null;
      }
      try
      {
        str3 = localTokenErrorResponse1.toPrettyString();
        localTokenErrorResponse2 = localTokenErrorResponse1;
        localObject = str3;
        localStringBuilder = HttpResponseException.a(paramHttpResponse);
        if (!Strings.a((String)localObject)) {
          localStringBuilder.append(StringUtils.a).append((String)localObject);
        }
        return new TokenResponseException(paramHttpResponse, localTokenErrorResponse2, localStringBuilder.toString());
      }
      catch (IOException localIOException3)
      {
        break label141;
      }
      str2 = paramHttpResponse.k();
      Object localObject = str2;
      TokenErrorResponse localTokenErrorResponse2 = null;
      continue;
      label141:
      localIOException2.printStackTrace();
      localTokenErrorResponse2 = localTokenErrorResponse1;
      localObject = null;
    }
  }
  
  public final TokenErrorResponse a()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.TokenResponseException
 * JD-Core Version:    0.7.0.1
 */