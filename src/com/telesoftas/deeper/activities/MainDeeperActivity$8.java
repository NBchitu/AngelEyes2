package com.telesoftas.deeper.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

class MainDeeperActivity$8
  implements View.OnClickListener
{
  MainDeeperActivity$8(MainDeeperActivity paramMainDeeperActivity, View paramView, String paramString, EditText paramEditText) {}
  
  public void onClick(View paramView)
  {
    String str2;
    if (this.d.o)
    {
      this.a.setVisibility(8);
      MainDeeperActivity.n(this.d).setVisibility(4);
      this.d.o = false;
      this.d.m().a(MapBuilder.a("Promo", "review", this.b, null).a());
      this.d.q = true;
      if (MainDeeperActivity.k(this.d).getString("PROMO_USER_COUNTRY", null).equals("UK"))
      {
        str2 = "https://www.amazon.co.uk/review/create-review?ie=UTF8&asin=B00JQCVDM2&#";
        Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        this.d.startActivity(localIntent);
      }
    }
    String str1;
    do
    {
      do
      {
        return;
        str2 = "https://www.amazon.com/review/create-review?ie=UTF8&asin=B00GOJWQ08#";
        break;
      } while (!this.d.p);
      str1 = this.c.getText().toString();
    } while (TextUtils.isEmpty(str1));
    this.a.setVisibility(8);
    MainDeeperActivity.n(this.d).setVisibility(4);
    this.d.p = false;
    MainDeeperActivity.k(this.d).edit().putString("PROMO_USER_EMAIL", str1).putInt("PROMO_EMAIL_STATUS", 1).apply();
    new MainDeeperActivity.SendEmailTask(this.d, null).g();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.8
 * JD-Core Version:    0.7.0.1
 */