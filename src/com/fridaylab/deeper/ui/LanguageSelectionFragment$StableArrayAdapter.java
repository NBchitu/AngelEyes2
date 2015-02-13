package com.fridaylab.deeper.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

class LanguageSelectionFragment$StableArrayAdapter
  extends ArrayAdapter<String>
{
  private final int a;
  
  public LanguageSelectionFragment$StableArrayAdapter(Context paramContext, int paramInt1, List<String> paramList, int paramInt2)
  {
    super(paramContext, paramInt1, paramList);
    this.a = paramInt2;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    TextView localTextView = (TextView)super.getView(paramInt, paramView, paramViewGroup);
    if (paramInt == this.a) {
      localTextView.setBackgroundColor(1894933794);
    }
    for (;;)
    {
      localTextView.setTextColor(-1);
      return localTextView;
      localTextView.setBackgroundColor(0);
    }
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.LanguageSelectionFragment.StableArrayAdapter
 * JD-Core Version:    0.7.0.1
 */