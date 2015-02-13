package com.telesoftas.deeper.activities;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.fridaylab.deeper.ui.ViewTools;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.ui.fragments.CalendarFragment;
import com.telesoftas.deeper.ui.fragments.LogEditFragment;
import com.telesoftas.deeper.ui.fragments.LogEditFragment.OnLogEditListener;
import com.telesoftas.deeper.ui.fragments.LogFragment;
import com.telesoftas.deeper.ui.fragments.LogFragment.OnLogListener;
import com.telesoftas.deeper.ui.fragments.LogShareFragment;
import com.telesoftas.deeper.ui.fragments.LogShareFragment.OnLogShareListener;
import com.telesoftas.deeper.ui.views.CalendarView.OnCellSelectedListener;
import com.telesoftas.deeper.ui.views.CalendarViewAdapter;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.DisplayUtils;
import com.telesoftas.utilities.FileUtils;
import com.telesoftas.utilities.StringUtils;
import com.telesoftas.utilities.deeper.SearchBarBuilder;
import java.util.GregorianCalendar;
import java.util.List;

public class LogActivity
  extends TrackedActivity
  implements View.OnClickListener, LogEditFragment.OnLogEditListener, LogFragment.OnLogListener, LogShareFragment.OnLogShareListener, CalendarView.OnCellSelectedListener
{
  private static final String K = LogEditFragment.class.getName();
  private static final String L = LogShareFragment.class.getName();
  private static final String M = LogFragment.class.getName();
  private static final String N = CalendarFragment.class.getName();
  private boolean A = false;
  private boolean B = false;
  private boolean C = false;
  private boolean J = false;
  private int O = 0;
  private int P = 0;
  private String Q = "";
  private GregorianCalendar R = new GregorianCalendar();
  public LinearLayout n;
  private LogFragment o;
  private CalendarFragment p;
  private LogEditFragment q;
  private LogShareFragment r;
  private EditText s;
  private View t;
  private View u;
  private TextView v;
  private RelativeLayout w;
  private RelativeLayout x;
  private RelativeLayout y;
  private CalendarViewAdapter z;
  
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
        localTranslateAnimation.setAnimationListener(new LogActivity.4(this, paramInt2));
      }
      if (paramInt1 == -1) {
        localTranslateAnimation.setAnimationListener(new LogActivity.5(this, paramInt2, paramBoolean));
      }
      return localTranslateAnimation;
      localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, i);
      localTranslateAnimation.setDuration(600L);
    }
  }
  
  private Long a(NoteEntry paramNoteEntry)
  {
    if (paramNoteEntry == null) {}
    while (paramNoteEntry.a() == null) {
      return null;
    }
    return CalendarUtils.c(paramNoteEntry.a().b());
  }
  
  private void a(int paramInt)
  {
    a(this.s, true);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("pointed", false);
    this.p = new CalendarFragment();
    this.p.g(localBundle);
    a(paramInt, this.p, false, false, N);
    if (!this.H) {
      p();
    }
  }
  
  private void a(int paramInt, String paramString)
  {
    this.o = new LogFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("search_phrase", paramString);
    this.o.g(localBundle);
    a(paramInt, this.o, true, true, M);
    if (!this.H) {
      o();
    }
  }
  
  private void a(int paramInt, boolean paramBoolean, GregorianCalendar paramGregorianCalendar)
  {
    a(this.s, false);
    this.r = new LogShareFragment();
    NoteEntry localNoteEntry = this.F.a(paramGregorianCalendar);
    boolean bool = false;
    if (localNoteEntry == null)
    {
      localNoteEntry = new NoteEntry(new NoteData(paramGregorianCalendar, "", ""), null, null, null);
      bool = true;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("edit_note", localNoteEntry);
    localBundle.putBoolean("search_for_location", bool);
    this.r.g(localBundle);
    a(paramInt, this.r, true, paramBoolean, L);
    if (!this.H) {
      o();
    }
  }
  
  private void a(int paramInt, boolean paramBoolean, GregorianCalendar paramGregorianCalendar, String paramString)
  {
    a(this.s, false);
    this.q = new LogEditFragment();
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
    this.q.g(localBundle);
    a(paramInt, this.q, true, true, K);
    if (!this.H) {
      o();
    }
  }
  
  private void a(EditText paramEditText)
  {
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
  }
  
  private void b(int paramInt, boolean paramBoolean, GregorianCalendar paramGregorianCalendar)
  {
    if (paramGregorianCalendar == null) {
      this.v.setText(2131427330);
    }
    for (;;)
    {
      this.o = new LogFragment();
      Bundle localBundle = new Bundle();
      localBundle.putSerializable("selected_date", paramGregorianCalendar);
      this.o.g(localBundle);
      a(paramInt, this.o, true, paramBoolean, M);
      if (!this.H) {
        o();
      }
      return;
      this.v.setText(StringUtils.b(paramGregorianCalendar, this));
    }
  }
  
  private void c(boolean paramBoolean)
  {
    if ((this.A) && (!this.C))
    {
      this.C = true;
      a(this.q.a());
      Animation localAnimation = a(-1, 2131296369, paramBoolean);
      this.x.startAnimation(localAnimation);
    }
  }
  
  private void d(boolean paramBoolean)
  {
    if ((this.P == 0) && (this.p != null) && (this.p.p())) {
      if (this.H)
      {
        b(2131296367, false, null);
        this.P = 1;
      }
    }
    while ((this.o == null) || (!this.o.p())) {
      for (;;)
      {
        return;
        b(2131296358, true, null);
        ((ImageView)this.t).setVisibility(8);
      }
    }
    if (this.H) {
      b(2131296367, false, null);
    }
    if (!paramBoolean) {
      a(this.s, true);
    }
    this.P = 0;
  }
  
  private void k()
  {
    ViewGroup localViewGroup = (ViewGroup)findViewById(2131296358);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localViewGroup.getLayoutParams();
    localLayoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelOffset(2131230752));
    localViewGroup.setLayoutParams(localLayoutParams);
    findViewById(2131296359).setVisibility(0);
    findViewById(2131296362).setVisibility(0);
    findViewById(2131296361).setVisibility(0);
  }
  
  private void l()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    this.s.setFocusable(false);
    this.s.setOnClickListener(new LogActivity.1(this));
    this.s.setOnEditorActionListener(new LogActivity.2(this, localInputMethodManager));
    this.s.addTextChangedListener(new LogActivity.3(this));
  }
  
  private void n()
  {
    int i = ViewTools.b(this);
    int j = ViewTools.a(this);
    int k = Math.max((int)(i / 2.1D), DisplayUtils.a(this, 292));
    int m = (int)(j / 1.5D);
    int i1 = (int)((i / 2 - k) / 1.5D);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(m, k);
    localLayoutParams.addRule(14);
    this.x.setLayoutParams(localLayoutParams);
    this.x.setPadding(0, i1, 0, 0);
    this.y.setLayoutParams(localLayoutParams);
    this.y.setPadding(0, i1, 0, 0);
  }
  
  private void o()
  {
    View localView = findViewById(2131296358);
    localView.setPadding(0, localView.getPaddingTop(), 0, localView.getPaddingBottom());
  }
  
  private void p()
  {
    View localView = findViewById(2131296358);
    int i = getResources().getDimensionPixelOffset(2131230751);
    localView.setPadding(i, localView.getPaddingTop(), i, localView.getPaddingBottom());
  }
  
  private void q()
  {
    if (!this.A)
    {
      this.w.setVisibility(0);
      this.x.setVisibility(0);
      Animation localAnimation = a(1, 2131296369, false);
      this.x.startAnimation(localAnimation);
      this.s.setFocusable(false);
    }
  }
  
  private void r()
  {
    if (!this.B)
    {
      this.w.setVisibility(0);
      this.y.setVisibility(0);
      Animation localAnimation = a(1, 2131296370, false);
      this.y.startAnimation(localAnimation);
      this.s.setFocusable(false);
    }
  }
  
  private void s()
  {
    if ((this.B) && (!this.C))
    {
      this.C = true;
      a(this.r.b());
      Animation localAnimation = a(-1, 2131296370, false);
      this.y.startAnimation(localAnimation);
    }
  }
  
  private void t()
  {
    ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 2);
  }
  
  private void u()
  {
    if (((this.p != null) && (this.p.p())) || ((this.o != null) && (this.o.p())))
    {
      if (this.R.compareTo(new GregorianCalendar()) >= 1) {
        break label119;
      }
      m().a(MapBuilder.a("Notes", "create", "started", null).a());
      if (this.H)
      {
        a(2131296369, true, this.R, null);
        q();
      }
    }
    else
    {
      return;
    }
    a(2131296358, true, this.R, null);
    b(false);
    return;
    label119:
    if (this.H) {
      a(2131296369, true, this.R, null);
    }
    v();
  }
  
  private void v()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle(getString(2131427385));
    localBuilder.setMessage(getString(2131427386));
    localBuilder.setPositiveButton(getString(2131427551), new LogActivity.6(this));
    localBuilder.show();
  }
  
  public void a(Location paramLocation) {}
  
  public void a(NoteEntry paramNoteEntry, boolean paramBoolean, GregorianCalendar paramGregorianCalendar)
  {
    this.n.setVisibility(0);
    if (this.O == 1) {
      finish();
    }
    if (this.H) {
      c(true);
    }
    this.E.c();
    if (paramNoteEntry != null)
    {
      NoteData localNoteData = paramNoteEntry.a();
      if ((localNoteData != null) && (!TextUtils.isEmpty(localNoteData.c())))
      {
        long l3 = localNoteData.c().length();
        m().a(MapBuilder.a("Notes", "create_details", "caption", Long.valueOf(l3)).a());
      }
      if ((localNoteData != null) && (!TextUtils.isEmpty(localNoteData.a())))
      {
        long l2 = localNoteData.a().length();
        m().a(MapBuilder.a("Notes", "create_details", "comment", Long.valueOf(l2)).a());
      }
      if (paramNoteEntry.c() != null)
      {
        long l1 = paramNoteEntry.c().size();
        m().a(MapBuilder.a("Notes", "create_details", "photo", Long.valueOf(l1)).a());
      }
      m().a(MapBuilder.a("Notes", "create", "finished", a(paramNoteEntry)).a());
    }
  }
  
  public void a(Object paramObject)
  {
    if (this.H)
    {
      LogShareFragment localLogShareFragment = this.r;
      EditText localEditText = null;
      if (localLogShareFragment != null) {
        localEditText = this.r.b();
      }
      if (this.q != null) {
        localEditText = this.q.a();
      }
      if (localEditText != null) {
        a(localEditText);
      }
    }
  }
  
  public void a(GregorianCalendar paramGregorianCalendar)
  {
    if (this.H)
    {
      a(2131296369, false, paramGregorianCalendar, null);
      q();
      return;
    }
    b(false);
    a(2131296358, false, paramGregorianCalendar, null);
  }
  
  public void a(GregorianCalendar paramGregorianCalendar, boolean paramBoolean)
  {
    this.R = paramGregorianCalendar;
    if (this.H)
    {
      if ((this.o != null) && (this.o.p()))
      {
        b(2131296367, false, paramGregorianCalendar);
        a(this.s, true);
        this.z.b(paramGregorianCalendar);
        this.z.notifyDataSetChanged();
      }
      this.P = 0;
    }
    for (;;)
    {
      m().a(MapBuilder.a("Notes", "review_date", "log", CalendarUtils.c(paramGregorianCalendar)).a());
      return;
      b(2131296358, true, paramGregorianCalendar);
      ((ImageView)this.t).setVisibility(8);
      this.z.b(paramGregorianCalendar);
    }
  }
  
  public void b(Object paramObject) {}
  
  protected void b(String paramString)
  {
    a(2131296358, paramString);
  }
  
  public void b(GregorianCalendar paramGregorianCalendar)
  {
    if (this.H)
    {
      a(2131296370, true, paramGregorianCalendar);
      r();
      return;
    }
    a(2131296358, true, paramGregorianCalendar);
    b(false);
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.n.setVisibility(0);
      return;
    }
    this.n.setVisibility(8);
  }
  
  public void c(GregorianCalendar paramGregorianCalendar)
  {
    this.F.c(paramGregorianCalendar);
    if (this.q != null) {
      this.q.Q();
    }
    this.n.setVisibility(0);
    if (this.O == 1) {
      finish();
    }
    if (this.H)
    {
      c(true);
      if ((this.o != null) && (this.o.p()))
      {
        this.p.a();
        this.o.a();
      }
      return;
    }
    this.E.c();
  }
  
  public void g()
  {
    if (this.H) {
      if (this.A)
      {
        localEditText = this.q.a();
        if (!FileUtils.a()) {
          break label41;
        }
        this.q.P();
        a(localEditText);
      }
    }
    label41:
    while (!this.q.p()) {
      for (;;)
      {
        EditText localEditText;
        return;
        d(2131427546);
      }
    }
    if (FileUtils.a())
    {
      this.q.P();
      return;
    }
    d(2131427546);
  }
  
  public void h()
  {
    u();
  }
  
  public void i()
  {
    if ((this.q != null) && (this.q.R())) {
      this.q.b();
    }
    do
    {
      return;
      if (this.A)
      {
        this.J = true;
        c(false);
      }
    } while (!this.B);
    this.J = true;
    s();
  }
  
  public CalendarViewAdapter j()
  {
    return this.z;
  }
  
  public void onBackPressed()
  {
    if ((this.q != null) && (this.q.R()))
    {
      this.q.b();
      return;
    }
    if ((this.o != null) && (this.o.p()))
    {
      a(this.s, true);
      if (!this.H) {
        break label134;
      }
      if (!this.J) {
        break label127;
      }
      this.J = false;
    }
    for (;;)
    {
      if ((this.q != null) && (this.q.p())) {
        this.q.a(true);
      }
      this.n.setVisibility(0);
      if (this.O == 1) {
        finish();
      }
      if (this.C) {
        break;
      }
      super.onBackPressed();
      return;
      label127:
      finish();
      continue;
      label134:
      this.P = 0;
      ((ImageView)this.t).setVisibility(0);
      p();
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.t)
    {
      d(false);
      m().a(MapBuilder.a("Notes", "show_all", null, null).a());
    }
    if (paramView == this.u) {
      u();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    setContentView(2130903062);
    this.n = ((LinearLayout)findViewById(2131296275));
    this.w = ((RelativeLayout)findViewById(2131296368));
    this.x = ((RelativeLayout)findViewById(2131296369));
    this.y = ((RelativeLayout)findViewById(2131296370));
    SearchBarBuilder localSearchBarBuilder = new SearchBarBuilder(this);
    if (this.H)
    {
      localSearchBarBuilder.a();
      this.t = findViewById(2131296364);
      this.u = findViewById(2131296363);
      this.n.addView(localSearchBarBuilder.i());
      this.t.setOnClickListener(this);
      this.u.setOnClickListener(this);
      this.s = ((EditText)localSearchBarBuilder.i().findViewById(1).findViewById(2131296344));
      this.v = ((TextView)findViewById(2131296365));
      this.z = new CalendarViewAdapter(this, this, false, this.F, this.H);
      l();
      n();
      Intent localIntent = getIntent();
      if (localIntent != null)
      {
        this.O = localIntent.getIntExtra("sterted_by", 0);
        this.Q = localIntent.getStringExtra("new_photo");
      }
      if (this.O != 1) {
        break label326;
      }
      a(2131296358, true, new GregorianCalendar(), this.Q);
      b(false);
    }
    label326:
    while (paramBundle != null)
    {
      return;
      localSearchBarBuilder.a().c().d();
      this.t = localSearchBarBuilder.i().findViewById(2);
      this.u = localSearchBarBuilder.i().findViewById(4);
      break;
    }
    if (this.H)
    {
      getWindow().setSoftInputMode(3);
      k();
      a(2131296360);
      b(2131296367, false, new GregorianCalendar());
      a(this.s, true);
      return;
    }
    getWindow().setSoftInputMode(32);
    a(2131296358);
  }
  
  protected void onResume()
  {
    if (this.p == null) {
      this.p = ((CalendarFragment)this.E.a(N));
    }
    if (this.q == null) {
      this.q = ((LogEditFragment)this.E.a(K));
    }
    if (this.o == null) {
      this.o = ((LogFragment)this.E.a(M));
    }
    if (this.r == null) {
      this.r = ((LogShareFragment)this.E.a(L));
    }
    super.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    this.F.close();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity
 * JD-Core Version:    0.7.0.1
 */