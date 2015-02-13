package com.fridaylab.deeper.ui.slideshow;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.fridaylab.deeper.ui.ViewTools;
import java.util.Locale;
import java.util.concurrent.Callable;

public class SlideshowPage4
  extends SlideshowPageFragment
  implements Callable<Boolean>
{
  private final View.OnClickListener aj = new SlideshowPage4.2(this);
  private boolean h = false;
  private final View.OnClickListener i = new SlideshowPage4.1(this);
  
  private String S()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1)) {
      return a(str2);
    }
    return a(str1) + " " + str2;
  }
  
  private void T()
  {
    View localView1 = this.a.findViewById(2131296570);
    View localView2 = this.a.findViewById(2131296569);
    int j = localView1.getWidth();
    int k = localView2.getWidth();
    int m = Math.max(j().getDimensionPixelOffset(2131230768), Math.max(j, k));
    ViewGroup.LayoutParams localLayoutParams1 = localView1.getLayoutParams();
    localLayoutParams1.width = m;
    localView1.setLayoutParams(localLayoutParams1);
    ViewGroup.LayoutParams localLayoutParams2 = localView2.getLayoutParams();
    localLayoutParams2.width = m;
    localView2.setLayoutParams(localLayoutParams2);
  }
  
  public static SlideshowPage4 a(int paramInt1, int paramInt2)
  {
    SlideshowPage4 localSlideshowPage4 = new SlideshowPage4();
    localSlideshowPage4.g(a(2130903088, paramInt1, paramInt2));
    return localSlideshowPage4;
  }
  
  private String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = "";
    }
    char c;
    do
    {
      return paramString;
      c = paramString.charAt(0);
    } while (Character.isUpperCase(c));
    return Character.toUpperCase(c) + paramString.substring(1);
  }
  
  public Boolean R()
  {
    if (!m())
    {
      this.h = true;
      return Boolean.TRUE;
    }
    T();
    return Boolean.FALSE;
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (this.h)
    {
      this.h = false;
      T();
    }
  }
  
  protected boolean a()
  {
    String str1 = j().getConfiguration().locale.getLanguage();
    int j;
    if ((str1.equals("ko")) || (str1.equals("ja")) || (str1.equals("zh")))
    {
      j = 1;
      if (j == 0) {
        break label297;
      }
    }
    label297:
    for (Typeface localTypeface = Typeface.create("sans-serif", 0);; localTypeface = null)
    {
      TextView localTextView1 = (TextView)this.a.findViewById(2131296551);
      localTextView1.setLayoutParams(d(0.0F, 250.0F));
      localTextView1.setTextSize(0, b(80.0F));
      if (j != 0) {
        localTextView1.setTypeface(localTypeface);
      }
      TextView localTextView2 = (TextView)this.a.findViewById(2131296552);
      localTextView2.setLayoutParams(a(800.0F));
      localTextView2.setTextSize(0, b(48.0F));
      String str2 = a(2131427609);
      String str3 = S();
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(String.format(str2, new Object[] { str3 }));
      int k = TextUtils.indexOf(str2, "%1$s");
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-1547238), k, k + str3.length(), 17);
      localTextView2.setText(localSpannableStringBuilder);
      if (j != 0) {
        localTextView2.setTypeface(localTypeface);
      }
      View localView = this.a.findViewById(2131296568);
      localView.setLayoutParams(a(920.0F));
      this.a.findViewById(2131296570).setOnClickListener(this.aj);
      this.a.findViewById(2131296569).setOnClickListener(this.i);
      ViewTools.a(localView, this);
      return true;
      j = 0;
      break;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage4
 * JD-Core Version:    0.7.0.1
 */