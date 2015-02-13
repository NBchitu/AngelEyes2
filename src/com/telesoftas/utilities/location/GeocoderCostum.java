package com.telesoftas.utilities.location;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class GeocoderCostum
{
  private final Context a;
  private WebserviceClient b = null;
  
  public GeocoderCostum(Context paramContext)
  {
    this.a = paramContext;
    this.b = new WebserviceClient();
  }
  
  private void a(List<Address> paramList, int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      String str1 = new String(paramArrayOfByte, "UTF-8");
      if (TextUtils.isEmpty(str1)) {
        return;
      }
      JSONObject localJSONObject1 = new JSONObject(str1);
      String str2 = localJSONObject1.getString("status");
      if (str2.equals("OK"))
      {
        JSONArray localJSONArray = localJSONObject1.getJSONArray("results");
        for (int i = 0; (i < paramInt) && (i < localJSONArray.length()); i++)
        {
          Address localAddress = new Address(Locale.getDefault());
          JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
          localAddress.setFeatureName(localJSONObject2.getString("formatted_address"));
          JSONObject localJSONObject3 = localJSONObject2.getJSONObject("geometry").getJSONObject("location");
          localAddress.setLatitude(localJSONObject3.getDouble("lat"));
          localAddress.setLongitude(localJSONObject3.getDouble("lng"));
          paramList.add(localAddress);
        }
      }
      if (str2.equals("OVER_QUERY_LIMIT")) {
        throw new GeocoderCostum.LimitExceededException();
      }
    }
    catch (GeocoderCostum.LimitExceededException localLimitExceededException)
    {
      throw localLimitExceededException;
    }
    catch (Throwable localThrowable)
    {
      Crashlytics.a(localThrowable);
    }
  }
  
  private static boolean a(Context paramContext)
  {
    return false;
  }
  
  public List<Address> a(double paramDouble1, double paramDouble2, int paramInt)
  {
    if ((paramDouble1 < -90.0D) || (paramDouble1 > 90.0D)) {
      throw new IllegalArgumentException("latitude == " + paramDouble1);
    }
    if ((paramDouble2 < -180.0D) || (paramDouble2 > 180.0D)) {
      throw new IllegalArgumentException("longitude == " + paramDouble2);
    }
    if (a(this.a)) {
      throw new GeocoderCostum.LimitExceededException();
    }
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder("http://maps.googleapis.com/maps/api/geocode/json?sensor=true&latlng=");
    localStringBuilder.append(paramDouble1);
    localStringBuilder.append(',');
    localStringBuilder.append(paramDouble2);
    localStringBuilder.append("&language=");
    localStringBuilder.append(Locale.getDefault().getLanguage());
    byte[] arrayOfByte = this.b.a(localStringBuilder.toString());
    if (arrayOfByte != null) {
      a(localArrayList, paramInt, arrayOfByte);
    }
    return localArrayList;
  }
  
  public List<Address> a(String paramString, int paramInt)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("locationName == null");
    }
    if (a(this.a)) {
      throw new GeocoderCostum.LimitExceededException();
    }
    localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder("https://maps.googleapis.com/maps/api/place/textsearch/json?key=AIzaSyAZrVUQmyXEMLW7rNzqBs2Yo8UpnOl_sWg&sensor=false");
    localStringBuilder.append("&query=").append(URLEncoder.encode(paramString, "UTF-8"));
    localStringBuilder.append("&types=accounting%7Cairport%7Camusement_park%7Caquarium%7Cart_gallery%7Catm%7Cbakery%7Cbank%7Cbar%7Cbeauty_salon%7Cbicycle_store%7Cbook_store%7Cbowling_alley%7Cbus_station%7Ccafe%7Ccampground%7Ccar_dealer%7Ccar_rental%7Ccar_repair%7Ccar_wash%7Ccasino%7Ccemetery%7Cchurch%7Ccity_hall%7Cclothing_store%7Cconvenience_store%7Ccourthouse%7Cdentist%7Cdepartment_store%7Cdoctor%7Celectrician%7Celectronics_store%7Cembassy%7Cestablishment%7Cfinance%7Cfire_station%7Cflorist%7Cfood%7Cfuneral_home%7Cfurniture_store%7Cgas_station%7Cgeneral_contractor%7Cgrocery_or_supermarket%7Cgym%7Chair_care%7Chardware_store%7Chealth%7Chindu_temple%7Chome_goods_store%7Chospital%7Cinsurance_agency%7Cjewelry_store%7Claundry%7Clawyer%7Clibrary%7Cliquor_store%7Clocal_government_office%7Clocksmith%7Clodging%7Cmeal_delivery%7Cmeal_takeaway%7Cmosque%7Cmovie_rental%7Cmovie_theater%7Cmoving_company%7Cmuseum%7Cnight_club%7Cpainter%7Cpark%7Cparking%7Cpet_store%7Cpharmacy%7Cphysiotherapist%7Cplace_of_worship%7Cplumber%7Cpolice%7Cpost_office%7Creal_estate_agency%7Crestaurant%7Croofing_contractor%7Crv_park%7Cschool%7Cshoe_store%7Cshopping_mall%7Cspa%7Cstadium%7Cstorage%7Cstore%7Csubway_station%7Csynagogue%7Ctaxi_stand%7Ctrain_station%7Ctravel_agency%7Cuniversity%7Cveterinary_care%7Czoo%7Cadministrative_area_level_1%7Cadministrative_area_level_2%7Cadministrative_area_level_3%7Ccolloquial_area%7Ccountry%7Cfloor%7Cgeocode%7Cintersection%7Clocality%7Cnatural_feature%7Cneighborhood%7Cpolitical%7Cpoint_of_interest%7Cpost_box%7Cpostal_code%7Cpostal_code_prefix%7Cpostal_town%7Cpremise%7Croom%7Croute%7Cstreet_address%7Cstreet_number%7Csublocality%7Csublocality_level_4%7Csublocality_level_5%7Csublocality_level_3%7Csublocality_level_2%7Csublocality_level_1%7Csubpremise%7Ctransit_station");
    byte[] arrayOfByte1 = this.b.a(localStringBuilder.toString());
    if (arrayOfByte1 != null) {}
    try
    {
      a(localArrayList, paramInt, arrayOfByte1);
      return localArrayList;
    }
    catch (GeocoderCostum.LimitExceededException localLimitExceededException1)
    {
      try
      {
        byte[] arrayOfByte2;
        do
        {
          Thread.sleep(2000L);
          arrayOfByte2 = this.b.a(localStringBuilder.toString());
        } while (arrayOfByte2 == null);
        try
        {
          a(localArrayList, paramInt, arrayOfByte2);
          return localArrayList;
        }
        catch (GeocoderCostum.LimitExceededException localLimitExceededException2)
        {
          throw localLimitExceededException2;
        }
        return localArrayList;
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.location.GeocoderCostum
 * JD-Core Version:    0.7.0.1
 */