package com.google.tagmanager.proto;

import com.google.analytics.containertag.proto.Serving.Resource;
import com.google.analytics.containertag.proto.Serving.Resource.Builder;
import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;

public final class Resource$ResourceWithMetadata$Builder
  extends GeneratedMessageLite.Builder<Resource.ResourceWithMetadata, Builder>
  implements Resource.ResourceWithMetadataOrBuilder
{
  private int a;
  private long b;
  private Serving.Resource c = Serving.Resource.a();
  
  private Resource$ResourceWithMetadata$Builder()
  {
    n();
  }
  
  private void n() {}
  
  private static Builder o()
  {
    return new Builder();
  }
  
  public Builder a()
  {
    return o().a(d());
  }
  
  public Builder a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }
  
  public Builder a(Serving.Resource paramResource)
  {
    if (paramResource == null) {
      throw new NullPointerException();
    }
    this.c = paramResource;
    this.a = (0x2 | this.a);
    return this;
  }
  
  public Builder a(Resource.ResourceWithMetadata paramResourceWithMetadata)
  {
    if (paramResourceWithMetadata == Resource.ResourceWithMetadata.a()) {
      return this;
    }
    if (paramResourceWithMetadata.d()) {
      a(paramResourceWithMetadata.e());
    }
    if (paramResourceWithMetadata.f()) {
      b(paramResourceWithMetadata.g());
    }
    a(r().a(Resource.ResourceWithMetadata.b(paramResourceWithMetadata)));
    return this;
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Resource.ResourceWithMetadata localResourceWithMetadata3 = (Resource.ResourceWithMetadata)Resource.ResourceWithMetadata.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localResourceWithMetadata3 != null) {
        a(localResourceWithMetadata3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Resource.ResourceWithMetadata localResourceWithMetadata2 = (Resource.ResourceWithMetadata)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localResourceWithMetadata1 = localResourceWithMetadata2;
      }
      if (localResourceWithMetadata1 != null) {
        a(localResourceWithMetadata1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Resource.ResourceWithMetadata localResourceWithMetadata1 = null;
      }
    }
  }
  
  public Builder b(Serving.Resource paramResource)
  {
    if (((0x2 & this.a) == 2) && (this.c != Serving.Resource.a())) {}
    for (this.c = Serving.Resource.a(this.c).a(paramResource).d();; this.c = paramResource)
    {
      this.a = (0x2 | this.a);
      return this;
    }
  }
  
  public Resource.ResourceWithMetadata b()
  {
    return Resource.ResourceWithMetadata.a();
  }
  
  public Resource.ResourceWithMetadata c()
  {
    Resource.ResourceWithMetadata localResourceWithMetadata = d();
    if (!localResourceWithMetadata.j()) {
      throw a(localResourceWithMetadata);
    }
    return localResourceWithMetadata;
  }
  
  public Resource.ResourceWithMetadata d()
  {
    int i = 1;
    Resource.ResourceWithMetadata localResourceWithMetadata = new Resource.ResourceWithMetadata(this, null);
    int j = this.a;
    if ((j & 0x1) == i) {}
    for (;;)
    {
      Resource.ResourceWithMetadata.a(localResourceWithMetadata, this.b);
      if ((j & 0x2) == 2) {
        i |= 0x2;
      }
      Resource.ResourceWithMetadata.a(localResourceWithMetadata, this.c);
      Resource.ResourceWithMetadata.a(localResourceWithMetadata, i);
      return localResourceWithMetadata;
      i = 0;
    }
  }
  
  public boolean i()
  {
    return (0x1 & this.a) == 1;
  }
  
  public final boolean j()
  {
    if (!i()) {}
    while ((!k()) || (!l().j())) {
      return false;
    }
    return true;
  }
  
  public boolean k()
  {
    return (0x2 & this.a) == 2;
  }
  
  public Serving.Resource l()
  {
    return this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.proto.Resource.ResourceWithMetadata.Builder
 * JD-Core Version:    0.7.0.1
 */