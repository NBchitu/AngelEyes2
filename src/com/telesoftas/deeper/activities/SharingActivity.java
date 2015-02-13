package com.telesoftas.deeper.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.telesoftas.deeper.database.DeeperDatabase;
import com.telesoftas.deeper.database.NoteData;
import com.telesoftas.deeper.database.NoteEntry;
import com.telesoftas.deeper.ui.fragments.LogShareFragment;
import com.telesoftas.deeper.ui.fragments.LogShareFragment.OnLogShareListener;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.FileUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SharingActivity
  extends WrapperActivity
  implements LogShareFragment.OnLogShareListener
{
  private static final String o = LogShareFragment.class.getName();
  private LogShareFragment n;
  private ProgressDialog p;
  private Calendar q = null;
  
  private void a(int paramInt)
  {
    this.n = new LogShareFragment();
    NoteEntry localNoteEntry = new NoteEntry(new NoteData(new GregorianCalendar(), "", ""), null, null, null);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("edit_note", localNoteEntry);
    localBundle.putBoolean("search_for_location", true);
    localBundle.putBoolean("phone_sharing_activity", true);
    this.n.g(localBundle);
    a(paramInt, this.n, true, false, o);
  }
  
  private void a(EditText paramEditText)
  {
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(paramEditText.getWindowToken(), 0);
  }
  
  public void g()
  {
    EditText localEditText = this.n.b();
    if (FileUtils.a()) {
      this.n.a();
    }
    for (;;)
    {
      a(localEditText);
      return;
      d(2131427546);
    }
  }
  
  public void i() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.b(this);
    ConnectionCheckUtils.a(this);
    this.q = ((Calendar)getIntent().getParcelableExtra("note_date"));
    if (this.q != null) {
      this.q = this.F.b().a().b();
    }
    setContentView(2130903083);
    if ((paramBundle == null) && (!this.H)) {
      a(2131296543);
    }
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if ((this.p != null) && (this.p.isShowing())) {
      this.p.dismiss();
    }
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SharingActivity
 * JD-Core Version:    0.7.0.1
 */