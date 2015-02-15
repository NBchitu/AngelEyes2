package com.telesoftas.deeper.activities;

import java.io.File;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.concurrent.Callable;

import com.fridaylab.deeper.ui.ColorOscillator;
import com.fridaylab.deeper.communication.*;
import com.telesoftas.deeper.animation.HistorySceneView;
import com.telesoftas.deeper.animation.SceneView;
import com.telesoftas.deeper.ui.fragments.LogEditFragment;
import com.telesoftas.deeper.ui.fragments.LogShareFragment;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.DeeperDeviceManager;
import com.fridaylab.deeper.ui.MessageDialogFragment;
import com.fridaylab.deeper.ui.MessageDialogFragment$MessageDialogListener;
import com.telesoftas.deeper.ui.fragments.LogEditFragment;
import com.telesoftas.deeper.ui.fragments.LogEditFragment$OnLogEditListener;
import com.telesoftas.deeper.ui.fragments.LogShareFragment;
import com.telesoftas.deeper.ui.fragments.LogShareFragment$OnLogShareListener;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.text.SpannableStringBuilder;
import android.text.format.Time;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Handler;

public class MainDeeperActivity
extends TrackedActivity
implements View.OnClickListener, MessageDialogFragment$MessageDialogListener, LogEditFragment$OnLogEditListener, LogShareFragment$OnLogShareListener, Callable<Boolean>
//private static final DecimalFormat L = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
{
	private static final DecimalFormat  L = new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    private static final String ab = LogEditFragment.class.getName();
    private static final String ac = LogShareFragment.class.getName();
@Deprecated	// 这个类或方法不再建议使用
	public static int n = 0;

	private TextView A;		// deeper_searching:"Searching…"
	private ImageView B;	// btn_reconnect
	private ImageView C;	// ic
	private ImageView J;	// ic_sleep
	private View K;			// btn_working(ProgressBar)
	private SceneView M;	//	import com.telesoftas.deeper.animation.SceneView;
	private HistorySceneView N;	// import com.telesoftas.deeper.animation.HistorySceneView;
	private View O;			// history_panel_handle(ImageView)
	private TextView P;		// temperature(TextView)
	private TextView Q;		// depth
	private TextView R;		// ice_temperature
	private TextView S;		// ice_depth
	private boolean T = false;
	private boolean U = false;
	private boolean V = false;
	private ViewGroup W;	// loading_background
	private ViewGroup X;	// log_edit_popup
	private ViewGroup Y;	// log_share_popup
	//private LogEditFragment Z;	//import com.telesoftas.deeper.ui.fragments.LogEditFragment;
	//private final ServiceConnection aA = new MainDeeperActivity.5(this);	//
	// 判断国家
	//private final MainDeeperActivity.CheckCountry aB = new MainDeeperActivity.CheckCountry(this, this);
	private int iCurrentBatLevel = 0;		// 当前电量值
	private File aD;
	//private final SharedPreferences.OnSharedPreferenceChangeListener aE = new MainDeeperActivity.12(this);
	//private QuickSettingsFragment aF;	//import com.telesoftas.deeper.ui.fragments.QuickSettingsFragment;
	private int aG = -1;
	//private LogShareFragment aa;	//import com.telesoftas.deeper.ui.fragments.LogShareFragment;
	private SharedPreferences ad;	// 保存"prefs"参数，用来存储轻量级数据
	private boolean ae = false;
	private boolean af = false;
	private boolean ag = false;
	private boolean ah = false;
	private boolean ai = false;
	private final CommunicationProtocol$Recorder aj = new CommunicationProtocol$Recorder();
	// import com.fridaylab.deeper.communication.CommunicationProtocol;
	private boolean ak;
	private CommunicationProtocol al = this.aj;
	private boolean am = false;	// 睡眠模式开关标志，默认false-睡眠打开
	private boolean an = true;
	private int colorWarningRed;
	private int ap = -1;
	private long aq;	// 系统时间Time
	private boolean ar;
	private String as = "";	// depth uint 深度单位，用于显示
	private String at = "";	// temperature unit
	private final RelativeSizeSpan au = new RelativeSizeSpan(0.7F);	// 深度信息整数部分字体大小 0.7表上默认大小的倍数
	private final RelativeSizeSpan av = new RelativeSizeSpan(0.6F);	// 深度信息小数部分字体大小 0.7表上默认大小的倍数
	private final SpannableStringBuilder aw = new SpannableStringBuilder();	// spannable的深度数据文本
	private final SpannableStringBuilder ax = new SpannableStringBuilder();
	private final ColorOscillator ay = new ColorOscillator(-1, -65536, 400);	// 显示带色彩的波形
	private final BroadcastReceiver az = new MainDeeperActivity$4(this);
	boolean o = false;
	boolean p = false;
	boolean q = false;
	boolean r = false;
	View.OnClickListener s = null;
	Handler t = new Handler();
	//BroadcastReceiver u = new MainDeeperActivity.13(this);
	String v = null;
	boolean w = false;
	//private Panel x;	//import com.telesoftas.deeper.ui.views.Panel;
	//private Panel y;
	//private Panel z;

// function: 拍照相关
//private void A()	 
//{
//  this.aD = null;
//  Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
//  if (localIntent.resolveActivity(getPackageManager()) != null)
//  {
//    Time localTime = new Time();
//    localTime.setToNow();
//    this.aD = new File(getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES), localTime.format("%Y%m%d%H%M%S") + ".jpg");
//    if (this.aD != null)
//    {
//      localIntent.addFlags(524288);	// 0x80000
//      localIntent.putExtra("output", Uri.fromFile(this.aD));
//      if (this.H) {
//        a(2131296369, true, new GregorianCalendar(), null);	// log_edit_popup
//      }
//      startActivityForResult(localIntent, 15);
//    }
//  }
//  if (this.aD == null) {
//    Toast.makeText(this, 2131427542, 1).show();	// no_camera
//  }
//}

// 利用intent启动activity: WeatherActivity
//private void B()
//{
//  startActivity(new Intent(this, WeatherActivity.class));
//}

// 利用intent启动activity: LogActivity
//private void C()
//{
//  startActivity(new Intent(this, LogActivity.class));
//}

//利用intent启动activity: DeeperMapActivity
//private void D()
//{
//  startActivity(new Intent(this, DeeperMapActivity.class));
//}

// 打开分享界面
//private void E()
//{
//  if (this.H)
//  {
//    if (b(2131296370, true)) {	// log_share_popup
//      I();
//    }
//    return;
//  }
//  startActivity(new Intent(this, SharingActivity.class));
//}

// 打开设置界面,但是打开之前向startActivity传入一些当前工作状态参数,比较复杂
//private void F()
//{
//  
//	CommunicationProtocol.ConnectionInfo localConnectionInfo = this.al.c();//import com.fridaylab.deeper.communication.CommunicationProtocol;
//  if (localConnectionInfo.a == CommunicationProtocol.ConnectionState.f) {}
//  for (DeeperModel localDeeperModel = localConnectionInfo.b;; localDeeperModel = null)
//  {
//    startActivity(SettingsActivity.a(this, localDeeperModel));	// 打开设置界面
//    return;
//  }
//}

private void G()
{ 
  int i = ViewTools.b(this);
  int j = ViewTools.a(this);
  int k = Math.max((int)(i / 2.1D), DisplayUtils.a(this, 292));
  int m = (int)(j / 1.5D);
  int i1 = (int)((i / 2 - k) / 1.5D);
  RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(m, k);
  localLayoutParams.addRule(14);
  this.Y.setLayoutParams(localLayoutParams);
  this.Y.setPadding(0, i1, 0, 0);
  this.X.setLayoutParams(localLayoutParams);
  this.X.setPadding(0, i1, 0, 0);
}

private void H()
{
  if (!this.U)
  {
    this.W.setVisibility(View.VISIBLE);	// 显示 VISIBLE：0 ININVISIBLE：4 GONE：8 隐藏
    this.X.setVisibility(View.VISIBLE);	// 显示
    Animation localAnimation = a(1, 2131296369, false);	// log_edit_popup
    this.X.startAnimation(localAnimation);
  }
}

private void I()
{
  if (!this.T)
  {
    this.W.setVisibility(View.VISIBLE);
    this.Y.setVisibility(View.VISIBLE);
    Animation localAnimation = a(1, 2131296370, false);	// log_share_popup
    this.Y.startAnimation(localAnimation);
  }
}

private void J()
{
  if ((this.T) && (!this.V))
  {
    this.V = true;
    a(this.aa.b());
    Animation localAnimation = a(-1, 2131296370, false);	// log_share_popup
    this.Y.startAnimation(localAnimation);
  }
}

private void K()
{
  ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 2);
}

