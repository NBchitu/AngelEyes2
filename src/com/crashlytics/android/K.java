package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class K
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    return v.i().matcher(paramString).matches();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.K
 * JD-Core Version:    0.7.0.1
 */