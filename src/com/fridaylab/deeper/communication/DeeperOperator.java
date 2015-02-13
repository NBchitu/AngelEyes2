package com.fridaylab.deeper.communication;

public abstract class DeeperOperator
  implements DeeperChannel.SignalObserver
{
  protected final BluetoothConnection a;
  protected final DeeperOperator.Agent b;
  protected final DeeperModel c;
  
  protected DeeperOperator(DeeperOperator.Agent paramAgent, DeeperModel paramDeeperModel, BluetoothConnection paramBluetoothConnection)
  {
    this.b = paramAgent;
    this.c = paramDeeperModel;
    this.a = paramBluetoothConnection;
  }
  
  protected DeeperOperator(DeeperOperator paramDeeperOperator)
  {
    this.b = paramDeeperOperator.b;
    this.c = paramDeeperOperator.c;
    this.a = paramDeeperOperator.a;
  }
  
  public void a() {}
  
  protected void a(DeeperModel.OperationMode paramOperationMode)
  {
    this.c.a(paramOperationMode);
    this.b.i();
  }
  
  public void b() {}
  
  public void c() {}
  
  public DeeperModel d()
  {
    return this.c;
  }
  
  public abstract int e();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.communication.DeeperOperator
 * JD-Core Version:    0.7.0.1
 */