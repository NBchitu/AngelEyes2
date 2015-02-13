package com.telesoftas.deeper.activities;

import com.fridaylab.deeper.communication.CommunicationProtocol;
import com.fridaylab.deeper.communication.CommunicationProtocol.ConnectionInfo;
import com.fridaylab.deeper.communication.DeeperModel;
import com.telesoftas.deeper.animation.HistorySceneView;
import com.telesoftas.deeper.animation.SceneView;
import com.telesoftas.deeper.ui.views.Panel;
import com.telesoftas.deeper.ui.views.Panel.OnPanelListener;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.SignalStream;

class MainDeeperActivity$1
  implements Panel.OnPanelListener
{
  MainDeeperActivity$1(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void a(Panel paramPanel)
  {
    if (MainDeeperActivity.a(this.a) != null)
    {
      MainDeeperActivity.a(this.a).setData(this.a.G.a(this.a, SignalStream.a));
      MainDeeperActivity.a(this.a).invalidate();
      MainDeeperActivity.b(this.a).setVisibility(4);
    }
  }
  
  public void b(Panel paramPanel)
  {
    if (MainDeeperActivity.b(this.a) != null)
    {
      MainDeeperActivity.b(this.a).setVisibility(0);
      MainDeeperActivity.b(this.a).a(false, false);
      MainDeeperActivity.c(this.a);
      MainDeeperActivity.a(this.a, MainDeeperActivity.d(this.a).c().b.f());
    }
    MainDeeperActivity.e(this.a).setVisibility(0);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.1
 * JD-Core Version:    0.7.0.1
 */