public static int a(int paramInt, float paramFloat)
{
  return (int)(0.5F + paramFloat * paramInt);
}

private Animation a(int paramInt1, int paramInt2, boolean paramBoolean)
{
  int i = (int)(1.3D * ViewTools.b(this));
  TranslateAnimation localTranslateAnimation;
  if (paramInt1 == 1)
  {
    localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, i, 0.0F);
    localTranslateAnimation.setDuration(500L);
  }
  for (;;)
  {
    if (paramInt1 == 1) {
      localTranslateAnimation.setAnimationListener(new MainDeeperActivity.10(this, paramInt2));
    }
    if (paramInt1 == -1) {
      localTranslateAnimation.setAnimationListener(new MainDeeperActivity.11(this, paramInt2));
    }
    return localTranslateAnimation;
    localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
    localTranslateAnimation.setDuration(600L);
  }
}

private void a(int paramInt, boolean paramBoolean, GregorianCalendar paramGregorianCalendar, String paramString)
{
  this.Z = new LogEditFragment();
  NoteEntry localNoteEntry = this.F.a(paramGregorianCalendar);
  boolean bool = false;
  if (paramBoolean)
  {
    if (localNoteEntry != null) {
      paramGregorianCalendar.add(14, 1);
    }
    localNoteEntry = new NoteEntry(new NoteData(paramGregorianCalendar, "", ""), null, null, null);
    bool = true;
  }
  Bundle localBundle = new Bundle();
  localBundle.putParcelable("edit_note", localNoteEntry);
  localBundle.putBoolean("search_for_location", bool);
  if ((paramString != null) && (paramString.length() > 1)) {
    localBundle.putString("new_photo", paramString);
  }
  this.Z.g(localBundle);
  a(paramInt, this.Z, true, true, ab);
}

private void a(EditText paramEditText)
{
  ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
}

private void a(CommunicationProtocol.ConnectionInfo paramConnectionInfo)
{
  int i = 1;
  if (this.aF == null) {
    this.aF = ((QuickSettingsFragment)f().a(2131296445));	// quickSettingsFragment
  }
  int j;
  int k;
  label72:
  boolean bool;
  if (this.aF != null)
  {
    if (this.ad.getInt(SettingsUtils.s, 0) != i) {
      break label123;
    }
    j = i;
    if ((paramConnectionInfo.b == null) || (paramConnectionInfo.a != CommunicationProtocol.ConnectionState.f)) {
      break label128;
    }
    k = i;
    if (k == 0) {
      break label134;
    }
    bool = paramConnectionInfo.b.g();
    label86:
    if (!bool) {
      break label140;
    }
    if (j == 0) {}
  }
  label128:
  label134:
  label140:
  for (i = 2;; i = 0)
  {
    if (i != this.aG)
    {
      this.aG = i;
      this.aF.b(i);
    }
    k();
    return;
    label123:
    j = 0;
    break;
    k = 0;
    break label72;
    bool = i;
    break label86;
  }
}

private void a(boolean paramBoolean, float paramFloat)
{
  FragmentManager localFragmentManager = f();
  if (paramBoolean)
  {
    Fragment localFragment = localFragmentManager.a("message");
    if (localFragment != null) {
      ((MessageDialogFragment)localFragment).a();
    }
  }
  ProgressDialogFragment localProgressDialogFragment = (ProgressDialogFragment)localFragmentManager.a("progress");
  if ((localProgressDialogFragment == null) && (paramBoolean))
  {
    localProgressDialogFragment = ProgressDialogFragment.a(getString(2131427403));	// deeper_updating
    localProgressDialogFragment.a(localFragmentManager, "progress");
    localFragmentManager.b();
  }
  if (localProgressDialogFragment != null)
  {
    if (paramBoolean) {
      localProgressDialogFragment.a(paramFloat);
    }
  }
  else {
    return;
  }
  localProgressDialogFragment.a();
}

private void a(boolean paramBoolean, DeeperModel paramDeeperModel)
{
  if ((this.w) || (!paramBoolean)) {}
  while ((this.o) || (this.p)) {
    return;
  }
  this.A.setText(2131427399);	// deeper_searching
  AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
  Object[] arrayOfObject = new Object[1];
  arrayOfObject[0] = paramDeeperModel.b();
  localBuilder.setMessage(getString(2131427395, arrayOfObject)).setCancelable(false).setPositiveButton(2131427585, new MainDeeperActivity.15(this, paramDeeperModel)).setNegativeButton(2131427339, new MainDeeperActivity.14(this)).create().show();
  // deeper_not_paired,settings,cancel
  this.w = true;
}

private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
{
  int i = this.W.getWidth();
  int j = this.W.getHeight();
  if ((i == 0) || (j == 0)) {
    return false;
  }
  float f = getResources().getDisplayMetrics().density;
  int k = Math.min(i - 2 * a(4, f), a(800, f));
  int m = (int)(1.0F * (k - a(56, f)) * paramInt4 / paramInt3) + a(80, f);
  ImageView localImageView1 = (ImageView)findViewById(2131296271);	// promo_banner
  RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(k, m);
  localLayoutParams.addRule(13, -1);
  localImageView1.setLayoutParams(localLayoutParams);
  localImageView1.setImageResource(paramInt1);
  ImageView localImageView2 = (ImageView)findViewById(2131296272);	// promo_action
  localImageView2.setImageResource(paramInt2);
  EditText localEditText = (EditText)findViewById(2131296274);	// promo_email
  localEditText.setVisibility(paramInt5);
  if (paramInt5 == 0)
  {
    ArrayList localArrayList = new ArrayList();
    Pattern localPattern = Patterns.EMAIL_ADDRESS;
    Account[] arrayOfAccount = AccountManager.get(this).getAccounts();
    int i1 = arrayOfAccount.length;
    int i2 = 0;
    int i3 = 0;
    if (i3 < i1)
    {
      Account localAccount = arrayOfAccount[i3];
      if (localPattern.matcher(localAccount.name).matches())
      {
        if (!localAccount.type.equals("com.google")) {
          break label284;
        }
        localArrayList.add(i2, localAccount.name);
        i2++;
      }
      for (;;)
      {
        i3++;
        break;
        label284:
        localArrayList.add(localAccount.name);
      }
    }
    if (localArrayList.size() > 0) {
      localEditText.setText((CharSequence)localArrayList.get(0));
    }
  }
  View localView = findViewById(2131296446);	// promo
  localView.setVisibility(View.VISIBLE);
  this.W.setVisibility(View.VISIBLE);
  localImageView2.setOnClickListener(new MainDeeperActivity.8(this, localView, paramString, localEditText));
  localImageView2.requestFocus();
  this.s = new MainDeeperActivity.9(this, localView, paramString);
  findViewById(2131296273).setOnClickListener(this.s);	// promo_close
  return true;
}

private void b(int paramInt)
{
  this.ax.clear();
  this.ax.clearSpans();
  if (paramInt == 666) {
    this.ax.append("---");
  }
  for (;;)
  {
    int i = this.ax.length();
    this.ax.append(this.at);
    this.ax.setSpan(this.av, i, this.ax.length(), 17);
    this.P.setText(this.ax);
    this.R.setText(this.ax);
    return;
    double d = MathUtils.b(paramInt, n);
    this.ax.append(StringUtils.a.format(d));
  }
}

private void b(boolean paramBoolean)
{
  Bundle localBundle = getIntent().getExtras();	// 得到从跳转activity传入的参数
  if (localBundle != null) {}
  for (boolean bool1 = localBundle.getBoolean("DEMO");; bool1 = false)	// 判断是否为演示所用
  {
    String str3;
    if (bool1)	// 演示所用
    {
      this.al.b();
      int i = this.ad.getInt(SettingsUtils.s, 0);	// 读取配置文件是否为冰钓模式
      boolean bool2 = false;
      if (i == 1) {
        bool2 = true;
      }
      if (bool2)	// 演示冰钓模式
      {
        str3 = "recording_ice.csv";
        if (!str3.equals(this.I.d().b()))	// 未打开文件"recording_ice.csv"的FileServeice
        {
          this.I.d().a();	//  DeeperDeviceManager 清除其FileService和DeeperDataManager成员变量
          this.I.d().a(bool2);	// bool2指定冰钓模式, 在DeeperDataManager中创建FileServices,打开演示数据
        }
      }
    }
    label217:
    String str1;
    do
    {
      CommunicationProtocol.ConnectionInfo localConnectionInfo;
      String str2;
      do
      {
        do
        {
          return;
          str3 = "recording.csv";
          break;
        } while (paramBoolean);
        if (this.I.d().b() != null) {
          this.I.d().a();
        }
        localConnectionInfo = this.al.c();
        if (localConnectionInfo.a != CommunicationProtocol.ConnectionState.f) {
          break label217;
        }
        str2 = getIntent().getStringExtra("DEVICE_ADDRESS");
      } while ((str2 == null) || (localConnectionInfo.b.c().equals(str2)));
      this.al.b();
      b(str2);
      return;
      str1 = getIntent().getStringExtra("DEVICE_ADDRESS");
      if (str1 == null)
      {
        a(SettingsUtils.d(this), true);
        return;
      }
    } while (str1.equals("DEVICE_ADDRESS"));
    b(str1);
    return;
  }
}

