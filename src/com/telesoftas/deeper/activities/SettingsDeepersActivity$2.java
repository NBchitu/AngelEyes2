package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class SettingsDeepersActivity$2
  implements View.OnClickListener
{
  SettingsDeepersActivity$2(SettingsDeepersActivity paramSettingsDeepersActivity) {}
  
  public void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.setFlags(524288);
    localIntent.setAction("android.settings.BLUETOOTH_SETTINGS");
    this.a.startActivity(localIntent);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.2
 * JD-Core Version:    0.7.0.1
 */