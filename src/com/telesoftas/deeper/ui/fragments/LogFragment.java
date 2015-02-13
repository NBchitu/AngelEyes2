package com.telesoftas.deeper.ui.fragments;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.telesoftas.deeper.database.DeeperContentProvider;
import com.telesoftas.deeper.ui.views.LogAdapter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LogFragment
  extends WrapperFragment
  implements LoaderManager.LoaderCallbacks<Cursor>, View.OnClickListener
{
  public static int a = 86400000;
  private ImageView aj;
  private int ak;
  private int al;
  private int am = -1;
  private int an = 0;
  private LogFragment.OnLogListener b;
  private LogAdapter c;
  private Calendar d;
  private String e;
  private ListView f;
  private RelativeLayout g;
  
  private void P()
  {
    LinearLayout localLinearLayout = (LinearLayout)this.f.getChildAt(0);
    int j;
    if (localLinearLayout != null)
    {
      int i = Math.abs(localLinearLayout.getTop());
      j = Math.abs(localLinearLayout.getBottom());
      if (i >= j) {
        this.f.smoothScrollBy(1 + ((LinearLayout)this.f.getChildAt(0)).getBottom(), i * 3);
      }
    }
    else
    {
      return;
    }
    this.f.smoothScrollBy(1 + ((LinearLayout)this.f.getChildAt(0)).getTop(), j * 3);
  }
  
  private String a(Calendar paramCalendar)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(this.d.get(1), this.d.get(2), this.d.get(5));
    long l1 = localGregorianCalendar.getTimeInMillis();
    localGregorianCalendar.add(5, 1);
    long l2 = localGregorianCalendar.getTimeInMillis();
    return "note.date >= " + l1 + " AND " + "note" + "." + "date" + " < " + l2;
  }
  
  private void a(ListView paramListView, Cursor paramCursor, Calendar paramCalendar)
  {
    paramCursor.moveToFirst();
    int i;
    for (;;)
    {
      boolean bool = paramCursor.isAfterLast();
      i = 0;
      if (!bool)
      {
        long l = paramCursor.getLong(3);
        if ((l >= paramCalendar.getTimeInMillis()) && (l <= paramCalendar.getTimeInMillis() + (-1 + a))) {
          i = paramCursor.getPosition();
        }
      }
      else
      {
        if (!this.i) {
          break;
        }
        if (i > 0) {
          i--;
        }
        paramListView.setSelection(i);
        return;
      }
      paramCursor.moveToNext();
    }
    paramListView.setSelection(i);
  }
  
  private void b()
  {
    int i = this.am;
    this.f.postDelayed(new LogFragment.4(this, i), 750L);
  }
  
  private void b(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse("file://" + paramString), "image/*");
    i().startActivity(localIntent);
  }
  
  private String c(String paramString)
  {
    return "note.title LIKE '%" + paramString + "%' OR " + "note" + "." + "body" + " LIKE '%" + paramString + "%' OR " + "note_location" + "." + "address" + " LIKE '%" + paramString + "%'";
  }
  
  public Loader<Cursor> a(int paramInt, Bundle paramBundle)
  {
    String[] arrayOfString = { "note_id", "body", "title", "date", "address", "latitude", "longitude", "high_temp_c", "high_temp_f", "low_temp_c", "low_temp_f", "cloud_condition_type", "moon_phase_type" };
    String str2;
    String str1;
    if (this.e != null)
    {
      str2 = c(this.e);
      str1 = null;
      if (this.d == null) {
        break label189;
      }
      str3 = a(this.d);
      if (str2 == null) {}
    }
    label189:
    for (String str3 = "(" + str2 + ") AND (" + str3 + ")";; str3 = str2)
    {
      return new CursorLoader(i(), DeeperContentProvider.a, arrayOfString, str3, null, str1);
      str1 = "note.date DESC";
      str2 = null;
      break;
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)paramLayoutInflater.inflate(2130903064, null);
    this.f = ((ListView)localRelativeLayout.findViewById(2131296386));
    this.g = ((RelativeLayout)localRelativeLayout.findViewById(2131296387));
    this.aj = ((ImageView)localRelativeLayout.findViewById(2131296351));
    this.aj.setOnClickListener(this);
    a(paramViewGroup, false);
    paramViewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new LogFragment.1(this, paramViewGroup));
    this.f.setHorizontalFadingEdgeEnabled(false);
    this.f.setVerticalFadingEdgeEnabled(false);
    this.f.setAdapter(this.c);
    this.f.setCacheColorHint(Color.parseColor("#00000000"));
    GestureDetector localGestureDetector = new GestureDetector(i(), new LogFragment.MyOnGestureListener(this));
    this.f.setOnTouchListener(new LogFragment.2(this, localGestureDetector));
    this.f.setOnScrollListener(new LogFragment.3(this));
    return localRelativeLayout;
  }
  
  public void a()
  {
    if (this.i) {
      this.c.a(true);
    }
    r().b(1).p();
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    try
    {
      this.b = ((LogFragment.OnLogListener)paramActivity);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(paramActivity.toString() + " must implement OnLogListener");
    }
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.ak = paramBundle.getInt("container_height");
      this.al = paramBundle.getInt("container_width");
    }
    Bundle localBundle = h();
    this.d = ((Calendar)localBundle.getSerializable("selected_date"));
    this.e = localBundle.getString("search_phrase");
    r().a(1, null, this);
    this.c = new LogAdapter(i(), null, 2, this, this.h, this.i);
    this.c.a(this.ak);
    this.c.b(this.al);
  }
  
  public void a(Loader<Cursor> paramLoader)
  {
    this.c.b(null);
  }
  
  public void a(Loader<Cursor> paramLoader, Cursor paramCursor)
  {
    if (paramCursor.getCount() == 0) {
      this.g.setVisibility(0);
    }
    for (;;)
    {
      if (this.d != null) {
        a(this.f, paramCursor, this.d);
      }
      this.c.b(paramCursor);
      return;
      this.g.setVisibility(4);
    }
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
    r().b(1, null, this);
  }
  
  public void e(Bundle paramBundle)
  {
    paramBundle.putInt("container_height", this.ak);
    paramBundle.putInt("container_width", this.al);
    super.e(paramBundle);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    for (;;)
    {
      if (paramView == this.aj) {
        this.b.h();
      }
      return;
      this.b.a((GregorianCalendar)paramView.getTag());
      continue;
      this.b.b((GregorianCalendar)paramView.getTag());
      continue;
      b((String)paramView.getTag());
      continue;
      this.b.a((Location)paramView.getTag());
    }
  }
  
  public void t()
  {
    a();
    super.t();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment
 * JD-Core Version:    0.7.0.1
 */