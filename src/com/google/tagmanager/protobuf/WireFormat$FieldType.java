package com.google.tagmanager.protobuf;

public enum WireFormat$FieldType
{
  private final WireFormat.JavaType s;
  private final int t;
  
  static
  {
    FieldType[] arrayOfFieldType = new FieldType[18];
    arrayOfFieldType[0] = a;
    arrayOfFieldType[1] = b;
    arrayOfFieldType[2] = c;
    arrayOfFieldType[3] = d;
    arrayOfFieldType[4] = e;
    arrayOfFieldType[5] = f;
    arrayOfFieldType[6] = g;
    arrayOfFieldType[7] = h;
    arrayOfFieldType[8] = i;
    arrayOfFieldType[9] = j;
    arrayOfFieldType[10] = k;
    arrayOfFieldType[11] = l;
    arrayOfFieldType[12] = m;
    arrayOfFieldType[13] = n;
    arrayOfFieldType[14] = o;
    arrayOfFieldType[15] = p;
    arrayOfFieldType[16] = q;
    arrayOfFieldType[17] = r;
    u = arrayOfFieldType;
  }
  
  private WireFormat$FieldType(WireFormat.JavaType paramJavaType, int paramInt)
  {
    this.s = paramJavaType;
    this.t = paramInt;
  }
  
  public WireFormat.JavaType a()
  {
    return this.s;
  }
  
  public int b()
  {
    return this.t;
  }
  
  public boolean c()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.WireFormat.FieldType
 * JD-Core Version:    0.7.0.1
 */