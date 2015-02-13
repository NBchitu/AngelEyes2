package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;

public final class Serving$Property$Builder
  extends GeneratedMessageLite.Builder<Serving.Property, Builder>
  implements Serving.PropertyOrBuilder
{
  private int a;
  private int b;
  private int c;
  
  private Serving$Property$Builder()
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
  
  public Builder a(int paramInt)
  {
    this.a = (0x1 | this.a);
    this.b = paramInt;
    return this;
  }
  
  public Builder a(Serving.Property paramProperty)
  {
    if (paramProperty == Serving.Property.a()) {
      return this;
    }
    if (paramProperty.d()) {
      a(paramProperty.e());
    }
    if (paramProperty.f()) {
      b(paramProperty.g());
    }
    a(r().a(Serving.Property.b(paramProperty)));
    return this;
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.Property localProperty3 = (Serving.Property)Serving.Property.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localProperty3 != null) {
        a(localProperty3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.Property localProperty2 = (Serving.Property)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localProperty1 = localProperty2;
      }
      if (localProperty1 != null) {
        a(localProperty1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.Property localProperty1 = null;
      }
    }
  }
  
  public Builder b(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public Serving.Property b()
  {
    return Serving.Property.a();
  }
  
  public Serving.Property c()
  {
    Serving.Property localProperty = d();
    if (!localProperty.j()) {
      throw a(localProperty);
    }
    return localProperty;
  }
  
  public Serving.Property d()
  {
    int i = 1;
    Serving.Property localProperty = new Serving.Property(this, null);
    int j = this.a;
    if ((j & 0x1) == i) {}
    for (;;)
    {
      Serving.Property.a(localProperty, this.b);
      if ((j & 0x2) == 2) {
        i |= 0x2;
      }
      Serving.Property.b(localProperty, this.c);
      Serving.Property.c(localProperty, i);
      return localProperty;
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
    while (!k()) {
      return false;
    }
    return true;
  }
  
  public boolean k()
  {
    return (0x2 & this.a) == 2;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.Property.Builder
 * JD-Core Version:    0.7.0.1
 */