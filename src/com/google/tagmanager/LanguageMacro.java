package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Locale;
import java.util.Map;

class LanguageMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.p.toString();
  
  public LanguageMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    Locale localLocale = Locale.getDefault();
    if (localLocale == null) {
      return Types.d();
    }
    String str = localLocale.getLanguage();
    if (str == null) {
      return Types.d();
    }
    return Types.e(str.toLowerCase());
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.LanguageMacro
 * JD-Core Version:    0.7.0.1
 */