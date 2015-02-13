package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.Map;

class GAThread$1
  implements Runnable
{
  GAThread$1(GAThread paramGAThread, Map paramMap) {}
  
  public void run()
  {
    if (TextUtils.isEmpty((CharSequence)this.a.get("&cid"))) {
      this.a.put("&cid", GAThread.a(this.b));
    }
    if ((GoogleAnalytics.a(GAThread.b(this.b)).c()) || (GAThread.a(this.b, this.a))) {
      return;
    }
    if (!TextUtils.isEmpty(GAThread.c(this.b)))
    {
      GAUsage.a().a(true);
      this.a.putAll(new MapBuilder().a(GAThread.c(this.b)).a());
      GAUsage.a().a(false);
      GAThread.a(this.b, null);
    }
    GAThread.b(this.b, this.a);
    Map localMap = HitBuilder.a(this.a);
    GAThread.e(this.b).a(localMap, Long.valueOf((String)this.a.get("&ht")).longValue(), GAThread.c(this.b, this.a), GAThread.d(this.b));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.GAThread.1
 * JD-Core Version:    0.7.0.1
 */