private boolean b(int paramInt, boolean paramBoolean)
{
  this.aa = new LogShareFragment();
  NoteEntry localNoteEntry = new NoteEntry(new NoteData(new GregorianCalendar(), "", ""), null, null, null);
  Bundle localBundle = new Bundle();
  localBundle.putParcelable("edit_note", localNoteEntry);
  localBundle.putBoolean("search_for_location", true);
  this.aa.g(localBundle);
  a(paramInt, this.aa, true, paramBoolean, ac);
  return true;
}

private void c(boolean paramBoolean)
{
  if ((this.U) && (!this.V))
  {
    this.V = true;
    a(this.Z.a());
    Animation localAnimation = a(-1, 2131296369, paramBoolean);	// log_edit_popup
    this.X.startAnimation(localAnimation);
  }
}

private void d(String paramString)
{
  this.o = a(2130837506, 2130837513, 1312, 509, 4, paramString);
  // (amzn_banner,amzn_review)
}

private void d(boolean paramBoolean)
{
  if (!paramBoolean) {}
  FragmentManager localFragmentManager;
  do
  {
    return;
    if ((this.o) || (this.p))
    {
      this.al.c().b.a(false);
      return;
    }
    localFragmentManager = f();
  } while ((localFragmentManager.a("progress") != null) || (localFragmentManager.a("message") != null));
  MessageDialogFragment.a(getString(2131427401), getString(2131427390), getString(2131427397)).a(localFragmentManager, "message");
  // (deeper_update_available,deeper_connect_to_charger_to_begin,deeper_remind_later)
  localFragmentManager.b();
}

// 过滤Intent
public static IntentFilter j()
{
  IntentFilter localIntentFilter = new IntentFilter();
  localIntentFilter.addAction("com.fridaylab.deeper.STATE_CHANGED");
  localIntentFilter.addAction("BROADCAST_NEW_ECHO_AVAILABLE");
  return localIntentFilter;
}

// 显示历史回放背景和探测界面
private void n()
{
  this.M = ((SceneView)findViewById(2131296408));	// container
  this.N = ((HistorySceneView)findViewById(2131296439));	// history_view
  this.N.setHistorySeekBar((SeekBar)findViewById(2131296440));	// history_seekbar
  this.M.setHistoryPanel(this.y);
  float f = Signal.a(this, 1);	// 鱼的高度
  if (((ActivityManager)getSystemService("activity")).getMemoryClass() > 50) {}
  for (double d = 1.5D;; d = 1.1D)
  {
    int i = (int)Math.ceil(d * ViewTools.a(this) / f);	// 取整,1.5*max(屏幕宽,高)/鱼高度
    Crashlytics.a("detailed_buffer", i);	// 统计信息,可忽略该行
    SonarBackground localSonarBackground = new SonarBackground(this);	// 声纳背景
    DetectedGround localDetectedGround = new DetectedGround();		// 探测背景
    RawRenderer localRawRenderer = new RawRenderer(i);	// 渲染
    this.N.a(localSonarBackground, localDetectedGround, localRawRenderer);
    this.M.a(localSonarBackground, localDetectedGround, localRawRenderer);
    return;
  }
}

private void o()
{
  int i = getResources().getDimensionPixelOffset(2131230778);	// sonar_scale_margin_bottom
  int j = this.W.getHeight();
  if (j == 0) {
    j = ViewTools.a(0.9F * ViewTools.b(this));
  }
  int k = ViewTools.a(ViewTools.a(0.8F * (j - i)) / 9.0F);
  this.R.setTextSize(0, k);
  this.S.setTextSize(0, k);
} 

private void p()
{
  if (!this.af) {}
  int i;
  do
  {
    do
    {
      do
      {
        return;
        this.af = false;
        i = this.ad.getInt("MainAct_launchCounterForOptionsDrawer", 0);
      } while (i < 0);
      this.ad.edit().putInt("MainAct_launchCounterForOptionsDrawer", i + 1).apply();
      this.z.setOnPanelListener(new MainDeeperActivity.6(this));
    } while ((!this.ad.getBoolean("has_deeper", false)) || ((i != 0) && (i != 4) && ((i <= 4) || (!MathUtils.a(i)))));
    this.ag = true;
    this.z.a(true, false);
    this.ag = false;
  } while (i >= 10);
  new Handler().postDelayed(new MainDeeperActivity.7(this), 900L);
}

