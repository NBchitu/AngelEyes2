package com.google.tagmanager.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class RopeByteString
  extends ByteString
{
  private static final int[] c;
  private final int d;
  private final ByteString e;
  private final ByteString f;
  private final int g;
  private final int h;
  private int i = 0;
  
  static
  {
    int j = 1;
    ArrayList localArrayList = new ArrayList();
    int k = j;
    while (j > 0)
    {
      localArrayList.add(Integer.valueOf(j));
      int n = k + j;
      k = j;
      j = n;
    }
    localArrayList.add(Integer.valueOf(2147483647));
    c = new int[localArrayList.size()];
    for (int m = 0; m < c.length; m++) {
      c[m] = ((Integer)localArrayList.get(m)).intValue();
    }
  }
  
  private RopeByteString(ByteString paramByteString1, ByteString paramByteString2)
  {
    this.e = paramByteString1;
    this.f = paramByteString2;
    this.g = paramByteString1.a();
    this.d = (this.g + paramByteString2.a());
    this.h = (1 + Math.max(paramByteString1.j(), paramByteString2.j()));
  }
  
  static ByteString a(ByteString paramByteString1, ByteString paramByteString2)
  {
    if ((paramByteString1 instanceof RopeByteString)) {}
    for (RopeByteString localRopeByteString1 = (RopeByteString)paramByteString1; paramByteString2.a() == 0; localRopeByteString1 = null) {
      return paramByteString1;
    }
    if (paramByteString1.a() == 0) {
      return paramByteString2;
    }
    int j = paramByteString1.a() + paramByteString2.a();
    if (j < 128) {
      return b(paramByteString1, paramByteString2);
    }
    if ((localRopeByteString1 != null) && (localRopeByteString1.f.a() + paramByteString2.a() < 128))
    {
      LiteralByteString localLiteralByteString = b(localRopeByteString1.f, paramByteString2);
      return new RopeByteString(localRopeByteString1.e, localLiteralByteString);
    }
    if ((localRopeByteString1 != null) && (localRopeByteString1.e.j() > localRopeByteString1.f.j()) && (localRopeByteString1.j() > paramByteString2.j()))
    {
      RopeByteString localRopeByteString2 = new RopeByteString(localRopeByteString1.f, paramByteString2);
      return new RopeByteString(localRopeByteString1.e, localRopeByteString2);
    }
    int k = 1 + Math.max(paramByteString1.j(), paramByteString2.j());
    if (j >= c[k]) {
      return new RopeByteString(paramByteString1, paramByteString2);
    }
    return RopeByteString.Balancer.a(new RopeByteString.Balancer(null), paramByteString1, paramByteString2);
  }
  
  private static LiteralByteString b(ByteString paramByteString1, ByteString paramByteString2)
  {
    int j = paramByteString1.a();
    int k = paramByteString2.a();
    byte[] arrayOfByte = new byte[j + k];
    paramByteString1.b(arrayOfByte, 0, 0, j);
    paramByteString2.b(arrayOfByte, 0, j, k);
    return new LiteralByteString(arrayOfByte);
  }
  
  private boolean b(ByteString paramByteString)
  {
    RopeByteString.PieceIterator localPieceIterator1 = new RopeByteString.PieceIterator(this, null);
    LiteralByteString localLiteralByteString1 = (LiteralByteString)localPieceIterator1.next();
    RopeByteString.PieceIterator localPieceIterator2 = new RopeByteString.PieceIterator(paramByteString, null);
    Object localObject1 = (LiteralByteString)localPieceIterator2.next();
    int j = 0;
    LiteralByteString localLiteralByteString2 = localLiteralByteString1;
    int k = 0;
    int m = 0;
    int n = localLiteralByteString2.a() - k;
    int i1 = ((LiteralByteString)localObject1).a() - j;
    int i2 = Math.min(n, i1);
    if (k == 0) {}
    for (boolean bool = localLiteralByteString2.a((LiteralByteString)localObject1, j, i2); !bool; bool = ((LiteralByteString)localObject1).a(localLiteralByteString2, k, i2)) {
      return false;
    }
    int i3 = m + i2;
    if (i3 >= this.d)
    {
      if (i3 == this.d) {
        return true;
      }
      throw new IllegalStateException();
    }
    label181:
    Object localObject3;
    int i5;
    if (i2 == n)
    {
      localLiteralByteString2 = (LiteralByteString)localPieceIterator1.next();
      k = 0;
      if (i2 != i1) {
        break label228;
      }
      localObject3 = (LiteralByteString)localPieceIterator2.next();
      i5 = 0;
    }
    for (;;)
    {
      j = i5;
      localObject1 = localObject3;
      m = i3;
      break;
      k += i2;
      break label181;
      label228:
      int i4 = j + i2;
      Object localObject2 = localObject1;
      i5 = i4;
      localObject3 = localObject2;
    }
  }
  
  public int a()
  {
    return this.d;
  }
  
  protected int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.a(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.a(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    int k = this.e.a(paramInt1, paramInt2, j);
    return this.f.a(k, 0, paramInt3 - j);
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt3 <= this.g)
    {
      this.e.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.a(paramArrayOfByte, paramInt1 - this.g, paramInt2, paramInt3);
      return;
    }
    int j = this.g - paramInt1;
    this.e.a(paramArrayOfByte, paramInt1, paramInt2, j);
    this.f.a(paramArrayOfByte, 0, paramInt2 + j, paramInt3 - j);
  }
  
  protected int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 + paramInt3 <= this.g) {
      return this.e.b(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= this.g) {
      return this.f.b(paramInt1, paramInt2 - this.g, paramInt3);
    }
    int j = this.g - paramInt2;
    int k = this.e.b(paramInt1, paramInt2, j);
    return this.f.b(k, 0, paramInt3 - j);
  }
  
  public String b(String paramString)
  {
    return new String(e(), paramString);
  }
  
  void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    if (paramInt1 + paramInt2 <= this.g)
    {
      this.e.b(paramOutputStream, paramInt1, paramInt2);
      return;
    }
    if (paramInt1 >= this.g)
    {
      this.f.b(paramOutputStream, paramInt1 - this.g, paramInt2);
      return;
    }
    int j = this.g - paramInt1;
    this.e.b(paramOutputStream, paramInt1, j);
    this.f.b(paramOutputStream, 0, paramInt2 - j);
  }
  
  public ByteString.ByteIterator c()
  {
    return new RopeByteString.RopeByteIterator(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ByteString localByteString;
    do
    {
      return true;
      if (!(paramObject instanceof ByteString)) {
        return false;
      }
      localByteString = (ByteString)paramObject;
      if (this.d != localByteString.a()) {
        return false;
      }
    } while (this.d == 0);
    if (this.i != 0)
    {
      int j = localByteString.l();
      if ((j != 0) && (this.i != j)) {
        return false;
      }
    }
    return b(localByteString);
  }
  
  public boolean g()
  {
    int j = this.e.a(0, 0, this.g);
    int k = this.f.a(j, 0, this.f.a());
    boolean bool = false;
    if (k == 0) {
      bool = true;
    }
    return bool;
  }
  
  public CodedInputStream h()
  {
    return CodedInputStream.a(new RopeByteString.RopeInputStream(this));
  }
  
  public int hashCode()
  {
    int j = this.i;
    if (j == 0)
    {
      j = b(this.d, 0, this.d);
      if (j == 0) {
        j = 1;
      }
      this.i = j;
    }
    return j;
  }
  
  protected int j()
  {
    return this.h;
  }
  
  protected boolean k()
  {
    return this.d >= c[this.h];
  }
  
  protected int l()
  {
    return this.i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.RopeByteString
 * JD-Core Version:    0.7.0.1
 */