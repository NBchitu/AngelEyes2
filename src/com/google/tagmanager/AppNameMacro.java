package com.google.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.analytics.containertag.common.FunctionType;
import com.google.analytics.midtier.proto.containertag.TypeSystem.Value;
import java.util.Map;

class AppNameMacro
  extends FunctionCallImplementation
{
  private static final String a = FunctionType.d.toString();
  private final Context b;
  
  public AppNameMacro(Context paramContext)
  {
    super(a, new String[0]);
    this.b = paramContext;
  }
  
  public TypeSystem.Value a(Map<String, TypeSystem.Value> paramMap)
  {
    try
    {
      PackageManager localPackageManager = this.b.getPackageManager();
      TypeSystem.Value localValue = Types.e(localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(this.b.getPackageName(), 0)).toString());
      return localValue;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.a("App name is not found.", localNameNotFoundException);
    }
    return Types.d();
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.AppNameMacro
 * JD-Core Version:    0.7.0.1
 */