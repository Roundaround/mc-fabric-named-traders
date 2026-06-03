package me.roundaround.namedtraders.mixin;

import net.minecraft.world.entity.animal.equine.TraderLlama;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TraderLlama.class)
public abstract class TraderLlamaMixin {
  @Inject(method = "canDespawn", at = @At(value = "HEAD"), cancellable = true)
  public void canDespawn(CallbackInfoReturnable<Boolean> info) {
    TraderLlama self = ((TraderLlama) (Object) this);
    if (self.hasCustomName()) {
      info.setReturnValue(false);
    }
  }
}
