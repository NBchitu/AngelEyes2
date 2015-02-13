package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;

public final class Serving$OptionalResource$Builder
  extends GeneratedMessageLite.Builder<Serving.OptionalResource, Builder>
  implements Serving.OptionalResourceOrBuilder
{
  private int a;
  private Serving.Resource b = Serving.Resource.a();
  
  private Serving$OptionalResource$Builder()
  {
    m();
  }
  
  private void m() {}
  
  private static Builder n()
  {
    return new Builder();
  }
  
  public Builder a()
  {
    return n().a(d());
  }
  
  public Builder a(Serving.OptionalResource paramOptionalResource)
  {
    if (paramOptionalResource == Serving.OptionalResource.a()) {
      return this;
    }
    if (paramOptionalResource.d()) {
      a(paramOptionalResource.e());
    }
    a(r().a(Serving.OptionalResource.b(paramOptionalResource)));
    return this;
  }
  
  public Builder a(Serving.Resource paramResource)
  {
    if (((0x1 & this.a) == 1) && (this.b != Serving.Resource.a())) {}
    for (this.b = Serving.Resource.a(this.b).a(paramResource).d();; this.b = paramResource)
    {
      this.a = (0x1 | this.a);
      return this;
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.OptionalResource localOptionalResource3 = (Serving.OptionalResource)Serving.OptionalResource.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localOptionalResource3 != null) {
        a(localOptionalResource3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.OptionalResource localOptionalResource2 = (Serving.OptionalResource)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localOptionalResource1 = localOptionalResource2;
      }
      if (localOptionalResource1 != null) {
        a(localOptionalResource1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.OptionalResource localOptionalResource1 = null;
      }
    }
  }
  
  public Serving.OptionalResource b()
  {
    return Serving.OptionalResource.a();
  }
  
  public Serving.OptionalResource c()
  {
    Serving.OptionalResource localOptionalResource = d();
    if (!localOptionalResource.j()) {
      throw a(localOptionalResource);
    }
    return localOptionalResource;
  }
  
  public Serving.OptionalResource d()
  {
    int i = 1;
    Serving.OptionalResource localOptionalResource = new Serving.OptionalResource(this, null);
    if ((0x1 & this.a) == i) {}
    for (;;)
    {
      Serving.OptionalResource.a(localOptionalResource, this.b);
      Serving.OptionalResource.a(localOptionalResource, i);
      return localOptionalResource;
      i = 0;
    }
  }
  
  public boolean i()
  {
    return (0x1 & this.a) == 1;
  }
  
  public final boolean j()
  {
    return (!i()) || (k().j());
  }
  
  public Serving.Resource k()
  {
    return this.b;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.OptionalResource.Builder
 * JD-Core Version:    0.7.0.1
 */