package com.google.analytics.containertag.proto;

import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Serving$ServingValue$Builder
  extends GeneratedMessageLite.Builder<Serving.ServingValue, Builder>
  implements Serving.ServingValueOrBuilder
{
  private int a;
  private List<Integer> b = Collections.emptyList();
  private List<Integer> c = Collections.emptyList();
  private List<Integer> d = Collections.emptyList();
  private int e;
  private List<Integer> f = Collections.emptyList();
  private int g;
  
  private Serving$ServingValue$Builder()
  {
    k();
  }
  
  private void k() {}
  
  private static Builder l()
  {
    return new Builder();
  }
  
  private void m()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  private void n()
  {
    if ((0x2 & this.a) != 2)
    {
      this.c = new ArrayList(this.c);
      this.a = (0x2 | this.a);
    }
  }
  
  private void o()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }
  
  private void p()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }
  
  public Builder a()
  {
    return l().a(d());
  }
  
  public Builder a(int paramInt)
  {
    this.a = (0x8 | this.a);
    this.e = paramInt;
    return this;
  }
  
  public Builder a(Serving.ServingValue paramServingValue)
  {
    if (paramServingValue == Serving.ServingValue.a()) {
      return this;
    }
    if (!Serving.ServingValue.b(paramServingValue).isEmpty())
    {
      if (this.b.isEmpty())
      {
        this.b = Serving.ServingValue.b(paramServingValue);
        this.a = (0xFFFFFFFE & this.a);
      }
    }
    else
    {
      if (!Serving.ServingValue.c(paramServingValue).isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label252;
        }
        this.c = Serving.ServingValue.c(paramServingValue);
        this.a = (0xFFFFFFFD & this.a);
      }
      label95:
      if (!Serving.ServingValue.d(paramServingValue).isEmpty())
      {
        if (!this.d.isEmpty()) {
          break label273;
        }
        this.d = Serving.ServingValue.d(paramServingValue);
        this.a = (0xFFFFFFFB & this.a);
      }
      label138:
      if (paramServingValue.l()) {
        a(paramServingValue.m());
      }
      if (!Serving.ServingValue.e(paramServingValue).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label294;
        }
        this.f = Serving.ServingValue.e(paramServingValue);
        this.a = (0xFFFFFFEF & this.a);
      }
    }
    for (;;)
    {
      if (paramServingValue.s()) {
        b(paramServingValue.t());
      }
      a(r().a(Serving.ServingValue.f(paramServingValue)));
      return this;
      m();
      this.b.addAll(Serving.ServingValue.b(paramServingValue));
      break;
      label252:
      n();
      this.c.addAll(Serving.ServingValue.c(paramServingValue));
      break label95;
      label273:
      o();
      this.d.addAll(Serving.ServingValue.d(paramServingValue));
      break label138;
      label294:
      p();
      this.f.addAll(Serving.ServingValue.e(paramServingValue));
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.ServingValue localServingValue3 = (Serving.ServingValue)Serving.ServingValue.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localServingValue3 != null) {
        a(localServingValue3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.ServingValue localServingValue2 = (Serving.ServingValue)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localServingValue1 = localServingValue2;
      }
      if (localServingValue1 != null) {
        a(localServingValue1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.ServingValue localServingValue1 = null;
      }
    }
  }
  
  public Builder b(int paramInt)
  {
    this.a = (0x20 | this.a);
    this.g = paramInt;
    return this;
  }
  
  public Serving.ServingValue b()
  {
    return Serving.ServingValue.a();
  }
  
  public Serving.ServingValue c()
  {
    Serving.ServingValue localServingValue = d();
    if (!localServingValue.j()) {
      throw a(localServingValue);
    }
    return localServingValue;
  }
  
  public Serving.ServingValue d()
  {
    int i = 1;
    Serving.ServingValue localServingValue = new Serving.ServingValue(this, null);
    int j = this.a;
    if ((0x1 & this.a) == i)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    Serving.ServingValue.a(localServingValue, this.b);
    if ((0x2 & this.a) == 2)
    {
      this.c = Collections.unmodifiableList(this.c);
      this.a = (0xFFFFFFFD & this.a);
    }
    Serving.ServingValue.b(localServingValue, this.c);
    if ((0x4 & this.a) == 4)
    {
      this.d = Collections.unmodifiableList(this.d);
      this.a = (0xFFFFFFFB & this.a);
    }
    Serving.ServingValue.c(localServingValue, this.d);
    if ((j & 0x8) == 8) {}
    for (;;)
    {
      Serving.ServingValue.a(localServingValue, this.e);
      if ((0x10 & this.a) == 16)
      {
        this.f = Collections.unmodifiableList(this.f);
        this.a = (0xFFFFFFEF & this.a);
      }
      Serving.ServingValue.d(localServingValue, this.f);
      if ((j & 0x20) == 32) {
        i |= 0x2;
      }
      Serving.ServingValue.b(localServingValue, this.g);
      Serving.ServingValue.c(localServingValue, i);
      return localServingValue;
      i = 0;
    }
  }
  
  public final boolean j()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.ServingValue.Builder
 * JD-Core Version:    0.7.0.1
 */