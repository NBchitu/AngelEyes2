package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SupportMapFragment$b
  extends a<SupportMapFragment.a>
{
  protected f<SupportMapFragment.a> a;
  private final Fragment b;
  private Activity c;
  private final List<OnMapReadyCallback> d = new ArrayList();
  
  SupportMapFragment$b(Fragment paramFragment)
  {
    this.b = paramFragment;
  }
  
  private void a(Activity paramActivity)
  {
    this.c = paramActivity;
    g();
  }
  
  protected void a(f<SupportMapFragment.a> paramf)
  {
    this.a = paramf;
    g();
  }
  
  public void g()
  {
    if ((this.c != null) && (this.a != null) && (a() == null)) {}
    try
    {
      MapsInitializer.a(this.c);
      IMapFragmentDelegate localIMapFragmentDelegate = x.a(this.c).b(e.a(this.c));
      this.a.a(new SupportMapFragment.a(this.b, localIMapFragmentDelegate));
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        OnMapReadyCallback localOnMapReadyCallback = (OnMapReadyCallback)localIterator.next();
        ((SupportMapFragment.a)a()).a(localOnMapReadyCallback);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
      this.d.clear();
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.SupportMapFragment.b
 * JD-Core Version:    0.7.0.1
 */