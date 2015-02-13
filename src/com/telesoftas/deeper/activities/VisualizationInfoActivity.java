package com.telesoftas.deeper.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VisualizationInfoActivity
  extends TrackedActivity
{
  public static Intent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, VisualizationInfoActivity.class);
    localIntent.putExtra("layout", paramInt);
    return localIntent;
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    overridePendingTransition(17432576, 2130968580);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(getIntent().getIntExtra("layout", 0));
    findViewById(2131296342).setOnClickListener(new VisualizationInfoActivity.1(this));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.VisualizationInfoActivity
 * JD-Core Version:    0.7.0.1
 */