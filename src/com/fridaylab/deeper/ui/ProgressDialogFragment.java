package com.fridaylab.deeper.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.text.NumberFormat;

public class ProgressDialogFragment
  extends DialogFragment
{
  private ProgressBar aj;
  private TextView ak;
  private NumberFormat al;
  
  public static ProgressDialogFragment a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString);
    ProgressDialogFragment localProgressDialogFragment = new ProgressDialogFragment();
    localProgressDialogFragment.g(localBundle);
    return localProgressDialogFragment;
  }
  
  public void a(float paramFloat)
  {
    int i = (int)Math.floor(10000.0F * paramFloat);
    this.aj.setProgress(i);
    this.ak.setText(this.al.format(paramFloat));
  }
  
  public Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    View localView = i().getLayoutInflater().inflate(2130903049, null);
    this.aj = ((ProgressBar)localView.findViewById(2131296312));
    this.ak = ((TextView)localView.findViewById(2131296313));
    this.al = NumberFormat.getPercentInstance();
    this.aj.setMax(10000);
    this.aj.setProgress(0);
    localBuilder.setMessage(h().getString("message"));
    localBuilder.setView(localView);
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.setCancelable(false);
    localAlertDialog.setCanceledOnTouchOutside(false);
    localAlertDialog.setOnKeyListener(new ProgressDialogFragment.1(this));
    return localAlertDialog;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.ProgressDialogFragment
 * JD-Core Version:    0.7.0.1
 */