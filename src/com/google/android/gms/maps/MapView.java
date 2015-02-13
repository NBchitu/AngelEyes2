package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView
  extends FrameLayout
{
  private final MapView.b a;
  private GoogleMap b;
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new MapView.b(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new MapView.b(this, paramContext, GoogleMapOptions.a(paramContext, paramAttributeSet));
  }
  
  @Deprecated
  public final GoogleMap getMap()
  {
    if (this.b != null) {
      return this.b;
    }
    this.a.g();
    if (this.a.a() == null) {
      return null;
    }
    try
    {
      this.b = new GoogleMap(((MapView.a)this.a.a()).f().a());
      return this.b;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.MapView
 * JD-Core Version:    0.7.0.1
 */