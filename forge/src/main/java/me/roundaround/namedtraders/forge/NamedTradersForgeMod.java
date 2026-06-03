package me.roundaround.namedtraders.forge;

import me.roundaround.trove.forge.TroveForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("namedtraders")
public final class NamedTradersForgeMod {
  public NamedTradersForgeMod(FMLJavaModLoadingContext context) {
    TroveForge.bootstrap(context);
    // Mixin-only mod: nothing else to register.
  }
}