/* Error */
private void q()
{
  // Byte code:
  //   0: iconst_1
  //   1: istore_1
  //   2: aload_0
  //   3: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   6: ldc_w 1102
  //   9: invokeinterface 1105 2 0
  //   14: ifeq +33 -> 47
  //   17: aload_0
  //   18: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   21: ldc_w 1107
  //   24: iconst_0
  //   25: invokeinterface 620 3 0
  //   30: iconst_3
  //   31: if_icmpeq +15 -> 46
  //   34: new 1109	com/telesoftas/deeper/activities/MainDeeperActivity$SendEmailTask
  //   37: dup
  //   38: aload_0
  //   39: aconst_null
  //   40: invokespecial 1112	com/telesoftas/deeper/activities/MainDeeperActivity$SendEmailTask:<init>	(Lcom/telesoftas/deeper/activities/MainDeeperActivity;Lcom/telesoftas/deeper/activities/MainDeeperActivity$1;)V
  //   43: invokevirtual 1114	com/telesoftas/deeper/activities/MainDeeperActivity$SendEmailTask:g	()V
  //   46: return
  //   47: aload_0
  //   48: invokevirtual 726	com/telesoftas/deeper/activities/MainDeeperActivity:getResources	()Landroid/content/res/Resources;
  //   51: invokevirtual 1118	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
  //   54: getfield 1123	android/content/res/Configuration:locale	Ljava/util/Locale;
  //   57: invokevirtual 1126	java/util/Locale:getLanguage	()Ljava/lang/String;
  //   60: ldc_w 1128
  //   63: invokevirtual 802	java/lang/String:equals	(Ljava/lang/Object;)Z
  //   66: ifeq -20 -> 46
  //   69: aload_0
  //   70: invokestatic 1131	com/telesoftas/utilities/deeper/SettingsUtils:e	(Landroid/content/Context;)Z
  //   73: ifeq -27 -> 46
  //   76: aload_0
  //   77: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   80: ldc_w 1133
  //   83: aconst_null
  //   84: invokeinterface 1136 3 0
  //   89: astore 7
  //   91: aload 7
  //   93: invokestatic 1142	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
  //   96: ifeq +128 -> 224
  //   99: aload_0
  //   100: getfield 229	com/telesoftas/deeper/activities/MainDeeperActivity:aB	Lcom/telesoftas/deeper/activities/MainDeeperActivity$CheckCountry;
  //   103: invokevirtual 1143	com/telesoftas/deeper/activities/MainDeeperActivity$CheckCountry:a	()V
  //   106: aload_0
  //   107: iconst_1
  //   108: putfield 237	com/telesoftas/deeper/activities/MainDeeperActivity:r	Z
  //   111: return
  //   112: astore_2
  //   113: aconst_null
  //   114: astore_3
  //   115: aconst_null
  //   116: astore 4
  //   118: iconst_0
  //   119: istore 5
  //   121: iconst_0
  //   122: istore 6
  //   124: iload 6
  //   126: ifeq +96 -> 222
  //   129: iload 5
  //   131: ifeq +25 -> 156
  //   134: aload_0
  //   135: invokevirtual 1146	com/telesoftas/deeper/activities/MainDeeperActivity:m	()Lcom/google/analytics/tracking/android/EasyTracker;
  //   138: ldc_w 1148
  //   141: ldc_w 1150
  //   144: aload 4
  //   146: aload_3
  //   147: invokestatic 1155	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
  //   150: invokevirtual 1158	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
  //   153: invokevirtual 1163	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
  //   156: aload_0
  //   157: invokevirtual 1146	com/telesoftas/deeper/activities/MainDeeperActivity:m	()Lcom/google/analytics/tracking/android/EasyTracker;
  //   160: ldc_w 1148
  //   163: ldc_w 1165
  //   166: aconst_null
  //   167: aconst_null
  //   168: invokestatic 1155	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
  //   171: invokevirtual 1158	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
  //   174: invokevirtual 1163	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
  //   177: iload 5
  //   179: ifeq +576 -> 755
  //   182: aload_0
  //   183: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   186: invokeinterface 1060 1 0
  //   191: ldc_w 1167
  //   194: invokestatic 1173	java/lang/System:currentTimeMillis	()J
  //   197: invokeinterface 1177 4 0
  //   202: ldc_w 1179
  //   205: iload_1
  //   206: invokeinterface 1066 3 0
  //   211: invokeinterface 1069 1 0
  //   216: aload_0
  //   217: aload 4
  //   219: invokespecial 1181	com/telesoftas/deeper/activities/MainDeeperActivity:d	(Ljava/lang/String;)V
  //   222: aload_2
  //   223: athrow
  //   224: ldc_w 1182
  //   227: ldc_w 1184
  //   230: ldc_w 1186
  //   233: ldc_w 1188
  //   236: invokestatic 1193	com/google/common/collect/ImmutableMap:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap;
  //   239: astore 8
  //   241: aload 8
  //   243: aload 7
  //   245: invokeinterface 1198 2 0
  //   250: ifeq -204 -> 46
  //   253: new 346	java/util/GregorianCalendar
  //   256: dup
  //   257: invokespecial 347	java/util/GregorianCalendar:<init>	()V
  //   260: astore 9
  //   262: aload 9
  //   264: aload 8
  //   266: aload 7
  //   268: invokeinterface 1201 2 0
  //   273: checkcast 567	java/lang/String
  //   276: invokestatic 1205	com/telesoftas/deeper/Tags:a	(Ljava/lang/String;)Ljava/lang/String;
  //   279: invokestatic 1208	com/telesoftas/utilities/StringUtils:a	(Ljava/lang/String;)Ljava/util/GregorianCalendar;
  //   282: invokestatic 1213	com/fridaylab/util/TimeSpan$DAY:a	(Ljava/util/GregorianCalendar;Ljava/util/GregorianCalendar;)Z
  //   285: istore 11
  //   287: iload 11
  //   289: ifne -243 -> 46
  //   292: new 266	android/content/Intent
  //   295: dup
  //   296: ldc_w 1215
  //   299: ldc_w 1217
  //   302: invokestatic 1221	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
  //   305: invokespecial 1224	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
  //   308: astore 12
  //   310: aload_0
  //   311: invokevirtual 275	com/telesoftas/deeper/activities/MainDeeperActivity:getPackageManager	()Landroid/content/pm/PackageManager;
  //   314: aload 12
  //   316: iconst_0
  //   317: invokevirtual 1230	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
  //   320: invokeinterface 1233 1 0
  //   325: ifeq -279 -> 46
  //   328: aload_0
  //   329: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   332: ldc_w 1179
  //   335: iconst_0
  //   336: invokeinterface 620 3 0
  //   341: iconst_5
  //   342: if_icmpge -296 -> 46
  //   345: aload 9
  //   347: invokevirtual 1236	java/util/GregorianCalendar:getTimeInMillis	()J
  //   350: lstore 13
  //   352: aload_0
  //   353: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   356: ldc_w 1167
  //   359: invokeinterface 1105 2 0
  //   364: ifeq +124 -> 488
  //   367: aload_0
  //   368: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   371: ldc_w 1167
  //   374: lload 13
  //   376: invokeinterface 1240 4 0
  //   381: lstore 23
  //   383: lload 13
  //   385: lload 23
  //   387: lsub
  //   388: ldc2_w 1241
  //   391: lcmp
  //   392: ifle +421 -> 813
  //   395: iload_1
  //   396: istore 25
  //   398: ldc_w 1244
  //   401: astore 26
  //   403: iload 25
  //   405: ifeq -359 -> 46
  //   408: aload_0
  //   409: invokevirtual 1146	com/telesoftas/deeper/activities/MainDeeperActivity:m	()Lcom/google/analytics/tracking/android/EasyTracker;
  //   412: ldc_w 1148
  //   415: ldc_w 1165
  //   418: aconst_null
  //   419: aconst_null
  //   420: invokestatic 1155	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
  //   423: invokevirtual 1158	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
  //   426: invokevirtual 1163	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
  //   429: iconst_1
  //   430: aload_0
  //   431: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   434: ldc_w 1179
  //   437: iconst_0
  //   438: invokeinterface 620 3 0
  //   443: iadd
  //   444: istore 27
  //   446: aload_0
  //   447: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   450: invokeinterface 1060 1 0
  //   455: ldc_w 1167
  //   458: invokestatic 1173	java/lang/System:currentTimeMillis	()J
  //   461: invokeinterface 1177 4 0
  //   466: ldc_w 1179
  //   469: iload 27
  //   471: invokeinterface 1066 3 0
  //   476: invokeinterface 1069 1 0
  //   481: aload_0
  //   482: aload 26
  //   484: invokespecial 1181	com/telesoftas/deeper/activities/MainDeeperActivity:d	(Ljava/lang/String;)V
  //   487: return
  //   488: aload_0
  //   489: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   492: ldc_w 1246
  //   495: invokeinterface 1105 2 0
  //   500: ifeq +209 -> 709
  //   503: lload 13
  //   505: aload_0
  //   506: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   509: ldc_w 1246
  //   512: lload 13
  //   514: invokeinterface 1240 4 0
  //   519: invokestatic 1249	com/fridaylab/util/TimeSpan$DAY:a	(JJ)I
  //   522: istore 20
  //   524: iload 20
  //   526: i2l
  //   527: invokestatic 1255	java/lang/Long:valueOf	(J)Ljava/lang/Long;
  //   530: astore 21
  //   532: aload 21
  //   534: astore_3
  //   535: iload 20
  //   537: bipush 7
  //   539: if_icmple +268 -> 807
  //   542: iload_1
  //   543: istore 22
  //   545: iload 22
  //   547: istore 15
  //   549: aload 9
  //   551: bipush 7
  //   553: invokevirtual 1257	java/util/GregorianCalendar:get	(I)I
  //   556: istore 16
  //   558: iload 16
  //   560: iconst_5
  //   561: if_icmpeq +10 -> 571
  //   564: iload 16
  //   566: bipush 6
  //   568: if_icmpne +173 -> 741
  //   571: aload 9
  //   573: bipush 9
  //   575: invokevirtual 1257	java/util/GregorianCalendar:get	(I)I
  //   578: istore 17
  //   580: iload 17
  //   582: iload_1
  //   583: if_icmpne +158 -> 741
  //   586: iload_1
  //   587: istore 18
  //   589: iload 18
  //   591: ifeq +156 -> 747
  //   594: ldc_w 1259
  //   597: astore 4
  //   599: iload 18
  //   601: ifeq +19 -> 620
  //   604: aload_3
  //   605: ifnonnull +196 -> 801
  //   608: lconst_0
  //   609: invokestatic 1255	java/lang/Long:valueOf	(J)Ljava/lang/Long;
  //   612: astore 19
  //   614: aload 19
  //   616: astore_3
  //   617: iload_1
  //   618: istore 15
  //   620: iload 15
  //   622: ifeq -576 -> 46
  //   625: aload_0
  //   626: invokevirtual 1146	com/telesoftas/deeper/activities/MainDeeperActivity:m	()Lcom/google/analytics/tracking/android/EasyTracker;
  //   629: ldc_w 1148
  //   632: ldc_w 1150
  //   635: aload 4
  //   637: aload_3
  //   638: invokestatic 1155	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
  //   641: invokevirtual 1158	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
  //   644: invokevirtual 1163	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
  //   647: aload_0
  //   648: invokevirtual 1146	com/telesoftas/deeper/activities/MainDeeperActivity:m	()Lcom/google/analytics/tracking/android/EasyTracker;
  //   651: ldc_w 1148
  //   654: ldc_w 1165
  //   657: aconst_null
  //   658: aconst_null
  //   659: invokestatic 1155	com/google/analytics/tracking/android/MapBuilder:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/analytics/tracking/android/MapBuilder;
  //   662: invokevirtual 1158	com/google/analytics/tracking/android/MapBuilder:a	()Ljava/util/Map;
  //   665: invokevirtual 1163	com/google/analytics/tracking/android/EasyTracker:a	(Ljava/util/Map;)V
  //   668: aload_0
  //   669: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   672: invokeinterface 1060 1 0
  //   677: ldc_w 1167
  //   680: invokestatic 1173	java/lang/System:currentTimeMillis	()J
  //   683: invokeinterface 1177 4 0
  //   688: ldc_w 1179
  //   691: iload_1
  //   692: invokeinterface 1066 3 0
  //   697: invokeinterface 1069 1 0
  //   702: aload_0
  //   703: aload 4
  //   705: invokespecial 1181	com/telesoftas/deeper/activities/MainDeeperActivity:d	(Ljava/lang/String;)V
  //   708: return
  //   709: aload_0
  //   710: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   713: invokeinterface 1060 1 0
  //   718: ldc_w 1246
  //   721: lload 13
  //   723: invokeinterface 1177 4 0
  //   728: invokeinterface 1069 1 0
  //   733: aconst_null
  //   734: astore_3
  //   735: iconst_0
  //   736: istore 15
  //   738: goto -189 -> 549
  //   741: iconst_0
  //   742: istore 18
  //   744: goto -155 -> 589
  //   747: ldc_w 1261
  //   750: astore 4
  //   752: goto -153 -> 599
  //   755: iconst_1
  //   756: aload_0
  //   757: getfield 610	com/telesoftas/deeper/activities/MainDeeperActivity:ad	Landroid/content/SharedPreferences;
  //   760: ldc_w 1179
  //   763: iconst_0
  //   764: invokeinterface 620 3 0
  //   769: iadd
  //   770: istore_1
  //   771: goto -589 -> 182
  //   774: astore_2
  //   775: iload 15
  //   777: istore 6
  //   779: aconst_null
  //   780: astore 4
  //   782: iconst_0
  //   783: istore 5
  //   785: goto -661 -> 124
  //   788: astore_2
  //   789: iload_1
  //   790: istore 5
  //   792: iload_1
  //   793: istore 6
  //   795: goto -671 -> 124
  //   798: astore 10
  //   800: return
  //   801: iload_1
  //   802: istore 15
  //   804: goto -184 -> 620
  //   807: iconst_0
  //   808: istore 22
  //   810: goto -265 -> 545
  //   813: iconst_0
  //   814: istore 25
  //   816: aconst_null
  //   817: astore 26
  //   819: goto -416 -> 403
  // Local variable table:
  //   start	length	slot	name	signature
  //   0	822	0	this	MainDeeperActivity
  //   1	801	1	i	int
  //   112	111	2	localObject1	Object
  //   774	1	2	localObject2	Object
  //   788	1	2	localObject3	Object
  //   114	621	3	localObject4	Object
  //   116	665	4	str1	String
  //   119	672	5	j	int
  //   122	672	6	k	int
  //   89	178	7	str2	String
  //   239	26	8	localImmutableMap	com.google.common.collect.ImmutableMap
  //   260	312	9	localGregorianCalendar	GregorianCalendar
  //   798	1	10	localNumberFormatException	java.lang.NumberFormatException
  //   285	3	11	bool	boolean
  //   308	7	12	localIntent	Intent
  //   350	372	13	l1	long
  //   547	256	15	m	int
  //   556	13	16	i1	int
  //   578	6	17	i2	int
  //   587	156	18	i3	int
  //   612	3	19	localLong1	Long
  //   522	18	20	i4	int
  //   530	3	21	localLong2	Long
  //   543	266	22	i5	int
  //   381	5	23	l2	long
  //   396	419	25	i6	int
  //   401	417	26	str3	String
  //   444	26	27	i7	int
  // Exception table:
  //   from	to	target	type
  //   47	111	112	finally
  //   224	262	112	finally
  //   262	287	112	finally
  //   292	383	112	finally
  //   488	532	112	finally
  //   709	733	112	finally
  //   549	558	774	finally
  //   571	580	774	finally
  //   608	614	788	finally
  //   262	287	798	java/lang/NumberFormatException
}

