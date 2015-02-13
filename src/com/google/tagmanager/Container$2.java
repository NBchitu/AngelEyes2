package com.google.tagmanager;

import com.google.tagmanager.proto.Resource.ResourceWithMetadata;

class Container$2
  implements LoadCallback<Resource.ResourceWithMetadata>
{
  Container$2(Container paramContainer, Clock paramClock) {}
  
  private Container.RefreshFailure b(LoadCallback.Failure paramFailure)
  {
    switch (Container.4.a[paramFailure.ordinal()])
    {
    default: 
      return Container.RefreshFailure.f;
    case 1: 
      return Container.RefreshFailure.a;
    case 2: 
      return Container.RefreshFailure.b;
    }
    return Container.RefreshFailure.e;
  }
  
  public void a()
  {
    Container.a(this.b, Container.RefreshType.a);
  }
  
  public void a(LoadCallback.Failure paramFailure)
  {
    Container.a(this.b, Container.RefreshType.a, b(paramFailure));
    if (this.b.c()) {
      this.b.a(0L);
    }
  }
  
  public void a(Resource.ResourceWithMetadata paramResourceWithMetadata)
  {
    if (this.b.c())
    {
      Container.a(this.b, paramResourceWithMetadata.g(), false);
      Log.e("setting refresh time to saved time: " + paramResourceWithMetadata.e());
      Container.a(this.b, paramResourceWithMetadata.e());
      this.b.a(Math.max(0L, Math.min(43200000L, 43200000L + Container.a(this.b) - this.a.a())));
    }
    Container.b(this.b, Container.RefreshType.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.Container.2
 * JD-Core Version:    0.7.0.1
 */