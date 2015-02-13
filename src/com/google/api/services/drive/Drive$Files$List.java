package com.google.api.services.drive;

import com.google.api.client.util.Key;
import com.google.api.services.drive.model.FileList;

public class Drive$Files$List
  extends DriveRequest<FileList>
{
  @Key
  private Integer maxResults;
  @Key
  private String pageToken;
  @Key
  private String projection;
  @Key
  private String q;
  
  Drive$Files$List(Drive.Files paramFiles)
  {
    super(paramFiles.a, "GET", "files", null, FileList.class);
  }
  
  public List a(String paramString)
  {
    this.q = paramString;
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive.Files.List
 * JD-Core Version:    0.7.0.1
 */