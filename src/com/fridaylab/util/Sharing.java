package com.fridaylab.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

public class Sharing
{
  public static Intent a(String paramString, String[] paramArrayOfString)
  {
    int i;
    if (!TextUtils.isEmpty(paramString))
    {
      i = 1;
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0)) {
        break label35;
      }
    }
    label35:
    for (int j = 1;; j = 0)
    {
      if ((j != 0) || (i != 0)) {
        break label40;
      }
      return null;
      i = 0;
      break;
    }
    label40:
    Intent localIntent = new Intent();
    String str1 = "android.intent.action.SEND";
    if (i != 0) {
      localIntent.putExtra("android.intent.extra.TEXT", paramString);
    }
    String str2;
    if (j != 0) {
      if (paramArrayOfString.length > 1)
      {
        str1 = "android.intent.action.SEND_MULTIPLE";
        ArrayList localArrayList = new ArrayList();
        int k = paramArrayOfString.length;
        for (int m = 0; m < k; m++) {
          localArrayList.add(Uri.fromFile(new File(paramArrayOfString[m])));
        }
        localIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", localArrayList);
        str2 = str1;
      }
    }
    for (String str3 = "image/jpeg";; str3 = "text/plain")
    {
      localIntent.setAction(str2);
      localIntent.setType(str3);
      return localIntent;
      localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(paramArrayOfString[0])));
      break;
      str2 = str1;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.Sharing
 * JD-Core Version:    0.7.0.1
 */