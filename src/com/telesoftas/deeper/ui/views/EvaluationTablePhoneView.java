package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fridaylab.astronomy.FishingEstimationTask;
import com.fridaylab.util.AsyncRequest.OnCompleteListener;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.DisplayUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class EvaluationTablePhoneView
  extends LinearLayout
  implements AsyncRequest.OnCompleteListener<FishingEstimationTask>
{
  private final Calendar a = new GregorianCalendar();
  private boolean b = false;
  private final ArrayList<EvaluationPhoneDiagram> c = new ArrayList();
  private final ArrayList<RelativeLayout> d = new ArrayList();
  private final GregorianCalendar e;
  private final int f;
  private int[] g;
  private Location h;
  
  public EvaluationTablePhoneView(Context paramContext, GregorianCalendar paramGregorianCalendar, int paramInt, Location paramLocation)
  {
    super(paramContext);
    this.f = paramInt;
    this.h = paramLocation;
    this.e = paramGregorianCalendar;
    setWeightSum(paramInt);
    this.g = new int[paramInt];
    setOrientation(1);
    setPadding(0, DisplayUtils.a(5.0F, paramContext), 0, DisplayUtils.a(5.0F, paramContext));
    TextView localTextView1 = new TextView(paramContext);
    localTextView1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0F));
    localTextView1.setGravity(17);
    localTextView1.setBackgroundResource(2130837813);
    localTextView1.setTextColor(-16777216);
    localTextView1.setTypeface(null, 1);
    String str1 = new java.text.DateFormatSymbols().getMonths()[this.e.get(2)];
    localTextView1.setText(str1 + " " + this.e.get(1));
    addView(localTextView1);
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    GregorianCalendar localGregorianCalendar = (GregorianCalendar)this.e.clone();
    int i = 0;
    if (i < paramInt)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)localLayoutInflater.inflate(2130903050, null);
      localRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0F));
      int j;
      if ((this.a.get(1) == localGregorianCalendar.get(1)) && (this.a.get(2) == localGregorianCalendar.get(2)) && (this.a.get(5) == localGregorianCalendar.get(5)))
      {
        j = 1;
        label321:
        if (i != 0) {
          break label504;
        }
        if (j == 0) {
          break label494;
        }
        localRelativeLayout.setBackgroundResource(2130837604);
        this.b = true;
      }
      for (;;)
      {
        EvaluationPhoneDiagram localEvaluationPhoneDiagram = (EvaluationPhoneDiagram)localRelativeLayout.findViewById(2131296317);
        this.d.add(localRelativeLayout);
        this.c.add(localEvaluationPhoneDiagram);
        TextView localTextView2 = (TextView)localRelativeLayout.findViewById(2131296315);
        TextView localTextView3 = (TextView)localRelativeLayout.findViewById(2131296316);
        localTextView3.setTextColor(-1);
        if (CalendarUtils.b(localGregorianCalendar)) {
          localTextView3.setTextColor(Color.parseColor("#F55600"));
        }
        int k = localGregorianCalendar.get(5);
        String str2 = CalendarUtils.a(localGregorianCalendar.get(7), paramContext);
        localTextView2.setText(Integer.toString(k));
        localTextView3.setText(str2);
        addView(localRelativeLayout);
        int m = i + 1;
        localGregorianCalendar.add(6, 1);
        i = m;
        break;
        j = 0;
        break label321;
        label494:
        localRelativeLayout.setBackgroundResource(2130837603);
        continue;
        label504:
        if (i == paramInt - 1)
        {
          if (j != 0)
          {
            localRelativeLayout.setBackgroundResource(2130837598);
          }
          else if (this.b)
          {
            localRelativeLayout.setBackgroundResource(2130837599);
            this.b = false;
          }
          else
          {
            localRelativeLayout.setBackgroundResource(2130837597);
          }
        }
        else if (j != 0)
        {
          localRelativeLayout.setBackgroundResource(2130837602);
          this.b = true;
        }
        else if (this.b)
        {
          localRelativeLayout.setBackgroundResource(2130837600);
          this.b = false;
        }
        else
        {
          localRelativeLayout.setBackgroundResource(2130837601);
        }
      }
    }
  }
  
  public void a(FishingEstimationTask paramFishingEstimationTask)
  {
    this.g = paramFishingEstimationTask.c();
    a(paramFishingEstimationTask.a(), paramFishingEstimationTask.b());
  }
  
  public void a(List<double[]> paramList, int[] paramArrayOfInt)
  {
    for (int i = 0; i < this.f; i++) {
      ((EvaluationPhoneDiagram)this.c.get(i)).setRatesArray((double[])paramList.get(i));
    }
    for (int j = 0; j < this.f; j++)
    {
      LinearLayout localLinearLayout = (LinearLayout)((RelativeLayout)this.d.get(j)).findViewById(2131296320);
      int k = paramArrayOfInt[j];
      for (int m = 0; m < k; m++) {
        localLinearLayout.getChildAt(m).setVisibility(0);
      }
      ((ImageView)((RelativeLayout)this.d.get(j)).findViewById(2131296318)).setImageResource(this.g[j]);
    }
  }
  
  public boolean a()
  {
    for (int i = 0; i < this.f; i++) {
      if (!((EvaluationPhoneDiagram)this.c.get(i)).a()) {
        return false;
      }
    }
    return true;
  }
  
  public void b()
  {
    if ((this.h != null) && (this.h.getLatitude() != -666.0D) && (!a())) {
      new FishingEstimationTask(this, this.h, this.e, this.f).h();
    }
  }
  
  public Calendar getCalendar()
  {
    return this.e;
  }
  
  public int getDaysCount()
  {
    return this.f;
  }
  
  public Location getLocation()
  {
    return this.h;
  }
  
  public void setLocation(LocationData paramLocationData)
  {
    if (paramLocationData.c() != -666.0D)
    {
      this.h = new Location(paramLocationData.a());
      this.h.setLatitude(paramLocationData.c());
      this.h.setLongitude(paramLocationData.e());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.EvaluationTablePhoneView
 * JD-Core Version:    0.7.0.1
 */