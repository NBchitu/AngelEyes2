package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.fridaylab.deeper.communication.CommunicationGateway;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.services.DeeperDevice;

class SettingsDeepersActivity$5
  implements View.OnClickListener
{
  SettingsDeepersActivity$5(SettingsDeepersActivity paramSettingsDeepersActivity, TextView paramTextView) {}
  
  public void onClick(View paramView)
  {
    DeeperDevice localDeeperDevice = (DeeperDevice)paramView.getTag();
    if (!localDeeperDevice.a())
    {
      this.b.setResult(-1, new Intent().putExtra("device", localDeeperDevice.b()));
      SettingsDeepersActivity.b(this.b);
      this.b.finish();
    }
    for (;;)
    {
      SettingsDeepersActivity.e(this.b);
      return;
      if (SettingsDeepersActivity.a(this.b) != null)
      {
        SettingsDeepersActivity.a(this.b).b();
        EasyTracker.a(this.b).a(MapBuilder.a("Hardware", "disconnect", "Disconnect", null).a());
      }
      localDeeperDevice.a(false, null);
      this.a.setBackgroundResource(2130837553);
      this.a.setText(2131427381);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsDeepersActivity.5
 * JD-Core Version:    0.7.0.1
 */