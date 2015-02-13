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

public final class Serving$FunctionCall$Builder
  extends GeneratedMessageLite.Builder<Serving.FunctionCall, Builder>
  implements Serving.FunctionCallOrBuilder
{
  private int a;
  private List<Integer> b = Collections.emptyList();
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  
  private Serving$FunctionCall$Builder()
  {
    l();
  }
  
  private void l() {}
  
  private static Builder m()
  {
    return new Builder();
  }
  
  private void n()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }
  
  public Builder a()
  {
    return m().a(d());
  }
  
  public Builder a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }
  
  public Builder a(Serving.FunctionCall paramFunctionCall)
  {
    if (paramFunctionCall == Serving.FunctionCall.a()) {
      return this;
    }
    if (!Serving.FunctionCall.b(paramFunctionCall).isEmpty())
    {
      if (!this.b.isEmpty()) {
        break label134;
      }
      this.b = Serving.FunctionCall.b(paramFunctionCall);
      this.a = (0xFFFFFFFE & this.a);
    }
    for (;;)
    {
      if (paramFunctionCall.f()) {
        a(paramFunctionCall.g());
      }
      if (paramFunctionCall.h()) {
        b(paramFunctionCall.i());
      }
      if (paramFunctionCall.l()) {
        a(paramFunctionCall.m());
      }
      if (paramFunctionCall.n()) {
        b(paramFunctionCall.r());
      }
      a(r().a(Serving.FunctionCall.c(paramFunctionCall)));
      return this;
      label134:
      n();
      this.b.addAll(Serving.FunctionCall.b(paramFunctionCall));
    }
  }
  
  public Builder a(CodedInputStream paramCodedInputStream, ExtensionRegistryLite paramExtensionRegistryLite)
  {
    try
    {
      Serving.FunctionCall localFunctionCall3 = (Serving.FunctionCall)Serving.FunctionCall.a.b(paramCodedInputStream, paramExtensionRegistryLite);
      if (localFunctionCall3 != null) {
        a(localFunctionCall3);
      }
      return this;
    }
    catch (InvalidProtocolBufferException localInvalidProtocolBufferException)
    {
      Serving.FunctionCall localFunctionCall2 = (Serving.FunctionCall)localInvalidProtocolBufferException.a();
      Object localObject1;
      try
      {
        throw localInvalidProtocolBufferException;
      }
      finally
      {
        localFunctionCall1 = localFunctionCall2;
      }
      if (localFunctionCall1 != null) {
        a(localFunctionCall1);
      }
      throw localObject1;
    }
    finally
    {
      for (;;)
      {
        Serving.FunctionCall localFunctionCall1 = null;
      }
    }
  }
  
  public Builder a(boolean paramBoolean)
  {
    this.a = (0x8 | this.a);
    this.e = paramBoolean;
    return this;
  }
  
  public Builder b(int paramInt)
  {
    this.a = (0x4 | this.a);
    this.d = paramInt;
    return this;
  }
  
  public Builder b(boolean paramBoolean)
  {
    this.a = (0x10 | this.a);
    this.f = paramBoolean;
    return this;
  }
  
  public Serving.FunctionCall b()
  {
    return Serving.FunctionCall.a();
  }
  
  public Serving.FunctionCall c()
  {
    Serving.FunctionCall localFunctionCall = d();
    if (!localFunctionCall.j()) {
      throw a(localFunctionCall);
    }
    return localFunctionCall;
  }
  
  public Serving.FunctionCall d()
  {
    int i = 1;
    Serving.FunctionCall localFunctionCall = new Serving.FunctionCall(this, null);
    int j = this.a;
    if ((0x1 & this.a) == i)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    Serving.FunctionCall.a(localFunctionCall, this.b);
    if ((j & 0x2) == 2) {}
    for (;;)
    {
      Serving.FunctionCall.a(localFunctionCall, this.c);
      if ((j & 0x4) == 4) {
        i |= 0x2;
      }
      Serving.FunctionCall.b(localFunctionCall, this.d);
      if ((j & 0x8) == 8) {
        i |= 0x4;
      }
      Serving.FunctionCall.a(localFunctionCall, this.e);
      if ((j & 0x10) == 16) {
        i |= 0x8;
      }
      Serving.FunctionCall.b(localFunctionCall, this.f);
      Serving.FunctionCall.c(localFunctionCall, i);
      return localFunctionCall;
      i = 0;
    }
  }
  
  public boolean i()
  {
    return (0x2 & this.a) == 2;
  }
  
  public final boolean j()
  {
    return i();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.containertag.proto.Serving.FunctionCall.Builder
 * JD-Core Version:    0.7.0.1
 */