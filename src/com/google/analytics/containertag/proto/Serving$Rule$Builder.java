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

public final class Serving$Rule$Builder
  extends GeneratedMessageLite.Builder<Serving.Rule, Builder>
  implements Serving.RuleOrBuilder
{
  private int a;
  private List<Integer> b = Collections.emptyList();
  private List<Integer> c = Collections.emptyList();
  private List<Integer> d = Collections.emptyList();
  private List<Integer> e = Collections.emptyList();
  private List<Integer> f = Collections.emptyList();
  private List<Integer> g = Collections.emptyList();
  private List<Integer> h = Collections.emptyList();
  private List<Integer> i = Collections.emptyList();
  private List<Integer> j = Collections.emptyList();
  private List<Integer> k = Collections.emptyList();
  
  private Serving$Rule$Builder()
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
    if ((0x8 & this.a) != 8)
    {
      this.e = new ArrayList(this.e);
      this.a = (0x8 | this.a);
    }
  }
  
  private void s()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }
  
  private void t()
  {
    if ((0x20 & this.a) != 32)
    {
      this.g = new ArrayList(this.g);
      this.a = (0x20 | this.a);
    }
  }
  
  private void u()
  {
    if ((0x40 & this.a) != 64)
    {
      this.h = new ArrayList(this.h);
      this.a = (0x40 | this.a);
    }
  }
  
  private void v()
  {
    if ((0x80 & this.a) != 128)
    {
      this.i = new ArrayList(this.i);
      this.a = (0x80 | this.a);
    }
  }
  
  private void w()
  {
    if ((0x100 & this.a) != 256)
    {
      this.j = new ArrayList(this.j);
      this.a = (0x100 | this.a);
    }
  }
  
  private void x()
  {
    if ((0x200 & this.a) != 512)
    {
      this.k = new ArrayList(this.k);
      this.a = (0x200 | this.a);
    }
  }
  
  public Builder a()
  {
    return l().a(d());
  }
  
  public Builder a(Serving.Rule paramRule)
  {
    if (paramRule == Serving.Rule.a()) {
      return this;
    }
    if (!Serving.Rule.b(paramRule).isEmpty())
    {
      if (this.b.isEmpty())
      {
        this.b = Serving.Rule.b(paramRule);
        this.a = (0xFFFFFFFE & this.a);
      }
    }
    else
    {
      if (!Serving.Rule.c(paramRule).isEmpty())
      {
        if (!this.c.isEmpty()) {
          break label481;
        }
        this.c = Serving.Rule.c(paramRule);
        this.a = (0xFFFFFFFD & this.a);
      }
      label95:
      if (!Serving.Rule.d(paramRule).isEmpty())
      {
        if (!this.d.isEmpty()) {
          break label502;
        }
        this.d = Serving.Rule.d(paramRule);
        this.a = (0xFFFFFFFB & this.a);
      }
      label138:
      if (!Serving.Rule.e(paramRule).isEmpty())
      {
        if (!this.e.isEmpty()) {
          break label523;
        }
        this.e = Serving.Rule.e(paramRule);
        this.a = (0xFFFFFFF7 & this.a);
      }
      label181:
      if (!Serving.Rule.f(paramRule).isEmpty())
      {
        if (!this.f.isEmpty()) {
          break label544;
        }
        this.f = Serving.Rule.f(paramRule);
        this.a = (0xFFFFFFEF & this.a);
      }
      label224:
      if (!Serving.Rule.g(paramRule).isEmpty())
      {
        if (!this.g.isEmpty()) {
          break label565;
        }
        this.g = Serving.Rule.g(paramRule);
        this.a = (0xFFFFFFDF & this.a);
      }
      label267:
      if (!Serving.Rule.h(paramRule).isEmpty())
      {
        if (!this.h.isEmpty()) {
          break label586;
        }
        this.h = Serving.Rule.h(paramRule);
        this.a = (0xFFFFFFBF & this.a);
      }
      label310:
      if (!Serving.Rule.i(paramRule).isEmpty())
      {
        if (!this.i.isEmpty()) {
          break label607;
        }
        this.i = Serving.Rule.i(paramRule);
        this.a = (0xFFFFFF7F & this.a);
      }
      label354:
      if (!Serving.Rule.j(paramRule).isEmpty())
      {
        if (!this.j.isEmpty()) {
          break label628;
        }
        this.j = Serving.Rule.j(paramRule);
        this.a = (0xFFFFFEFF & this.a);
      }
      label398:
      if (!Serving.Rule.k(paramRule).isEmpty())
      {
        if (!this.k.isEmpty()) {
          break label649;
        }
        this.k = Serving.Rule.k(paramRule);
        this.a = (0xFFFFFDFF & this.a);
      }
    }
    for (;;)
    {
      a(r().a(Serving.Rule.l(paramRule)));
      return this;
      m();
      this.b.addAll(Serving.Rule.b(paramRule));
      break;
      label481:
      n();
      this.c.addAll(Serving.Rule.c(paramRule));
      break label95;
      label502:
      o();
      this.d.addAll(Serving.Rule.d(paramRule));
      break label138;
      label523:
      p();
      this.e.addAll(Serving.Rule.e(paramRule));
      break label181;
      label544:
      s();
      this.f.addAll(Serving.Rule.f(paramRule));
      break label224;
      label565:
      t();
      this.g.addAll(Serving.Rule.g(paramRule));
      break label267;
      label586:
      u();
      this.h.addAll(Serving.Rule.h(paramRule));
      break label310;
      label607:
      v();
      this.i.addAll(Serving.Rule.i(paramRule));
      break label354;
      label628:
      w();
      this.j.addAll(Serving.Rule.j(paramRule));
      break label398;
      label649:
      x();
      this.k.addAll(Serving.Rule.k(paramRule));
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.Rule localRule3 = (Serving.Rule)Serving.Rule.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localRule3 != null) {
        a(localRule3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.Rule localRule2 = (Serving.Rule)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localRule1 = localRule2;
      }
      if (localRule1 != null) {
        a(localRule1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.Rule localRule1 = null;
      }
    }
  }
  
  public Serving.Rule b()
  {
    return Serving.Rule.a();
  }
  
  public Serving.Rule c()
  {
    Serving.Rule localRule = d();
    if (!localRule.j()) {
      throw a(localRule);
    }
    return localRule;
  }
  
  public Serving.Rule d()
  {
    Serving.Rule localRule = new Serving.Rule(this, null);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    Serving.Rule.a(localRule, this.b);
    if ((0x2 & this.a) == 2)
    {
      this.c = Collections.unmodifiableList(this.c);
      this.a = (0xFFFFFFFD & this.a);
    }
    Serving.Rule.b(localRule, this.c);
    if ((0x4 & this.a) == 4)
    {
      this.d = Collections.unmodifiableList(this.d);
      this.a = (0xFFFFFFFB & this.a);
    }
    Serving.Rule.c(localRule, this.d);
    if ((0x8 & this.a) == 8)
    {
      this.e = Collections.unmodifiableList(this.e);
      this.a = (0xFFFFFFF7 & this.a);
    }
    Serving.Rule.d(localRule, this.e);
    if ((0x10 & this.a) == 16)
    {
      this.f = Collections.unmodifiableList(this.f);
      this.a = (0xFFFFFFEF & this.a);
    }
    Serving.Rule.e(localRule, this.f);
    if ((0x20 & this.a) == 32)
    {
      this.g = Collections.unmodifiableList(this.g);
      this.a = (0xFFFFFFDF & this.a);
    }
    Serving.Rule.f(localRule, this.g);
    if ((0x40 & this.a) == 64)
    {
      this.h = Collections.unmodifiableList(this.h);
      this.a = (0xFFFFFFBF & this.a);
    }
    Serving.Rule.g(localRule, this.h);
    if ((0x80 & this.a) == 128)
    {
      this.i = Collections.unmodifiableList(this.i);
      this.a = (0xFFFFFF7F & this.a);
    }
    Serving.Rule.h(localRule, this.i);
    if ((0x100 & this.a) == 256)
    {
      this.j = Collections.unmodifiableList(this.j);
      this.a = (0xFFFFFEFF & this.a);
    }
    Serving.Rule.i(localRule, this.j);
    if ((0x200 & this.a) == 512)
    {
      this.k = Collections.unmodifiableList(this.k);
      this.a = (0xFFFFFDFF & this.a);
    }
    Serving.Rule.j(localRule, this.k);
    return localRule;
  }
  
  public final boolean j()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.Rule.Builder
 * JD-Core Version:    0.7.0.1
 */