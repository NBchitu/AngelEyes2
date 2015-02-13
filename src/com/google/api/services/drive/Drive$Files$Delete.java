package com.google.api.services.drive;

import com.google.api.client.util.Key;
import com.google.common.base.Preconditions;

public class Drive$Files$Delete
  extends DriveRequest<Void>
{
  @Key
  private String fileId;
  
  Drive$Files$Delete(Drive.Files paramFiles, String paramString)
  {
    super(paramFiles.a, "DELETE", "files/{fileId}", null, Void.class);
    this.fileId = ((String)Preconditions.a(paramString, "Required parameter fileId must be specified."));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.drive.Drive.Files.Delete
 * JD-Core Version:    0.7.0.1
 */