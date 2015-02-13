package com.google.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class DeviceIdMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.A.toString();
  private final Context b;
  
  public DeviceIdMacro(Context paramContext)
  {
    super(a, new String[0]);
    this.b = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    String str = a(this.b);
    if (str == null) {
      return Types.d();
    }
    return Types.e(str);
  }
  
  protected String a(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.DeviceIdMacro
 * JD-Core Version:    0.7.0.1
 */