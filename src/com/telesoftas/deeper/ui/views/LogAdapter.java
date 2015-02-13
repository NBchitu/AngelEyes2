package com.telesoftas.deeper.ui.views;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.location.Location;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.PhotoData;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.ImageManager;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import com.telesoftas.utilities.weather.WeatherCodeUtils;
import java.util.GregorianCalendar;
import java.util.List;

public class LogAdapter
  extends CursorAdapter
  implements ScrollViewListener
{
  public ImageManager j;
  private final View.OnClickListener k;
  private int l;
  private int m;
  private boolean n = false;
  private final Context o;
  private final DeeperDatabase p;
  private int q = 0;
  private int r = 0;
  private int s = 0;
  private final boolean t;
  
  public LogAdapter(Activity paramActivity, Cursor paramCursor, int paramInt, View.OnClickListener paramOnClickListener, DeeperDatabase paramDeeperDatabase, boolean paramBoolean)
  {
    super(paramActivity, paramCursor, paramInt);
    this.t = paramBoolean;
    this.o = paramActivity;
    this.k = paramOnClickListener;
    this.p = paramDeeperDatabase;
    this.j = new ImageManager(paramActivity.getApplicationContext(), 10L, true);
    e();
  }
  
  private void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, LinearLayout paramLinearLayout, Cursor paramCursor)
  {
    List localList = this.p.c(paramCursor.getInt(0));
    this.s = localList.size();
    paramLinearLayout.removeAllViews();
    int i = 5;
    if (this.t) {
      i = 6;
    }
    int i1 = this.m / i;
    if (localList.size() == 0)
    {
      ImageView localImageView1 = new ImageView(this.o);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(i1, -2);
      localLayoutParams1.setMargins(0, 0, DisplayUtils.a(5.0F, this.o), 0);
      localImageView1.setBackgroundResource(2130837521);
      localImageView1.setImageResource(2130837686);
      int i2 = DisplayUtils.a(10.0F, this.o);
      localImageView1.setPadding(i2, i2, i2, i2);
      localImageView1.setLayoutParams(localLayoutParams1);
      paramLinearLayout.addView(localImageView1);
      TextView localTextView = new TextView(this.o);
      localTextView.setText(2131427545);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams2.gravity = 16;
      localTextView.setLayoutParams(localLayoutParams2);
      localTextView.setLines(1);
      localTextView.setSingleLine();
      localTextView.setTextAppearance(this.o, 16842817);
      localTextView.setTextColor(-1);
      localTextView.setTextSize(18.0F);
      paramLinearLayout.addView(localTextView);
    }
    for (int i3 = 0; i3 < localList.size(); i3++)
    {
      ImageView localImageView2 = new ImageView(this.o);
      if (this.n) {
        this.j.a(((PhotoData)localList.get(i3)).a(), localImageView2, -1);
      }
      LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(i1, -1);
      localLayoutParams3.setMargins(0, 0, DisplayUtils.a(10.0F, this.o), 0);
      localLayoutParams3.gravity = 16;
      localImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localImageView2.setBackgroundResource(2130837521);
      localImageView2.setPadding(DisplayUtils.a(10.0F, this.o), DisplayUtils.a(10.0F, this.o), DisplayUtils.a(10.0F, this.o), DisplayUtils.a(10.0F, this.o));
      localImageView2.setLayoutParams(localLayoutParams3);
      localImageView2.setTag(((PhotoData)localList.get(i3)).a());
      localImageView2.setId(3);
      localImageView2.setOnClickListener(this.k);
      paramLinearLayout.addView(localImageView2);
    }
    if (this.n) {
      paramLinearLayout.setTag("gallery_refresed");
    }
    for (;;)
    {
      if (this.r > localList.size()) {
        ((ImageView)paramCustomHorizontalScrollView.getTag(2131296378)).setVisibility(8);
      }
      return;
      paramLinearLayout.setTag("gallery_not_refresed");
    }
  }
  
  private void e()
  {
    this.q = this.o.getSharedPreferences("prefs", 0).getInt(SettingsUtils.a, 0);
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    View localView1 = localLayoutInflater.inflate(2130903066, null, false);
    View localView2 = localLayoutInflater.inflate(2130903068, null);
    localView2.setTag(2131296402, localView2.findViewById(2131296402));
    localView2.setTag(2131296401, localView2.findViewById(2131296401));
    localView2.setTag(2131296403, localView2.findViewById(2131296403));
    localView2.setTag(2131296405, localView2.findViewById(2131296405));
    localView2.setTag(2131296407, localView2.findViewById(2131296407));
    localView1.setTag(2130903068, localView2);
    View localView3 = localLayoutInflater.inflate(2130903067, null);
    localView3.setTag(2131296402, localView3.findViewById(2131296402));
    localView3.setTag(2131296401, localView3.findViewById(2131296401));
    localView3.setTag(2131296403, localView3.findViewById(2131296403));
    localView1.setTag(2130903067, localView3);
    localView1.setTag(2131296398, localView1.findViewById(2131296398));
    localView1.setTag(2131296372, localView1.findViewById(2131296372));
    localView1.setTag(2131296399, localView1.findViewById(2131296399));
    localView1.setTag(2131296400, localView1.findViewById(2131296400));
    localView1.setTag(2131296376, localView1.findViewById(2131296376));
    localView1.setTag(2131296394, localView1.findViewById(2131296394));
    localView1.setTag(2131296396, localView1.findViewById(2131296396));
    localView1.setTag(2131296392, localView1.findViewById(2131296392));
    localView1.setTag(2131296280, localView1.findViewById(2131296280));
    localView1.setTag(2131296391, localView1.findViewById(2131296391));
    localView1.setTag(2131296377, localView1.findViewById(2131296377));
    localView1.setTag(2131296378, localView1.findViewById(2131296378));
    localView1.setTag(2131296375, localView1.findViewById(2131296375));
    int i = this.l;
    if (this.t)
    {
      int i1 = Math.max((int)(this.l / 2.5D), DisplayUtils.a(paramContext, 240));
      RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localView1.findViewById(2131296399).getLayoutParams();
      localLayoutParams1.height = (i1 / 6);
      localView1.findViewById(2131296399).setLayoutParams(localLayoutParams1);
      RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)localView1.findViewById(2131296400).getLayoutParams();
      localLayoutParams2.height = (i1 / 6);
      localView1.findViewById(2131296400).setLayoutParams(localLayoutParams2);
      i = i1;
    }
    localView1.setLayoutParams(new AbsListView.LayoutParams(-1, i));
    return localView1;
  }
  
  public void a(int paramInt)
  {
    this.l = paramInt;
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    LinearLayout localLinearLayout1 = (LinearLayout)paramView.getTag(2131296398);
    View localView1 = (View)paramView.getTag(2130903068);
    localLinearLayout1.removeAllViews();
    localLinearLayout1.addView(localView1);
    LinearLayout localLinearLayout2 = (LinearLayout)paramView.getTag(2131296376);
    TextView localTextView1 = (TextView)paramView.getTag(2131296396);
    TextView localTextView2 = (TextView)paramView.getTag(2131296392);
    TextView localTextView3 = (TextView)paramView.getTag(2131296280);
    TextView localTextView4 = (TextView)paramView.getTag(2131296391);
    CustomHorizontalScrollView localCustomHorizontalScrollView = (CustomHorizontalScrollView)paramView.findViewById(2131296375);
    localCustomHorizontalScrollView.setScrollViewListener(this);
    ((ImageView)paramView.getTag(2131296377)).setVisibility(8);
    ((ImageView)paramView.getTag(2131296378)).setVisibility(0);
    localCustomHorizontalScrollView.setTag(2131296377, paramView.findViewById(2131296377));
    localCustomHorizontalScrollView.setTag(2131296378, paramView.findViewById(2131296378));
    a(localCustomHorizontalScrollView, localLinearLayout2, paramCursor);
    localCustomHorizontalScrollView.fullScroll(33);
    localTextView1.setText(paramCursor.getString(1));
    localTextView2.setText(paramCursor.getString(2));
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    localGregorianCalendar1.setTimeInMillis(paramCursor.getLong(3));
    double d1 = paramCursor.getDouble(5);
    double d2 = paramCursor.getDouble(6);
    String str1 = paramCursor.getString(4);
    if ((str1 == null) || (str1.equals(""))) {}
    for (String str2 = d1 + " " + d2;; str2 = str1)
    {
      float f1 = paramCursor.getFloat(7);
      float f2 = paramCursor.getFloat(8);
      float f3 = paramCursor.getFloat(9);
      float f4 = paramCursor.getFloat(10);
      int i = DeeperDatabase.a(paramCursor.getInt(11));
      int i1 = DeeperDatabase.b(paramCursor.getInt(12));
      TextView localTextView5 = (TextView)localView1.getTag(2131296402);
      TextView localTextView6 = (TextView)localView1.getTag(2131296401);
      ImageView localImageView = (ImageView)localView1.getTag(2131296407);
      if (localImageView != null) {
        localImageView.setImageResource(0);
      }
      String str3 = CalendarUtils.a(localGregorianCalendar1.get(7), paramContext);
      TextView localTextView7;
      if (CalendarUtils.b(localGregorianCalendar1))
      {
        localTextView5.setTextColor(Color.parseColor("#F55600"));
        localTextView5.setText(str3);
        localTextView6.setText(localGregorianCalendar1.get(5) + " ");
        ((ImageView)localView1.getTag(2131296403)).setImageResource(i1);
        if (f1 != -666.0F)
        {
          localTextView7 = (TextView)localView1.getTag(2131296405);
          if ((this.q != 1) && (this.q != 2)) {
            break label852;
          }
        }
      }
      label852:
      for (String str4 = (int)f2 + WeatherCodeUtils.a(this.q, paramContext) + "/" + (int)f4 + WeatherCodeUtils.a(this.q, paramContext);; str4 = (int)f1 + WeatherCodeUtils.a(this.q, paramContext) + "/" + (int)f3 + WeatherCodeUtils.a(this.q, paramContext))
      {
        if (localTextView7 != null) {
          localTextView7.setText(str4);
        }
        if ((i != 0) && (localImageView != null)) {
          localImageView.setImageResource(i);
        }
        localTextView3.setText(StringUtils.a(localGregorianCalendar1, this.o));
        localTextView4.setText(str2);
        View localView2 = (View)paramView.getTag(2131296372);
        Button localButton1 = (Button)paramView.getTag(2131296399);
        localButton1.setText(this.o.getString(2131427412));
        Button localButton2 = (Button)paramView.getTag(2131296400);
        localButton2.setText(this.o.getString(2131427595));
        localView2.setOnClickListener(this.k);
        localTextView4.setOnClickListener(this.k);
        localButton1.setOnClickListener(this.k);
        localButton2.setOnClickListener(this.k);
        localButton1.setId(1);
        localButton2.setId(2);
        Location localLocation = new Location("loc");
        localLocation.setLatitude(d1);
        localLocation.setLongitude(d2);
        localLocation.setProvider(str2);
        localView2.setTag(localLocation);
        localTextView4.setTag(localLocation);
        GregorianCalendar localGregorianCalendar2 = new GregorianCalendar();
        localGregorianCalendar2.setTimeInMillis(paramCursor.getLong(3));
        localButton1.setTag(localGregorianCalendar2);
        localButton2.setTag(localGregorianCalendar2);
        getItem(1);
        return;
        localTextView5.setTextColor(-1);
        break;
      }
    }
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      paramInt2 = 10;
    }
    if (paramInt1 == 0) {
      paramInt1 = 10;
    }
    this.r = (paramInt1 / paramInt2);
    if (paramInt1 / paramInt2 > this.s) {
      ((ImageView)paramCustomHorizontalScrollView.getTag(2131296378)).setVisibility(8);
    }
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramCustomHorizontalScrollView.getWidth() <= paramCustomHorizontalScrollView.getChildAt(0).getWidth())
    {
      if (paramInt1 + paramCustomHorizontalScrollView.getWidth() >= paramCustomHorizontalScrollView.getChildAt(0).getWidth())
      {
        ((ImageView)paramCustomHorizontalScrollView.getTag(2131296377)).setVisibility(0);
        ((ImageView)paramCustomHorizontalScrollView.getTag(2131296378)).setVisibility(8);
      }
    }
    else {
      return;
    }
    if (paramInt1 <= 10)
    {
      ((ImageView)paramCustomHorizontalScrollView.getTag(2131296377)).setVisibility(8);
      ((ImageView)paramCustomHorizontalScrollView.getTag(2131296378)).setVisibility(0);
      return;
    }
    ((ImageView)paramCustomHorizontalScrollView.getTag(2131296377)).setVisibility(0);
    ((ImageView)paramCustomHorizontalScrollView.getTag(2131296378)).setVisibility(0);
  }
  
  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  public int c()
  {
    return this.l;
  }
  
  public int d()
  {
    return this.m;
  }
  
  public boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.LogAdapter
 * JD-Core Version:    0.7.0.1
 */