package com.telesoftas.httpcommunication;

import com.telesoftas.utilities.weather.WeatherItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonHelper
{
  private static JSONObject a;
  
  public static JsonHelper.WeatherItemList a(String paramString)
  {
    JsonHelper.WeatherItemList localWeatherItemList = new JsonHelper.WeatherItemList();
    if (paramString != null)
    {
      a = b(paramString);
      if (a == null) {
        return null;
      }
      JSONObject localJSONObject1 = b(a, "data");
      if (localJSONObject1 == null) {
        return null;
      }
      JSONArray localJSONArray1 = a(localJSONObject1, "current_condition");
      if ((localJSONArray1 == null) || (localJSONArray1.length() < 1)) {
        return null;
      }
      JSONObject localJSONObject2 = a(localJSONArray1, 0);
      if (localJSONObject2 == null) {
        return null;
      }
      String str1 = e(localJSONObject2, "observation_time");
      double d1 = d(localJSONObject2, "windspeedKmph");
      double d2 = d(localJSONObject2, "windspeedMiles");
      int i = c(localJSONObject2, "winddirDegree");
      String str2 = e(localJSONObject2, "winddir16Point");
      int j = c(localJSONObject2, "weatherCode");
      double d3 = d(localJSONObject2, "temp_C");
      double d4 = d(localJSONObject2, "temp_F");
      double d5 = d(localJSONObject2, "visibility");
      double d6 = d(localJSONObject2, "pressure");
      localWeatherItemList.add(new WeatherItem(j, str1, d3, d4, d1, d2, i, str2, c(localJSONObject2, "humidity"), d5, d6));
      JSONArray localJSONArray2 = a(localJSONObject1, "weather");
      if (localJSONArray2 == null) {
        return null;
      }
      for (int k = 0; k < localJSONArray2.length(); k++)
      {
        JSONObject localJSONObject3 = a(localJSONArray2, k);
        JSONObject localJSONObject4 = a(a(localJSONObject3, "hourly"), 0);
        String str3 = e(localJSONObject3, "date");
        double d7 = d(localJSONObject3, "mintempC");
        double d8 = d(localJSONObject3, "maxtempC");
        double d9 = d(localJSONObject3, "mintempF");
        double d10 = d(localJSONObject3, "maxtempF");
        int m = c(localJSONObject4, "weatherCode");
        double d11 = d(localJSONObject4, "windspeedKmph");
        double d12 = d(localJSONObject4, "windspeedMiles");
        int n = c(localJSONObject4, "winddirDegree");
        String str4 = e(localJSONObject4, "winddir16Point");
        double d13 = d(localJSONObject4, "pressure");
        localWeatherItemList.add(new WeatherItem(m, str3, d8, d7, d10, d9, d11, d12, n, str4, c(localJSONObject4, "humidity"), d(localJSONObject4, "visibility"), d13));
      }
    }
    return localWeatherItemList;
  }
  
  private static JSONArray a(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString);
      return localJSONArray;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private static JSONObject a(JSONArray paramJSONArray, int paramInt)
  {
    try
    {
      JSONObject localJSONObject = (JSONObject)paramJSONArray.get(paramInt);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private static JSONObject b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private static JSONObject b(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private static int c(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      int i = paramJSONObject.getInt(paramString);
      return i;
    }
    catch (JSONException localJSONException) {}
    return -1;
  }
  
  private static double d(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      double d = paramJSONObject.getDouble(paramString);
      return d;
    }
    catch (JSONException localJSONException) {}
    return -1.0D;
  }
  
  private static String e(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      String str = paramJSONObject.getString(paramString);
      return str;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.httpcommunication.JsonHelper
 * JD-Core Version:    0.7.0.1
 */