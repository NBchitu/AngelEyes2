package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class AdwordsClickReferrerMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.z.toString();
  private static final String b = Key.J.toString();
  private static final String c = Key.M.toString();
  private final Context d;
  
  public AdwordsClickReferrerMacro(Context paramContext)
  {
    super(str, arrayOfString);
    this.d = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    TypeSystem.Value localValue1 = (TypeSystem.Value)paramMap.get(c);
    if (localValue1 == null) {
      return Types.d();
    }
    String str1 = Types.a(localValue1);
    TypeSystem.Value localValue2 = (TypeSystem.Value)paramMap.get(b);
    if (localValue2 != null) {}
    for (String str2 = Types.a(localValue2);; str2 = null)
    {
      String str3 = InstallReferrerUtil.a(this.d, str1, str2);
      if (str3 == null) {
        break;
      }
      return Types.e(str3);
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.AdwordsClickReferrerMacro
 * JD-Core Version:    0.7.0.1
 */