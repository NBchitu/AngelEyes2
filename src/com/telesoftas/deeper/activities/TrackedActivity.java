package com.telesoftas.deeper.activities;

import android.os.Bundle;
import com.google.analytics.tracking.android.EasyTracker;

public abstract class TrackedActivity
  extends WrapperActivity
{
  protected EasyTracker D;
  
  protected EasyTracker m()
  {
    if (this.D == null) {
      this.D = EasyTracker.a(this);
    }
    return this.D;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    m().a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    m().b(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.TrackedActivity
 * JD-Core Version:    0.7.0.1
 */