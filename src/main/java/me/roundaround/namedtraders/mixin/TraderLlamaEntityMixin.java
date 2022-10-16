package me.roundaround.namedtraders.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.passive.TraderLlamaEntity;

@Mixin(TraderLlamaEntity.class)
public abstract class TraderLlamaEntityMixin {
  @Inject(method = "canDespawn", at = @At(value = "HEAD"), cancellable = true)
  public void canDespawn(CallbackInfoReturnable<Boolean> info) {
    TraderLlamaEntity self = ((TraderLlamaEntity) (Object) this);
    if (self.hasCustomName()) {
      info.setReturnValue(false);
      return;
    }
  }
}
