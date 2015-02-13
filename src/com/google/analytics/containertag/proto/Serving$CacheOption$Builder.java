package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;

public final class Serving$CacheOption$Builder
  extends GeneratedMessageLite.Builder<Serving.CacheOption, Builder>
  implements Serving.CacheOptionOrBuilder
{
  private int a;
  private Serving.CacheOption.CacheLevel b = Serving.CacheOption.CacheLevel.a;
  private int c;
  private int d;
  
  private Serving$CacheOption$Builder()
  {
    k();
  }
  
  private void k() {}
  
  private static Builder l()
  {
    return new Builder();
  }
  
  public Builder a()
  {
    return l().a(d());
  }
  
  public Builder a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public Builder a(Serving.CacheOption.CacheLevel paramCacheLevel)
  {
    if (paramCacheLevel == null) {
      throw new NullPointerException();
    }
    this.a = (0x1 | this.a);
    this.b = paramCacheLevel;
    return this;
  }
  
  public Builder a(Serving.CacheOption paramCacheOption)
  {
    if (paramCacheOption == Serving.CacheOption.a()) {
      return this;
    }
    if (paramCacheOption.d()) {
      a(paramCacheOption.e());
    }
    if (paramCacheOption.f()) {
      a(paramCacheOption.g());
    }
    if (paramCacheOption.h()) {
      b(paramCacheOption.i());
    }
    a(r().a(Serving.CacheOption.b(paramCacheOption)));
    return this;
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.CacheOption localCacheOption3 = (Serving.CacheOption)Serving.CacheOption.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localCacheOption3 != null) {
        a(localCacheOption3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.CacheOption localCacheOption2 = (Serving.CacheOption)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localCacheOption1 = localCacheOption2;
      }
      if (localCacheOption1 != null) {
        a(localCacheOption1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.CacheOption localCacheOption1 = null;
      }
    }
  }
  
  public Builder b(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }
  
  public Serving.CacheOption b()
  {
    return Serving.CacheOption.a();
  }
  
  public Serving.CacheOption c()
  {
    Serving.CacheOption localCacheOption = d();
    if (!localCacheOption.j()) {
      throw a(localCacheOption);
    }
    return localCacheOption;
  }
  
  public Serving.CacheOption d()
  {
    int i = 1;
    Serving.CacheOption localCacheOption = new Serving.CacheOption(this, null);
    int j = this.a;
    if ((j & 0x1) == i) {}
    for (;;)
    {
      Serving.CacheOption.a(localCacheOption, this.b);
      if ((j & 0x2) == 2) {
        i |= 0x2;
      }
      Serving.CacheOption.a(localCacheOption, this.c);
      if ((j & 0x4) == 4) {
        i |= 0x4;
      }
      Serving.CacheOption.b(localCacheOption, this.d);
      Serving.CacheOption.c(localCacheOption, i);
      return localCacheOption;
      i = 0;
    }
  }
  
  public final boolean j()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.CacheOption.Builder
 * JD-Core Version:    0.7.0.1
 */