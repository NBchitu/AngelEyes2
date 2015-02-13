package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.maps.model.internal.i;

public abstract interface IGoogleMapDelegate
  extends IInterface
{
  public abstract CameraPosition a();
  
  public abstract IPolylineDelegate a(PolylineOptions paramPolylineOptions);
  
  public abstract com.google.android.gms.maps.model.internal.h a(CircleOptions paramCircleOptions);
  
  public abstract i a(GroundOverlayOptions paramGroundOverlayOptions);
  
  public abstract i a(GroundOverlayOptions paramGroundOverlayOptions, com.google.android.gms.maps.model.internal.e parame);
  
  public abstract com.google.android.gms.maps.model.internal.l a(MarkerOptions paramMarkerOptions);
  
  public abstract com.google.android.gms.maps.model.internal.l a(MarkerOptions paramMarkerOptions, com.google.android.gms.maps.model.internal.p paramp);
  
  public abstract com.google.android.gms.maps.model.internal.m a(PolygonOptions paramPolygonOptions);
  
  public abstract com.google.android.gms.maps.model.internal.n a(TileOverlayOptions paramTileOverlayOptions);
  
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(com.google.android.gms.dynamic.d paramd);
  
  public abstract void a(com.google.android.gms.dynamic.d paramd, int paramInt, b paramb);
  
  public abstract void a(com.google.android.gms.dynamic.d paramd, b paramb);
  
  public abstract void a(ILocationSourceDelegate paramILocationSourceDelegate);
  
  public abstract void a(d paramd);
  
  public abstract void a(e parame);
  
  public abstract void a(f paramf);
  
  public abstract void a(g paramg);
  
  public abstract void a(h paramh);
  
  public abstract void a(j paramj);
  
  public abstract void a(k paramk);
  
  public abstract void a(l paraml);
  
  public abstract void a(m paramm);
  
  public abstract void a(n paramn);
  
  public abstract void a(o paramo);
  
  public abstract void a(p paramp);
  
  public abstract void a(q paramq);
  
  public abstract void a(v paramv, com.google.android.gms.dynamic.d paramd);
  
  public abstract void a(c paramc);
  
  public abstract void a(c paramc, int paramInt, b paramb);
  
  public abstract void a(c paramc, b paramb);
  
  public abstract void a(String paramString);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract float b();
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(com.google.android.gms.dynamic.d paramd);
  
  public abstract void b(c paramc);
  
  public abstract boolean b(boolean paramBoolean);
  
  public abstract float c();
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void e();
  
  public abstract int f();
  
  public abstract boolean g();
  
  public abstract boolean h();
  
  public abstract boolean i();
  
  public abstract Location j();
  
  public abstract IUiSettingsDelegate k();
  
  public abstract IProjectionDelegate l();
  
  public abstract boolean m();
  
  public abstract com.google.android.gms.maps.model.internal.j n();
  
  public abstract void o();
  
  public abstract void p();
  
  public abstract void q();
  
  public abstract void r();
  
  public abstract boolean s();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IGoogleMapDelegate
 * JD-Core Version:    0.7.0.1
 */