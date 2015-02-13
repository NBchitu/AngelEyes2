package com.telesoftas.deeper.activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.GoogleDriveSyncTask;

public class ImportExportActivity
  extends WrapperActivity
{
  public ProgressBar n;
  private String o;
  private int p;
  private TextView q;
  private boolean r = false;
  
  private void a(int paramInt, Intent paramIntent)
  {
    if (paramIntent == null) {
      b("Unknown error, click the button again");
    }
    do
    {
      return;
      if (paramInt == -1)
      {
        new GoogleDriveSyncTask(this, this.o, "oauth2:https://www.googleapis.com/auth/drive", 1001, this.p).execute(new Void[0]);
        return;
      }
    } while (paramInt != 0);
    Log.e("imp", "cancel");
    finish();
  }
  
  private void g()
  {
    if (this.p == 1) {
      this.q.setText(2131427464);
    }
    while (h())
    {
      startActivityForResult(AccountPicker.a(null, null, new String[] { "com.google" }, false, null, null, null, null), 2001);
      return;
      if (this.p == 2) {
        this.q.setText(2131427417);
      }
    }
    this.q.setText(2131427414);
  }
  
  private boolean h()
  {
    int i = GooglePlayServicesUtil.a(getApplicationContext());
    if (i == 0) {
      return true;
    }
    GooglePlayServicesUtil.a(i, this, 1003).show();
    return false;
  }
  
  public void a(int paramInt)
  {
    runOnUiThread(new ImportExportActivity.2(this, paramInt));
  }
  
  public void b(int paramInt)
  {
    runOnUiThread(new ImportExportActivity.3(this, paramInt));
  }
  
  public void b(String paramString)
  {
    runOnUiThread(new ImportExportActivity.1(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 2001)
    {
      if ((paramIntent == null) || (paramInt2 == 0))
      {
        finish();
        return;
      }
      this.o = paramIntent.getStringExtra("authAccount");
      this.r = true;
      new GoogleDriveSyncTask(this, this.o, "oauth2:https://www.googleapis.com/auth/drive", 1001, this.p).execute(new Void[0]);
      return;
    }
    if (paramInt1 == 1001)
    {
      a(paramInt2, paramIntent);
      return;
    }
    if (paramInt1 == 1003)
    {
      g();
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!this.r) {
      super.onBackPressed();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.a(this);
    setContentView(2130903055);
    this.q = ((TextView)findViewById(2131296278));
    this.p = getIntent().getExtras().getInt("action");
    if (this.p == 0)
    {
      finish();
      return;
    }
    this.n = ((ProgressBar)findViewById(2131296339));
    g();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.ImportExportActivity
 * JD-Core Version:    0.7.0.1
 */