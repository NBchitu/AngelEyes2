package com.google.tagmanager.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class GeneratedMessageLite$ExtendableMessage$ExtensionWriter
{
  private final Iterator<Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object>> b = GeneratedMessageLite.ExtendableMessage.a(this.a).e();
  private Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object> c;
  private final boolean d;
  
  private GeneratedMessageLite$ExtendableMessage$ExtensionWriter(GeneratedMessageLite.ExtendableMessage paramExtendableMessage, boolean paramBoolean)
  {
    if (this.b.hasNext()) {
      this.c = ((Map.Entry)this.b.next());
    }
    this.d = paramBoolean;
  }
  
  public void a(int paramInt, CodedOutputStream paramCodedOutputStream)
  {
    while ((this.c != null) && (((GeneratedMessageLite.ExtensionDescriptor)this.c.getKey()).a() < paramInt))
    {
      GeneratedMessageLite.ExtensionDescriptor localExtensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor)this.c.getKey();
      if ((this.d) && (localExtensionDescriptor.c() == WireFormat.JavaType.i) && (!localExtensionDescriptor.d())) {
        paramCodedOutputStream.c(localExtensionDescriptor.a(), (MessageLite)this.c.getValue());
      }
      for (;;)
      {
        if (!this.b.hasNext()) {
          break label131;
        }
        this.c = ((Map.Entry)this.b.next());
        break;
        FieldSet.a(localExtensionDescriptor, this.c.getValue(), paramCodedOutputStream);
      }
      label131:
      this.c = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.protobuf.GeneratedMessageLite.ExtendableMessage.ExtensionWriter
 * JD-Core Version:    0.7.0.1
 */