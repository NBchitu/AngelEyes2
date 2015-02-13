package com.telesoftas.utilities.deeper;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.fridaylab.deeper.ui.ViewTools;
import com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText;

public class SearchBarBuilder
{
  private LinearLayout a;
  private Activity b;
  private int c = 0;
  private int d = 10;
  private View e;
  private int f;
  
  public SearchBarBuilder(Activity paramActivity)
  {
    this.b = paramActivity;
    this.a = new LinearLayout(paramActivity);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.d = paramActivity.getResources().getDimensionPixelOffset(2131230749);
    int i = paramActivity.getResources().getDimensionPixelOffset(2131230751);
    int j = paramActivity.getResources().getDimensionPixelOffset(2131230752);
    int k = paramActivity.getResources().getDimensionPixelOffset(2131230748);
    this.f = paramActivity.getResources().getDimensionPixelOffset(2131230742);
    this.a.setPadding(i, j, i, k);
    this.a.setLayoutParams(localLayoutParams);
  }
  
  private void a(View paramView)
  {
    CustomAutoCompleteEditText localCustomAutoCompleteEditText = (CustomAutoCompleteEditText)paramView.findViewById(2131296344);
    View localView = paramView.findViewById(2131296345);
    int i = this.b.getResources().getDimensionPixelOffset(2131230750);
    localCustomAutoCompleteEditText.setPadding(localCustomAutoCompleteEditText.getPaddingLeft(), localCustomAutoCompleteEditText.getPaddingTop(), i, localCustomAutoCompleteEditText.getPaddingBottom());
    localCustomAutoCompleteEditText.addTextChangedListener(new SearchBarBuilder.2(this, localView));
    localView.setOnClickListener(new SearchBarBuilder.3(this, localCustomAutoCompleteEditText));
  }
  
  public SearchBarBuilder a()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1, 1.0F);
    this.c = (1 + this.c);
    View localView = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130903078, null, false);
    a(localView);
    localView.setId(1);
    localView.setLayoutParams(localLayoutParams);
    this.a.addView(localView);
    return this;
  }
  
  public SearchBarBuilder b()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1, 1.0F);
    this.c = (1 + this.c);
    View localView = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130903079, null, false);
    localView.setId(1);
    localView.setLayoutParams(localLayoutParams);
    this.a.addView(localView);
    localView.findViewById(2131296344).setOnClickListener(new SearchBarBuilder.1(this));
    return this;
  }
  
  public SearchBarBuilder c()
  {
    ImageView localImageView = new ImageView(this.b);
    this.e = localImageView;
    localImageView.setId(2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setImageResource(2130837654);
    if (this.c != 0) {
      localImageView.setPadding(this.d, 0, 0, 0);
    }
    this.c = (1 + this.c);
    this.a.addView(localImageView, localLayoutParams);
    return this;
  }
  
  public SearchBarBuilder d()
  {
    ImageView localImageView = new ImageView(this.b);
    this.e = localImageView;
    localImageView.setId(4);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    if (this.c != 0) {
      localImageView.setPadding(this.d, 0, 0, 0);
    }
    this.c = (1 + this.c);
    localImageView.setImageResource(2130837640);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setBackgroundResource(0);
    this.a.addView(localImageView);
    return this;
  }
  
  public SearchBarBuilder e()
  {
    ImageView localImageView = new ImageView(this.b);
    this.e = localImageView;
    localImageView.setId(5);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    if (this.c != 0) {
      localImageView.setPadding(this.d, 0, 0, 0);
    }
    this.c = (1 + this.c);
    localImageView.setImageResource(2130837641);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setBackgroundResource(0);
    this.a.addView(localImageView);
    return this;
  }
  
  public SearchBarBuilder f()
  {
    ImageView localImageView = new ImageView(this.b);
    this.e = localImageView;
    localImageView.setId(6);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    if (this.c != 0) {
      localImageView.setPadding(this.d, 0, 0, 0);
    }
    this.c = (1 + this.c);
    localImageView.setImageResource(2130837656);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setBackgroundResource(0);
    this.a.addView(localImageView);
    return this;
  }
  
  public SearchBarBuilder g()
  {
    ImageView localImageView = new ImageView(this.b);
    this.e = localImageView;
    localImageView.setId(7);
    localImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    if (this.c != 0) {
      localImageView.setPadding(this.d, 0, 0, 0);
    }
    this.c = (1 + this.c);
    localImageView.setImageResource(2130837655);
    localImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    localImageView.setBackgroundResource(0);
    this.a.addView(localImageView);
    return this;
  }
  
  public SearchBarBuilder h()
  {
    if (this.e != null) {
      this.e.setPadding(this.e.getPaddingLeft(), 0, this.d, 0);
    }
    this.c = (1 + this.c);
    View localView = ((LayoutInflater)this.b.getSystemService("layout_inflater")).inflate(2130903058, null, false);
    localView.setId(8);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(ViewTools.a(this.b) / 2 - this.f - this.b.getResources().getDimensionPixelOffset(2131230751), -1);
    localLayoutParams.rightMargin = (2 * this.f);
    localView.setLayoutParams(localLayoutParams);
    this.a.addView(localView);
    return this;
  }
  
  public View i()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.deeper.SearchBarBuilder
 * JD-Core Version:    0.7.0.1
 */