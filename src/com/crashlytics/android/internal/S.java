package com.crashlytics.android.internal;

final class S
  implements Runnable
{
  S(O paramO) {}
  
  public final void run()
  {
    try
    {
      this.a.a.a();
      return;
    }
    catch (Exception localException)
    {
      ab.d("Crashlytics failed to send analytics files.");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.S
 * JD-Core Version:    0.7.0.1
 */