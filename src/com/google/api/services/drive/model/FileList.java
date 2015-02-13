package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public final class FileList
  extends GenericJson
{
  @Key
  private String etag;
  @Key
  private List<File> items;
  @Key
  private String kind;
  @Key
  private String nextLink;
  @Key
  private String nextPageToken;
  @Key
  private String selfLink;
  
  static
  {
    Data.a(File.class);
  }
  
  public List<File> a()
  {
    return this.items;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.FileList
 * JD-Core Version:    0.7.0.1
 */