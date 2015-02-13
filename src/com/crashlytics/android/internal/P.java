package com.crashlytics.android.internal;

import java.util.Collections;
import java.util.Map;

final class P
  implements Runnable
{
  P(O paramO, String paramString) {}
  
  public final void run()
  {
    try
    {
      U localU = this.b.a;
      String str1 = O.a(this.b);
      String str2 = O.b(this.b);
      String str3 = O.c(this.b);
      String str4 = O.d(this.b);
      String str5 = O.e(this.b);
      String str6 = O.f(this.b);
      String str7 = O.g(this.b);
      String str8 = O.h(this.b);
      Map localMap = Collections.singletonMap("sessionId", this.a);
      localU.a(V.a(str1, str2, str3, str4, str5, str6, str7, str8, W.i, localMap));
      return;
    }
    catch (Exception localException)
    {
      ab.d("Crashlytics failed to record crash event");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.P
 * JD-Core Version:    0.7.0.1
 */