package com.telesoftas.deeper.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.telesoftas.deeper.DeeperApplication;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.utilities.DisplayUtils;

public abstract class WrapperActivity
  extends FragmentActivity
{
  protected FragmentManager E;
  protected DeeperDatabase F;
  protected DeeperDataManager G;
  protected boolean H;
  protected DeeperApplication I;
  
  public static Intent a(Context paramContext, boolean paramBoolean, String paramString)
  {
    Intent localIntent = new Intent(paramContext, MainDeeperActivity.class);	// 启动演示,打开主界面
    localIntent.putExtra("DEMO", paramBoolean);	// 传入参数1 表明为DEMO模式
    localIntent.putExtra("DEVICE_ADDRESS", paramString);	// // 传入参数2
    return localIntent;
  }
  
  protected void a(int paramInt, Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    FragmentTransaction localFragmentTransaction = this.E.a();
    localFragmentTransaction.a(17432576, 0, 17432576, 0);
    if (paramBoolean1) {
      localFragmentTransaction.b(paramInt, paramFragment, paramString);
    }
    for (;;)
    {
      if (paramBoolean2) {
        localFragmentTransaction.a(paramString);
      }
      localFragmentTransaction.a();
      return;
      localFragmentTransaction.a(paramInt, paramFragment, paramString);
    }
  }
  
  protected void a(EditText paramEditText, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramEditText.setText("");
    }
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
  }
  
  protected void d(int paramInt)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    localAlertDialog.setTitle(paramInt);
    localAlertDialog.setButton(-1, getString(17039370), null);
    localAlertDialog.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    if (DisplayUtils.a()) {
      DisplayUtils.a(this);
    }
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    this.I = ((DeeperApplication)getApplication());
    this.H = this.I.c();
    this.E = f();
    this.F = this.I.a();
    this.G = this.I.b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.WrapperActivity
 * JD-Core Version:    0.7.0.1
 */