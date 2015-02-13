package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class File$IndexableText
  extends GenericJson
{
  @Key
  private String text;
  
  public String getText()
  {
    return this.text;
  }
  
  public IndexableText setText(String paramString)
  {
    this.text = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File.IndexableText
 * JD-Core Version:    0.7.0.1
 */