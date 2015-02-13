package com.google.analytics.containertag.proto;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.Builder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.LazyStringArrayList;
import com.google.tagmanager.protobuf.LazyStringList;
import com.google.tagmanager.protobuf.Parser;
import com.google.tagmanager.protobuf.UnmodifiableLazyStringList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Serving$Resource$Builder
  extends GeneratedMessageLite.Builder<Serving.Resource, Builder>
  implements Serving.ResourceOrBuilder
{
  private int a;
  private LazyStringList b = LazyStringArrayList.a;
  private List<TypeSystem.Value> c = Collections.emptyList();
  private List<Serving.Property> d = Collections.emptyList();
  private List<Serving.FunctionCall> e = Collections.emptyList();
  private List<Serving.FunctionCall> f = Collections.emptyList();
  private List<Serving.FunctionCall> g = Collections.emptyList();
  private List<Serving.Rule> h = Collections.emptyList();
  private Object i = "";
  private Object j = "";
  private Object k = "0";
  private Object l = "";
  private Serving.CacheOption m = Serving.CacheOption.a();
  private float n;
  private boolean o;
  private LazyStringList p = LazyStringArrayList.a;
  private int q;
  
  private Serving$Resource$Builder()
  {
    p();
  }
  
  private void A()
  {
    if ((0x4000 & this.a) != 16384)
    {
      this.p = new LazyStringArrayList(this.p);
      this.a = (0x4000 | this.a);
    }
  }
  
  private void p() {}
  
  private static Builder s()
  {
    return new Builder();
  }
  
  private void t()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new LazyStringArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  private void u()
  {
    if ((0x2 & this.a) != 2)
    {
      this.c = new ArrayList(this.c);
      this.a = (0x2 | this.a);
    }
  }
  
  private void v()
  {
    if ((0x4 & this.a) != 4)
    {
      this.d = new ArrayList(this.d);
      this.a = (0x4 | this.a);
    }
  }
  
  private void w()
  {
    if ((0x8 & this.a) != 8)
    {
      this.e = new ArrayList(this.e);
      this.a = (0x8 | this.a);
    }
  }
  
  private void x()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }
  
  private void y()
  {
    if ((0x20 & this.a) != 32)
    {
      this.g = new ArrayList(this.g);
      this.a = (0x20 | this.a);
    }
  }
  
  private void z()
  {
    if ((0x40 & this.a) != 64)
    {
      this.h = new ArrayList(this.h);
      this.a = (0x40 | this.a);
    }
  }
  
  public Builder a()
  {
    return s().a(d());
  }
  
  public Builder a(float paramFloat)
  {
    this.a = (0x1000 | this.a);
    this.n = paramFloat;
    return this;
  }
  
  public Builder a(Serving.CacheOption paramCacheOption)
  {
    if (((0x800 & this.a) == 2048) && (this.m != Serving.CacheOption.a())) {}
    for (this.m = Serving.CacheOption.a(this.m).a(paramCacheOption).d();; this.m = paramCacheOption)
    {
      this.a = (0x800 | this.a);
      return this;
    }
  }
  
  public Builder a(Serving.Resource paramResource)
  {
    if (paramResource == Serving.Resource.a()) {
      return this;
    }
    if (!Serving.Resource.b(paramResource).isEmpty())
    {
      if (this.b.isEmpty())
      {
        this.b = Serving.Resource.b(paramResource);
        this.a = (0xFFFFFFFE & this.a);
      }
    }
    else
    {
      if (!Serving.Resource.c(paramResource).isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label565;
        }
        this.c = Serving.Resource.c(paramResource);
        this.a = (0xFFFFFFFD & this.a);
      }
      label95:
      if (!Serving.Resource.d(paramResource).isEmpty())
      {
        if (!this.d.isEmpty()) {
          break label586;
        }
        this.d = Serving.Resource.d(paramResource);
        this.a = (0xFFFFFFFB & this.a);
      }
      label138:
      if (!Serving.Resource.e(paramResource).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label607;
        }
        this.e = Serving.Resource.e(paramResource);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label181:
      if (!Serving.Resource.f(paramResource).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label628;
        }
        this.f = Serving.Resource.f(paramResource);
        this.a = (0xFFFFFFEF & this.a);
      }
      label224:
      if (!Serving.Resource.g(paramResource).isEmpty())
      {
        if (!this.g.isEmpty()) {
          break label649;
        }
        this.g = Serving.Resource.g(paramResource);
        this.a = (0xFFFFFFDF & this.a);
      }
      label267:
      if (!Serving.Resource.h(paramResource).isEmpty())
      {
        if (!this.h.isEmpty()) {
          break label670;
        }
        this.h = Serving.Resource.h(paramResource);
        this.a = (0xFFFFFFBF & this.a);
      }
      label310:
      if (paramResource.w())
      {
        this.a = (0x80 | this.a);
        this.i = Serving.Resource.i(paramResource);
      }
      if (paramResource.z())
      {
        this.a = (0x100 | this.a);
        this.j = Serving.Resource.j(paramResource);
      }
      if (paramResource.C())
      {
        this.a = (0x200 | this.a);
        this.k = Serving.Resource.k(paramResource);
      }
      if (paramResource.F())
      {
        this.a = (0x400 | this.a);
        this.l = Serving.Resource.l(paramResource);
      }
      if (paramResource.I()) {
        a(paramResource.J());
      }
      if (paramResource.K()) {
        a(paramResource.L());
      }
      if (paramResource.M()) {
        a(paramResource.N());
      }
      if (!Serving.Resource.m(paramResource).isEmpty())
      {
        if (!this.p.isEmpty()) {
          break label691;
        }
        this.p = Serving.Resource.m(paramResource);
        this.a = (0xFFFFBFFF & this.a);
      }
    }
    for (;;)
    {
      if (paramResource.Q()) {
        f(paramResource.R());
      }
      a(r().a(Serving.Resource.n(paramResource)));
      return this;
      t();
      this.b.addAll(Serving.Resource.b(paramResource));
      break;
      label565:
      u();
      this.c.addAll(Serving.Resource.c(paramResource));
      break label95;
      label586:
      v();
      this.d.addAll(Serving.Resource.d(paramResource));
      break label138;
      label607:
      w();
      this.e.addAll(Serving.Resource.e(paramResource));
      break label181;
      label628:
      x();
      this.f.addAll(Serving.Resource.f(paramResource));
      break label224;
      label649:
      y();
      this.g.addAll(Serving.Resource.g(paramResource));
      break label267;
      label670:
      z();
      this.h.addAll(Serving.Resource.h(paramResource));
      break label310;
      label691:
      A();
      this.p.addAll(Serving.Resource.m(paramResource));
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.Resource localResource3 = (Serving.Resource)Serving.Resource.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localResource3 != null) {
        a(localResource3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.Resource localResource2 = (Serving.Resource)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localResource1 = localResource2;
      }
      if (localResource1 != null) {
        a(localResource1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.Resource localResource1 = null;
      }
    }
  }
  
  public Builder a(boolean paramBoolean)
  {
    this.a = (0x2000 | this.a);
    this.o = paramBoolean;
    return this;
  }
  
  public TypeSystem.Value a(int paramInt)
  {
    return (TypeSystem.Value)this.c.get(paramInt);
  }
  
  public Serving.Property b(int paramInt)
  {
    return (Serving.Property)this.d.get(paramInt);
  }
  
  public Serving.Resource b()
  {
    return Serving.Resource.a();
  }
  
  public Serving.FunctionCall c(int paramInt)
  {
    return (Serving.FunctionCall)this.e.get(paramInt);
  }
  
  public Serving.Resource c()
  {
    Serving.Resource localResource = d();
    if (!localResource.j()) {
      throw a(localResource);
    }
    return localResource;
  }
  
  public Serving.FunctionCall d(int paramInt)
  {
    return (Serving.FunctionCall)this.f.get(paramInt);
  }
  
  public Serving.Resource d()
  {
    int i1 = 1;
    Serving.Resource localResource = new Serving.Resource(this, null);
    int i2 = this.a;
    if ((0x1 & this.a) == i1)
    {
      this.b = new UnmodifiableLazyStringList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    Serving.Resource.a(localResource, this.b);
    if ((0x2 & this.a) == 2)
    {
      this.c = Collections.unmodifiableList(this.c);
      this.a = (0xFFFFFFFD & this.a);
    }
    Serving.Resource.a(localResource, this.c);
    if ((0x4 & this.a) == 4)
    {
      this.d = Collections.unmodifiableList(this.d);
      this.a = (0xFFFFFFFB & this.a);
    }
    Serving.Resource.b(localResource, this.d);
    if ((0x8 & this.a) == 8)
    {
      this.e = Collections.unmodifiableList(this.e);
      this.a = (0xFFFFFFF7 & this.a);
    }
    Serving.Resource.c(localResource, this.e);
    if ((0x10 & this.a) == 16)
    {
      this.f = Collections.unmodifiableList(this.f);
      this.a = (0xFFFFFFEF & this.a);
    }
    Serving.Resource.d(localResource, this.f);
    if ((0x20 & this.a) == 32)
    {
      this.g = Collections.unmodifiableList(this.g);
      this.a = (0xFFFFFFDF & this.a);
    }
    Serving.Resource.e(localResource, this.g);
    if ((0x40 & this.a) == 64)
    {
      this.h = Collections.unmodifiableList(this.h);
      this.a = (0xFFFFFFBF & this.a);
    }
    Serving.Resource.f(localResource, this.h);
    if ((i2 & 0x80) == 128) {}
    for (;;)
    {
      Serving.Resource.a(localResource, this.i);
      if ((i2 & 0x100) == 256) {
        i1 |= 0x2;
      }
      Serving.Resource.b(localResource, this.j);
      if ((i2 & 0x200) == 512) {
        i1 |= 0x4;
      }
      Serving.Resource.c(localResource, this.k);
      if ((i2 & 0x400) == 1024) {
        i1 |= 0x8;
      }
      Serving.Resource.d(localResource, this.l);
      if ((i2 & 0x800) == 2048) {
        i1 |= 0x10;
      }
      Serving.Resource.a(localResource, this.m);
      if ((i2 & 0x1000) == 4096) {
        i1 |= 0x20;
      }
      Serving.Resource.a(localResource, this.n);
      if ((i2 & 0x2000) == 8192) {
        i1 |= 0x40;
      }
      Serving.Resource.a(localResource, this.o);
      if ((0x4000 & this.a) == 16384)
      {
        this.p = new UnmodifiableLazyStringList(this.p);
        this.a = (0xFFFFBFFF & this.a);
      }
      Serving.Resource.b(localResource, this.p);
      if ((i2 & 0x8000) == 32768) {
        i1 |= 0x80;
      }
      Serving.Resource.a(localResource, this.q);
      Serving.Resource.b(localResource, i1);
      return localResource;
      i1 = 0;
    }
  }
  
  public Serving.FunctionCall e(int paramInt)
  {
    return (Serving.FunctionCall)this.g.get(paramInt);
  }
  
  public Builder f(int paramInt)
  {
    this.a = (0x8000 | this.a);
    this.q = paramInt;
    return this;
  }
  
  public int i()
  {
    return this.c.size();
  }
  
  public final boolean j()
  {
    for (int i1 = 0; i1 < i(); i1++) {
      if (!a(i1).j()) {
        return false;
      }
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= k()) {
        break label56;
      }
      if (!b(i2).j()) {
        break;
      }
    }
    label56:
    for (int i3 = 0;; i3++)
    {
      if (i3 >= l()) {
        break label83;
      }
      if (!c(i3).j()) {
        break;
      }
    }
    label83:
    for (int i4 = 0;; i4++)
    {
      if (i4 >= m()) {
        break label113;
      }
      if (!d(i4).j()) {
        break;
      }
    }
    label113:
    for (int i5 = 0;; i5++)
    {
      if (i5 >= n()) {
        break label143;
      }
      if (!e(i5).j()) {
        break;
      }
    }
    label143:
    return true;
  }
  
  public int k()
  {
    return this.d.size();
  }
  
  public int l()
  {
    return this.e.size();
  }
  
  public int m()
  {
    return this.f.size();
  }
  
  public int n()
  {
    return this.g.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.Resource.Builder
 * JD-Core Version:    0.7.0.1
 */