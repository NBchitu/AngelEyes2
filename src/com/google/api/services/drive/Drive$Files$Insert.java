package com.google.api.services.drive;

import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.util.Key;
import com.google.api.services.drive.model.File;

public class Drive$Files$Insert
  extends DriveRequest<File>
{
  @Key
  private Boolean convert;
  @Key
  private Boolean ocr;
  @Key
  private String ocrLanguage;
  @Key
  private Boolean pinned;
  @Key
  private String sourceLanguage;
  @Key
  private String targetLanguage;
  @Key
  private String timedTextLanguage;
  @Key
  private String timedTextTrackName;
  
  Drive$Files$Insert(Drive.Files paramFiles, File paramFile)
  {
    super(paramFiles.a, "POST", "files", paramFile, File.class);
  }
  
  Drive$Files$Insert(Drive.Files paramFiles, File paramFile, AbstractInputStreamContent paramAbstractInputStreamContent)
  {
    super(paramFiles.a, "POST", "/upload/" + paramFiles.a.a() + "files", paramFile, File.class);
    a(paramAbstractInputStreamContent);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive.Files.Insert
 * JD-Core Version:    0.7.0.1
 */