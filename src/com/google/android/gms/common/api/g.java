package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

public class g
  extends Fragment
  implements DialogInterface.OnCancelListener, LoaderManager.LoaderCallbacks<ConnectionResult>
{
  private boolean a;
  private int b = -1;
  private ConnectionResult c;
  private final Handler d = new Handler(Looper.getMainLooper());
  private final SparseArray<g.b> e = new SparseArray();
  
  public static g a(FragmentActivity paramFragmentActivity)
  {
    jx.b("Must be called from main thread of process");
    FragmentManager localFragmentManager = paramFragmentActivity.f();
    try
    {
      g localg = (g)localFragmentManager.a("GmsSupportLifecycleFragment");
      if ((localg == null) || (localg.o()))
      {
        localg = new g();
        localFragmentManager.a().a(localg, "GmsSupportLifecycleFragment").a();
        localFragmentManager.b();
      }
      return localg;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", localClassCastException);
    }
  }
  
  private void a()
  {
    int i = 0;
    this.a = false;
    this.b = -1;
    this.c = null;
    LoaderManager localLoaderManager = r();
    while (i < this.e.size())
    {
      int j = this.e.keyAt(i);
      g.a locala = d(j);
      if (locala != null) {
        locala.b();
      }
      localLoaderManager.a(j, null, this);
      i++;
    }
  }
  
  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    if (!this.a)
    {
      this.a = true;
      this.b = paramInt;
      this.c = paramConnectionResult;
      this.d.post(new g.c(this, paramInt, paramConnectionResult));
    }
  }
  
  private void b(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
    g.b localb = (g.b)this.e.get(paramInt);
    if (localb != null)
    {
      c(paramInt);
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = localb.b;
      if (localOnConnectionFailedListener != null) {
        localOnConnectionFailedListener.a(paramConnectionResult);
      }
    }
    a();
  }
  
  private void e(int paramInt)
  {
    if (paramInt == this.b) {
      a();
    }
  }
  
  public Loader<ConnectionResult> a(int paramInt, Bundle paramBundle)
  {
    return new g.a(i(), ((g.b)this.e.get(paramInt)).a);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        break label62;
      }
      a();
      return;
      if (GooglePlayServicesUtil.a(i()) != 0) {
        break;
      }
      continue;
      if (paramInt2 != -1) {
        break;
      }
    }
    label62:
    b(this.b, this.c);
  }
  
  public void a(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    jx.a(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    if (this.e.indexOfKey(paramInt) < 0) {}
    for (boolean bool = true;; bool = false)
    {
      jx.a(bool, "Already managing a GoogleApiClient with id " + paramInt);
      g.b localb = new g.b(paramGoogleApiClient, paramOnConnectionFailedListener, null);
      this.e.put(paramInt, localb);
      if (i() != null) {
        r().a(paramInt, null, this);
      }
      return;
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    int i = 0;
    if (i < this.e.size())
    {
      int j = this.e.keyAt(i);
      g.a locala = d(j);
      if ((locala != null) && (((g.b)this.e.valueAt(i)).a != locala.a)) {
        r().b(j, null, this);
      }
      for (;;)
      {
        i++;
        break;
        r().a(j, null, this);
      }
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("resolving_error", false);
      this.b = paramBundle.getInt("failed_client_id", -1);
      if (this.b >= 0) {
        this.c = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public void a(Loader<ConnectionResult> paramLoader)
  {
    if (paramLoader.k() == this.b) {
      a();
    }
  }
  
  public void a(Loader<ConnectionResult> paramLoader, ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.b())
    {
      e(paramLoader.k());
      return;
    }
    a(paramLoader.k(), paramConnectionResult);
  }
  
  public GoogleApiClient b(int paramInt)
  {
    if (i() != null)
    {
      g.a locala = d(paramInt);
      if (locala != null) {
        return locala.a;
      }
    }
    return null;
  }
  
  public void c(int paramInt)
  {
    r().a(paramInt);
    this.e.remove(paramInt);
  }
  
  g.a d(int paramInt)
  {
    try
    {
      g.a locala = (g.a)r().b(paramInt);
      return locala;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", localClassCastException);
    }
  }
  
  public void d()
  {
    super.d();
    if (!this.a) {
      for (int i = 0; i < this.e.size(); i++) {
        r().a(this.e.keyAt(i), null, this);
      }
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("resolving_error", this.a);
    if (this.b >= 0)
    {
      paramBundle.putInt("failed_client_id", this.b);
      paramBundle.putInt("failed_status", this.c.c());
      paramBundle.putParcelable("failed_resolution", this.c.d());
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    b(this.b, this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.g
 * JD-Core Version:    0.7.0.1
 */