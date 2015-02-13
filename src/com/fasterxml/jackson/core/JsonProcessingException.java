package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException
  extends IOException
{
  protected JsonLocation a;
  
  protected JsonProcessingException(String paramString, JsonLocation paramJsonLocation)
  {
    this(paramString, paramJsonLocation, null);
  }
  
  protected JsonProcessingException(String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable)
  {
    super(paramString);
    if (paramThrowable != null) {
      initCause(paramThrowable);
    }
    this.a = paramJsonLocation;
  }
  
  public JsonLocation a()
  {
    return this.a;
  }
  
  protected String b()
  {
    return null;
  }
  
  public String getMessage()
  {
    String str1 = super.getMessage();
    if (str1 == null) {
      str1 = "N/A";
    }
    JsonLocation localJsonLocation = a();
    String str2 = b();
    if ((localJsonLocation != null) || (str2 != null))
    {
      StringBuilder localStringBuilder = new StringBuilder(100);
      localStringBuilder.append(str1);
      if (str2 != null) {
        localStringBuilder.append(str2);
      }
      if (localJsonLocation != null)
      {
        localStringBuilder.append('\n');
        localStringBuilder.append(" at ");
        localStringBuilder.append(localJsonLocation.toString());
      }
      str1 = localStringBuilder.toString();
    }
    return str1;
  }
  
  public String toString()
  {
    return getClass().getName() + ": " + getMessage();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonProcessingException
 * JD-Core Version:    0.7.0.1
 */