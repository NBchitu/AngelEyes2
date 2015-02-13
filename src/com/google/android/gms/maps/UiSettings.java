package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{
  private final IUiSettingsDelegate a;
  
  UiSettings(IUiSettingsDelegate paramIUiSettingsDelegate)
  {
    this.a = paramIUiSettingsDelegate;
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.a.b(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    try
    {
      this.a.c(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.UiSettings
 * JD-Core Version:    0.7.0.1
 */