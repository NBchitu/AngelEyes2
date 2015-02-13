package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;

public abstract class BaseImplementation$a<R extends Result, A extends Api.a>
  extends BaseImplementation.AbstractPendingResult<R>
  implements c.d<A>
{
  private final Api.c<A> b;
  private final GoogleApiClient c;
  private c.b d;
  
  protected BaseImplementation$a(Api.c<A> paramc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient.a());
    this.b = ((Api.c)jx.a(paramc));
    this.c = paramGoogleApiClient;
  }
  
  private void a(RemoteException paramRemoteException)
  {
    b(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  public final void a(A paramA)
  {
    try
    {
      b(paramA);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      a(localDeadObjectException);
      throw localDeadObjectException;
    }
    catch (RemoteException localRemoteException)
    {
      a(localRemoteException);
    }
  }
  
  public void a(c.b paramb)
  {
    this.d = paramb;
  }
  
  protected abstract void b(A paramA);
  
  public final void b(Status paramStatus)
  {
    if (!paramStatus.e()) {}
    for (boolean bool = true;; bool = false)
    {
      jx.b(bool, "Failed result must not be success");
      a(a(paramStatus));
      return;
    }
  }
  
  protected void c()
  {
    super.c();
    if (this.d != null)
    {
      this.d.a(this);
      this.d = null;
    }
  }
  
  public final Api.c<A> d()
  {
    return this.b;
  }
  
  public int e()
  {
    return 0;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.BaseImplementation.a
 * JD-Core Version:    0.7.0.1
 */