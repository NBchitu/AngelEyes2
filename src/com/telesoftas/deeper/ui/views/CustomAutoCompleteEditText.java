package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.AutoCompleteTextView;

public class CustomAutoCompleteEditText
  extends AutoCompleteTextView
{
  private CustomAutoCompleteEditText$OnKeybordBackListener a;
  
  public CustomAutoCompleteEditText(Context paramContext)
  {
    super(paramContext);
  }
  
  public CustomAutoCompleteEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomAutoCompleteEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 0) && (this.a != null)) {
      this.a.a(this);
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = super.onTouchEvent(paramMotionEvent);
    postDelayed(new CustomAutoCompleteEditText.1(this), 50L);
    return bool;
  }
  
  public void setOnKeyboardBackListener(CustomAutoCompleteEditText.OnKeybordBackListener paramOnKeybordBackListener)
  {
    this.a = paramOnKeybordBackListener;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CustomAutoCompleteEditText
 * JD-Core Version:    0.7.0.1
 */