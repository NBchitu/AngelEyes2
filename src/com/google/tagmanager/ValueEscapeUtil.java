package com.google.tagmanager;

import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Escaping;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value.Type;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

class ValueEscapeUtil
{
  private static ObjectAndStatic<TypeSystem.Value> a(ObjectAndStatic<TypeSystem.Value> paramObjectAndStatic)
  {
    try
    {
      ObjectAndStatic localObjectAndStatic = new ObjectAndStatic(Types.e(a(((TypeSystem.Value)paramObjectAndStatic.a()).g())), paramObjectAndStatic.b());
      return localObjectAndStatic;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.a("Escape URI: unsupported encoding", localUnsupportedEncodingException);
    }
    return paramObjectAndStatic;
  }
  
  private static ObjectAndStatic<TypeSystem.Value> a(ObjectAndStatic<TypeSystem.Value> paramObjectAndStatic, TypeSystem.Value.Escaping paramEscaping)
  {
    if (!a((TypeSystem.Value)paramObjectAndStatic.a()))
    {
      Log.a("Escaping can only be applied to strings.");
      return paramObjectAndStatic;
    }
    switch (ValueEscapeUtil.1.a[paramEscaping.ordinal()])
    {
    default: 
      Log.a("Unsupported Value Escaping: " + paramEscaping);
      return paramObjectAndStatic;
    }
    return a(paramObjectAndStatic);
  }
  
  static ObjectAndStatic<TypeSystem.Value> a(ObjectAndStatic<TypeSystem.Value> paramObjectAndStatic, List<TypeSystem.Value.Escaping> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      paramObjectAndStatic = a(paramObjectAndStatic, (TypeSystem.Value.Escaping)localIterator.next());
    }
    return paramObjectAndStatic;
  }
  
  static String a(String paramString)
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }
  
  private static boolean a(TypeSystem.Value paramValue)
  {
    return (paramValue.d()) && (paramValue.e().equals(TypeSystem.Value.Type.a)) && (paramValue.f());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ValueEscapeUtil
 * JD-Core Version:    0.7.0.1
 */