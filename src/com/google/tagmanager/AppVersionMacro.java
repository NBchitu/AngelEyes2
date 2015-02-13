package com.google.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class AppVersionMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.e.toString();
  private final Context b;
  
  public AppVersionMacro(Context paramContext)
  {
    super(a, new String[0]);
    this.b = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    try
    {
      TypeSystem.Value localValue = Types.e(Integer.valueOf(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode));
      return localValue;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.a("Package name " + this.b.getPackageName() + " not found. " + localNameNotFoundException.getMessage());
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.AppVersionMacro
 * JD-Core Version:    0.7.0.1
 */