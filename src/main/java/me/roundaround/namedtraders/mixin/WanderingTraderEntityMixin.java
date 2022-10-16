package me.roundaround.namedtraders.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.passive.WanderingTraderEntity;

@Mixin(WanderingTraderEntity.class)
public abstract class WanderingTraderEntityMixin {
  @Inject(method = "tickDespawnDelay", at = @At(value = "HEAD"), cancellable = true)
  public void tickDespawnDelay(CallbackInfo info) {
    WanderingTraderEntity self = ((WanderingTraderEntity) (Object) this);
    if (self.hasCustomName()) {
      info.cancel();
    }
  }
}
