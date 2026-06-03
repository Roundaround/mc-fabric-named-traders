package me.roundaround.namedtraders.neoforge;

import me.roundaround.trove.neoforge.TroveNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod("namedtraders")
public final class NamedTradersNeoForgeMod {
  public NamedTradersNeoForgeMod(IEventBus modBus, ModContainer container) {
    TroveNeoForge.bootstrap(modBus, container);
    // Mixin-only mod: nothing else to register.
  }
}