private void r()
{
  this.p = a(2130837510, 2130837516, 1210, 516, 0, null);
  // (amzn_email,amzn_send)
}

private void s()
{
  float f1 = -1.0F;
  this.aw.clear();	// Spannable:设置文本对应的超链接或单独设置个别字的颜色字体等
  this.aw.clearSpans(); // 清除该可编辑文本的所有Spans
  if (this.ah)
  {
    ImagingSignal localImagingSignal = DeeperDataManager.a().d();	// d()返回成员ImagingSignal d
    		// d在DeeperDataManager类中被赋值DeeperFishDataPacket(继承自ImagingSignal)类型，
    if (localImagingSignal != null) {
      f1 = localImagingSignal.f();	// 深度信息 ImagingSigna中的float b成员变量
    }
  }
  for (float f2 = f1;; f2 = f1)
  {
    int i;
    int j;
    boolean bool1;
    if (f2 > 0.0F)	// 如果深度>0
    {
      boolean bool2 = DeeperDeviceManager.a(this, f2);
      double d = MathUtils.a(41.439999F * f2, n);
      String str = L.format(d);	// double转换成String
      int k = str.indexOf('.');
      if (k < 0) {	// 没有小数点
        k = str.length();	// k 返回字符串长度(整数部分长度)
      }
      this.aw.append(str);
      i = this.aw.length();	// 水深度文本长度
      j = k;				// 整数部分长度
      bool1 = bool2;
      this.aw.append(this.as);	// 加上单位：米 ft等
      if (j != i) {				// 有小数点
        this.aw.setSpan(this.au, j, i, Spanned.SPAN_MARK_MARK);	// Spanned.SPAN_MARK_MARK = 17
      }
      this.aw.setSpan(this.av, i, this.aw.length(), Spanned.SPAN_MARK_MARK);
      if (!bool1) {	// 全局DeeperDeviceManager未被创建
        break label266;
      }
      if (!this.ay.b()) {	// ay: ColorOscillator 若 ay内部的两个成员变量都为null
        this.ay.a(this.t, this.Q);	// 执行显示动画
      }
    }
    for (;;)
    {
      this.Q.setText(this.aw);	// 显示带单位和spannable的深度信息
      this.S.setText(this.aw);	// 
      return;
      this.aw.append("---");
      i = 3;
      j = i;
      bool1 = false;
      break;
      label266:
      if (this.ay.b())	//  ay: ColorOscillator 若 ay内部的两个成员变量至少有一个存在
      {
        this.ay.a();	// 清除操作?
        this.Q.setTextColor(-1);	// 透明
      }
    }
  }
}

// 根据设置文件来设置声音总开关
private void t()
{
  String str = SettingsUtils.m;
  if (this.ad.getInt(str, 1) == 1)
  {
    w();
    return;
  }
  x();
}

// 打开睡眠模式
private void u()
{
  this.am = false;	// 睡眠打开
  this.J.setBackgroundResource(2130837695);	// ic_sleep
  findViewById(2131296414).setVisibility(View.GONE);// sleep_curtains
   
  this.I.d().d();	// crash
}

// 关闭睡眠模式
private void v()
{
  this.am = true;	// 睡眠关闭
  this.J.setBackgroundResource(2130837696);	// ic_sleep_off
  if (this.al.c().a == CommunicationProtocol$ConnectionState.f) {	// f:"Established" 建立连接状态
    findViewById(2131296414).setVisibility(View.VISIBLE); // sleep_curtains
  }
  this.I.d().e(); // crash
}

private void w()
{
  this.C.setBackgroundResource(2130837699);	// ic_sound
  this.I.d().b(true);
}

private void x()
{
  this.C.setBackgroundResource(2130837700);	// ic_sound_off
  this.I.d().b(false);
}

// 根据prefs设置深度和温度单位
private void y()
{
  String str = SettingsUtils.a;
  if ((Locale.getDefault().equals(Locale.US)) && (!this.ad.contains(str))) {
    this.ad.edit().putInt(str, 1).apply();
  }
  n = this.ad.getInt(str, 0);
  switch (n)
  {
  default: 
    this.as = getString(2131427513);	// metre
    this.at = getString(2131427340);	// celsius 摄氏
    return;
  case 1: 
    this.as = getString(2131427424);	// feet
    this.at = getString(2131427421);	// farenheit 华氏
    return;
  case 2: 
    this.as = getString(2131427422);	// fathom
    this.at = getString(2131427421);	// farenheit
    return;
  }
  this.as = getString(2131427424);		// feet
  this.at = getString(2131427340);		// celsius
}

// 打开日历
private void z()
{
  startActivity(new Intent(this, CalendarTabletActivity.class));
}

public void a()
{
  this.al.c().b.a(false);
}

// 设置显示蓝牙打开图标
public void a(int paramInt)
{
  ImageView localImageView = (ImageView)findViewById(2131296425);	// img_btIcon
  localImageView.setImageResource(2130837645); // ic_bluetooth_on 蓝牙打开
 
}

