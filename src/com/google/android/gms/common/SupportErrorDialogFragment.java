package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.jx;

public class SupportErrorDialogFragment
  extends DialogFragment
{
  private Dialog aj = null;
  private DialogInterface.OnCancelListener ak = null;
  
  public static SupportErrorDialogFragment a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    Dialog localDialog = (Dialog)jx.a(paramDialog, "Cannot display null dialog");
    localDialog.setOnCancelListener(null);
    localDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.aj = localDialog;
    if (paramOnCancelListener != null) {
      localSupportErrorDialogFragment.ak = paramOnCancelListener;
    }
    return localSupportErrorDialogFragment;
  }
  
  public void a(FragmentManager paramFragmentManager, String paramString)
  {
    super.a(paramFragmentManager, paramString);
  }
  
  public Dialog c(Bundle paramBundle)
  {
    if (this.aj == null) {
      b(false);
    }
    return this.aj;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.ak != null) {
      this.ak.onCancel(paramDialogInterface);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SupportErrorDialogFragment
 * JD-Core Version:    0.7.0.1
 */