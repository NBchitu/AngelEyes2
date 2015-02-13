package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.ref.SoftReference;

public class JsonFactory
{
  protected static final int a = ;
  protected static final int b = JsonParser.Feature.a();
  protected static final int c = JsonGenerator.Feature.a();
  protected static final ThreadLocal<SoftReference<BufferRecycler>> d = new ThreadLocal();
  protected CharsToNameCanonicalizer e = CharsToNameCanonicalizer.a();
  protected BytesToNameCanonicalizer f = BytesToNameCanonicalizer.a();
  protected ObjectCodec g;
  protected int h = a;
  protected int i = b;
  protected int j = c;
  protected CharacterEscapes k;
  protected InputDecorator l;
  protected OutputDecorator m;
  
  public JsonFactory()
  {
    this(null);
  }
  
  public JsonFactory(ObjectCodec paramObjectCodec)
  {
    this.g = paramObjectCodec;
  }
  
  public JsonFactory a(JsonGenerator.Feature paramFeature)
  {
    this.j |= paramFeature.c();
    return this;
  }
  
  public final JsonFactory a(JsonGenerator.Feature paramFeature, boolean paramBoolean)
  {
    if (paramBoolean) {
      return a(paramFeature);
    }
    return b(paramFeature);
  }
  
  public JsonGenerator a(OutputStream paramOutputStream, JsonEncoding paramJsonEncoding)
  {
    IOContext localIOContext = a(paramOutputStream, false);
    localIOContext.a(paramJsonEncoding);
    if (paramJsonEncoding == JsonEncoding.a)
    {
      if (this.m != null) {
        paramOutputStream = this.m.a(localIOContext, paramOutputStream);
      }
      return a(paramOutputStream, localIOContext);
    }
    Writer localWriter = a(paramOutputStream, paramJsonEncoding, localIOContext);
    if (this.m != null) {
      localWriter = this.m.a(localIOContext, localWriter);
    }
    return a(localWriter, localIOContext);
  }
  
  protected JsonGenerator a(OutputStream paramOutputStream, IOContext paramIOContext)
  {
    UTF8JsonGenerator localUTF8JsonGenerator = new UTF8JsonGenerator(paramIOContext, this.j, this.g, paramOutputStream);
    if (this.k != null) {
      localUTF8JsonGenerator.a(this.k);
    }
    return localUTF8JsonGenerator;
  }
  
  protected JsonGenerator a(Writer paramWriter, IOContext paramIOContext)
  {
    WriterBasedJsonGenerator localWriterBasedJsonGenerator = new WriterBasedJsonGenerator(paramIOContext, this.j, this.g, paramWriter);
    if (this.k != null) {
      localWriterBasedJsonGenerator.a(this.k);
    }
    return localWriterBasedJsonGenerator;
  }
  
  public JsonParser a(InputStream paramInputStream)
  {
    IOContext localIOContext = a(paramInputStream, false);
    if (this.l != null) {
      paramInputStream = this.l.a(localIOContext, paramInputStream);
    }
    return a(paramInputStream, localIOContext);
  }
  
  protected JsonParser a(InputStream paramInputStream, IOContext paramIOContext)
  {
    return new ByteSourceJsonBootstrapper(paramIOContext, paramInputStream).a(this.i, this.g, this.f, this.e, a(JsonFactory.Feature.b), a(JsonFactory.Feature.a));
  }
  
  protected IOContext a(Object paramObject, boolean paramBoolean)
  {
    return new IOContext(a(), paramObject, paramBoolean);
  }
  
  public BufferRecycler a()
  {
    SoftReference localSoftReference = (SoftReference)d.get();
    if (localSoftReference == null) {}
    for (BufferRecycler localBufferRecycler = null;; localBufferRecycler = (BufferRecycler)localSoftReference.get())
    {
      if (localBufferRecycler == null)
      {
        localBufferRecycler = new BufferRecycler();
        d.set(new SoftReference(localBufferRecycler));
      }
      return localBufferRecycler;
    }
  }
  
  protected Writer a(OutputStream paramOutputStream, JsonEncoding paramJsonEncoding, IOContext paramIOContext)
  {
    if (paramJsonEncoding == JsonEncoding.a) {
      return new UTF8Writer(paramIOContext, paramOutputStream);
    }
    return new OutputStreamWriter(paramOutputStream, paramJsonEncoding.a());
  }
  
  public final boolean a(JsonFactory.Feature paramFeature)
  {
    return (this.h & paramFeature.c()) != 0;
  }
  
  public JsonFactory b(JsonGenerator.Feature paramFeature)
  {
    this.j &= (0xFFFFFFFF ^ paramFeature.c());
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonFactory
 * JD-Core Version:    0.7.0.1
 */