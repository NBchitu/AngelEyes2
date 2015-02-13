package com.google.common.collect;

import javax.annotation.concurrent.Immutable;

@Immutable
final class RegularImmutableMap$NonTerminalEntry<K, V>
  extends ImmutableEntry<K, V>
  implements RegularImmutableMap.LinkedEntry<K, V>
{
  final RegularImmutableMap.LinkedEntry<K, V> a;
  
  RegularImmutableMap$NonTerminalEntry(K paramK, V paramV, RegularImmutableMap.LinkedEntry<K, V> paramLinkedEntry)
  {
    super(paramK, paramV);
    this.a = paramLinkedEntry;
  }
  
  public RegularImmutableMap.LinkedEntry<K, V> a()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.RegularImmutableMap.NonTerminalEntry
 * JD-Core Version:    0.7.0.1
 */