package com.crashlytics.android.internal;

final class T
  implements Runnable
{
  T(O paramO) {}
  
  public final void run()
  {
    try
    {
      U localU = this.a.a;
      this.a.a = new I();
      localU.b();
      return;
    }
    catch (Exception localException)
    {
      ab.d("Crashlytics failed to disable analytics.");
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.T
 * JD-Core Version:    0.7.0.1
 */