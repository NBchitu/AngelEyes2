package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType;
import com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType;
import com.fasterxml.jackson.core.util.TextBuffer;

public final class IOContext
{
  protected final Object a;
  protected JsonEncoding b;
  protected final boolean c;
  protected final BufferRecycler d;
  protected byte[] e = null;
  protected byte[] f = null;
  protected char[] g = null;
  protected char[] h = null;
  protected char[] i = null;
  
  public IOContext(BufferRecycler paramBufferRecycler, Object paramObject, boolean paramBoolean)
  {
    this.d = paramBufferRecycler;
    this.a = paramObject;
    this.c = paramBoolean;
  }
  
  public final Object a()
  {
    return this.a;
  }
  
  public void a(JsonEncoding paramJsonEncoding)
  {
    this.b = paramJsonEncoding;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte != this.e) {
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      }
      this.e = null;
      this.d.a(BufferRecycler.ByteBufferType.a, paramArrayOfByte);
    }
  }
  
  public final void a(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.g) {
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      }
      this.g = null;
      this.d.a(BufferRecycler.CharBufferType.a, paramArrayOfChar);
    }
  }
  
  public final JsonEncoding b()
  {
    return this.b;
  }
  
  public final void b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte != this.f) {
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      }
      this.f = null;
      this.d.a(BufferRecycler.ByteBufferType.b, paramArrayOfByte);
    }
  }
  
  public final void b(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.h) {
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      }
      this.h = null;
      this.d.a(BufferRecycler.CharBufferType.b, paramArrayOfChar);
    }
  }
  
  public final void c(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar != null)
    {
      if (paramArrayOfChar != this.i) {
        throw new IllegalArgumentException("Trying to release buffer not owned by the context");
      }
      this.i = null;
      this.d.a(BufferRecycler.CharBufferType.d, paramArrayOfChar);
    }
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final TextBuffer d()
  {
    return new TextBuffer(this.d);
  }
  
  public final byte[] e()
  {
    if (this.e != null) {
      throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
    }
    this.e = this.d.a(BufferRecycler.ByteBufferType.a);
    return this.e;
  }
  
  public final byte[] f()
  {
    if (this.f != null) {
      throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
    }
    this.f = this.d.a(BufferRecycler.ByteBufferType.b);
    return this.f;
  }
  
  public final char[] g()
  {
    if (this.g != null) {
      throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
    }
    this.g = this.d.a(BufferRecycler.CharBufferType.a);
    return this.g;
  }
  
  public final char[] h()
  {
    if (this.h != null) {
      throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
    }
    this.h = this.d.a(BufferRecycler.CharBufferType.b);
    return this.h;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.io.IOContext
 * JD-Core Version:    0.7.0.1
 */