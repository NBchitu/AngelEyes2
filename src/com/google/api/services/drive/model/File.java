package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Data;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.Key;
import java.util.List;
import java.util.Map;

public final class File
  extends GenericJson
{
  @Key
  private String alternateLink;
  @Key
  private DateTime createdDate;
  @Key
  private String description;
  @Key
  private String downloadUrl;
  @Key
  private Boolean editable;
  @Key
  private String embedLink;
  @Key
  private String etag;
  @Key
  private Boolean explicitlyTrashed;
  @Key
  private Map<String, String> exportLinks;
  @Key
  private String fileExtension;
  @JsonString
  @Key
  private Long fileSize;
  @Key
  private String id;
  @Key
  private File.ImageMediaMetadata imageMediaMetadata;
  @Key
  private File.IndexableText indexableText;
  @Key
  private String kind;
  @Key
  private File.Labels labels;
  @Key
  private String lastModifyingUserName;
  @Key
  private DateTime lastViewedByMeDate;
  @Key
  private String md5Checksum;
  @Key
  private String mimeType;
  @Key
  private DateTime modifiedByMeDate;
  @Key
  private DateTime modifiedDate;
  @Key
  private String originalFilename;
  @Key
  private List<String> ownerNames;
  @Key
  private List<ParentReference> parents;
  @JsonString
  @Key
  private Long quotaBytesUsed;
  @Key
  private String selfLink;
  @Key
  private DateTime sharedWithMeDate;
  @Key
  private File.Thumbnail thumbnail;
  @Key
  private String thumbnailLink;
  @Key
  private String title;
  @Key
  private Permission userPermission;
  @Key
  private String webContentLink;
  @Key
  private Boolean writersCanShare;
  
  static
  {
    Data.a(ParentReference.class);
  }
  
  public File a(String paramString)
  {
    this.mimeType = paramString;
    return this;
  }
  
  public File a(List<ParentReference> paramList)
  {
    this.parents = paramList;
    return this;
  }
  
  public String a()
  {
    return this.id;
  }
  
  public File b(String paramString)
  {
    this.title = paramString;
    return this;
  }
  
  public String b()
  {
    return this.title;
  }
  
  public File c(String paramString)
  {
    this.description = paramString;
    return this;
  }
  
  public String c()
  {
    return this.downloadUrl;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.model.File
 * JD-Core Version:    0.7.0.1
 */