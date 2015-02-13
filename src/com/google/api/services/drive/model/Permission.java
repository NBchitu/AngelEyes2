package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class Permission
  extends GenericJson
{
  @Key
  private List<String> additionalRoles;
  @Key
  private String authKey;
  @Key
  private String etag;
  @Key
  private String id;
  @Key
  private String kind;
  @Key
  private String name;
  @Key
  private String photoLink;
  @Key
  private String role;
  @Key
  private String selfLink;
  @Key
  private String type;
  @Key
  private String value;
  @Key
  private Boolean withLink;
  
  public List<String> getAdditionalRoles()
  {
    return this.additionalRoles;
  }
  
  public String getAuthKey()
  {
    return this.authKey;
  }
  
  public String getEtag()
  {
    return this.etag;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getKind()
  {
    return this.kind;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPhotoLink()
  {
    return this.photoLink;
  }
  
  public String getRole()
  {
    return this.role;
  }
  
  public String getSelfLink()
  {
    return this.selfLink;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public Boolean getWithLink()
  {
    return this.withLink;
  }
  
  public Permission setAdditionalRoles(List<String> paramList)
  {
    this.additionalRoles = paramList;
    return this;
  }
  
  public Permission setAuthKey(String paramString)
  {
    this.authKey = paramString;
    return this;
  }
  
  public Permission setEtag(String paramString)
  {
    this.etag = paramString;
    return this;
  }
  
  public Permission setId(String paramString)
  {
    this.id = paramString;
    return this;
  }
  
  public Permission setKind(String paramString)
  {
    this.kind = paramString;
    return this;
  }
  
  public Permission setName(String paramString)
  {
    this.name = paramString;
    return this;
  }
  
  public Permission setPhotoLink(String paramString)
  {
    this.photoLink = paramString;
    return this;
  }
  
  public Permission setRole(String paramString)
  {
    this.role = paramString;
    return this;
  }
  
  public Permission setSelfLink(String paramString)
  {
    this.selfLink = paramString;
    return this;
  }
  
  public Permission setType(String paramString)
  {
    this.type = paramString;
    return this;
  }
  
  public Permission setValue(String paramString)
  {
    this.value = paramString;
    return this;
  }
  
  public Permission setWithLink(Boolean paramBoolean)
  {
    this.withLink = paramBoolean;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.Permission
 * JD-Core Version:    0.7.0.1
 */