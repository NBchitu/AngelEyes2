package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GoogleApiClient$Builder
{
  private String a;
  private final Set<String> b = new HashSet();
  private int c;
  private View d;
  private String e;
  private final Context f;
  private final Map<Api<?>, Api.ApiOptions> g = new HashMap();
  private FragmentActivity h;
  private int i = -1;
  private GoogleApiClient.OnConnectionFailedListener j;
  private Looper k;
  private final Set<GoogleApiClient.ConnectionCallbacks> l = new HashSet();
  private final Set<GoogleApiClient.OnConnectionFailedListener> m = new HashSet();
  
  public GoogleApiClient$Builder(Context paramContext)
  {
    this.f = paramContext;
    this.k = paramContext.getMainLooper();
    this.e = paramContext.getPackageName();
  }
  
  private GoogleApiClient c()
  {
    g localg = g.a(this.h);
    Object localObject = localg.b(this.i);
    if (localObject == null) {
      localObject = new c(this.f.getApplicationContext(), this.k, a(), this.g, this.l, this.m, this.i);
    }
    localg.a(this.i, (GoogleApiClient)localObject, this.j);
    return localObject;
  }
  
  public Builder a(Api<? extends Api.ApiOptions.NotRequiredOptions> paramApi)
  {
    this.g.put(paramApi, null);
    List localList = paramApi.b();
    int n = localList.size();
    for (int i1 = 0; i1 < n; i1++) {
      this.b.add(((Scope)localList.get(i1)).a());
    }
    return this;
  }
  
  public Builder a(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.l.add(paramConnectionCallbacks);
    return this;
  }
  
  public Builder a(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.m.add(paramOnConnectionFailedListener);
    return this;
  }
  
  public jg a()
  {
    return new jg(this.a, this.b, this.c, this.d, this.e);
  }
  
  public GoogleApiClient b()
  {
    if (!this.g.isEmpty()) {}
    for (boolean bool = true;; bool = false)
    {
      jx.b(bool, "must call addApi() to add at least one API");
      if (this.i < 0) {
        break;
      }
      return c();
    }
    return new c(this.f, this.k, a(), this.g, this.l, this.m, -1);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.GoogleApiClient.Builder
 * JD-Core Version:    0.7.0.1
 */