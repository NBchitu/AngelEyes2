package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public class GoogleJsonError
  extends GenericJson
{
  @Key
  private int code;
  @Key
  private List<GoogleJsonError.ErrorInfo> errors;
  @Key
  private String message;
  
  static
  {
    Data.a(GoogleJsonError.ErrorInfo.class);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.json.GoogleJsonError
 * JD-Core Version:    0.7.0.1
 */