// 设置设备电池电量显示
public void a(int iBatLevel, boolean isCharging)
{

  ImageView localImageView = (ImageView)findViewById(2131296427);	// img_batteryIcon
  TextView localTextView = (TextView)findViewById(2131296428);	// batteryLevel
  if (iBatLevel <= 100)
  {
    localImageView.setVisibility(View.VISIBLE);	// 显示电池图标
    if (isCharging)
    {
      localImageView.setImageResource(2130837538);	// battery_charger
      a(localImageView, iBatLevel);	// 显示具体电路值的图标,及充电动画
      localImageView.setImageLevel(iBatLevel); // 
      localTextView.setText(iBatLevel + "%");	// 显示电量文字
     
    }
 
    if ((isCharging) || (iBatLevel > 15)) {	// 在充电或者电量值>15%
    	      
    }
    else{ // 电量低于15% 且 没在充电时,即显示红色数字提示电量低
    	for (int i = this.colorWarningRed;; i = -1)
        {
          localTextView.setTextColor(i);	// 设置电量低红色告警字体
          if ((isCharging) || (iBatLevel > 10) || (iBatLevel <= 0)) {
            break;
          }
          if (localImageView.getAnimation() == null) {
            localImageView.startAnimation(AnimationUtils.loadAnimation(this, 2130968582));	// warning_blink
          }
          return;
//          this.iCurrentBatLevel = 0;
//          localImageView.setBackgroundResource(0);
//          localImageView.setImageResource(2130837546);	// battery_status 显示电量图标
//          break;
        }
    }
    
    localImageView.clearAnimation();
    return;
  } 
  else {	// 非正常电量值,则清空电量显示
	  localImageView.clearAnimation();
	  localImageView.setVisibility(View.INVISIBLE);
	  localTextView.setText("");
	  return;
  		}
  
}

// 根据百分比 显示电量不同电量值
public void a(ImageView batImageView, int iBatLevel)
{
  int i = 1;
  int j = 0;
  if (iBatLevel < 25) {
    j = 2130837539;		// battery_charging_0
  }
  if (this.iCurrentBatLevel == j)
  {
    if (iBatLevel < 50)
    {
      j = 2130837540;	// battery_charging_25
    }
    else if (iBatLevel < 75)
    {
      j = 2130837541;	// battery_charging_50
    }
    else if (iBatLevel < 100)
    {
      j = 2130837542;	// battery_charging_75
    }
    else
    {
      j = 2130837528;	// battery_100
      i = 0;			// 电量满值
    }
  }
  // 显示电量值
  batImageView.setBackgroundResource(j);
  
  if (i != 0)			// 电量不满
  {
    this.iCurrentBatLevel = j;		// 保存当前电量到变量
    ((AnimationDrawable)batImageView.getBackground()).start();	// 显示充电动画
    return;
  }
  return;
}

// 通过蓝牙去连接设备
public void a(CommunicationProtocol.ConnectionInfo paramConnectionInfo, boolean paramBoolean)
{
  if (this.I.d().b() != null)
  {
    CommunicationProtocol.ConnectionState localConnectionState = CommunicationProtocol.ConnectionState.f;
    paramConnectionInfo = new CommunicationProtocol.ConnectionInfo(localConnectionState, null);
  }
  int i;
  boolean bool2;
  boolean bool4;
  float f1;
  boolean bool1;
  int j;
  boolean bool3;
  switch (MainDeeperActivity$16.a[paramConnectionInfo.a.ordinal()])
  {
  default: 
    this.A.setText(2131427394);	// string "Deeper is disconnected"
    i = 0;
    bool2 = false;
    bool4 = false;
    f1 = -1.0F;
    bool1 = false;
    j = 666;
    bool3 = false;
  }
  for (;;)
  {
    label122:
    a(paramConnectionInfo);
    label155:
    label175:
    boolean bool5;
    label200:
    boolean bool8;
    boolean bool7;
    float f3;
    label361:
    int m;
    label428:
    label822:
    boolean bool6;
    label810:
    float f2;
    if (paramConnectionInfo.a != CommunicationProtocol.ConnectionState.f)
    {
      a(-1);
      a(200, false);
      this.an = false;
      if (i == 0) {
        break label1328;
      }
      this.K.setVisibility(View.VISIBLE);
      this.B.setVisibility(View.INVISIBLE);
      this.ah = bool1;
      SceneView localSceneView = this.M;
      if (paramConnectionInfo.a != CommunicationProtocol.ConnectionState.f) {
        break label1347;
      }
      bool5 = true;
      localSceneView.a(false, bool5);
      s();
      b(j);
      if (paramBoolean)
      {
        a(bool2, paramConnectionInfo.b);
        d(bool4);
        a(bool3, f1);
      }
      return;
      int k;
      if (paramConnectionInfo.b == null)
      {
        String str1 = "";
        if (!"recording_ice.csv".equals(this.I.d().b())) {
          str1 = " (" + getString(2131427598) + " ×2)";	// simulation_speed
        }
        String str2 = getString(2131427393) + str1;	// deeper_demo
        this.A.setText(str2);
        k = 0;
        bool8 = false;
        bool7 = false;
        f3 = -1.0F;
        if (k != 0) {
          this.A.setText(getString(2131427391) + " " + paramConnectionInfo.b.a());	// deeper_connected
        }
        if (paramConnectionInfo.b != null) {
          break label810;
        }
        m = this.I.d().c();
        if ((paramConnectionInfo.b != null) && ((paramConnectionInfo.b.n()) || (paramConnectionInfo.b.m()))) {
          break label822;
        }
      }
      for (bool1 = true;; bool1 = false)
      {
        if (!this.ar)
        {
          this.ar = true;
          m().a(MapBuilder.a("deeper", Long.valueOf(TimeSpan.a(System.nanoTime() - this.aq)), "connected", null).a());
        }
        if ((this.an) || (!GlobalBluetoothOutputStream.a().b())) {
          break label1391;
        }
        if (this.am)	// 睡眠模式打开
        {
          this.I.d().e();
          findViewById(2131296414).setVisibility(View.VISIBLE);	// sleep_curtains
        }
        this.an = true;
        bool4 = bool8;
        bool3 = bool7;
        f1 = f3;
        j = m;
        i = 0;
        bool2 = false;
        break;
        if (paramConnectionInfo.b.k())
        {
          k = 1;
          bool8 = true;
          f3 = -1.0F;
          bool7 = false;
          break label361;
        }
        if (paramConnectionInfo.b.j())
        {
          float f4 = paramConnectionInfo.b.l();
          k = 1;
          bool7 = true;
          f3 = f4;
          bool8 = false;
          break label361;
        }
        if (paramConnectionInfo.b.m())
        {
          this.A.setText(2131427400);	// deeper_too_shallow_water
          f3 = -1.0F;
          k = 0;
          bool7 = false;
          bool8 = false;
          break label361;
        }
        if (paramConnectionInfo.b.n())
        {
          this.A.setText(2131427396);	// deeper_out_of_water
          f3 = -1.0F;
          k = 0;
          bool7 = false;
          bool8 = false;
          break label361;
        }
        if (paramConnectionInfo.b.p())
        {
          this.A.setText(2131427389);	// deeper_charging
          f3 = -1.0F;
          k = 0;
          bool7 = false;
          bool8 = false;
          break label361;
        }
        if (paramConnectionInfo.b.o())
        {
          this.A.setText(2131427387);	// deeper_battery_empty
          a(0, false);
          f3 = -1.0F;
          k = 0;
          bool7 = false;
          bool8 = false;
          break label361;
        }
        k = 1;
        f3 = -1.0F;
        bool7 = false;
        bool8 = false;
        break label361;
        m = paramConnectionInfo.b.f();
        break label428;
      }
      if (!paramConnectionInfo.b.j()) {
        break label1380;
      }
      bool6 = true;
      f2 = paramConnectionInfo.b.l();
    }
    for (;;)
    {
      this.A.setText(getString(2131427392) + " " + paramConnectionInfo.b.a());	// deeper_connecting
      bool3 = bool6;
      f1 = f2;
      i = 1;
      j = 666;
      bool1 = false;
      bool2 = false;
      bool4 = false;
      break label122;
      this.A.setText(2131427399);	// deeper_searching
      f1 = -1.0F;
      j = 666;
      i = 0;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      break label122;
      this.A.setText(2131427548);	// string "Not found"
      if (this.ar) {
        break;
      }
      this.ar = true;
      m().a(MapBuilder.a("deeper", Long.valueOf(TimeSpan.a(System.nanoTime() - this.aq)), "not found", null).a());
      f1 = -1.0F;
      j = 666;
      i = 0;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      break label122;
      if ((paramConnectionInfo.b != null) && (paramConnectionInfo.b.o()))
      {
        this.A.setText(2131427387);	// deeper_battery_empty
        f1 = -1.0F;
        j = 666;
        i = 0;
        bool1 = false;
        bool2 = false;
        bool3 = false;
        bool4 = false;
        break label122;
      }
      this.A.setText(2131427394);	// string "Deeper is disconnected"
      f1 = -1.0F;
      j = 666;
      i = 0;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      break label122;
      if (!this.ar)
      {
        this.ar = true;
        m().a(MapBuilder.a("deeper", Long.valueOf(TimeSpan.a(System.nanoTime() - this.aq)), "found unpaired", null).a());
        f1 = -1.0F;
        bool2 = true;
        j = 666;
        i = 0;
        bool1 = false;
        bool3 = false;
        bool4 = false;
        break label122;
        this.A.setText(2131427388);	// deeper_bluetooth_connection_is_lost
        f1 = -1.0F;
        j = 666;
        i = 0;
        bool1 = false;
        bool2 = false;
        bool3 = false;
        bool4 = false;
        break label122;
        this.A.setText(2131427398);	// deeper_restoring_connection
        i = 1;
        f1 = -1.0F;
        j = 666;
        bool1 = false;
        bool2 = false;
        bool3 = false;
        bool4 = false;
        break label122;
        if (paramConnectionInfo.b == null)
        {
          a(100);
          a(68, false);
          break label155;
        }
        a(100);
        a(paramConnectionInfo.b.e(), paramConnectionInfo.b.p());
        break label155;
        label1328:
        this.K.setVisibility(View.INVISIBLE);
        this.B.setVisibility(View.VISIBLE);
        break label175;
        label1347:
        bool5 = false;
        break label200;
      }
      f1 = -1.0F;
      bool2 = true;
      j = 666;
      i = 0;
      bool1 = false;
      bool3 = false;
      bool4 = false;
      break label122;
      label1380:
      f2 = -1.0F;
      bool6 = false;
    }
    label1391:
    bool4 = bool8;
    bool3 = bool7;
    f1 = f3;
    j = m;
    i = 0;
    bool2 = false;
  }
}

