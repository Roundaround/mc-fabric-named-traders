package me.roundaround.namedtraders;

import me.roundaround.allay.api.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint(Entrypoint.MAIN)
public final class NamedTradersMod implements ModInitializer {
  @Override
  public void onInitialize() {
    // Mixin-only mod: no config, networking, commands, or key bindings.
    // Trove's Fabric core self-bootstraps via its own bundled entrypoint, so
    // there is nothing to wire here.
  }
}
