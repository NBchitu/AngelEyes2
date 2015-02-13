package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
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
import com.fridaylab.deeper.ui.ViewTools;
import com.fridaylab.util.Sharing;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.database.PhotoData;
import com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText;
import com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText.OnKeybordBackListener;
import com.telesoftas.deeper.ui.views.CustomHorizontalScrollView;
import com.telesoftas.deeper.ui.views.ScrollViewListener;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.FileUtils;
import com.telesoftas.utilities.ImageUtils;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.location.GeodecodingOperation.GeodecodingListener;
import com.telesoftas.utilities.location.LocationHelperSingleton;
import com.telesoftas.utilities.location.LocationListenerInterface;
import com.telesoftas.utilities.social.PostHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LogShareFragment
  extends WrapperFragment
  implements View.OnClickListener, CustomAutoCompleteEditText.OnKeybordBackListener, ScrollViewListener, GeodecodingOperation.GeodecodingListener, LocationListenerInterface
{
  private LogShareFragment$OnLogShareListener a;
  private TextView aj;
  private TextView ak;
  private List<PhotoData> al = new ArrayList();
  private final List<PhotoData> am = new ArrayList();
  private final List<String> an = new ArrayList();
  private final Set<String> ao = new HashSet();
  private LinearLayout ap;
  private Button aq;
  private View ar;
  private View as;
  private View at;
  private LinearLayout au;
  private RelativeLayout av;
  private View aw;
  private ImageView ax;
  private ImageView ay;
  private File az = null;
  private LocationHelperSingleton b;
  private NoteEntry c;
  private boolean d = true;
  private boolean e = false;
  private int f = 0;
  private CustomAutoCompleteEditText g;
  
  private void P()
  {
    if ((this.av != null) && (this.av.getVisibility() == 0))
    {
      if (i() != null) {
        this.av.startAnimation(AnimationUtils.loadAnimation(i(), 2130968577));
      }
      this.av.setVisibility(8);
    }
  }
  
  public static Bitmap a(String paramString, int paramInt1, int paramInt2)
  {
    return BitmapFactory.decodeFile(FileUtils.a(paramString));
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(i().getString(paramInt1)).setCancelable(false).setMessage(i().getString(paramInt2)).setPositiveButton(a(17039370), null);
    localBuilder.create().show();
  }
  
  private void a(View paramView)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(a(2131427485)).setCancelable(false).setPositiveButton(a(17039379), new LogShareFragment.2(this, paramView)).setNegativeButton(a(17039360), new LogShareFragment.1(this));
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
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(j / k, -1);
      if (this.e)
      {
        ImageView localImageView1 = new ImageView(i());
        localImageView1.setId(23);
        localImageView1.setImageResource(2130837686);
        localLayoutParams1.setMargins(0, 0, DisplayUtils.a(5.0F, i()), 0);
        localImageView1.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        localImageView1.setBackgroundResource(2130837521);
        localImageView1.setLayoutParams(localLayoutParams1);
        localImageView1.setTag(Integer.valueOf(-1));
        localImageView1.setOnClickListener(this);
        localRelativeLayout1.addView(localImageView1);
        localRelativeLayout1.setLayoutParams(localLayoutParams1);
        paramLinearLayout.addView(localRelativeLayout1);
        if (this.am.size() + this.al.size() < 1)
        {
          TextView localTextView = new TextView(i());
          localTextView.setText(2131427545);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams2.gravity = 16;
          localTextView.setLayoutParams(localLayoutParams2);
          localTextView.setLines(1);
          localTextView.setSingleLine();
          localTextView.setTextAppearance(i(), 16842817);
          localTextView.setTextColor(-1);
          localTextView.setTextSize(18.0F);
          paramLinearLayout.addView(localTextView);
        }
      }
      ArrayList localArrayList = new ArrayList();
      for (int m = this.am.size(); m > 0; m--) {
        localArrayList.add(((PhotoData)this.am.get(m - 1)).a());
      }
      for (int n = this.al.size(); n > 0; n--) {
        localArrayList.add(((PhotoData)this.al.get(n - 1)).a());
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
          LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(j / k, -1);
          localLayoutParams3.setMargins(DisplayUtils.a(5.0F, i()), 0, DisplayUtils.a(5.0F, i()), 0);
          localLayoutParams3.gravity = 16;
          localRelativeLayout2.setBackgroundResource(2130837524);
          localImageView2.setTag(localArrayList.get(i1));
          localImageView2.setId(22);
          localImageView2.setOnClickListener(this);
          localImageView2.setLayoutParams(localLayoutParams3);
          localRelativeLayout2.setLayoutParams(localLayoutParams3);
          localRelativeLayout2.setPadding(DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()), DisplayUtils.a(10.0F, i()));
          localRelativeLayout2.addView(localImageView2);
          if (this.e)
          {
            ImageView localImageView3 = new ImageView(i());
            localImageView3.setImageResource(2130837555);
            RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            localLayoutParams.addRule(7, localImageView2.getId());
            int i2 = i().getResources().getDimensionPixelOffset(2131230799);
            localLayoutParams.setMargins(0, i2, i2, 0);
            localImageView3.setTag(localArrayList.get(i1));
            localImageView3.setId(25);
            localImageView3.setOnClickListener(this);
            localRelativeLayout2.addView(localImageView3, localLayoutParams);
          }
          localRelativeLayout2.setLayoutParams(localLayoutParams3);
          paramLinearLayout.addView(localRelativeLayout2);
          i1++;
          break;
          localImageView2.setImageResource(2130837555);
        }
      }
      if (this.f < 1 + (this.al.size() + this.am.size())) {
        this.ay.setVisibility(0);
      }
      return;
      j = i;
    }
  }
  
  private void a(RelativeLayout paramRelativeLayout)
  {
    paramRelativeLayout.setBackgroundResource(2130837523);
    paramRelativeLayout.setTag("selected");
    int i = DisplayUtils.a(10.0F, i());
    paramRelativeLayout.setPadding(i, i, i, i);
  }
  
  private void a(boolean paramBoolean, String paramString)
  {
    Object localObject;
    int k;
    if (paramBoolean)
    {
      if (!ConnectionCheckUtils.a(i())) {
        return;
      }
      if (!this.ao.isEmpty())
      {
        if (this.ao.size() != 1) {
          break label446;
        }
        localObject = (String)this.ao.iterator().next();
        k = 1;
      }
    }
    for (;;)
    {
      int j;
      if ((localObject == null) && (k != 0))
      {
        a(2131427566, 2131427567);
        return;
        int i = this.am.size() + this.al.size();
        if (i > 0)
        {
          j = 1;
          label112:
          if (i != 1) {
            break label436;
          }
          if (this.am.size() <= 0) {
            break label165;
          }
        }
        label165:
        for (String str = ((PhotoData)this.am.get(0)).a();; str = ((PhotoData)this.al.get(0)).a())
        {
          localObject = str;
          k = j;
          break;
          j = 0;
          break label112;
        }
      }
      else
      {
        if ((localObject == null) && (TextUtils.isEmpty(paramString)))
        {
          a(2131427413, 2131427570);
          return;
        }
        ProgressDialog localProgressDialog = new ProgressDialog(i());
        new PostHelper(i()).a(i(), localProgressDialog, paramString, (String)localObject, null);
        b(3);
        return;
        HashSet localHashSet = new HashSet(this.ao);
        if (localHashSet.isEmpty())
        {
          Iterator localIterator1 = this.am.iterator();
          while (localIterator1.hasNext()) {
            localHashSet.add(((PhotoData)localIterator1.next()).a());
          }
          Iterator localIterator2 = this.al.iterator();
          while (localIterator2.hasNext()) {
            localHashSet.add(((PhotoData)localIterator2.next()).a());
          }
        }
        if ((localHashSet.isEmpty()) && (TextUtils.isEmpty(paramString)))
        {
          a(2131427413, 2131427570);
          return;
        }
        a(Sharing.a(paramString, (String[])localHashSet.toArray(new String[0])));
        EasyTracker.a(i()).a(MapBuilder.a("Social", "share", "intent", null).a());
        return;
      }
      label436:
      k = j;
      localObject = null;
      continue;
      label446:
      k = 1;
      localObject = null;
    }
  }
  
  private void b(int paramInt)
  {
    SharedPreferences.Editor localEditor = i().getSharedPreferences("prefs", 0).edit();
    localEditor.putInt("last_share", paramInt);
    localEditor.apply();
  }
  
  private void b(RelativeLayout paramRelativeLayout)
  {
    paramRelativeLayout.setBackgroundResource(2130837521);
    paramRelativeLayout.setTag(null);
    int i = DisplayUtils.a(10.0F, i());
    paramRelativeLayout.setPadding(i, i, i, i);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    a(paramViewGroup, true);
    this.am.clear();
    Bundle localBundle = h();
    this.c = ((NoteEntry)localBundle.get("edit_note"));
    this.e = localBundle.getBoolean("search_for_location");
    boolean bool = localBundle.getBoolean("phone_sharing_activity");
    this.aw = paramLayoutInflater.inflate(2130903063, null);
    ((CustomHorizontalScrollView)this.aw.findViewById(2131296375)).setScrollViewListener(this);
    this.aj = ((TextView)this.aw.findViewById(2131296371));
    String str1 = StringUtils.a(this.c.a().b(), i());
    this.aj.setText(str1);
    this.ak = ((TextView)this.aw.findViewById(2131296278));
    this.g = ((CustomAutoCompleteEditText)this.aw.findViewById(2131296379));
    this.g.setOnKeyboardBackListener(this);
    if (this.i) {
      this.g.requestFocus();
    }
    this.ax = ((ImageView)this.aw.findViewById(2131296377));
    this.ay = ((ImageView)this.aw.findViewById(2131296378));
    this.g.setImeOptions(268435462);
    this.au = ((LinearLayout)this.aw.findViewById(2131296380));
    this.aw.findViewById(2131296373).setVisibility(8);
    this.aw.findViewById(2131296374).setVisibility(8);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.ak.setLayoutParams(localLayoutParams);
    this.au.removeAllViews();
    paramLayoutInflater.inflate(2130903065, this.au, true);
    this.aq = ((Button)this.aw.findViewById(2131296390));
    this.aq.setOnClickListener(this);
    this.aq.setId(21);
    this.ar = this.aw.findViewById(2131296389);
    this.ar.setOnClickListener(this);
    this.ar.setId(26);
    this.as = this.aw.findViewById(2131296372);
    this.at = this.aw.findViewById(2131296278);
    this.as.setOnClickListener(this);
    this.at.setOnClickListener(this);
    this.as.setId(24);
    this.at.setId(24);
    Location localLocation = new Location("loc");
    if (this.c.b() != null)
    {
      localLocation.setLatitude(this.c.b().c());
      localLocation.setLongitude(this.c.b().e());
      localLocation.setProvider(this.c.b().b());
    }
    this.as.setTag(localLocation);
    this.at.setTag(localLocation);
    this.ap = ((LinearLayout)this.aw.findViewById(2131296376));
    this.g.setText(this.c.a().a());
    if (bool) {
      this.g.requestFocus();
    }
    if (this.e)
    {
      this.b = LocationHelperSingleton.a(i());
      this.b.a(this);
    }
    while (this.c.b() == null)
    {
      if ((this.c.c() != null) && (this.c.c().size() != 0)) {
        this.al = this.c.c();
      }
      this.c.a().b().setFirstDayOfWeek(2);
      a(this.ap);
      return this.aw;
    }
    if ((this.c.b().b() == null) || (this.c.b().b().equals(""))) {}
    for (String str2 = this.c.b().c() + " " + this.c.b().e();; str2 = this.c.b().b())
    {
      this.ak.setText(str2);
      break;
    }
  }
  
  public void a()
  {
    this.az = null;
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    if (localIntent.resolveActivity(i().getPackageManager()) != null)
    {
      Time localTime = new Time();
      localTime.setToNow();
      this.az = new File(i().getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), localTime.format("%Y%m%d%H%M%S") + ".jpg");
      if (this.az != null)
      {
        localIntent.addFlags(524288);
        localIntent.putExtra("output", Uri.fromFile(this.az));
        a(localIntent, 1);
      }
    }
    if (this.az == null) {
      Toast.makeText(i(), 2131427542, 1).show();
    }
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1) {
        break label46;
      }
      ImageUtils.a(this.az.getAbsolutePath(), 200, 200);
      b(this.az.getAbsolutePath());
    }
    for (;;)
    {
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      label46:
      if (this.az != null)
      {
        this.az.delete();
        this.az = null;
      }
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    try
    {
      this.a = ((LogShareFragment.OnLogShareListener)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(paramActivity.toString() + " must implement OnLogShareListener");
    }
  }
  
  public void a(Location paramLocation)
  {
    this.c.a(new LocationData("", "", paramLocation.getLatitude(), -1, paramLocation.getLongitude()));
    this.ak.setText(paramLocation.getLatitude() + " " + paramLocation.getLongitude());
  }
  
  public void a(CustomAutoCompleteEditText paramCustomAutoCompleteEditText)
  {
    this.a.i();
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2)
  {
    this.f = (paramInt1 / paramInt2);
    if (this.d)
    {
      if (paramInt1 / paramInt2 > this.al.size()) {
        this.ay.setVisibility(8);
      }
      this.d = false;
    }
  }
  
  public void a(CustomHorizontalScrollView paramCustomHorizontalScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != paramInt3)
    {
      if (paramInt1 + paramCustomHorizontalScrollView.getWidth() >= paramCustomHorizontalScrollView.getChildAt(0).getWidth())
      {
        this.ax.setVisibility(0);
        this.ay.setVisibility(8);
      }
    }
    else {
      return;
    }
    if (paramInt1 <= 10)
    {
      this.ax.setVisibility(8);
      this.ay.setVisibility(0);
      return;
    }
    this.ax.setVisibility(0);
    this.ay.setVisibility(0);
  }
  
  public void a(String paramString)
  {
    a(this.ap);
    for (int i = 0; i < this.al.size(); i++) {
      if (((PhotoData)this.al.get(i)).a().equals(paramString))
      {
        this.al.remove(i);
        a(this.ap);
      }
    }
  }
  
  public boolean a(Object paramObject)
  {
    this.an.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.am.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.am.get(i)).a().equals(paramObject)) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public EditText b()
  {
    return this.g;
  }
  
  public void b(Location paramLocation)
  {
    this.c.a(new LocationData(paramLocation.getProvider(), paramLocation.getProvider(), paramLocation.getLatitude(), -1, paramLocation.getLongitude()));
    if (paramLocation.getProvider().equals(""))
    {
      this.ak.setText(paramLocation.getLatitude() + " " + paramLocation.getLongitude());
      return;
    }
    this.ak.setText(paramLocation.getProvider());
  }
  
  public void b(String paramString)
  {
    if ((paramString == null) && (this.az == null)) {}
    for (;;)
    {
      return;
      PhotoData localPhotoData;
      if ((paramString == null) && (this.az != null)) {
        localPhotoData = new PhotoData(this.az.getAbsolutePath());
      }
      while ((this.am.size() <= 0) || (!((PhotoData)this.am.get(-1 + this.am.size())).a().equals(this.az.getAbsolutePath())))
      {
        this.am.add(localPhotoData);
        a(this.ap);
        return;
        if (paramString != null) {
          localPhotoData = new PhotoData(paramString);
        } else {
          localPhotoData = null;
        }
      }
    }
  }
  
  public boolean b(Object paramObject)
  {
    this.an.add((String)paramObject);
    for (int i = 0;; i++)
    {
      int j = this.am.size();
      boolean bool = false;
      if (i < j)
      {
        if (((PhotoData)this.am.get(i)).a().equals(paramObject))
        {
          this.am.remove(i);
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
    do
    {
      return;
      a(true, this.g.getText().toString());
      return;
      a(false, this.g.getText().toString());
      return;
      P();
      this.a.g();
      return;
      P();
      RelativeLayout localRelativeLayout = (RelativeLayout)paramView.getParent();
      if (localRelativeLayout.getTag() == null)
      {
        a(localRelativeLayout);
        this.ao.add(paramView.getTag().toString());
        return;
      }
      b(localRelativeLayout);
      this.ao.remove(paramView.getTag().toString());
      return;
      if (this.f > this.am.size() + this.al.size()) {
        this.ay.setVisibility(8);
      }
      P();
    } while (!a(paramView.getTag()));
    a(paramView);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogShareFragment
 * JD-Core Version:    0.7.0.1
 */