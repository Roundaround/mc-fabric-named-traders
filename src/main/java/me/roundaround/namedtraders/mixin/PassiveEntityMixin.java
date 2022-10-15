package me.roundaround.namedtraders.mixin;

import java.util.Locale;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.util.Formatting;

@Mixin(PassiveEntity.class)
public abstract class PassiveEntityMixin {
  @Shadow
  protected int breedingAge;

  @Inject(method = "setBreedingAge", at = @At(value = "HEAD"), cancellable = true)
  public void setBreedingAge(int age, CallbackInfo info) {
    PassiveEntity self = ((PassiveEntity) (Object) this);
    if (self.getBreedingAge() < 0
        && self.hasCustomName()
        && !isNameBypass(self)
        && age >= 0) {
      breedingAge = -1;
      info.cancel();
    }
  }

  private static boolean isNameBypass(Entity entity) {
    if (!entity.hasCustomName()) {
      return false;
    }
    String name = Formatting.strip(entity.getName().getString()).toLowerCase(Locale.ROOT);
    return "growup".equals(name) || "grow up".equals(name) || "grow_up".equals(name);
  }
}
