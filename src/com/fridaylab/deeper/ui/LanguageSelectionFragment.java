package com.fridaylab.deeper.ui;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class LanguageSelectionFragment
  extends DialogFragment
{
  private SharedPreferences aj;
  private ListView ak;
  private String[] al;
  private int am;
  private boolean an;
  private final AdapterView.OnItemClickListener ao = new LanguageSelectionFragment.2(this);
  
  public static LanguageSelectionFragment a(String[] paramArrayOfString, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putStringArray("languages", paramArrayOfString);
    localBundle.putString("prefKey", paramString);
    LanguageSelectionFragment localLanguageSelectionFragment = new LanguageSelectionFragment();
    localLanguageSelectionFragment.g(localBundle);
    return localLanguageSelectionFragment;
  }
  
  @SuppressLint({"InflateParams"})
  public Dialog c(Bundle paramBundle)
  {
    this.aj = SettingsUtils.a(i());
    this.al = h().getStringArray("languages");
    this.an = false;
    String str1 = h().getString("prefKey");
    String str2 = j().getConfiguration().locale.getLanguage();
    if (!Arrays.asList(this.al).contains(str2)) {
      str2 = "en";
    }
    String str3 = this.aj.getString(str1, str2);
    this.am = 0;
    ArrayList localArrayList = new ArrayList(this.al.length);
    int i = 0;
    int j = 0;
    if (i < this.al.length)
    {
      String str4 = this.al[i];
      Locale localLocale = new Locale(str4);
      String str5 = localLocale.getDisplayLanguage(localLocale);
      String str6;
      if (str5.length() > 0)
      {
        str6 = str5.substring(0, 1).toUpperCase(localLocale) + str5.substring(1);
        label193:
        localArrayList.add(str6);
        if (j == 0)
        {
          if (!str4.equals(str3)) {
            break label246;
          }
          this.am = i;
          j = 1;
        }
      }
      for (;;)
      {
        i++;
        break;
        str6 = str4.toUpperCase(Locale.US);
        break label193;
        label246:
        if (str4.equals("en")) {
          this.am = i;
        }
      }
    }
    View localView = i().getLayoutInflater().inflate(2130903048, null);
    this.ak = ((ListView)localView.findViewById(2131296311));
    LanguageSelectionFragment.StableArrayAdapter localStableArrayAdapter = new LanguageSelectionFragment.StableArrayAdapter(i(), 17367057, localArrayList, this.am);
    this.ak.setAdapter(localStableArrayAdapter);
    this.ak.setChoiceMode(1);
    this.ak.setItemChecked(0, true);
    this.ak.setOnItemClickListener(this.ao);
    this.ak.smoothScrollToPosition(this.am);
    this.ak.setVerticalFadingEdgeEnabled(false);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(i());
    localBuilder.setTitle(2131427493);
    localBuilder.setView(localView);
    localBuilder.setPositiveButton(2131427551, new LanguageSelectionFragment.1(this));
    localBuilder.setCancelable(true);
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.setCanceledOnTouchOutside(true);
    return localAlertDialog;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (this.an)
    {
      String str = this.al[this.am];
      this.aj.edit().putString(h().getString("prefKey"), str).apply();
      if ((i() instanceof LanguageSelectionFragment.OnLanguageSelectedListener)) {
        ((LanguageSelectionFragment.OnLanguageSelectedListener)i()).a_(str);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.LanguageSelectionFragment
 * JD-Core Version:    0.7.0.1
 */