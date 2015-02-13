package com.crashlytics.android.internal;

final class Q
  implements Runnable
{
  Q(O paramO, V paramV, boolean paramBoolean) {}
  
  public final void run()
  {
    try
    {
      this.c.a.a(this.a);
      if (this.b) {
        this.c.a.d();
      }
      return;
    }
    catch (Exception localException)
    {
      ab.d("Crashlytics failed to record session event.");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.Q
 * JD-Core Version:    0.7.0.1
 */