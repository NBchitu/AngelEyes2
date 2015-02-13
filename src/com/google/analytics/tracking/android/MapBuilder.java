package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class MapBuilder
{
  private Map<String, String> a = new HashMap();
  
  public static MapBuilder a(String paramString, Boolean paramBoolean)
  {
    GAUsage.a().a(GAUsage.Field.H);
    MapBuilder localMapBuilder = new MapBuilder();
    localMapBuilder.a("&t", "exception");
    localMapBuilder.a("&exd", paramString);
    localMapBuilder.a("&exf", a(paramBoolean));
    return localMapBuilder;
  }
  
  public static MapBuilder a(String paramString1, Long paramLong, String paramString2, String paramString3)
  {
    GAUsage.a().a(GAUsage.Field.J);
    MapBuilder localMapBuilder = new MapBuilder();
    localMapBuilder.a("&t", "timing");
    localMapBuilder.a("&utc", paramString1);
    String str = null;
    if (paramLong != null) {
      str = Long.toString(paramLong.longValue());
    }
    localMapBuilder.a("&utt", str);
    localMapBuilder.a("&utv", paramString2);
    localMapBuilder.a("&utl", paramString3);
    return localMapBuilder;
  }
  
  public static MapBuilder a(String paramString1, String paramString2, String paramString3, Long paramLong)
  {
    GAUsage.a().a(GAUsage.Field.Y);
    MapBuilder localMapBuilder = new MapBuilder();
    localMapBuilder.a("&t", "event");
    localMapBuilder.a("&ec", paramString1);
    localMapBuilder.a("&ea", paramString2);
    localMapBuilder.a("&el", paramString3);
    if (paramLong == null) {}
    for (String str = null;; str = Long.toString(paramLong.longValue()))
    {
      localMapBuilder.a("&ev", str);
      return localMapBuilder;
    }
  }
  
  static String a(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return null;
    }
    if (paramBoolean.booleanValue()) {
      return "1";
    }
    return "0";
  }
  
  public MapBuilder a(String paramString)
  {
    GAUsage.a().a(GAUsage.Field.d);
    String str = Utils.b(paramString);
    if (TextUtils.isEmpty(str)) {
      return this;
    }
    Map localMap = Utils.a(str);
    a("&cc", (String)localMap.get("utm_content"));
    a("&cm", (String)localMap.get("utm_medium"));
    a("&cn", (String)localMap.get("utm_campaign"));
    a("&cs", (String)localMap.get("utm_source"));
    a("&ck", (String)localMap.get("utm_term"));
    a("&ci", (String)localMap.get("utm_id"));
    a("&gclid", (String)localMap.get("gclid"));
    a("&dclid", (String)localMap.get("dclid"));
    a("&gmob_t", (String)localMap.get("gmob_t"));
    return this;
  }
  
  public MapBuilder a(String paramString1, String paramString2)
  {
    GAUsage.a().a(GAUsage.Field.a);
    if (paramString1 != null)
    {
      this.a.put(paramString1, paramString2);
      return this;
    }
    Log.d(" MapBuilder.set() called with a null paramName.");
    return this;
  }
  
  public Map<String, String> a()
  {
    return new HashMap(this.a);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.MapBuilder
 * JD-Core Version:    0.7.0.1
 */