package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.internal.aQ;
import com.crashlytics.android.internal.ab;

final class X
{
  private final Context a;
  private final aQ b;
  
  public X(Context paramContext, aQ paramaQ)
  {
    this.a = paramContext;
    this.b = paramaQ;
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str = ab.a(this.a, paramString1);
    if ((str == null) || (str.length() == 0)) {}
    for (int i = 1; i != 0; i = 0) {
      return paramString2;
    }
    return str;
  }
  
  public final String a()
  {
    return a("com.crashlytics.CrashSubmissionPromptTitle", this.b.a);
  }
  
  public final String b()
  {
    return a("com.crashlytics.CrashSubmissionPromptMessage", this.b.b);
  }
  
  public final String c()
  {
    return a("com.crashlytics.CrashSubmissionSendTitle", this.b.c);
  }
  
  public final String d()
  {
    return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.b.g);
  }
  
  public final String e()
  {
    return a("com.crashlytics.CrashSubmissionCancelTitle", this.b.e);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.X
 * JD-Core Version:    0.7.0.1
 */