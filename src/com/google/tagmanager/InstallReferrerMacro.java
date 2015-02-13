package com.google.tagmanager;

import android.content.Context;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.containertag.common.Key;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class InstallReferrerMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.E.toString();
  private static final String b = Key.J.toString();
  private final Context c;
  
  public InstallReferrerMacro(Context paramContext)
  {
    super(a, new String[0]);
    this.c = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    if ((TypeSystem.Value)paramMap.get(b) != null) {}
    for (String str1 = Types.a((TypeSystem.Value)paramMap.get(b));; str1 = null)
    {
      String str2 = InstallReferrerUtil.b(this.c, str1);
      if (str2 == null) {
        break;
      }
      return Types.e(str2);
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.InstallReferrerMacro
 * JD-Core Version:    0.7.0.1
 */