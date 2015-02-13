package com.fridaylab.astronomy;

import android.location.Location;
import com.fridaylab.util.AsyncRequest;
import com.fridaylab.util.AsyncRequest.OnCompleteListener;
import com.koniaris.astronomy.Moon;
import com.telesoftas.utilities.weather.WeatherCodeUtils;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class FishingEstimationTask
  extends AsyncRequest<FishingEstimationTask>
{
  private final Location a;
  private final GregorianCalendar b;
  private final int c;
  private final int[] d;
  private final int[] e;
  private List<double[]> f;
  
  public FishingEstimationTask(AsyncRequest.OnCompleteListener<FishingEstimationTask> paramOnCompleteListener, Location paramLocation, GregorianCalendar paramGregorianCalendar, int paramInt)
  {
    super(paramOnCompleteListener);
    this.a = paramLocation;
    this.b = ((GregorianCalendar)paramGregorianCalendar.clone());
    this.c = paramInt;
    this.d = new int[this.c];
    this.e = new int[this.c];
  }
  
  public List<double[]> a()
  {
    return this.f;
  }
  
  public int[] b()
  {
    return this.e;
  }
  
  public int[] c()
  {
    return this.d;
  }
  
  protected void d()
  {
    GregorianCalendar localGregorianCalendar = (GregorianCalendar)this.b.clone();
    this.f = Arrays.asList(AstronomyTools.b(localGregorianCalendar, this.a, this.e));
    for (int i = 0;; i++)
    {
      if ((i >= this.c) || (isCancelled())) {
        return;
      }
      Moon localMoon = AstronomyTools.a(localGregorianCalendar);
      int j = localMoon.b();
      boolean bool = localMoon.a();
      this.d[i] = WeatherCodeUtils.a(j, bool, this.a);
      localGregorianCalendar.add(6, 1);
    }
  }
  
  protected FishingEstimationTask e()
  {
    return this;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.astronomy.FishingEstimationTask
 * JD-Core Version:    0.7.0.1
 */