package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Api<O extends Api.ApiOptions>
{
  private final Api.b<?, O> a;
  private final Api.c<?> b;
  private final ArrayList<Scope> c;
  
  public <C extends Api.a> Api(Api.b<C, O> paramb, Api.c<C> paramc, Scope... paramVarArgs)
  {
    this.a = paramb;
    this.b = paramc;
    this.c = new ArrayList(Arrays.asList(paramVarArgs));
  }
  
  public Api.b<?, O> a()
  {
    return this.a;
  }
  
  public List<Scope> b()
  {
    return this.c;
  }
  
  public Api.c<?> c()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api
 * JD-Core Version:    0.7.0.1
 */