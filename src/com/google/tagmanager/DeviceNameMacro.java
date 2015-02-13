package com.google.tagmanager;

import android.os.Build;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class DeviceNameMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.j.toString();
  
  public DeviceNameMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if ((!str2.startsWith(str1)) && (!str1.equals("unknown"))) {
      str2 = str1 + " " + str2;
    }
    return Types.e(str2);
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DeviceNameMacro
 * JD-Core Version:    0.7.0.1
 */