package com.google.tagmanager;

import android.os.Build.VERSION;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class SdkVersionMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.w.toString();
  
  public SdkVersionMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return Types.e(Integer.valueOf(Build.VERSION.SDK_INT));
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.SdkVersionMacro
 * JD-Core Version:    0.7.0.1
 */