package com.google.analytics.midtier.proto.containertag;

import com.google.tagmanager.protobuf.Internal.EnumLite;
import com.google.tagmanager.protobuf.Internal.EnumLiteMap;

public enum TypeSystem$Value$Escaping
  implements Internal.EnumLite
{
  private static Internal.EnumLiteMap<Escaping> r = new TypeSystem.Value.Escaping.1();
  private final int s;
  
  static
  {
    Escaping[] arrayOfEscaping = new Escaping[17];
    arrayOfEscaping[0] = a;
    arrayOfEscaping[1] = b;
    arrayOfEscaping[2] = c;
    arrayOfEscaping[3] = d;
    arrayOfEscaping[4] = e;
    arrayOfEscaping[5] = f;
    arrayOfEscaping[6] = g;
    arrayOfEscaping[7] = h;
    arrayOfEscaping[8] = i;
    arrayOfEscaping[9] = j;
    arrayOfEscaping[10] = k;
    arrayOfEscaping[11] = l;
    arrayOfEscaping[12] = m;
    arrayOfEscaping[13] = n;
    arrayOfEscaping[14] = o;
    arrayOfEscaping[15] = p;
    arrayOfEscaping[16] = q;
    t = arrayOfEscaping;
  }
  
  private TypeSystem$Value$Escaping(int paramInt1, int paramInt2)
  {
    this.s = paramInt2;
  }
  
  public static Escaping a(int paramInt)
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
    case 8: 
      return h;
    case 9: 
      return i;
    case 10: 
      return j;
    case 11: 
      return k;
    case 12: 
      return l;
    case 13: 
      return m;
    case 14: 
      return n;
    case 15: 
      return o;
    case 17: 
      return p;
    }
    return q;
  }
  
  public final int a()
  {
    return this.s;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Escaping
 * JD-Core Version:    0.7.0.1
 */