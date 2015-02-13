package com.google.api.client.http;

import com.google.api.client.util.escape.CharEscapers;
import com.google.common.base.Preconditions;
import java.util.Map;

 enum UriTemplate$CompositeOutput
{
  private final Character i;
  private final String j;
  private final String k;
  private final boolean l;
  private final boolean m;
  
  static
  {
    CompositeOutput[] arrayOfCompositeOutput = new CompositeOutput[8];
    arrayOfCompositeOutput[0] = a;
    arrayOfCompositeOutput[1] = b;
    arrayOfCompositeOutput[2] = c;
    arrayOfCompositeOutput[3] = d;
    arrayOfCompositeOutput[4] = e;
    arrayOfCompositeOutput[5] = f;
    arrayOfCompositeOutput[6] = g;
    arrayOfCompositeOutput[7] = h;
    n = arrayOfCompositeOutput;
  }
  
  private UriTemplate$CompositeOutput(Character paramCharacter, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.i = paramCharacter;
    this.j = ((String)Preconditions.a(paramString1));
    this.k = ((String)Preconditions.a(paramString2));
    this.l = paramBoolean1;
    this.m = paramBoolean2;
    if (paramCharacter != null) {
      UriTemplate.a.put(paramCharacter, this);
    }
  }
  
  String a()
  {
    return this.j;
  }
  
  String a(String paramString)
  {
    if (this.m) {
      return CharEscapers.c(paramString);
    }
    return CharEscapers.a(paramString);
  }
  
  String b()
  {
    return this.k;
  }
  
  boolean c()
  {
    return this.l;
  }
  
  int d()
  {
    if (this.i == null) {
      return 0;
    }
    return 1;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.UriTemplate.CompositeOutput
 * JD-Core Version:    0.7.0.1
 */