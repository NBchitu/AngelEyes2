package com.crashlytics.android.internal;

final class E
  extends aa
{
  E(D paramD) {}
  
  public final void a()
  {
    try
    {
      D.a(this.a);
      return;
    }
    catch (Exception localException)
    {
      v.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", localException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.E
 * JD-Core Version:    0.7.0.1
 */