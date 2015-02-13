package com.google.api.services.drive;

import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.services.drive.model.File;

public class Drive$Files
{
  public Drive$Files(Drive paramDrive) {}
  
  public Drive.Files.Delete a(String paramString)
  {
    Drive.Files.Delete localDelete = new Drive.Files.Delete(this, paramString);
    this.a.a(localDelete);
    return localDelete;
  }
  
  public Drive.Files.Insert a(File paramFile)
  {
    Drive.Files.Insert localInsert = new Drive.Files.Insert(this, paramFile);
    this.a.a(localInsert);
    return localInsert;
  }
  
  public Drive.Files.Insert a(File paramFile, AbstractInputStreamContent paramAbstractInputStreamContent)
  {
    Drive.Files.Insert localInsert = new Drive.Files.Insert(this, paramFile, paramAbstractInputStreamContent);
    this.a.a(localInsert);
    return localInsert;
  }
  
  public Drive.Files.List a()
  {
    Drive.Files.List localList = new Drive.Files.List(this);
    this.a.a(localList);
    return localList;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive.Files
 * JD-Core Version:    0.7.0.1
 */