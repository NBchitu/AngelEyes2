package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StreetViewPanoramaView$b
  extends a<StreetViewPanoramaView.a>
{
  protected f<StreetViewPanoramaView.a> a;
  private final ViewGroup b;
  private final Context c;
  private final StreetViewPanoramaOptions d;
  private final List<OnStreetViewPanoramaReadyCallback> e = new ArrayList();
  
  StreetViewPanoramaView$b(ViewGroup paramViewGroup, Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    this.b = paramViewGroup;
    this.c = paramContext;
    this.d = paramStreetViewPanoramaOptions;
  }
  
  protected void a(f<StreetViewPanoramaView.a> paramf)
  {
    this.a = paramf;
    g();
  }
  
  public void g()
  {
    if ((this.a != null) && (a() == null)) {}
    try
    {
      IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = x.a(this.c).a(e.a(this.c), this.d);
      this.a.a(new StreetViewPanoramaView.a(this.b, localIStreetViewPanoramaViewDelegate));
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        OnStreetViewPanoramaReadyCallback localOnStreetViewPanoramaReadyCallback = (OnStreetViewPanoramaReadyCallback)localIterator.next();
        ((StreetViewPanoramaView.a)a()).a(localOnStreetViewPanoramaReadyCallback);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
      this.e.clear();
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaView.b
 * JD-Core Version:    0.7.0.1
 */