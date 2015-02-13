package com.google.tagmanager;

import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class AdvertisingTrackingEnabledMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.b.toString();
  
  public AdvertisingTrackingEnabledMacro()
  {
    super(a, new String[0]);
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    return Types.e(Boolean.valueOf(true));
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.AdvertisingTrackingEnabledMacro
 * JD-Core Version:    0.7.0.1
 */