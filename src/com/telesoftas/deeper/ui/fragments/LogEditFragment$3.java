package com.telesoftas.deeper.ui.fragments;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;

class LogEditFragment$3
  implements DialogInterface.OnClickListener
{
  LogEditFragment$3(LogEditFragment paramLogEditFragment, View paramView) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a != null)
    {
      this.b.c(this.a.getTag());
      this.b.d(this.a.getTag());
      this.b.b((String)this.a.getTag());
      return;
    }
    LogEditFragment.d(this.b).c(LogEditFragment.a(this.b).a().b());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogEditFragment.3
 * JD-Core Version:    0.7.0.1
 */