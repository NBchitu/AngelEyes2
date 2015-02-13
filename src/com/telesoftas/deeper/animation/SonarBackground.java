package com.telesoftas.deeper.animation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public class SonarBackground
  implements Renderable
{
  private Bitmap a;
  private Rect b;
  private Rect c;
  
  public SonarBackground(Context paramContext)
  {
    this.a = BitmapFactory.decodeResource(paramContext.getResources(), 2130837817);
  }
  
  public void a(Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(this.a, this.b, this.c, null);
  }
  
  public void a(View paramView)
  {
    this.b = new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
    this.c = new Rect(0, 0, paramView.getWidth(), paramView.getHeight());
  }
  
  public void b()
  {
    if (this.a != null)
    {
      this.a.recycle();
      this.a = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.SonarBackground
 * JD-Core Version:    0.7.0.1
 */