package com.telesoftas.deeper.activities;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import com.telesoftas.utilities.ConnectionCheckUtils;
import com.telesoftas.utilities.location.GeocodingOperation;
import com.telesoftas.utilities.location.GeocodingOperation.GeocodingListener;
import java.util.List;

public class SearchActivity
  extends WrapperActivity
  implements GeocodingOperation.GeocodingListener
{
  GeocodingOperation n = null;
  Handler o = new SearchActivity.4(this);
  private EditText p;
  private ListView q;
  private boolean r = false;
  private List<Location> s = null;
  
  @SuppressLint({"NewApi"})
  private void b(String paramString)
  {
    if (this.n != null) {
      this.n.a();
    }
    this.n = new GeocodingOperation(getApplicationContext(), paramString);
    this.n.a(this);
    if (Build.VERSION.SDK_INT >= 11)
    {
      this.n.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (String[])null);
      return;
    }
    this.n.execute((String[])null);
  }
  
  private void g()
  {
    this.p.setHint(getString(2131427582));
    this.p.setOnEditorActionListener(new SearchActivity.2(this));
    this.p.addTextChangedListener(new SearchActivity.3(this));
  }
  
  public void a(List<Location> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.q.setAdapter(null);
      return;
    }
    String[] arrayOfString = new String[paramList.size()];
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfString[i] = (((Location)paramList.get(i)).getProvider().toString() + " ");
    }
    ArrayAdapter localArrayAdapter = new ArrayAdapter(this, 2130903080, 2131296503, arrayOfString);
    this.q.setAdapter(localArrayAdapter);
    this.s = paramList;
    if (this.r)
    {
      String str = this.p.getText().toString();
      this.p.setText(str);
      this.p.setSelection(this.p.getText().length());
    }
    this.r = false;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ConnectionCheckUtils.a(this);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    getWindow().setSoftInputMode(5);
    ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 0);
    setContentView(2130903077);
    this.p = ((EditText)findViewById(2131296344));
    this.q = ((ListView)findViewById(2131296502));
    g();
    this.q.setOnItemClickListener(new SearchActivity.1(this));
  }
  
  protected void onPause()
  {
    super.onPause();
    getWindow().setSoftInputMode(2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SearchActivity
 * JD-Core Version:    0.7.0.1
 */