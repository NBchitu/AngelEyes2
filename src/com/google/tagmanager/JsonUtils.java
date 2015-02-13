package com.google.tagmanager;

import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class JsonUtils
{
  public static ResourceUtil.ExpandedResource a(String paramString)
  {
    TypeSystem.Value localValue = b(new JSONObject(paramString));
    ResourceUtil.ExpandedResourceBuilder localExpandedResourceBuilder = ResourceUtil.ExpandedResource.a();
    for (int i = 0; i < localValue.n(); i++) {
      localExpandedResourceBuilder.a(ResourceUtil.ExpandedFunctionCall.a().a(Key.aD.toString(), localValue.b(i)).a(Key.at.toString(), Types.a(ConstantMacro.b())).a(ConstantMacro.c(), localValue.c(i)).a());
    }
    return localExpandedResourceBuilder.a();
  }
  
  static Object a(Object paramObject)
  {
    if ((paramObject instanceof JSONArray)) {
      throw new RuntimeException("JSONArrays are not supported");
    }
    if (JSONObject.NULL.equals(paramObject)) {
      throw new RuntimeException("JSON nulls are not supported");
    }
    if ((paramObject instanceof JSONObject))
    {
      JSONObject localJSONObject = (JSONObject)paramObject;
      HashMap localHashMap = new HashMap();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localHashMap.put(str, a(localJSONObject.get(str)));
      }
      paramObject = localHashMap;
    }
    return paramObject;
  }
  
  private static TypeSystem.Value b(Object paramObject)
  {
    return Types.e(a(paramObject));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.JsonUtils
 * JD-Core Version:    0.7.0.1
 */