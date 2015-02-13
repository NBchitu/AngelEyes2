package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.internal.aa;
import com.crashlytics.android.internal.q;
import java.util.concurrent.CountDownLatch;

final class t
  extends aa
{
  t(Crashlytics paramCrashlytics, Context paramContext, float paramFloat, CountDownLatch paramCountDownLatch) {}
  
  public final void a()
  {
    try
    {
      if (Crashlytics.a(this.d, this.a, this.b)) {
        Crashlytics.a(this.d).e();
      }
      return;
    }
    catch (Exception localException)
    {
      com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", localException);
      return;
    }
    finally
    {
      this.c.countDown();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.t
 * JD-Core Version:    0.7.0.1
 */