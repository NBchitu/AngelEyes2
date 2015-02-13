package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.location.Location;
import android.view.LayoutInflater;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.fridaylab.astronomy.FishingEstimationTask;
import com.fridaylab.util.AsyncRequest.OnCompleteListener;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.utilities.DisplayUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class EvaluationTableView
  extends RelativeLayout
  implements AsyncRequest.OnCompleteListener<FishingEstimationTask>
{
  private final GregorianCalendar a;
  private final int b;
  private int[] c;
  private Location d;
  private final EvaluationDiagram e;
  
  public EvaluationTableView(Context paramContext, GregorianCalendar paramGregorianCalendar, int paramInt, Location paramLocation)
  {
    super(paramContext);
    this.b = paramInt;
    this.d = paramLocation;
    this.a = ((GregorianCalendar)paramGregorianCalendar.clone());
    this.c = new int[paramInt];
    setPadding(DisplayUtils.a(10.0F, paramContext), DisplayUtils.a(5.0F, paramContext), DisplayUtils.a(10.0F, paramContext), DisplayUtils.a(5.0F, paramContext));
    TextView localTextView = new TextView(paramContext);
    localTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    localTextView.setGravity(17);
    localTextView.setBackgroundResource(2130837813);
    localTextView.setTextColor(-16777216);
    localTextView.setTypeface(null, 1);
    localTextView.setId(65);
    String str = new java.text.DateFormatSymbols().getMonths()[paramGregorianCalendar.get(2)];
    localTextView.setText(str + " " + paramGregorianCalendar.get(1));
    addView(localTextView);
    RelativeLayout localRelativeLayout = (RelativeLayout)LayoutInflater.from(paramContext).inflate(2130903051, null);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(3, 65);
    localRelativeLayout.setLayoutParams(localLayoutParams);
    this.e = ((EvaluationDiagram)localRelativeLayout.findViewById(2131296317));
    this.e.setDaysCount(paramInt);
    addView(localRelativeLayout);
  }
  
  public void a(FishingEstimationTask paramFishingEstimationTask)
  {
    this.c = paramFishingEstimationTask.c();
    a(paramFishingEstimationTask.a(), paramFishingEstimationTask.b());
  }
  
  public void a(List<double[]> paramList, int[] paramArrayOfInt)
  {
    EvaluationTableView.ForecastData[] arrayOfForecastData = new EvaluationTableView.ForecastData[this.b];
    for (int i = 0; i < this.b; i++)
    {
      arrayOfForecastData[i] = new EvaluationTableView.ForecastData();
      arrayOfForecastData[i].b = ((double[])paramList.get(i));
      arrayOfForecastData[i].a = ((GregorianCalendar)this.a.clone());
      arrayOfForecastData[i].c = this.c[i];
      arrayOfForecastData[i].d = paramArrayOfInt[i];
    }
    this.e.a(arrayOfForecastData);
  }
  
  public boolean a()
  {
    return this.e.a();
  }
  
  public void b()
  {
    if ((this.d != null) && (this.d.getLatitude() != -666.0D) && (!a())) {
      new FishingEstimationTask(this, this.d, this.a, this.b).h();
    }
  }
  
  public Calendar getCalendar()
  {
    return this.a;
  }
  
  public int getDaysCount()
  {
    return this.b;
  }
  
  public Location getLocation()
  {
    return this.d;
  }
  
  public void setLocation(LocationData paramLocationData)
  {
    if (paramLocationData.c() != -666.0D)
    {
      this.d = new Location(paramLocationData.a());
      this.d.setLatitude(paramLocationData.c());
      this.d.setLongitude(paramLocationData.e());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.EvaluationTableView
 * JD-Core Version:    0.7.0.1
 */