package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class File$Labels
  extends GenericJson
{
  @Key
  private Boolean hidden;
  @Key
  private Boolean restricted;
  @Key
  private Boolean starred;
  @Key
  private Boolean trashed;
  @Key
  private Boolean viewed;
  
  public Boolean getHidden()
  {
    return this.hidden;
  }
  
  public Boolean getRestricted()
  {
    return this.restricted;
  }
  
  public Boolean getStarred()
  {
    return this.starred;
  }
  
  public Boolean getTrashed()
  {
    return this.trashed;
  }
  
  public Boolean getViewed()
  {
    return this.viewed;
  }
  
  public Labels setHidden(Boolean paramBoolean)
  {
    this.hidden = paramBoolean;
    return this;
  }
  
  public Labels setRestricted(Boolean paramBoolean)
  {
    this.restricted = paramBoolean;
    return this;
  }
  
  public Labels setStarred(Boolean paramBoolean)
  {
    this.starred = paramBoolean;
    return this;
  }
  
  public Labels setTrashed(Boolean paramBoolean)
  {
    this.trashed = paramBoolean;
    return this;
  }
  
  public Labels setViewed(Boolean paramBoolean)
  {
    this.viewed = paramBoolean;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File.Labels
 * JD-Core Version:    0.7.0.1
 */