package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.EditText;

public class CustomEditText
  extends EditText
{
  private CustomEditText.OnKeybordBackListener a;
  
  public CustomEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    postDelayed(new CustomEditText.1(this), 50L);
    return bool;
  }
  
  public void setOnKeyboardBackListener(CustomEditText.OnKeybordBackListener paramOnKeybordBackListener)
  {
    this.a = paramOnKeybordBackListener;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CustomEditText
 * JD-Core Version:    0.7.0.1
 */