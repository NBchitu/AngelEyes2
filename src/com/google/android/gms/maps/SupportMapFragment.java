package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class SupportMapFragment
  extends Fragment
{
  private final SupportMapFragment.b a = new SupportMapFragment.b(this);
  private GoogleMap b;
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return this.a.a(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  protected IMapFragmentDelegate a()
  {
    this.a.g();
    if (this.a.a() == null) {
      return null;
    }
    return ((SupportMapFragment.a)this.a.a()).f();
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    SupportMapFragment.b.a(this.a, paramActivity);
  }
  
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.a(paramActivity, paramAttributeSet, paramBundle);
    SupportMapFragment.b.a(this.a, paramActivity);
    GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.a(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", localGoogleMapOptions);
    this.a.a(paramActivity, localBundle, paramBundle);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a.a(paramBundle);
  }
  
  @Deprecated
  public final GoogleMap b()
  {
    IMapFragmentDelegate localIMapFragmentDelegate = a();
    if (localIMapFragmentDelegate == null) {}
    for (;;)
    {
      return null;
      try
      {
        IGoogleMapDelegate localIGoogleMapDelegate = localIMapFragmentDelegate.a();
        if (localIGoogleMapDelegate == null) {
          continue;
        }
        if ((this.b == null) || (this.b.a().asBinder() != localIGoogleMapDelegate.asBinder())) {
          this.b = new GoogleMap(localIGoogleMapDelegate);
        }
        return this.b;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  public void d(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.d(paramBundle);
  }
  
  public void e(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.e(paramBundle);
    this.a.b(paramBundle);
  }
  
  public void f()
  {
    this.a.d();
    super.f();
  }
  
  public void g(Bundle paramBundle)
  {
    super.g(paramBundle);
  }
  
  public void onLowMemory()
  {
    this.a.f();
    super.onLowMemory();
  }
  
  public void t()
  {
    super.t();
    this.a.b();
  }
  
  public void u()
  {
    this.a.c();
    super.u();
  }
  
  public void v()
  {
    this.a.e();
    super.v();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.SupportMapFragment
 * JD-Core Version:    0.7.0.1
 */