package com.google.common.collect;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
final class RegularImmutableMap$TerminalEntry<K, V>
  extends ImmutableEntry<K, V>
  implements RegularImmutableMap.LinkedEntry<K, V>
{
  RegularImmutableMap$TerminalEntry(K paramK, V paramV)
  {
    super(paramK, paramV);
  }
  
  @Nullable
  public RegularImmutableMap.LinkedEntry<K, V> a()
  {
    return null;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.RegularImmutableMap.TerminalEntry
 * JD-Core Version:    0.7.0.1
 */