public void a(NoteEntry paramNoteEntry, boolean paramBoolean, GregorianCalendar paramGregorianCalendar)
{
  c(false);
  this.E.c();
}

public void a(Object paramObject)
{
  if (this.Z != null) {
    a(this.Z.a());
  }
}

void a(String paramString, boolean paramBoolean)
{
  l();
  this.al.a(paramString, paramBoolean);
}

public void b(Object paramObject) {}

void b(String paramString)
{
  l();
  Boolean localBoolean = DeeperModel.c(paramString);
  if (localBoolean == null)
  {
    this.al.a(paramString, false);
    return;
  }
  if (localBoolean.booleanValue())
  {
    this.al.a(paramString);
    return;
  }
  a(new CommunicationProtocol$ConnectionInfo(CommunicationProtocol$ConnectionState.d, DeeperModel.b(paramString)), true);
}

public void c(String paramString)
{
  Intent localIntent = new Intent();
  localIntent.setFlags(524288);
  localIntent.setAction("android.settings.BLUETOOTH_SETTINGS");
  startActivity(localIntent);
  this.v = paramString;
}

public void c(GregorianCalendar paramGregorianCalendar)
{
  c(false);
}

// 该函数估计跟照片存取有关,暂不做分析
public void g()
{
  boolean bool = this.U;
  EditText localEditText = null;
  if (bool)
  {
    LogEditFragment localLogEditFragment = this.Z;
    localEditText = null;
    if (localLogEditFragment != null)
    {
      localEditText = this.Z.a();
      if (!FileUtils.a()) {
        break label84;
      }
      this.Z.P();
    }
  }
  if ((this.T) && (this.aa != null))
  {
    localEditText = this.aa.b();
    if (!FileUtils.a()) {
      break label94;
    }
    this.aa.a();
  }
  for (;;)
  {
    a(localEditText);
    return;
    label84:
    d(2131427546);	// no_sdcard
    break;
    label94:
    d(2131427546);	// no_sdcard
  }
}

public Boolean h()
{
  o();
  q();
  return null;
}

public void i()
{
  if (this.U) {
    c(false);
  }
  if (this.T) {
    J();
  }
}

void k()
{
  CommunicationProtocol.ConnectionInfo localConnectionInfo = this.al.c();
  int i;
  int j;
  label171:
  View localView;
  int k;
  if ((localConnectionInfo.a == CommunicationProtocol.ConnectionState.f) && (!localConnectionInfo.b.i()))
  {
    i = 1;
    if (i != 0) {
      this.ad.edit().putInt(SettingsUtils.s, 0).apply();
    }
    if (this.ad.getInt(SettingsUtils.s, 0) != 1) {
      break label217;
    }
    if (this.ap != 1)
    {
      this.G.e();
      this.G.a(0.1F);
      this.Q.setVisibility(View.GONE);
      this.P.setVisibility(View.GONE);
      this.S.setVisibility(View.VISIBLE);
      this.R.setVisibility(View.VISIBLE);
      this.C.setVisibility(View.GONE);
      this.O.setVisibility(View.INVISIBLE);
    }
    if (this.ad.getInt(SettingsUtils.t, 1) != 1) {
      break label205;
    }
    j = 1;
    localView = findViewById(2131296411);	// ice_flasher
    k = 0;
    if (j == 0) {
      break label210;
    }
  }
  for (;;)
  {
    localView.setVisibility(k);
    this.ap = 1;
    return;
    i = 0;
    break;
    label205:
    j = 0;
    break label171;
    label210:
    k = 8;
  }
  label217:
  if (this.ap != 0)
  {
    this.G.e();
    this.G.a(this.ad.getInt(SettingsUtils.u, 15));
    this.Q.setVisibility(View.VISIBLE);
    this.P.setVisibility(View.VISIBLE);
    this.S.setVisibility(View.INVISIBLE);
    this.R.setVisibility(View.INVISIBLE);
    this.C.setVisibility(View.VISIBLE);
    findViewById(2131296411).setVisibility(View.GONE);	// ice_flasher
    this.O.setVisibility(View.VISIBLE);
  }
  this.ap = 0;
}

void l()
{
  this.G.e();
  if (this.ad.getInt(SettingsUtils.s, 0) == 1) {}
  for (float f = 0.1F;; f = this.ad.getInt(SettingsUtils.u, 15))
  {
    this.G.a(f);
    return;
  }
}

protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
{
  switch (paramInt1)
  {
  default: 
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  do
  {
    do
    {
      return;
      if (paramInt2 != -1) {
        break;
      }
    } while (this.aD == null);
    ImageUtils.a(this.aD.getAbsolutePath(), 200, 200);
    if (this.H)
    {
      if (this.T)
      {
        this.aa.b(this.aD.getAbsolutePath());
        return;
      }
      this.Z.a(this.aD.getAbsolutePath());
      H();
      return;
    }
    Intent localIntent = new Intent(getBaseContext(), LogActivity.class);
    localIntent.putExtra("sterted_by", 1);
    localIntent.putExtra("new_photo", this.aD.getAbsolutePath());
    startActivity(localIntent);
    return;
  } while (this.aD == null);
  this.aD.delete();
  this.aD = null;
}

public void onBackPressed()
{
  if ((this.o) && (this.s != null)) {
    this.s.onClick(null);
  }
  do
  {
    do
    {
      return;
    } while (this.p);
    if (this.y.a())
    {
      this.y.a(false, true);
      return;
    }
  } while (this.V);
  if (this.T)
  {
    J();
    return;
  }
  if (this.z.a())
  {
    this.z.a(false, true);
    return;
  }
  super.onBackPressed();
  this.ai = true;
  finish();
}

// 点击事件处理函数
public void onClick(View paramView)
{
  String str2;
  switch (paramView.getId())
  {
  default: 
    if (paramView == this.C)	//	C 为点击的图片:sleep静音按钮
    {
      if (this.I.d().f())
      {
        x();
        str2 = "off";
        label77:
        m().a(MapBuilder.a("Sonar", "change_sound", str2, null).a());	// GoogleAnalytics获取用户UI使用习惯信息
      }
    }
    else if (paramView == this.J)	// ic_sleep or ic_sleep_off 休眠模式开关
    {
      if (this.am) {	// 睡眠模式打开
        break label347;
      }
      v();	// 关闭睡眠模式
    }
    break;
  }
  for (String str1 = "off";; str1 = "on")
  {
    m().a(MapBuilder.a("Sonar", "change_sleep", str1, null).a());	// 获取用户UI习惯
    if (paramView == this.B)	// 蓝牙重连图标点击
    {
      u();	// 打开睡眠模式
      this.I.d().a();	// DeeperDeviceManager 清除其FileService和DeeperDataManager成员变量
      if (this.al.c().a == CommunicationProtocol.ConnectionState.f) {
        m().a(MapBuilder.a("Hardware", "disconnect", "Reconnect", null).a());	// crash
      }
      this.al.b();	// crash
      this.ar = false; //?
      this.aq = System.nanoTime();	// 获取系统时间
      a(SettingsUtils.d(this), true);	// SettingsUtils.d(this):获取"prefs"中的默认蓝牙地址"default_deeper_address"
      // SettingsUtils类与用户设置参数相关
      // 获取蓝牙地址后，调用a(this,boolean)去重连蓝牙设备
      if (this.M != null) {	// crash
        this.M.invalidate();
      }
    }
    return;
    z();
    break;
    if (FileUtils.a())
    {
      A();
      m().a(MapBuilder.a("Sonar", "take_picture", null, null).a());
      break;
    }
    d(2131427546);	// no_sdcard
    break;
    B();
    break;
    C();
    break;
    D();
    break;
    E();
    break;
    F();
    break;
    w();
    str2 = "on";
    break label77;
    label347:
    u();	// 打开睡眠模式
  }
}

public void onConfigurationChanged(Configuration paramConfiguration)
{
  super.onConfigurationChanged(paramConfiguration);
  this.M.b();
  this.N.b();
}
// 创建主界面
public void onCreate(Bundle paramBundle)	// Bundle为key-value对
{
  super.onCreate(paramBundle);
  // LocalBroadcastManager用来在同一个应用内的不同组件间发送Broadcast
  // 注册广播接收者
  LocalBroadcastManager.getInstance(this).registerReceiver(this.az, CommunicationService.a());
  // 启动deeper通信服务
  startService(new Intent(this, CommunicationService.class));
  
  this.ad = getSharedPreferences("prefs", 0);	// 获取prefs参数
  this.ad.edit().putFloat(SettingsUtils.e, 0.0F).apply();	// 存入单位 float类型的首选项,优选apply()异步保存
  setContentView(2130903069);	// 显示界面: main_deeper_activity
  findViewById(2131296418).setOnClickListener(this);	// menu_calendar(TextView)单击事件加入到本activity的onclick中
  findViewById(2131296419).setOnClickListener(this);	// menu_camera
  findViewById(2131296420).setOnClickListener(this);	// menu_weather
  findViewById(2131296421).setOnClickListener(this);	// menu_notes
  findViewById(2131296422).setOnClickListener(this);	// menu_maps
  findViewById(2131296423).setOnClickListener(this);	// menu_sharing
  findViewById(2131296424).setOnClickListener(this);	// menu_settings
  this.z = ((Panel)findViewById(2131296442));	// options_panel 抽屉panel,操作设置
  this.y = ((Panel)findViewById(2131296436));	// history_panel 历史探测界面回顾
  this.x = ((Panel)findViewById(2131296415));	// menuPanel 
  this.O = findViewById(2131296441);	// history_panel_handle 
  this.P = ((TextView)findViewById(2131296405));	// temperature
  this.Q = ((TextView)findViewById(2131296430));	// depth
  this.R = ((TextView)findViewById(2131296413));	// ice_temperature
  this.S = ((TextView)findViewById(2131296412));	// ice_depth
  this.y.setOnPanelListener(new MainDeeperActivity$1(this));
  this.O.setOnClickListener(new MainDeeperActivity$2(this));
  TransitionDrawable localTransitionDrawable = (TransitionDrawable)findViewById(2131296429).getBackground();
  this.x.setOnPanelListener(new MainDeeperActivity$3(this, localTransitionDrawable)); // deeper_measurements
  this.x.a(true, false);
  this.A = ((TextView)findViewById(2131296435));	// deeper_status
  this.C = ((ImageView)findViewById(2131296434));	// btn_sound
  this.B = ((ImageView)findViewById(2131296431));	// btn_reconnect
  this.J = ((ImageView)findViewById(2131296433));	// btn_sleep
  this.K = findViewById(2131296432);	// btn_working
  this.B.setOnClickListener(this);	// btn_reconnect
  this.C.setOnClickListener(this);	// ic
  this.J.setOnClickListener(this);	// ic_sleep

  this.W = ((ViewGroup)findViewById(2131296368));	// loading_background
  this.X = ((RelativeLayout)findViewById(2131296369));	// log_edit_popup
  this.Y = ((ViewGroup)findViewById(2131296370));	// log_share_popup
  this.colorWarningRed = getResources().getColor(2131165194);	// warning_red
  if (this.H) {		// ??
    G();	
  }
  a(-2147483648);	// 0x80000000  显示蓝牙打开图标
  y();	// 根据prefs设置深度和温度单位
  t();	// 根据设置文件来设置声音总开关
  n();	// 显示历史回放背景和探测界面
  if (this.M != null) {	// container不为空
    this.M.invalidate();	// 请求重绘view树
  }
  if (paramBundle != null) {}
  for (boolean bool = paramBundle.getBoolean("firstLoad");; bool = true)
  {
    if (bool)	// 如果是第一次加载
    {
      b(false);  // 初始化操作?
      this.af = true; // ?
    }
    this.aq = System.nanoTime();	// 获取系统时间
    this.ar = false;
    ViewTools.a(this.W, this);		// 显示背景
    return;
  }
}

protected void onDestroy()
{
  LocalBroadcastManager.a(this).a(this.az);
  if (this.ak)
  {
    if (this.al.c().a == CommunicationProtocol.ConnectionState.f) {
      m().a(MapBuilder.a("Hardware", "disconnect", "App terminated", null).a());
    }
    this.ak = false;
    unbindService(this.aA);
  }
  if (this.N != null) {
    this.N.c();
  }
  if (this.M != null) {
    this.M.c();
  }
  if (this.ai)
  {
    if (this.G != null) {
      this.G.e();
    }
    this.I.d().a(); //  DeeperDeviceManager 清除其FileService和DeeperDataManager成员变量
  }
  super.onDestroy();
}

public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
{
  switch (paramInt)
  {
  default: 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  Panel localPanel = this.x;
  if (!this.x.a()) {}
  for (boolean bool = true;; bool = false)
  {
    localPanel.a(bool, true);
    return true;
  }
}

protected void onNewIntent(Intent paramIntent)
{
  super.onNewIntent(paramIntent);
  setIntent(paramIntent);
  b(false);
}

protected void onPause()
{
  super.onPause();
  this.ar = true;
  LocalBroadcastManager.a(this).a(this.u);
  this.ay.a();
  this.Q.setTextColor(-1);
  this.ae = true;
  this.ad.unregisterOnSharedPreferenceChangeListener(this.aE);
}

protected void onResume()
{
  super.onResume();
  this.ae = false;
  LocalBroadcastManager.a(this).a(this.u, j());
  p();
  this.ad.registerOnSharedPreferenceChangeListener(this.aE);
  SettingsUtils.c(this);
  int i = SettingsUtils.f(this);
  if (i == -1)
  {
    SettingsUtils.a(this, true);
    i = SettingsUtils.f(this);
  }
  if (this.v != null)
  {
    a(this.v, false);
    this.v = null;
  }
  if (i == 1) {}
  for (boolean bool = true;; bool = false)
  {
    if (this.N != null) {
      this.N.setShowFishDepth(bool);
    }
    y();
    if (this.M != null)
    {
      this.M.setShowFishDepth(bool);
      this.M.a(false, false);
      s();
      b(this.al.c().b.f());
    }
    b(true);
    if (this.I.d().b() != null)
    {
      a(new CommunicationProtocol.ConnectionInfo(CommunicationProtocol.ConnectionState.f, null), false);
      if (!this.q) {
        break label227;
      }
      this.q = false;
      r();
    }
    label227:
    while (!this.r)
    {
      return;
      a(this.al.c(), false);
      break;
    }
    this.r = false;
    q();
    return;
  }
}

// 系统调用onSaveInstanceState()来保存activity的一些数据
// 通过重写onSaveInstanceState()来保存我们认为有用的其他信息
protected void onSaveInstanceState(Bundle paramBundle)
{
  super.onSaveInstanceState(paramBundle);
  paramBundle.putBoolean("firstLoad", false);
}

protected void onStart()
{
  super.onStart();
  if (this.M != null) {	//	crash
    this.M.invalidate();
  }
}

protected void onStop()
{
  super.onStop();
  if ((this.N != null) && (!this.y.a())) {	//	crash 
    this.N.setVisibility(View.INVISIBLE);
  }
}
}
