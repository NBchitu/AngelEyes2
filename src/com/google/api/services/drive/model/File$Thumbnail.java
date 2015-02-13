package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class File$Thumbnail
  extends GenericJson
{
  @Key
  private String image;
  @Key
  private String mimeType;
  
  public String getImage()
  {
    return this.image;
  }
  
  public String getMimeType()
  {
    return this.mimeType;
  }
  
  public Thumbnail setImage(String paramString)
  {
    this.image = paramString;
    return this;
  }
  
  public Thumbnail setMimeType(String paramString)
  {
    this.mimeType = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File.Thumbnail
 * JD-Core Version:    0.7.0.1
 */