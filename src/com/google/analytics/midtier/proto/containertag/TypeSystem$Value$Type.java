package com.google.analytics.midtier.proto.containertag;

import com.google.tagmanager.protobuf.Internal.EnumLite;
import com.google.tagmanager.protobuf.Internal.EnumLiteMap;

public enum TypeSystem$Value$Type
  implements Internal.EnumLite
{
  private static Internal.EnumLiteMap<Type> i = new TypeSystem.Value.Type.1();
  private final int j;
  
  static
  {
    Type[] arrayOfType = new Type[8];
    arrayOfType[0] = a;
    arrayOfType[1] = b;
    arrayOfType[2] = c;
    arrayOfType[3] = d;
    arrayOfType[4] = e;
    arrayOfType[5] = f;
    arrayOfType[6] = g;
    arrayOfType[7] = h;
    k = arrayOfType;
  }
  
  private TypeSystem$Value$Type(int paramInt1, int paramInt2)
  {
    this.j = paramInt2;
  }
  
  public static Type a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return a;
    case 2: 
      return b;
    case 3: 
      return c;
    case 4: 
      return d;
    case 5: 
      return e;
    case 6: 
      return f;
    case 7: 
      return g;
    }
    return h;
  }
  
  public final int a()
  {
    return this.j;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Type
 * JD-Core Version:    0.7.0.1
 */