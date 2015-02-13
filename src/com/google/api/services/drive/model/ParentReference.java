package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class ParentReference
  extends GenericJson
{
  @Key
  private String id;
  @Key
  private Boolean isRoot;
  @Key
  private String kind;
  @Key
  private String parentLink;
  @Key
  private String selfLink;
  
  public ParentReference a(Boolean paramBoolean)
  {
    this.isRoot = paramBoolean;
    return this;
  }
  
  public ParentReference a(String paramString)
  {
    this.id = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.ParentReference
 * JD-Core Version:    0.7.0.1
 */