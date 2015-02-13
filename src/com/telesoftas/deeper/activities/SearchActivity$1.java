package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

class SearchActivity$1
  implements AdapterView.OnItemClickListener
{
  SearchActivity$1(SearchActivity paramSearchActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("result_s", (Parcelable)SearchActivity.a(this.a).get(paramInt));
    this.a.setResult(-1, localIntent);
    this.a.finish();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SearchActivity.1
 * JD-Core Version:    0.7.0.1
 */