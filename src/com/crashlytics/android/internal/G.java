package com.crashlytics.android.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class G
  implements Application.ActivityLifecycleCallbacks
{
  G(F paramF) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.a.a(paramActivity);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    this.a.b(paramActivity);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    this.a.c(paramActivity);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    this.a.d(paramActivity);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    this.a.e(paramActivity);
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    this.a.f(paramActivity);
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    this.a.g(paramActivity);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.crashlytics.android.internal.G
 * JD-Core Version:    0.7.0.1
 */