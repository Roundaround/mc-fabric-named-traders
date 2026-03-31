package me.roundaround.namedtraders.mixin;

import net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WanderingTrader.class)
public abstract class WanderingTraderMixin {
  @Inject(method = "maybeDespawn", at = @At(value = "HEAD"), cancellable = true)
  public void maybeDespawn(CallbackInfo info) {
    WanderingTrader self = ((WanderingTrader) (Object) this);
    if (self.hasCustomName()) {
      info.cancel();
    }
  }
}
