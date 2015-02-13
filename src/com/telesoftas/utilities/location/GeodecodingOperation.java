package com.telesoftas.utilities.location;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.List;

public class GeodecodingOperation
  extends AsyncTask<String, Void, String>
{
  private final Location a;
  private final Context b;
  private GeodecodingOperation.GeodecodingListener c;
  
  public GeodecodingOperation(Context paramContext, Location paramLocation)
  {
    this.b = paramContext;
    this.a = paramLocation;
  }
  
  protected String a(String... paramVarArgs)
  {
    for (;;)
    {
      try
      {
        List localList = new GeocoderCostum(this.b).a(this.a.getLatitude(), this.a.getLongitude(), 1);
        if (localList.size() > 0)
        {
          String str2 = ((Address)localList.get(0)).getFeatureName();
          str1 = str2;
          return str1;
        }
      }
      catch (GeocoderCostum.LimitExceededException localLimitExceededException)
      {
        return "";
      }
      catch (IOException localIOException)
      {
        return "";
      }
      String str1 = "";
    }
  }
  
  public void a(GeodecodingOperation.GeodecodingListener paramGeodecodingListener)
  {
    this.c = paramGeodecodingListener;
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    this.a.setProvider(paramString);
    if (this.c != null) {
      this.c.b(this.a);
    }
  }
  
  protected void a(Void... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.location.GeodecodingOperation
 * JD-Core Version:    0.7.0.1
 */