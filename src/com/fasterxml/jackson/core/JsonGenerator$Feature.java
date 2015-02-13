package com.fasterxml.jackson.core;

public enum JsonGenerator$Feature
{
  private final boolean h;
  private final int i = 1 << ordinal();
  
  static
  {
    Feature[] arrayOfFeature = new Feature[7];
    arrayOfFeature[0] = a;
    arrayOfFeature[1] = b;
    arrayOfFeature[2] = c;
    arrayOfFeature[3] = d;
    arrayOfFeature[4] = e;
    arrayOfFeature[5] = f;
    arrayOfFeature[6] = g;
    j = arrayOfFeature;
  }
  
  private JsonGenerator$Feature(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public static int a()
  {
    int k = 0;
    for (Feature localFeature : values()) {
      if (localFeature.b()) {
        k |= localFeature.c();
      }
    }
    return k;
  }
  
  public boolean b()
  {
    return this.h;
  }
  
  public int c()
  {
    return this.i;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fasterxml.jackson.core.JsonGenerator.Feature
 * JD-Core Version:    0.7.0.1
 */