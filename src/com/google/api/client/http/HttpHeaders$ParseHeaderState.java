package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.ClassInfo;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

final class HttpHeaders$ParseHeaderState
{
  final ArrayValueMap a;
  final StringBuilder b;
  final ClassInfo c;
  final List<Type> d;
  
  public HttpHeaders$ParseHeaderState(HttpHeaders paramHttpHeaders, StringBuilder paramStringBuilder)
  {
    Class localClass = paramHttpHeaders.getClass();
    this.d = Arrays.asList(new Type[] { localClass });
    this.c = ClassInfo.a(localClass, true);
    this.b = paramStringBuilder;
    this.a = new ArrayValueMap(paramHttpHeaders);
  }
  
  void a()
  {
    this.a.a();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpHeaders.ParseHeaderState
 * JD-Core Version:    0.7.0.1
 */