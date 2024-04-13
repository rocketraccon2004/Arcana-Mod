package net.arcanamod.items.Armor;

import net.arcanamod.items.ArcanaItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArcanaArmourMaterials {
    public static final ArmorMaterial GOGGLES = new ArmorMaterial() {
        @Override
        public String getName() {
            return "arcana:goggles";
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 11 * 5;
                case CHESTPLATE -> 16 * 5;
                case LEGGINGS -> 15 * 5;
                case BOOTS -> 13 * 5;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 2;
                case CHESTPLATE -> 0;
                case LEGGINGS -> 0;
                case BOOTS -> 0;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GENERIC;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY;
        }
    };

    public static final ArmorMaterial ARCANIUM = new ArmorMaterial() {
        @Override
        public String getName() {
            return "arcana:arcanium";
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 11 * 20;
                case CHESTPLATE -> 16 * 20;
                case LEGGINGS -> 15 * 20;
                case BOOTS -> 13 * 20;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 3;
                case CHESTPLATE -> 7;
                case LEGGINGS -> 5;
                case BOOTS -> 2;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        @Override
        public float getToughness() {
            return 1;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GENERIC;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ArcanaItems.ARCANIUM_INGOT.get());
        }
    };

    public static final ArmorMaterial VOID_METAL = new ArmorMaterial() {
        @Override
        public String getName() {
            return "arcana:void_metal";
        }

        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 11 * 17;
                case CHESTPLATE -> 16 * 17;
                case LEGGINGS -> 15 * 17;
                case BOOTS -> 13 * 17;
            };
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return switch (type) {
                case HELMET -> 4;
                case CHESTPLATE -> 8;
                case LEGGINGS -> 6;
                case BOOTS -> 3;
            };
        }

        @Override
        public int getEnchantmentValue() {
            return 20;
        }

        @Override
        public float getToughness() {
            return 1;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GENERIC;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ArcanaItems.VOID_METAL_INGOT.get());
        }
    };
}
