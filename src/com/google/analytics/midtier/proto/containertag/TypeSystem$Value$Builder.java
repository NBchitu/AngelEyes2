package com.google.analytics.midtier.proto.containertag;

import com.google.tagmanager.protobuf.AbstractMessageLite.Builder;
import com.google.tagmanager.protobuf.ByteString;
import com.google.tagmanager.protobuf.CodedInputStream;
import com.google.tagmanager.protobuf.ExtensionRegistryLite;
import com.google.tagmanager.protobuf.GeneratedMessageLite.ExtendableBuilder;
import com.google.tagmanager.protobuf.InvalidProtocolBufferException;
import com.google.tagmanager.protobuf.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TypeSystem$Value$Builder
  extends GeneratedMessageLite.ExtendableBuilder<TypeSystem.Value, Builder>
  implements TypeSystem.ValueOrBuilder
{
  private int a;
  private TypeSystem.Value.Type b = TypeSystem.Value.Type.a;
  private Object c = "";
  private List<TypeSystem.Value> d = Collections.emptyList();
  private List<TypeSystem.Value> e = Collections.emptyList();
  private List<TypeSystem.Value> f = Collections.emptyList();
  private Object g = "";
  private Object h = "";
  private long i;
  private boolean j;
  private List<TypeSystem.Value> k = Collections.emptyList();
  private List<TypeSystem.Value.Escaping> l = Collections.emptyList();
  private boolean m;
  
  private TypeSystem$Value$Builder()
  {
    t();
  }
  
  private void t() {}
  
  private static Builder u()
  {
    return new Builder();
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
    if ((0x200 & this.a) != 512)
    {
      this.k = new ArrayList(this.k);
      this.a = (0x200 | this.a);
    }
  }
  
  private void z()
  {
    if ((0x400 & this.a) != 1024)
    {
      this.l = new ArrayList(this.l);
      this.a = (0x400 | this.a);
    }
  }
  
  public Builder a()
  {
    return u().a(d());
  }
  
  public Builder a(long paramLong)
  {
    this.a = (0x80 | this.a);
    this.i = paramLong;
    return this;
  }
  
  public Builder a(TypeSystem.Value.Type paramType)
  {
    if (paramType == null) {
      throw new NullPointerException();
    }
    this.a = (0x1 | this.a);
    this.b = paramType;
    return this;
  }
  
  public Builder a(TypeSystem.Value paramValue)
  {
    if (paramValue == TypeSystem.Value.a()) {
      return this;
    }
    if (paramValue.d()) {
      a(paramValue.e());
    }
    if (paramValue.f())
    {
      this.a = (0x2 | this.a);
      this.c = TypeSystem.Value.b(paramValue);
    }
    if (!TypeSystem.Value.c(paramValue).isEmpty())
    {
      if (this.d.isEmpty())
      {
        this.d = TypeSystem.Value.c(paramValue);
        this.a = (0xFFFFFFFB & this.a);
      }
    }
    else
    {
      if (!TypeSystem.Value.d(paramValue).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label411;
        }
        this.e = TypeSystem.Value.d(paramValue);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label136:
      if (!TypeSystem.Value.e(paramValue).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label432;
        }
        this.f = TypeSystem.Value.e(paramValue);
        this.a = (0xFFFFFFEF & this.a);
      }
      label179:
      if (paramValue.t())
      {
        this.a = (0x20 | this.a);
        this.g = TypeSystem.Value.f(paramValue);
      }
      if (paramValue.w())
      {
        this.a = (0x40 | this.a);
        this.h = TypeSystem.Value.g(paramValue);
      }
      if (paramValue.z()) {
        a(paramValue.A());
      }
      if (paramValue.B()) {
        a(paramValue.C());
      }
      if (!TypeSystem.Value.h(paramValue).isEmpty())
      {
        if (!this.k.isEmpty()) {
          break label453;
        }
        this.k = TypeSystem.Value.h(paramValue);
        this.a = (0xFFFFFDFF & this.a);
      }
      label307:
      if (!TypeSystem.Value.i(paramValue).isEmpty())
      {
        if (!this.l.isEmpty()) {
          break label474;
        }
        this.l = TypeSystem.Value.i(paramValue);
        this.a = (0xFFFFFBFF & this.a);
      }
    }
    for (;;)
    {
      if (paramValue.H()) {
        b(paramValue.I());
      }
      a(paramValue);
      a(r().a(TypeSystem.Value.j(paramValue)));
      return this;
      v();
      this.d.addAll(TypeSystem.Value.c(paramValue));
      break;
      label411:
      w();
      this.e.addAll(TypeSystem.Value.d(paramValue));
      break label136;
      label432:
      x();
      this.f.addAll(TypeSystem.Value.e(paramValue));
      break label179;
      label453:
      y();
      this.k.addAll(TypeSystem.Value.h(paramValue));
      break label307;
      label474:
      z();
      this.l.addAll(TypeSystem.Value.i(paramValue));
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      TypeSystem.Value localValue3 = (TypeSystem.Value)TypeSystem.Value.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localValue3 != null) {
        a(localValue3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      TypeSystem.Value localValue2 = (TypeSystem.Value)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localValue1 = localValue2;
      }
      if (localValue1 != null) {
        a(localValue1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        TypeSystem.Value localValue1 = null;
      }
    }
  }
  
  public Builder a(Iterable<? extends TypeSystem.Value.Escaping> paramIterable)
  {
    z();
    AbstractMessageLite.Builder.a(paramIterable, this.l);
    return this;
  }
  
  public Builder a(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = (0x2 | this.a);
    this.c = paramString;
    return this;
  }
  
  public Builder a(boolean paramBoolean)
  {
    this.a = (0x100 | this.a);
    this.j = paramBoolean;
    return this;
  }
  
  public TypeSystem.Value a(int paramInt)
  {
    return (TypeSystem.Value)this.d.get(paramInt);
  }
  
  public Builder b(TypeSystem.Value paramValue)
  {
    if (paramValue == null) {
      throw new NullPointerException();
    }
    v();
    this.d.add(paramValue);
    return this;
  }
  
  public Builder b(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = (0x20 | this.a);
    this.g = paramString;
    return this;
  }
  
  public Builder b(boolean paramBoolean)
  {
    this.a = (0x800 | this.a);
    this.m = paramBoolean;
    return this;
  }
  
  public TypeSystem.Value b()
  {
    return TypeSystem.Value.a();
  }
  
  public TypeSystem.Value b(int paramInt)
  {
    return (TypeSystem.Value)this.e.get(paramInt);
  }
  
  public Builder c(TypeSystem.Value paramValue)
  {
    if (paramValue == null) {
      throw new NullPointerException();
    }
    w();
    this.e.add(paramValue);
    return this;
  }
  
  public Builder c(String paramString)
  {
    if (paramString == null) {
      throw new NullPointerException();
    }
    this.a = (0x40 | this.a);
    this.h = paramString;
    return this;
  }
  
  public TypeSystem.Value c()
  {
    TypeSystem.Value localValue = d();
    if (!localValue.j()) {
      throw a(localValue);
    }
    return localValue;
  }
  
  public TypeSystem.Value c(int paramInt)
  {
    return (TypeSystem.Value)this.f.get(paramInt);
  }
  
  public Builder d(TypeSystem.Value paramValue)
  {
    if (paramValue == null) {
      throw new NullPointerException();
    }
    x();
    this.f.add(paramValue);
    return this;
  }
  
  public TypeSystem.Value d()
  {
    int n = 1;
    TypeSystem.Value localValue = new TypeSystem.Value(this, null);
    int i1 = this.a;
    if ((i1 & 0x1) == n) {}
    for (;;)
    {
      TypeSystem.Value.a(localValue, this.b);
      if ((i1 & 0x2) == 2) {
        n |= 0x2;
      }
      TypeSystem.Value.a(localValue, this.c);
      if ((0x4 & this.a) == 4)
      {
        this.d = Collections.unmodifiableList(this.d);
        this.a = (0xFFFFFFFB & this.a);
      }
      TypeSystem.Value.a(localValue, this.d);
      if ((0x8 & this.a) == 8)
      {
        this.e = Collections.unmodifiableList(this.e);
        this.a = (0xFFFFFFF7 & this.a);
      }
      TypeSystem.Value.b(localValue, this.e);
      if ((0x10 & this.a) == 16)
      {
        this.f = Collections.unmodifiableList(this.f);
        this.a = (0xFFFFFFEF & this.a);
      }
      TypeSystem.Value.c(localValue, this.f);
      if ((i1 & 0x20) == 32) {
        n |= 0x4;
      }
      TypeSystem.Value.b(localValue, this.g);
      if ((i1 & 0x40) == 64) {
        n |= 0x8;
      }
      TypeSystem.Value.c(localValue, this.h);
      if ((i1 & 0x80) == 128) {
        n |= 0x10;
      }
      TypeSystem.Value.a(localValue, this.i);
      if ((i1 & 0x100) == 256) {
        n |= 0x20;
      }
      TypeSystem.Value.a(localValue, this.j);
      if ((0x200 & this.a) == 512)
      {
        this.k = Collections.unmodifiableList(this.k);
        this.a = (0xFFFFFDFF & this.a);
      }
      TypeSystem.Value.d(localValue, this.k);
      if ((0x400 & this.a) == 1024)
      {
        this.l = Collections.unmodifiableList(this.l);
        this.a = (0xFFFFFBFF & this.a);
      }
      TypeSystem.Value.e(localValue, this.l);
      if ((i1 & 0x800) == 2048) {
        n |= 0x40;
      }
      TypeSystem.Value.b(localValue, this.m);
      TypeSystem.Value.a(localValue, n);
      return localValue;
      n = 0;
    }
  }
  
  public TypeSystem.Value d(int paramInt)
  {
    return (TypeSystem.Value)this.k.get(paramInt);
  }
  
  public Builder e(TypeSystem.Value paramValue)
  {
    if (paramValue == null) {
      throw new NullPointerException();
    }
    y();
    this.k.add(paramValue);
    return this;
  }
  
  public boolean i()
  {
    return (0x1 & this.a) == 1;
  }
  
  public final boolean j()
  {
    if (!i()) {}
    label36:
    label63:
    label90:
    label120:
    do
    {
      return false;
      for (int n = 0;; n++)
      {
        if (n >= k()) {
          break label36;
        }
        if (!a(n).j()) {
          break;
        }
      }
      for (int i1 = 0;; i1++)
      {
        if (i1 >= l()) {
          break label63;
        }
        if (!b(i1).j()) {
          break;
        }
      }
      for (int i2 = 0;; i2++)
      {
        if (i2 >= m()) {
          break label90;
        }
        if (!c(i2).j()) {
          break;
        }
      }
      for (int i3 = 0;; i3++)
      {
        if (i3 >= n()) {
          break label120;
        }
        if (!d(i3).j()) {
          break;
        }
      }
    } while (!s());
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
    return this.k.size();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Builder
 * JD-Core Version:    0.7.0.1
 */