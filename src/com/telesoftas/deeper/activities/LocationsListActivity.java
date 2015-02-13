package com.telesoftas.deeper.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.crashlytics.android.Crashlytics;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.deeper.SearchBarBuilder;
import java.util.ArrayList;

public class LocationsListActivity
  extends WrapperActivity
  implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener
{
  public static int[] n = new int[8];
  public static int[] o = new int[8];
  private int A = -1;
  private Runnable B = new LocationsListActivity.3(this);
  private ListView p;
  private RelativeLayout q;
  private RelativeLayout r;
  private ProgressDialog s = null;
  private ArrayList<LocationData> t = null;
  private ArrayList<LocationData> u = null;
  private LocationsListActivity.LocationDataAdapter v;
  private Runnable w;
  private EditText x;
  private Intent y;
  private DeeperDatabase z;
  
  private void g()
  {
    this.p.setVisibility(0);
    this.q.setVisibility(8);
    this.r.setVisibility(8);
  }
  
  private void h()
  {
    this.p.setVisibility(8);
    this.q.setVisibility(0);
    this.r.setVisibility(8);
  }
  
  private void i()
  {
    this.p.setVisibility(8);
    this.q.setVisibility(8);
    this.r.setVisibility(0);
  }
  
  private void j()
  {
    int i;
    try
    {
      new ArrayList();
      this.t = new ArrayList();
      this.u = new ArrayList();
      if (this.A == 2)
      {
        ArrayList localArrayList3 = this.z.d(6);
        this.t.addAll(localArrayList3);
        this.u.addAll(localArrayList3);
      }
      for (;;)
      {
        runOnUiThread(this.B);
        return;
        if (this.A != 3) {
          break;
        }
        ArrayList localArrayList2 = this.z.d(1);
        this.t.addAll(localArrayList2);
        this.u.addAll(localArrayList2);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Crashlytics.a(localException);
      }
      i = 0;
    }
    while (i < 8)
    {
      ArrayList localArrayList1 = this.z.d(i);
      this.t.addAll(localArrayList1);
      this.u.addAll(localArrayList1);
      i++;
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    if (paramInt2 == 0) {
      if (this.t.size() == 1)
      {
        localStateListDrawable.addState(new int[] { 16842919 }, getResources().getDrawable(2130837808));
        localStateListDrawable.addState(new int[] { 16842908 }, getResources().getDrawable(2130837808));
        localStateListDrawable.addState(new int[0], getResources().getDrawable(2130837710));
      }
    }
    for (;;)
    {
      paramView.setBackgroundDrawable(localStateListDrawable);
      return;
      localStateListDrawable.addState(new int[] { 16842919 }, getResources().getDrawable(2130837809));
      localStateListDrawable.addState(new int[] { 16842908 }, getResources().getDrawable(2130837809));
      localStateListDrawable.addState(new int[0], getResources().getDrawable(2130837711));
      continue;
      if (paramInt2 == -1 + this.t.size())
      {
        localStateListDrawable.addState(new int[] { 16842919 }, getResources().getDrawable(2130837806));
        localStateListDrawable.addState(new int[] { 16842908 }, getResources().getDrawable(2130837806));
        localStateListDrawable.addState(new int[0], getResources().getDrawable(2130837708));
      }
      else
      {
        localStateListDrawable.addState(new int[] { 16842919 }, getResources().getDrawable(2130837807));
        localStateListDrawable.addState(new int[] { 16842908 }, getResources().getDrawable(2130837807));
        localStateListDrawable.addState(new int[0], getResources().getDrawable(2130837709));
      }
    }
  }
  
  public void onBackPressed()
  {
    setResult(-1, this.y);
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    n[0] = 2130837665;
    n[1] = 2130837663;
    n[2] = 2130837667;
    n[3] = 2130837661;
    n[4] = 2130837662;
    n[5] = 2130837664;
    n[6] = 2130837666;
    n[7] = 2130837659;
    o[0] = 2131427501;
    o[1] = 2131427499;
    o[2] = 2131427503;
    o[3] = 2131427497;
    o[4] = 2131427498;
    o[5] = 2131427500;
    o[6] = 2131427502;
    o[7] = 2131427495;
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {
      this.A = localBundle.getInt("started_by");
    }
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903059);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131296275);
    SearchBarBuilder localSearchBarBuilder = new SearchBarBuilder(this);
    localSearchBarBuilder.a();
    localLinearLayout.addView(localSearchBarBuilder.i());
    this.x = ((AutoCompleteTextView)localSearchBarBuilder.i().findViewById(1).findViewById(2131296344));
    this.p = ((ListView)findViewById(2131296346));
    this.p.setVerticalFadingEdgeEnabled(false);
    this.q = ((RelativeLayout)findViewById(2131296347));
    this.r = ((RelativeLayout)findViewById(2131296353));
    this.t = new ArrayList();
    this.v = new LocationsListActivity.LocationDataAdapter(this, this, 2130903060, this.t);
    this.p.setOnItemClickListener(this);
    this.z = this.F;
    this.w = new LocationsListActivity.1(this);
    new Thread(null, this.w, "MagentoBackground").start();
    this.s = ProgressDialog.show(this, "Please wait...", "Retrieving data ...", true);
    this.x.addTextChangedListener(new LocationsListActivity.2(this));
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    LocationData localLocationData = (LocationData)this.t.get(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("location", localLocationData);
    setResult(-1, localIntent);
    finish();
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LocationsListActivity
 * JD-Core Version:    0.7.0.1
 */