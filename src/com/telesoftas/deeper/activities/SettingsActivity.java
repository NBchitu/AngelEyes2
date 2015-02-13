package com.telesoftas.deeper.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.facebook.android.Facebook;
import com.facebook.android.SessionStore;
import com.fridaylab.deeper.communication.DeeperModel;
import com.fridaylab.deeper.ui.LanguageSelectionFragment;
import com.fridaylab.deeper.ui.LanguageSelectionFragment.OnLanguageSelectedListener;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.services.DeeperDeviceManager;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import com.telesoftas.utilities.social.SocialNetworksConstants;

public class SettingsActivity
  extends TrackedActivity
  implements View.OnClickListener, LanguageSelectionFragment.OnLanguageSelectedListener
{
  View A;
  View B;
  View C;
  private SharedPreferences J;
  private ProgressDialog K;
  private Facebook L;
  private Button M;
  private TextView N;
  private String O;
  private boolean P = false;
  private final Handler Q = new SettingsActivity.4(this);
  private final Handler R = new SettingsActivity.6(this);
  TextView n;
  TextView o;
  TextView p;
  TextView q;
  TextView r;
  TextView s;
  TextView t;
  TextView u;
  TextView v;
  TextView w;
  TextView x;
  View y;
  View z;
  
  public static Intent a(Context paramContext, DeeperModel paramDeeperModel)
  {
    Intent localIntent = new Intent(paramContext, SettingsActivity.class);
    if (paramDeeperModel != null)
    {
      localIntent.putExtra("iceFishing", paramDeeperModel.i());
      localIntent.putExtra("nightFishing", paramDeeperModel.h());
    }
    return localIntent;
  }
  
  private void a(TextView paramTextView, int paramInt1, String paramString, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.J.getInt(paramString, paramInt2);
    String str1 = getString(paramInt1) + ": ";
    paramTextView.setEnabled(paramBoolean2);
    boolean bool;
    String str2;
    if (!paramBoolean1)
    {
      String str3 = str1 + getString(2131427633);
      EasyTracker localEasyTracker = m();
      if (paramTextView.getVisibility() == 0)
      {
        bool = true;
        localEasyTracker.a(MapBuilder.a("Navigation", "update_required_for_night_fishing", Boolean.toString(bool), null).a());
        str2 = str3;
        paramBoolean2 = false;
        label120:
        paramTextView.setText(str2);
        if (!paramBoolean2) {
          break label215;
        }
      }
    }
    label215:
    for (int j = -1;; j = getResources().getColor(17170437))
    {
      paramTextView.setTextColor(j);
      return;
      bool = false;
      break;
      if ((i == 0) || (!paramBoolean2))
      {
        str2 = str1 + getString(2131427550);
        break label120;
      }
      str2 = str1 + getString(2131427552);
      break label120;
    }
  }
  
  private void g()
  {
    int i = this.J.getInt(SettingsUtils.a, 0);
    String str1 = getString(2131427632) + ": ";
    if (i == 0) {
      str1 = str1 + getString(2131427515);
    }
    if (i == 1) {
      str1 = str1 + getString(2131427463);
    }
    if (i == 2) {
      str1 = str1 + getString(2131427423);
    }
    if (i == 3) {
      str1 = str1 + getString(2131427425);
    }
    this.n.setText(str1);
    int j;
    int k;
    label201:
    String str2;
    label257:
    boolean bool1;
    label280:
    int m;
    label309:
    boolean bool2;
    label334:
    boolean bool3;
    label366:
    TextView localTextView5;
    String str5;
    if (this.J.getInt(SettingsUtils.s, 0) == 1)
    {
      j = 1;
      if ((j == 0) || (!getIntent().getBooleanExtra("iceFishing", true))) {
        break label666;
      }
      k = 1;
      if ((this.J.getInt(SettingsUtils.c, 2) != 2) && (j == 0)) {
        break label672;
      }
      str2 = getString(2131427432) + ": " + getString(2131427465);
      this.o.setText(str2);
      TextView localTextView1 = this.o;
      if (k != 0) {
        break label711;
      }
      bool1 = true;
      localTextView1.setEnabled(bool1);
      TextView localTextView2 = this.o;
      if (k == 0) {
        break label717;
      }
      m = getResources().getColor(17170437);
      localTextView2.setTextColor(m);
      TextView localTextView3 = this.p;
      String str3 = SettingsUtils.h;
      if (j != 0) {
        break label723;
      }
      bool2 = true;
      a(localTextView3, 2131427406, str3, 1, true, bool2);
      TextView localTextView4 = this.q;
      String str4 = SettingsUtils.n;
      if (j != 0) {
        break label729;
      }
      bool3 = true;
      a(localTextView4, 2131427427, str4, 1, true, bool3);
      localTextView5 = this.r;
      str5 = SettingsUtils.r;
      if (j != 0) {
        break label735;
      }
    }
    label666:
    label672:
    label711:
    label717:
    label723:
    label729:
    label735:
    for (boolean bool4 = true;; bool4 = false)
    {
      a(localTextView5, 2131427428, str5, 1, true, bool4);
      a(this.s, 2131427456, SettingsUtils.s, 0, getIntent().getBooleanExtra("iceFishing", true), true);
      a(this.t, 2131427635, SettingsUtils.t, 1, true, true);
      a(this.u, 2131427539, SettingsUtils.g, 0, getIntent().getBooleanExtra("nightFishing", true), true);
      int i1 = this.J.getInt(SettingsUtils.u, 15);
      String str6 = getString(2131427384) + ": " + i1 + getString(2131427519);
      this.v.setText(str6);
      int i2 = DisplayUtils.d(this);
      String str7 = getString(2131427337) + ": ";
      String str8 = str7 + Integer.toString(i2);
      String str9 = str8 + "%";
      this.w.setText(str9);
      if (this.I.d().b() == null) {
        break label741;
      }
      this.x.setText(getString(2131427622));
      return;
      j = 0;
      break;
      k = 0;
      break label201;
      str2 = getString(2131427432) + ": " + getString(2131427467);
      break label257;
      bool1 = false;
      break label280;
      m = -1;
      break label309;
      bool2 = false;
      break label334;
      bool3 = false;
      break label366;
    }
    label741:
    this.x.setText(getString(2131427578));
  }
  
  private void h()
  {
    String str1;
    if (this.L.a())
    {
      this.P = true;
      String str2 = SessionStore.b(this);
      if (str2.equals("")) {
        str2 = "Unknown";
      }
      this.O = str2;
      str1 = getString(2131427489) + " " + this.O;
      this.M.setText(getString(2131427491));
      this.M.setBackgroundResource(2130837554);
      this.N.setTextColor(-1);
    }
    for (;;)
    {
      this.N.setText(str1);
      return;
      this.P = false;
      str1 = getString(2131427549);
      this.M.setText(getString(2131427490));
      this.M.setBackgroundResource(2130837553);
      this.N.setTextColor(-7829368);
    }
  }
  
  private void i()
  {
    ManualWebViewActivity.a(this);
    LanguageSelectionFragment.a(ManualWebViewActivity.n, "preferred_manual_language").a(f(), "LANGUAGE_DLG");
  }
  
  private void j()
  {
    if (this.L.a())
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
      localBuilder.setMessage(getString(2131427409)).setCancelable(false).setPositiveButton(getString(2131427640), new SettingsActivity.2(this)).setNegativeButton(getString(2131427541), new SettingsActivity.1(this));
      localBuilder.create().show();
    }
  }
  
  private void k()
  {
    this.L.a(this, SocialNetworksConstants.a, -1, new SettingsActivity.FbLoginDialogListener(this, null));
  }
  
  private void l()
  {
    if (!this.L.a())
    {
      k();
      return;
    }
    this.K.setMessage(getString(2131427435));
    this.K.show();
    new SettingsActivity.3(this).start();
  }
  
  private void n()
  {
    this.K.setMessage(getString(2131427410));
    this.K.show();
    new SettingsActivity.5(this).start();
  }
  
  public void a_(String paramString)
  {
    startActivity(ManualWebViewActivity.a(this, paramString));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) || (paramInt1 == 3)) {
      if (paramInt2 == -1) {
        g();
      }
    }
    do
    {
      do
      {
        return;
        if (paramInt1 == 5)
        {
          g();
          this.L = new Facebook("348962841848059");
          SessionStore.b(this.L, this);
          h();
          return;
        }
      } while (paramInt1 != 0);
      if (paramInt2 == -1)
      {
        startActivity(a(this, false, paramIntent.getStringExtra("device")));
        finish();
        return;
      }
    } while (paramInt2 != 1);
    finish();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.M) {
      if (this.P)
      {
        j();
        h();
      }
    }
    label443:
    label498:
    label504:
    do
    {
      return;
      k();
      break;
      if (paramView == this.n)
      {
        Intent localIntent1 = new Intent(this, SettingsChoiceActivity.class);
        localIntent1.putExtra("choice type", 10);
        startActivityForResult(localIntent1, 1);
        return;
      }
      if (paramView == this.o)
      {
        Intent localIntent2 = new Intent(this, SettingsChoiceActivity.class);
        localIntent2.putExtra("choice type", 17);
        startActivityForResult(localIntent2, 1);
        return;
      }
      if (paramView == this.p)
      {
        startActivityForResult(new Intent(this, DepthAlarmsSettingsActivity.class), 3);
        return;
      }
      if (paramView == this.q)
      {
        startActivityForResult(new Intent(this, FishAlarmsSettings.class), 1);
        return;
      }
      if (paramView == this.r)
      {
        Intent localIntent3 = new Intent(this, SettingsChoiceActivity.class);
        localIntent3.putExtra("choice type", 14);
        startActivityForResult(localIntent3, 1);
        return;
      }
      if (paramView == this.s)
      {
        Intent localIntent4 = new Intent(this, SettingsChoiceActivity.class);
        localIntent4.putExtra("choice type", 20);
        startActivityForResult(localIntent4, 1);
        return;
      }
      if (paramView == this.t)
      {
        Intent localIntent5 = new Intent(this, SettingsChoiceActivity.class);
        localIntent5.putExtra("choice type", 18);
        startActivityForResult(localIntent5, 1);
        return;
      }
      if (paramView == this.u)
      {
        Intent localIntent6 = new Intent(this, SettingsChoiceActivity.class);
        localIntent6.putExtra("choice type", 19);
        startActivityForResult(localIntent6, 1);
        return;
      }
      if (paramView == this.v)
      {
        Intent localIntent7 = new Intent(this, SettingsChoiceActivity.class);
        localIntent7.putExtra("choice type", 15);
        startActivityForResult(localIntent7, 1);
        return;
      }
      if (paramView == this.w)
      {
        Intent localIntent8 = new Intent(this, SettingsChoiceActivity.class);
        localIntent8.putExtra("choice type", 16);
        startActivityForResult(localIntent8, 1);
        return;
      }
      if (paramView == this.x)
      {
        int i;
        String str1;
        if (this.I.d().b() != null)
        {
          i = 1;
          boolean bool = false;
          if (i == 0) {
            bool = true;
          }
          if (i == 0) {
            break label498;
          }
          str1 = "DEVICE_ADDRESS";
          startActivity(a(this, bool, str1));
          finish();
          if (i == 0) {
            break label504;
          }
        }
        for (String str2 = "stop";; str2 = "start")
        {
          EasyTracker.a(this).a(MapBuilder.a("Settings", str2, "simulation", null).a());
          return;
          i = 0;
          break;
          str1 = null;
          break label443;
        }
      }
      if (paramView == this.y)
      {
        startActivityForResult(new Intent(this, SettingsDeepersActivity.class), 0);
        return;
      }
      if (paramView == this.z)
      {
        i();
        return;
      }
      if (paramView == this.B)
      {
        Intent localIntent9 = new Intent(getApplicationContext(), ImportExportActivity.class);
        localIntent9.putExtra("action", 1);
        startActivityForResult(localIntent9, 5);
        return;
      }
    } while (paramView != this.C);
    Intent localIntent10 = new Intent(getApplicationContext(), ImportExportActivity.class);
    localIntent10.putExtra("action", 2);
    startActivity(localIntent10);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903081);
    ButterKnife.a(this);
    this.J = SettingsUtils.a(this);
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.p.setOnClickListener(this);
    this.q.setOnClickListener(this);
    this.r.setOnClickListener(this);
    this.t.setOnClickListener(this);
    this.v.setOnClickListener(this);
    this.w.setOnClickListener(this);
    this.x.setOnClickListener(this);
    if (getIntent().getBooleanExtra("iceFishing", true))
    {
      this.s.setOnClickListener(this);
      if (!getIntent().getBooleanExtra("nightFishing", true)) {
        break label349;
      }
      this.u.setOnClickListener(this);
      label138:
      this.y.setOnClickListener(this);
      this.z.setOnClickListener(this);
      this.B.setOnClickListener(this);
      this.C.setOnClickListener(this);
      TextView localTextView = (TextView)findViewById(2131296524);
      String str = getString(2131427634);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = StringUtils.a(this);
      localTextView.setText(String.format(str, arrayOfObject));
      this.K = new ProgressDialog(this);
      this.L = new Facebook("348962841848059");
      SessionStore.b(this.L, this);
      this.M = ((Button)findViewById(2131296519));
      this.N = ((TextView)findViewById(2131296518));
      this.M.setOnClickListener(this);
      h();
      if (GooglePlayServicesUtil.a(this) != 0) {
        break label368;
      }
    }
    label349:
    label368:
    for (int i = 0;; i = 8)
    {
      this.A.setVisibility(i);
      this.B.setVisibility(i);
      this.C.setVisibility(i);
      g();
      return;
      this.s.setTextColor(getResources().getColor(17170437));
      break;
      this.u.setTextColor(getResources().getColor(17170437));
      break label138;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsActivity
 * JD-Core Version:    0.7.0.1
 */