package com.telesoftas.utilities.deeper;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.telesoftas.deeper.activities.SearchActivity;

class SearchBarBuilder$1
  implements View.OnClickListener
{
  SearchBarBuilder$1(SearchBarBuilder paramSearchBarBuilder) {}
  
  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(SearchBarBuilder.a(this.a), SearchActivity.class);
    SearchBarBuilder.a(this.a).startActivityForResult(localIntent, 22);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.deeper.SearchBarBuilder.1
 * JD-Core Version:    0.7.0.1
 */