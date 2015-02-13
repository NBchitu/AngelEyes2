package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

final class w
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    return (paramString.length() == 39) && (paramString.endsWith(".cls"));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.w
 * JD-Core Version:    0.7.0.1
 */