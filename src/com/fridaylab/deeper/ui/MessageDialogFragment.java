package com.fridaylab.deeper.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MessageDialogFragment
  extends DialogFragment
{
  private boolean aj;
  
  public static MessageDialogFragment a(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("title", paramString1);
    localBundle.putString("message", paramString2);
    localBundle.putString("button", paramString3);
    MessageDialogFragment localMessageDialogFragment = new MessageDialogFragment();
    localMessageDialogFragment.g(localBundle);
    return localMessageDialogFragment;
  }
  
  public void a()
  {
    this.aj = false;
    super.a();
  }
  
  public Dialog c(Bundle paramBundle)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(h().getString("title"));
    localBuilder.setMessage(h().getString("message"));
    localBuilder.setPositiveButton(h().getString("button"), null);
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.setCanceledOnTouchOutside(false);
    this.aj = true;
    return localAlertDialog;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((this.aj) && ((i() instanceof MessageDialogFragment.MessageDialogListener))) {
      ((MessageDialogFragment.MessageDialogListener)i()).a();
    }
    super.onDismiss(paramDialogInterface);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.MessageDialogFragment
 * JD-Core Version:    0.7.0.1
 */