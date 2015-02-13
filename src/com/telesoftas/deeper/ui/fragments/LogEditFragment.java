package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.fridaylab.astronomy.AstronomyTools;
import com.fridaylab.deeper.ui.ViewTools;
import com.koniaris.astronomy.Moon;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.database.PhotoData;
import com.telesoftas.deeper.database.WeatherData;
import com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText;
import com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText$OnKeybordBackListener;
import com.telesoftas.deeper.ui.views.CustomHorizontalScrollView;
import com.telesoftas.deeper.ui.views.ScrollViewListener;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.FileUtils;
import com.telesoftas.utilities.ImageUtils;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import com.telesoftas.utilities.location.GeodecodingOperation$GeodecodingListener;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;
import com.telesoftas.utilities.weather.WeatherCodeUtils;
import com.telesoftas.utilities.weather.WeatherService;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class LogEditFragment
  extends WrapperFragment
  implements View.OnClickListener, CustomAutoCompleteEditText$OnKeybordBackListener, ScrollViewListener, GeodecodingOperation$GeodecodingListener, LocationListenerInterface
{                                  
  private LogEditFragment$OnLogEditListener a;
  private RelativeLayout aA;
  private View aB;
  private int aC = -99;
  private ImageView aD;
  private ImageView aE;
  private int aF = 0;
  private final String aG = "";
  private boolean aH = false;
  private GregorianCalendar aI = null;
  private File aJ = null;
  private boolean aK = true;
  private EditText aj;
  private CustomAutoCompleteEditText ak;
  private TextView al;
  private TextView am;
  private final List<PhotoData> an = new ArrayList();
  private List<PhotoData> ao = new ArrayList();
  private final List<String> ap = new ArrayList();
  private LinearLayout aq;
  private Button ar;
  private Button as;
  private View at;
  private View au;
  private Location av;
  private View aw;
  private LinearLayout ax;
  private WeatherData ay;
  private GregorianCalendar az;
  private LocationHelperSingleton b;
  private int c = 0;
  private NoteEntry d;
  private boolean e;
  private String f;
  private boolean g = true;
  
  private void S()
  {
    this.aF = i().getSharedPreferences("prefs", 0).getInt(SettingsUtils.a, 0);
  }
  
  private void T()
  {
    if (this.av == null) {
      this.av = new Location("gps");
    }
    a(this.av);
    if (this.e)
    {
      this.d.a(new NoteData(this.d.a().b(), this.aj.getText().toString(), this.ak.getText().toString()));
      if (this.an != null) {
        this.d.a(this.an);
      }
      if (this.ay == null) {
        break label275;
      }
      this.d.a(this.ay);
    }
    for (;;)
    {
      if ((this.d.b() == null) && (this.av != null)) {
        this.d.a(new LocationData("", "", this.av.getLatitude(), -1, this.av.getLongitude()));
      }
      if ((!this.e) || (this.av != null))
      {
        this.h.a(this.d, this.e, false);
        LocationData localLocationData = this.d.b();
        localLocationData.a(this.d.a().c());
        localLocationData.a(1);
        a(false);
      }
      return;
      this.d.a(new NoteData(this.d.a().b(), this.aj.getText().toString(), this.ak.getText().toString()));
      break;
      label275:
      if ((this.e) && (this.av != null))
      {
        Moon localMoon = AstronomyTools.a(this.d.a().b());
        this.ay = new WeatherData(0, 0.0F, 0.0F, null, -666.0F, -666.0F, 0.0F, 0.0F, 0.0F, WeatherCodeUtils.a(localMoon.b(), localMoon.a(), this.av), this.az, this.az, 0.0F, this.az, this.az, 0, 0.0F);
        this.d.a(this.ay);
      }
    }
  }
  
  private void U()
  {
    for (int i = 0; i < this.ap.size(); i++)
    {
      this.h.a((String)this.ap.get(i));
      c((String)this.ap.get(i));
    }
    this.ap.clear();
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    return BitmapFactory.decodeFile(FileUtils.a(paramString));
  }
  
  private void a(Location paramLocation, View paramView)
  {
    LogEditFragment.1 local1 = new LogEditFragment.1(this, paramView, paramLocation);
    WeatherService.a(i()).a(local1, paramLocation);
  }
  
  private void a(View paramView)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(a(2131427485)).setCancelable(false).setPositiveButton(a(17039379), new LogEditFragment.3(this, paramView)).setNegativeButton(a(17039360), new LogEditFragment.2(this));
    localBuilder.create().show();
  }
  
  private void a(LinearLayout paramLinearLayout)
  {
    int i = ViewTools.b(i());
    int j;
    if (this.i) {
      j = (int)(i / 1.5D);
    }
    for (int k = 4;; k = 3)
    {
      paramLinearLayout.removeAllViews();
      RelativeLayout localRelativeLayout1 = new RelativeLayout(i());
      ImageView localImageView1 = new ImageView(i());
      localImageView1.setId(6);
      localImageView1.setImageResource(2130837686);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(j / k, -1);
      localLayoutParams1.setMargins(0, 0, DisplayUtils.a(5.0F, i()), 0);
      localImageView1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      localImageView1.setBackgroundResource(2130837521);
      localImageView1.setLayoutParams(localLayoutParams1);
      localImageView1.setTag(Integer.valueOf(-1));
      localImageView1.setOnClickListener(this);
      localRelativeLayout1.addView(localImageView1);
      localRelativeLayout1.setLayoutParams(localLayoutParams1);
      paramLinearLayout.addView(localRelativeLayout1);
      ArrayList localArrayList = new ArrayList();
      for (int m = this.an.size(); m > 0; m--) {
        localArrayList.add(((PhotoData)this.an.get(m - 1)).a());
      }
      for (int n = this.ao.size(); n > 0; n--) {
        localArrayList.add(((PhotoData)this.ao.get(n - 1)).a());
      }
      int i1 = 0;
      if (i1 < localArrayList.size())
      {
        RelativeLayout localRelativeLayout2 = new RelativeLayout(i());
        ImageView localImageView2 = new ImageView(i());
        if (new File((String)localArrayList.get(i1)).exists()) {
          localImageView2.setImageBitmap(a((String)localArrayList.get(i1), 200, 200));
        }
        for (;;)
        {
          localImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(j / k, -1);
          localLayoutParams2.setMargins(DisplayUtils.a(5.0F, i()), 0, DisplayUtils.a(5.0F, i()), 0);
          localLayoutParams2.gravity = 16;
          localRelativeLayout2.setBackgroundResource(2130837524);
          localImageView2.setTag(localArrayList.get(i1));
          localImageView2.setId(7);
          localImageView2.setOnClickListener(this);
          localImageView2.setLayoutParams(localLayoutParams2);
          localRelativeLayout2.setLayoutParams(localLayoutParams2);
          localRelativeLayout2.setPadding(DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()));
          localRelativeLayout2.addView(localImageView2);
          ImageView localImageView3 = new ImageView(i());
          localImageView3.setImageResource(2130837555);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
          localLayoutParams.addRule(7, localImageView2.getId());
          int i2 = i().getResources().getDimensionPixelOffset(2131230799);
          localLayoutParams.setMargins(0, i2, i2, 0);
          localImageView3.setTag(localArrayList.get(i1));
          localImageView3.setId(8);
          localImageView3.setOnClickListener(this);
          localRelativeLayout2.setLayoutParams(localLayoutParams2);
          localRelativeLayout2.addView(localImageView3, localLayoutParams);
          paramLinearLayout.addView(localRelativeLayout2);
          i1++;
          break;
          localImageView2.setImageResource(2130837555);
        }
      }
      if (this.c < 1 + (this.ao.size() + this.an.size())) {
        this.aE.setVisibility(0);
      }
      return;
      j = i;
    }
  }
  
  private void a(Calendar paramCalendar)
  {
    this.al.setText(StringUtils.a(paramCalendar, i()));
  }
  
  private void a(boolean paramBoolean, LinearLayout paramLinearLayout, View paramView)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)i().getSystemService("layout_inflater");
    if (this.e)
    {
      View localView2 = localLayoutInflater.inflate(2130903068, null);
      paramLinearLayout.addView(localView2);
      this.ar = ((Button)paramView.findViewById(2131296382));
      this.as = ((Button)paramView.findViewById(2131296383));
      this.aw = localView2;
      TextView localTextView4 = (TextView)this.aw.findViewById(2131296401);
      TextView localTextView5 = (TextView)this.aw.findViewById(2131296402);
      String str3 = CalendarUtils.a(this.d.a().b().get(7), i());
      localTextView4.setText(this.d.a().b().get(5) + " ");
      localTextView5.setText(str3);
      if (CalendarUtils.b(this.d.a().b())) {
        localTextView5.setTextColor(Color.parseColor("#F55600"));
      }
      for (;;)
      {
        if (this.aC != -66) {
          ((ImageView)this.aw.findViewById(2131296403)).setImageResource(this.aC);
        }
        return;
        localTextView5.setTextColor(-1);
      }
    }
    View localView1 = localLayoutInflater.inflate(2130903068, null);
    paramLinearLayout.addView(localView1, new LinearLayout.LayoutParams(-1, -1));
    this.ar = ((Button)paramView.findViewById(2131296382));
    this.as = ((Button)paramView.findViewById(2131296383));
    this.aw = localView1;
    TextView localTextView1 = (TextView)this.aw.findViewById(2131296405);
    String str1;
    TextView localTextView3;
    if ((this.aF == 1) || (this.aF == 2))
    {
      str1 = (int)this.d.d().f() + WeatherCodeUtils.a(this.aF, i()) + "/" + (int)this.d.d().i() + WeatherCodeUtils.a(this.aF, i());
      if (this.d.d().e() != -666.0F) {
        localTextView1.setText(str1);
      }
      ImageView localImageView = (ImageView)this.aw.findViewById(2131296407);
      int i = this.d.d().a();
      if (i != 0) {
        localImageView.setImageResource(i);
      }
      TextView localTextView2 = (TextView)this.aw.findViewById(2131296401);
      localTextView3 = (TextView)this.aw.findViewById(2131296402);
      String str2 = CalendarUtils.a(this.d.a().b().get(7), i());
      localTextView2.setText(this.d.a().b().get(5) + " ");
      localTextView3.setText(str2);
      if (!CalendarUtils.b(this.d.a().b())) {
        break label695;
      }
      localTextView3.setTextColor(Color.parseColor("#F55600"));
    }
    for (;;)
    {
      ((ImageView)this.aw.findViewById(2131296403)).setImageResource(this.d.d().j());
      return;
      str1 = (int)this.d.d().e() + WeatherCodeUtils.a(this.aF, i()) + "/" + (int)this.d.d().h() + WeatherCodeUtils.a(this.aF, i());
      break;
      label695:
      localTextView3.setTextColor(-1);
    }
  }
  
  private void c(Location paramLocation)
  {
    ImageView localImageView = (ImageView)this.aw.findViewById(2131296403);
    Moon localMoon = AstronomyTools.a(this.d.a().b());
    this.aC = WeatherCodeUtils.a(localMoon.b(), localMoon.a(), paramLocation);
    localImageView.setImageResource(this.aC);
  }
  
  private void d(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse("file://" + paramString), "image/*");
    a(localIntent);
  }
  
  public void P()
  {
    this.aJ = null;
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    if (localIntent.resolveActivity(i().getPackageManager()) != null)
    {
      Time localTime = new Time();
      localTime.setToNow();
      this.aJ = new File(i().getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), localTime.format("%Y%m%d%H%M%S") + ".jpg");
      if (this.aJ != null)
      {
        localIntent.addFlags(524288);
        localIntent.putExtra("output", Uri.fromFile(this.aJ));
        a(localIntent, 1);
      }
    }
    if (this.aJ == null) {
      Toast.makeText(i(), 2131427542, 1).show();
    }
  }
  
  public void Q()
  {
    a(this.ao);
    a(this.an);
    U();
  }
  
  public boolean R()
  {
    RelativeLayout localRelativeLayout = this.aA;
    boolean bool = false;
    if (localRelativeLayout != null)
    {
      int i = this.aA.getVisibility();
      bool = false;
      if (i == 0) {
        bool = true;
      }
    }
    return bool;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    a(paramViewGroup, true);
    S();
    this.an.clear();
    this.aH = false;
    this.az = new GregorianCalendar();
    Bundle localBundle = h();
    this.d = ((NoteEntry)localBundle.get("edit_note"));
    this.e = localBundle.getBoolean("search_for_location");
    this.f = localBundle.getString("new_photo");
    this.aB = paramLayoutInflater.inflate(2130903063, null);
    if (this.d.d() == null)
    {
      this.aA = ((RelativeLayout)this.aB.findViewById(2131296384));
      this.aA.setVisibility(0);
      this.aA.startAnimation(AnimationUtils.loadAnimation(i(), 2130968576));
      if ((!ConnectionCheckUtils.a(i())) || (!ConnectionCheckUtils.b(i()))) {
        this.aA.setVisibility(8);
      }
    }
    this.al = ((TextView)this.aB.findViewById(2131296371));
    this.al.setOnClickListener(this);
    this.am = ((TextView)this.aB.findViewById(2131296278));
    a(this.d.a().b());
    this.aI = this.d.a().b();
    this.aj = ((EditText)this.aB.findViewById(2131296374));
    this.ak = ((CustomAutoCompleteEditText)this.aB.findViewById(2131296379));
    this.ak.setOnKeyboardBackListener(this);
    if (this.i) {
      this.ak.requestFocus();
    }
    this.aj.setImeOptions(268435462);
    this.ak.setImeOptions(268435462);
    this.ax = ((LinearLayout)this.aB.findViewById(2131296381));
    if (!ConnectionCheckUtils.a(i())) {
      this.aK = false;
    }
    if ((this.d.a().b().get(1) != this.az.get(1)) || (this.d.a().b().get(6) != this.az.get(6))) {
      this.aK = false;
    }
    a(this.aK, this.ax, this.aB);
    this.aD = ((ImageView)this.aB.findViewById(2131296377));
    this.aE = ((ImageView)this.aB.findViewById(2131296378));
    this.ar = ((Button)this.aB.findViewById(2131296382));
    this.ar.setOnClickListener(this);
    this.ar.setId(4);
    this.as = ((Button)this.aB.findViewById(2131296383));
    this.as.setOnClickListener(this);
    this.as.setId(5);
    this.at = this.aB.findViewById(2131296372);
    this.au = this.aB.findViewById(2131296278);
    this.at.setOnClickListener(this);
    this.au.setOnClickListener(this);
    this.at.setId(9);
    this.au.setId(9);
    Location localLocation = new Location("loc");
    if (this.d.b() != null)
    {
      localLocation.setLatitude(this.d.b().c());
      localLocation.setLongitude(this.d.b().e());
      localLocation.setProvider(this.d.b().b());
    }
    this.at.setTag(localLocation);
    this.au.setTag(localLocation);
    this.aq = ((LinearLayout)this.aB.findViewById(2131296376));
    ((CustomHorizontalScrollView)this.aB.findViewById(2131296375)).setScrollViewListener(this);
    this.aj.setText(this.d.a().c());
    this.ak.setText(this.d.a().a());
    if (this.e)
    {
      this.b = LocationHelperSingleton.a(i());
      this.b.a(this);
      this.d.a().b().setFirstDayOfWeek(2);
      if ((this.f != null) && (this.f.length() > 0)) {
        a(this.f);
      }
      a(this.aq);
      return this.aB;
    }
    if (this.d.b() != null) {
      if ((this.d.b().b() != null) && (!this.d.b().b().equals(""))) {
        break label952;
      }
    }
    label952:
    for (String str = this.d.b().c() + " " + this.d.b().e();; str = this.d.b().b())
    {
      this.am.setText(str);
      if ((this.d.c() == null) || (this.d.c().size() == 0)) {
        break;
      }
      this.ao = this.d.c();
      break;
    }
  }
  
  public EditText a()
  {
    return this.ak;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1) {
        break label46;
      }
      ImageUtils.a(this.aJ.getAbsolutePath(), 200, 200);
      a(this.aJ.getAbsolutePath());
    }
    for (;;)
    {
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      label46:
      if (this.aJ != null)
      {
        this.aJ.delete();
        this.aJ = null;
      }
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    try
    {
      this.a = ((LogEditFragment.OnLogEditListener)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(paramActivity.toString() + " must implement OnLogEditListener");
    }
  }
  
  public void a(Location paramLocation)
  {
    this.av = paramLocation;
    this.at.setTag(paramLocation);
    this.au.setTag(paramLocation);
    this.am.setText("" + paramLocation.getLatitude() + " " + paramLocation.getLongitude());
    if (i() != null)
    {
      if ((!this.e) || (!this.aK)) {
        break label99;
      }
      a(paramLocation, this.aw);
    }
    for (;;)
    {
      c(paramLocation);
      return;
      label99:
      b();
    }
  }
  
  public void a(CustomAutoCompleteEditText paramCustomAutoCompleteEditText)
  {
    this.a.i();
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2)
  {
    this.c = (paramInt1 / paramInt2);
    if (this.g)
    {
      if (paramInt1 / paramInt2 > 1 + (this.ao.size() + this.an.size())) {
        this.aE.setVisibility(8);
      }
      this.g = false;
    }
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != paramInt3)
    {
      if (paramInt1 + paramCustomHorizontalScrollView.getWidth() >= paramCustomHorizontalScrollView.getChildAt(0).getWidth())
      {
        this.aD.setVisibility(0);
        this.aE.setVisibility(8);
      }
    }
    else {
      return;
    }
    if (paramInt1 <= 10)
    {
      this.aD.setVisibility(8);
      this.aE.setVisibility(0);
      return;
    }
    this.aD.setVisibility(0);
    this.aE.setVisibility(0);
  }
  
  public void a(String paramString)
  {
    PhotoData localPhotoData;
    if ((paramString == null) && (this.aJ != null)) {
      localPhotoData = new PhotoData(this.aJ.getAbsolutePath());
    }
    for (;;)
    {
      this.an.add(localPhotoData);
      a(this.aq);
      return;
      localPhotoData = null;
      if (paramString != null) {
        localPhotoData = new PhotoData(paramString);
      }
    }
  }
  
  public void a(List<PhotoData> paramList)
  {
    if (paramList != null) {
      for (int i = 0; i < paramList.size(); i++) {
        c(((PhotoData)paramList.get(i)).a());
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.e) {
        U();
      }
      a(this.an);
      return;
    }
    U();
  }
  
  public boolean a(Object paramObject)
  {
    this.ap.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.an.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.an.get(i)).a().equals(paramObject)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public void b()
  {
    if ((this.aA != null) && (this.aA.getVisibility() == 0))
    {
      if (i() != null) {
        this.aA.startAnimation(AnimationUtils.loadAnimation(i(), 2130968577));
      }
      this.aA.setVisibility(8);
    }
  }
  
  public void b(Location paramLocation)
  {
    this.d.a(new LocationData(null, paramLocation.getProvider(), paramLocation.getLatitude(), -1, paramLocation.getLongitude()));
    if (paramLocation.getProvider().equals(""))
    {
      this.am.setText("" + paramLocation.getLatitude() + " " + paramLocation.getLongitude());
      return;
    }
    this.am.setText("" + paramLocation.getProvider());
  }
  
  public void b(String paramString)
  {
    a(this.aq);
    for (int i = 0; i < this.ao.size(); i++) {
      if (((PhotoData)this.ao.get(i)).a().equals(paramString))
      {
        this.ao.remove(i);
        a(this.aq);
      }
    }
  }
  
  public boolean b(Object paramObject)
  {
    this.ap.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.ao.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.ao.get(i)).a().equals(paramObject)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public void c(String paramString)
  {
    FileUtils.b(paramString);
    FileUtils.b(FileUtils.a(paramString));
  }
  
  public boolean c(Object paramObject)
  {
    this.ap.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.an.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.an.get(i)).a().equals(paramObject))
        {
          this.an.remove(i);
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public boolean d(Object paramObject)
  {
    this.ap.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.ao.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.ao.get(i)).a().equals(paramObject))
        {
          this.ao.remove(i);
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    for (;;)
    {
      if ((paramView == this.aj) || (paramView == this.ak)) {
        b();
      }
      if (paramView == this.al) {}
      return;
      T();
      if (this.aH)
      {
        this.a.a(this.d, this.e, this.aI);
      }
      else
      {
        this.a.a(this.d, this.e, null);
        continue;
        a(null);
        continue;
        b();
        this.a.g();
        continue;
        b();
        this.a.a(paramView.getTag());
        d((String)paramView.getTag());
        continue;
        if (this.c > this.an.size() + this.ao.size()) {
          this.aE.setVisibility(8);
        }
        b();
        if ((a(paramView.getTag())) || (b(paramView.getTag()))) {
          a(paramView);
        }
        this.a.b(paramView.getTag());
      }
    }
  }
  
  public void v()
  {
    if (this.e) {
      this.b.b(this);
    }
    super.v();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogEditFragment
 * JD-Core Version:    0.7.0.1
 */