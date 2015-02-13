package com.telesoftas.deeper.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

class ImportExportActivity$3
  implements Runnable
{
  ImportExportActivity$3(ImportExportActivity paramImportExportActivity, int paramInt) {}
  
  public void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.b);
    localBuilder.setMessage(this.a).setPositiveButton(17039370, new ImportExportActivity.3.1(this));
    localBuilder.create().show();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.ImportExportActivity.3
 * JD-Core Version:    0.7.0.1
 */