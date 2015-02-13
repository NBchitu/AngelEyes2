package com.telesoftas.deeper.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.fridaylab.deeper.ui.ViewTools;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.deeper.ui.views.ObservableScrollView;
import com.telesoftas.deeper.ui.views.Panel;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.deeper.SearchBarBuilder;
import com.telesoftas.utilities.location.GeodecodingOperation;
import com.telesoftas.utilities.location.GeodecodingOperation.GeodecodingListener;
import java.util.ArrayList;
import java.util.Iterator;
import pl.mg6.android.maps.extensions.GoogleMap;
import pl.mg6.android.maps.extensions.GoogleMap.OnMarkerClickListener;
import pl.mg6.android.maps.extensions.Marker;
import pl.mg6.android.maps.extensions.SupportMapFragment;

public class DeeperMapActivity
  extends FragmentActivity
  implements View.OnClickListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, GeodecodingOperation.GeodecodingListener, GoogleMap.OnMarkerClickListener
{
  private static final LocationRequest J = LocationRequest.a().a(5000L).b(16L).a(100);
  public static final int[] n = new int[8];
  public static final int[] o = new int[8];
  public static final String[] p = { "shop", "fishing_place", "wharf", "parking", "picnic", "rent", "weather", "info" };
  private TextView A;
  private EditText B;
  private EditText C;
  private Button D;
  private Button E;
  private int F = -1;
  private boolean G = false;
  private GoogleMap H;
  private GoogleApiClient I;
  private int K = 10;
  private String L = "";
  private boolean M = false;
  private final ArrayList<Marker> N = new ArrayList();
  private final CheckBox[] O = new CheckBox[8];
  private final CheckBox[] P = new CheckBox[8];
  private final LocationData[] Q = new LocationData[8];
  private final View[] R = new View[8];
  private final View[] S = new View[8];
  private ImageView T;
  private int U = 0;
  private LocationData V;
  private DeeperDatabase W;
  private boolean X = false;
  private final GoogleApiClient.ConnectionCallbacks Y = new DeeperMapActivity.2(this);
  private LinearLayout q;
  private View r;
  private View s;
  private View t;
  private Panel u;
  private RelativeLayout v;
  private ImageView w;
  private ImageView x;
  private ImageView y;
  private ImageView z;
  
  private void A()
  {
    this.A.setEnabled(false);
    this.y.setEnabled(false);
    this.w.setEnabled(false);
    this.x.setEnabled(false);
    this.y.setAlpha(100);
    this.w.setAlpha(100);
    this.x.setAlpha(100);
  }
  
  private void B()
  {
    this.A.setEnabled(true);
    this.y.setEnabled(true);
    this.w.setEnabled(true);
    this.x.setEnabled(true);
    this.y.setAlpha(255);
    this.w.setAlpha(255);
    this.x.setAlpha(255);
  }
  
  private boolean C()
  {
    try
    {
      getPackageManager().getPackageInfo("com.android.vending", 1);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
  }
  
  private void a(double paramDouble1, double paramDouble2)
  {
    LatLng localLatLng = new LatLng(paramDouble1, paramDouble2);
    if (this.H != null) {
      this.H.b(CameraUpdateFactory.a(localLatLng, 16.0F));
    }
    e(1);
    if (this.K == 12) {
      c(6);
    }
    if (this.K == 13) {
      c(1);
    }
    t();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i = getResources().getDimensionPixelOffset(2131230741);
    int j = getResources().getDimensionPixelOffset(2131230740);
    int k = 77 * ViewTools.b(this) / 90 - j;
    int m = getResources().getDimensionPixelOffset(2131230734);
    int i1 = ViewTools.a(this) - Math.max(this.u.getWidth(), m);
    if (paramInt1 > i1) {
      paramInt1 = i1;
    }
    int i2 = -10 + (paramInt1 - i);
    if (i2 < 0) {}
    for (int i3 = 0;; i3 = i2)
    {
      int i4 = paramInt2 + 10;
      if (i4 > k) {}
      for (;;)
      {
        if (i > i1) {}
        for (;;)
        {
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(i1, j);
          localLayoutParams.leftMargin = i3;
          localLayoutParams.topMargin = k;
          this.v.removeView(this.t);
          this.v.addView(this.t, localLayoutParams);
          this.v.invalidate();
          A();
          this.T.setVisibility(0);
          return;
          i1 = i;
        }
        k = i4;
      }
    }
  }
  
  private void b(int paramInt)
  {
    new ArrayList();
    MarkerOptions localMarkerOptions = new MarkerOptions();
    localMarkerOptions.a(BitmapDescriptorFactory.a(((BitmapDrawable)getResources().getDrawable(n[paramInt])).getBitmap()));
    ArrayList localArrayList = this.W.d(paramInt);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      LocationData localLocationData = (LocationData)localArrayList.get(i);
      localMarkerOptions.a(new LatLng(localLocationData.c(), localLocationData.e()));
      if (this.H != null)
      {
        Marker localMarker = this.H.a(localMarkerOptions);
        localMarker.a(localLocationData);
        this.N.add(localMarker);
      }
    }
  }
  
  private void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.H != null)) {
      this.H.a(CameraUpdateFactory.a(3.0F));
    }
    if (this.H != null) {
      this.H.a(1);
    }
    b(0);
    b(1);
    b(2);
    b(3);
    b(4);
    b(5);
    b(6);
    b(7);
  }
  
  private void c(int paramInt)
  {
    if (this.Q[p()] == null) {
      this.L = this.B.getText().toString();
    }
    o();
    this.P[paramInt].setChecked(true);
    if (this.U != 1)
    {
      this.U = 0;
      this.B.setText(this.L);
      this.V.a(s().getLatitude());
      this.V.b(s().getLongitude());
    }
  }
  
  private void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.M = true;
      this.E.setText(getString(2131427339));
      return;
    }
    this.M = false;
    this.E.setText(getString(2131427404));
  }
  
  private void d(int paramInt)
  {
    if (this.O[paramInt].isChecked())
    {
      f(paramInt);
      return;
    }
    e(paramInt);
  }
  
  private void d(boolean paramBoolean)
  {
    int i = getResources().getDimensionPixelOffset(2131230740);
    a(-i, 0);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, -i, -5.0F);
    localTranslateAnimation.setDuration(300L);
    localTranslateAnimation.setFillEnabled(true);
    localTranslateAnimation.setFillAfter(true);
    localTranslateAnimation.setAnimationListener(new DeeperMapActivity.5(this));
    this.t.startAnimation(localTranslateAnimation);
    this.G = true;
    if ((this.K == 13) || (this.K == 12)) {
      x();
    }
  }
  
  private void e(int paramInt)
  {
    this.O[paramInt].setChecked(true);
    Iterator localIterator = this.N.iterator();
    while (localIterator.hasNext())
    {
      Marker localMarker = (Marker)localIterator.next();
      if (((LocationData)localMarker.a()).d() == paramInt) {
        localMarker.a(true);
      }
    }
  }
  
  private void f(int paramInt)
  {
    this.O[paramInt].setChecked(false);
    Iterator localIterator = this.N.iterator();
    while (localIterator.hasNext())
    {
      Marker localMarker = (Marker)localIterator.next();
      if (((LocationData)localMarker.a()).d() == paramInt) {
        localMarker.a(false);
      }
    }
  }
  
  private void g()
  {
    if (this.I == null) {
      this.I = new GoogleApiClient.Builder(this).a(LocationServices.a).a(this).a(this).b();
    }
  }
  
  private void g(int paramInt)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.q.removeAllViews();
    if (paramInt == 1)
    {
      this.q.addView(this.s, localLayoutParams);
      return;
    }
    this.q.addView(this.r, localLayoutParams);
  }
  
  private void h()
  {
    int i = GooglePlayServicesUtil.a(this);
    if (i != 0)
    {
      A();
      switch (i)
      {
      default: 
        Crashlytics.a("Google Play services", i);
        Crashlytics.a("Google Play installed", C());
      }
    }
    do
    {
      do
      {
        return;
        findViewById(2131296485).setVisibility(0);
        return;
      } while (this.H != null);
      this.H = ((SupportMapFragment)f().a(2131296477)).P();
    } while (this.H == null);
    MapsInitializer.a(this);
    ConnectionCheckUtils.a(this);
    this.H.a(true);
    this.H.a(this);
    this.H.c().a(false);
    this.H.c().b(false);
    b(true);
    i();
    Intent localIntent = getIntent();
    this.K = localIntent.getIntExtra("started_by", 10);
    double d1 = localIntent.getDoubleExtra("latitude", -1.0D);
    double d2 = localIntent.getDoubleExtra("longitude", -1.0D);
    if ((this.K == 11) || (this.K == 12) || (this.K == 13))
    {
      this.X = true;
      a(d1, d2);
    }
    w();
  }
  
  private void i()
  {
    c(1);
    if (!this.u.a()) {
      this.u.a(true, false);
    }
  }
  
  private void j()
  {
    int i = 0;
    this.R[0] = this.s.findViewById(2131296459);
    this.R[1] = this.s.findViewById(2131296460);
    this.R[2] = this.s.findViewById(2131296461);
    this.R[3] = this.s.findViewById(2131296462);
    this.R[4] = this.s.findViewById(2131296463);
    this.R[5] = this.s.findViewById(2131296464);
    this.R[6] = this.s.findViewById(2131296465);
    this.R[7] = this.s.findViewById(2131296466);
    this.P[0] = ((CheckBox)this.R[0].findViewById(2131296471));
    this.P[1] = ((CheckBox)this.R[1].findViewById(2131296471));
    this.P[2] = ((CheckBox)this.R[2].findViewById(2131296471));
    this.P[3] = ((CheckBox)this.R[3].findViewById(2131296471));
    this.P[4] = ((CheckBox)this.R[4].findViewById(2131296471));
    this.P[5] = ((CheckBox)this.R[5].findViewById(2131296471));
    this.P[6] = ((CheckBox)this.R[6].findViewById(2131296471));
    this.P[7] = ((CheckBox)this.R[7].findViewById(2131296471));
    while (i < 8)
    {
      this.R[i].setOnClickListener(this);
      ((TextView)this.R[i].findViewById(2131296473)).setText(o[i]);
      ((ImageView)this.R[i].findViewById(2131296472)).setImageResource(n[i]);
      i++;
    }
  }
  
  private void k()
  {
    int i = 0;
    this.S[0] = this.r.findViewById(2131296451);
    this.S[1] = this.r.findViewById(2131296452);
    this.S[2] = this.r.findViewById(2131296453);
    this.S[3] = this.r.findViewById(2131296454);
    this.S[4] = this.r.findViewById(2131296455);
    this.S[5] = this.r.findViewById(2131296456);
    this.S[6] = this.r.findViewById(2131296457);
    this.S[7] = this.r.findViewById(2131296458);
    this.O[0] = ((CheckBox)this.S[0].findViewById(2131296448));
    this.O[1] = ((CheckBox)this.S[1].findViewById(2131296448));
    this.O[2] = ((CheckBox)this.S[2].findViewById(2131296448));
    this.O[3] = ((CheckBox)this.S[3].findViewById(2131296448));
    this.O[4] = ((CheckBox)this.S[4].findViewById(2131296448));
    this.O[5] = ((CheckBox)this.S[5].findViewById(2131296448));
    this.O[6] = ((CheckBox)this.S[6].findViewById(2131296448));
    this.O[7] = ((CheckBox)this.S[7].findViewById(2131296448));
    while (i < 8)
    {
      this.S[i].setOnClickListener(this);
      ((TextView)this.S[i].findViewById(2131296450)).setText(o[i]);
      ((ImageView)this.S[i].findViewById(2131296449)).setImageResource(n[i]);
      i++;
    }
  }
  
  private void l()
  {
    for (int i = 0; i < 8; i++) {
      this.Q[i] = null;
    }
  }
  
  private void m()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("saved", this.F);
    setResult(-1, localIntent);
    finish();
  }
  
  private void n()
  {
    if ((this.H != null) && (this.I != null)) {
      this.I.a(this.Y);
    }
  }
  
  private void o()
  {
    for (int i = 0; i < 8; i++) {
      this.P[i].setChecked(false);
    }
  }
  
  private int p()
  {
    int i = 1;
    boolean bool = this.P[0].isChecked();
    int j = 0;
    if (bool) {}
    for (;;)
    {
      if (this.P[i].isChecked()) {}
      for (;;)
      {
        if (this.P[2].isChecked()) {
          i = 2;
        }
        if (this.P[3].isChecked()) {
          i = 3;
        }
        if (this.P[4].isChecked()) {
          i = 4;
        }
        if (this.P[5].isChecked()) {
          i = 5;
        }
        if (this.P[6].isChecked()) {
          i = 6;
        }
        if (this.P[7].isChecked()) {
          i = 7;
        }
        return i;
        i = j;
      }
      j = i;
    }
  }
  
  private void q()
  {
    int i = this.V.d();
    int j = p();
    this.V.a(this.B.getText().toString());
    this.V.b(this.C.getText().toString());
    this.V.a(j);
    if (this.U == 0)
    {
      this.W.a(this.V);
      this.F = 1;
    }
    for (;;)
    {
      f(j);
      b(j);
      e(j);
      z();
      if ((this.K == 12) || (this.K == 13)) {
        m();
      }
      String str = p[j];
      EasyTracker.a(this).a(MapBuilder.a("Maps", "create_new_location", str, null).a());
      return;
      this.F = 2;
      if (this.V.f() != -1) {
        if (this.U == 1)
        {
          this.W.a(this.V, this.V.f());
          if (i != j)
          {
            f(i);
            b(i);
            e(i);
          }
        }
        else if (this.U == 2)
        {
          this.W.a(this.V, this.V.f());
        }
      }
    }
  }
  
  private void r()
  {
    if (!this.M)
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setMessage(getString(2131427405)).setCancelable(false).setPositiveButton(getString(2131427640), new DeeperMapActivity.4(this)).setNegativeButton(getString(2131427541), new DeeperMapActivity.3(this));
      localBuilder.create().show();
    }
    z();
    if (this.K == 13) {
      e(1);
    }
  }
  
  private Location s()
  {
    h();
    Location localLocation = new Location("center");
    if ((this.H != null) && (this.H.a() != null) && (this.H.a().a != null))
    {
      localLocation.setLatitude(this.H.a().a.a);
      localLocation.setLongitude(this.H.a().a.b);
    }
    return localLocation;
  }
  
  private void t()
  {
    if ((this.G) && (this.K == 10)) {
      z();
    }
    do
    {
      return;
      new Location("new");
      Location localLocation = s();
      LocationData localLocationData = new LocationData("new", null, localLocation.getLatitude(), p(), localLocation.getLongitude());
      d(true);
      c(true);
      GeodecodingOperation localGeodecodingOperation = new GeodecodingOperation(getApplicationContext(), localLocation);
      localGeodecodingOperation.a(this);
      localGeodecodingOperation.execute(new String[0]);
      g(1);
      for (int i = 0; i < 8; i++) {
        this.Q[i] = this.W.a(localLocationData, 200, i);
      }
      this.U = 0;
      this.V.a(localLocation.getLatitude());
      this.V.b(localLocation.getLongitude());
      this.B.setText("");
    } while (this.u.a());
    this.u.a(true, true);
  }
  
  private void u()
  {
    if ((this.K != 12) && (this.K != 13) && (this.K != 11))
    {
      SharedPreferences.Editor localEditor = getSharedPreferences("prefs", 0).edit();
      localEditor.putBoolean("checkBox", true);
      int i = 0;
      if (i < 8)
      {
        String str = "checkBox" + Integer.toString(i);
        if (this.O[i].isChecked()) {
          localEditor.putBoolean(str, true);
        }
        for (;;)
        {
          i++;
          break;
          localEditor.putBoolean(str, false);
        }
      }
      localEditor.apply();
    }
  }
  
  private void v()
  {
    w();
  }
  
  private void w()
  {
    for (int i = 0; i < 8; i++) {
      e(i);
    }
  }
  
  private void x()
  {
    for (int i = 0; i < 8; i++) {
      ((ImageView)this.R[i].findViewById(2131296474)).setVisibility(0);
    }
  }
  
  private void y()
  {
    for (int i = 0; i < 8; i++) {
      ((ImageView)this.R[i].findViewById(2131296474)).setVisibility(4);
    }
  }
  
  private void z()
  {
    g(0);
    this.v.removeView(this.t);
    c(false);
    this.B.clearFocus();
    l();
    B();
    this.G = false;
    y();
    this.T.setVisibility(8);
  }
  
  public void a(int paramInt) {}
  
  public void a(Location paramLocation)
  {
    if ((!this.X) && (this.H != null))
    {
      this.X = true;
      this.H.a(CameraUpdateFactory.a(new LatLng(paramLocation.getLatitude(), paramLocation.getLongitude()), 14.0F));
    }
  }
  
  public void a(Bundle paramBundle)
  {
    LocationServices.b.a(this.I, J, this);
    if (!this.X) {
      n();
    }
  }
  
  public void a(ConnectionResult paramConnectionResult) {}
  
  public void a(LatLng paramLatLng, boolean paramBoolean)
  {
    CameraUpdate localCameraUpdate;
    if (this.H != null)
    {
      localCameraUpdate = CameraUpdateFactory.a(paramLatLng, 16.0F);
      if (paramBoolean) {
        this.H.a(localCameraUpdate, 1, null);
      }
    }
    else
    {
      return;
    }
    this.H.a(localCameraUpdate);
  }
  
  public boolean a(Marker paramMarker)
  {
    b(paramMarker);
    return false;
  }
  
  public void b(Location paramLocation)
  {
    this.C.setText(paramLocation.getProvider());
  }
  
  public void b(Marker paramMarker)
  {
    int i = 0;
    LocationData localLocationData = (LocationData)paramMarker.a();
    this.N.remove(paramMarker);
    paramMarker.a(false);
    this.U = 1;
    d(true);
    this.V = localLocationData;
    while (i < 8)
    {
      this.Q[i] = this.W.a(this.V, 200, i);
      i++;
    }
    this.B.setText(localLocationData.a());
    this.C.setText(localLocationData.b());
    g(1);
    c(localLocationData.d());
    if (!this.u.a()) {
      this.u.a(true, true);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 102) {
      ConnectionCheckUtils.b(this);
    }
    if (paramInt1 == 101) {
      ConnectionCheckUtils.a(this);
    }
    if ((paramInt1 == 1) && (paramInt2 == -1) && (paramIntent != null))
    {
      LocationData localLocationData = (LocationData)paramIntent.getExtras().getParcelable("location");
      if (localLocationData != null)
      {
        a(new LatLng(localLocationData.c(), localLocationData.e()), false);
        int i = localLocationData.d();
        b(i);
        this.O[i].setChecked(true);
        EasyTracker.a(this).a(MapBuilder.a("Maps", "changed_location", "saved_list", null).a());
      }
    }
    Location localLocation;
    do
    {
      do
      {
        return;
        this.N.clear();
        b(false);
        w();
        return;
      } while ((paramInt1 != 22) || (paramIntent == null) || (paramIntent.getExtras() == null));
      localLocation = (Location)paramIntent.getExtras().getParcelable("result_s");
    } while (localLocation == null);
    a(new LatLng(localLocation.getLatitude(), localLocation.getLongitude()), true);
    this.A.setText(localLocation.getProvider());
    EasyTracker.a(this).a(MapBuilder.a("Maps", "changed_location", "search", null).a());
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.T) {
      z();
    }
    if (paramView == this.y) {
      t();
    }
    if (paramView == this.x) {
      n();
    }
    if ((paramView == this.z) && (this.H != null))
    {
      if (this.H.b() != 2) {
        break label371;
      }
      this.H.a(1);
    }
    for (;;)
    {
      if (paramView == this.w) {
        startActivityForResult(new Intent(this, LocationsListActivity.class), 1);
      }
      if (paramView == this.D) {
        q();
      }
      if (paramView == this.E) {
        r();
      }
      if (paramView == this.S[0]) {
        d(0);
      }
      if (paramView == this.S[1]) {
        d(1);
      }
      if (paramView == this.S[2]) {
        d(2);
      }
      if (paramView == this.S[3]) {
        d(3);
      }
      if (paramView == this.S[4]) {
        d(4);
      }
      if (paramView == this.S[5]) {
        d(5);
      }
      if (paramView == this.S[6]) {
        d(6);
      }
      if (paramView == this.S[7]) {
        d(7);
      }
      if (paramView == this.R[0]) {
        c(0);
      }
      if (paramView == this.R[1]) {
        c(1);
      }
      if (paramView == this.R[2]) {
        c(2);
      }
      if (paramView == this.R[3]) {
        c(3);
      }
      if (paramView == this.R[4]) {
        c(4);
      }
      if (paramView == this.R[5]) {
        c(5);
      }
      if (paramView == this.R[6]) {
        c(6);
      }
      if (paramView == this.R[7]) {
        c(7);
      }
      return;
      label371:
      this.H.a(2);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    getWindow().addFlags(128);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903075);
    this.W = ((DeeperApplication)getApplicationContext()).a();
    this.V = new LocationData(-1, null, null, -1.0D, 0, -1.0D);
    int j = GooglePlayServicesUtil.a(this);
    if (j != 0)
    {
      if (GooglePlayServicesUtil.b(j)) {
        GooglePlayServicesUtil.a(j, this, 9000).show();
      }
    }
    else
    {
      this.u = ((Panel)findViewById(2131296481));
      this.q = ((LinearLayout)findViewById(2131296483));
      ((ObservableScrollView)this.q.getParent()).setScrollViewListener(new DeeperMapActivity.1(this));
      LayoutInflater localLayoutInflater = (LayoutInflater)getSystemService("layout_inflater");
      this.r = localLayoutInflater.inflate(2130903071, null);
      this.s = localLayoutInflater.inflate(2130903072, null);
      this.t = localLayoutInflater.inflate(2130903073, null);
      this.t.setTag(Integer.valueOf(1));
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
      localLayoutParams.gravity = 21;
      this.q.addView(this.r, localLayoutParams);
      this.v = ((RelativeLayout)findViewById(2131296476));
      LinearLayout localLinearLayout = (LinearLayout)findViewById(2131296275);
      SearchBarBuilder localSearchBarBuilder = new SearchBarBuilder(this);
      localSearchBarBuilder.b().g().f().e();
      localLinearLayout.addView(localSearchBarBuilder.i());
      this.w = ((ImageView)localSearchBarBuilder.i().findViewById(7));
      this.x = ((ImageView)localSearchBarBuilder.i().findViewById(6));
      this.y = ((ImageView)localSearchBarBuilder.i().findViewById(5));
      this.z = ((ImageView)findViewById(2131296478));
      this.A = ((TextView)localSearchBarBuilder.i().findViewById(1).findViewById(2131296344));
      this.A.setHint(getString(2131427583));
      getWindow().setSoftInputMode(3);
      this.B = ((EditText)this.t.findViewById(2131296467));
      this.C = ((EditText)this.t.findViewById(2131296468));
      this.D = ((Button)this.t.findViewById(2131296469));
      this.E = ((Button)this.t.findViewById(2131296470));
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
      this.D.setOnClickListener(this);
      this.E.setOnClickListener(this);
      this.w.setOnClickListener(this);
      this.x.setOnClickListener(this);
      this.y.setOnClickListener(this);
      this.z.setOnClickListener(this);
      this.T = ((ImageView)findViewById(2131296479));
      this.T.setOnClickListener(this);
      j();
      k();
      while (i < 8)
      {
        this.Q[i] = null;
        i++;
      }
    }
    Toast.makeText(this, 2131427333, 0).show();
    finish();
    return;
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    h();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.v.findViewWithTag(Integer.valueOf(1)) != null)
      {
        z();
        if ((this.K == 12) || (this.K == 13)) {
          m();
        }
        return true;
      }
      u();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    if (this.I != null) {
      this.I.c();
    }
    super.onPause();
  }
  
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    v();
  }
  
  protected void onResume()
  {
    h();
    g();
    this.I.b();
    super.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    u();
  }
  
  protected void onStart()
  {
    super.onStart();
    EasyTracker.a(this).a(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    EasyTracker.a(this).b(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperMapActivity
 * JD-Core Version:    0.7.0.1
 */