package at.fischling.foodplus.item;

import at.fischling.foodplus.FoodPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item GRILLED_BROWN_MUSHROOM = registerItem("grilled_brown_mushroom", Item::new, new Item.Settings().food(new FoodComponent.Builder().saturationModifier(0.2f).nutrition(2).build()));
    public static final Item GRILLED_RED_MUSHROOM = registerItem("grilled_red_mushroom", Item::new, new Item.Settings().food(new FoodComponent(2,0.2f,false)));
    public static final Item GRILLED_CARROT = registerItem("grilled_carrot", Item::new, new Item.Settings().food(new FoodComponent(2,0.2f,false)));
    public static final Item VEGETABLE_SKEWERS = registerItem("vegetable_skewers", Item::new, new Item.Settings().food(new FoodComponent(1,0.2f,false)));
    public static final Item GRILLED_VEGETABLE_SKEWERS = registerItem("grilled_vegetable_skewers", Item::new, new Item.Settings().food(new FoodComponent(4,1f,false)));
    public static final Item HONEY_BREAD = registerItem("honey_bread", Item::new, new Item.Settings().food(new FoodComponent(5,2f,false)));
    public static final Item SCRAMBLED_EGGS = registerItem("scrambled_eggs", Item::new, new Item.Settings().food(new FoodComponent(1,0.2f,false)));
    public static final Item COOKED_SCRAMBLED_EGGS = registerItem("cooked_scrambled_eggs", Item::new, new Item.Settings().food(new FoodComponent(4,0.8f,false)));
    public static final Item FRIED_EGG = registerItem("fried_egg", Item::new, new Item.Settings().food(new FoodComponent(2,0.5f,false)));
    public static final Item PANCAKE = registerItem("pancake", Item::new, new Item.Settings().food(new FoodComponent(3,0.5f,true), ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 6 * 20, 1), 1.0f)).build()));
    public static final Item HONEY_PANCAKE = registerItem("honey_pancake", Item::new, new Item.Settings().food(new FoodComponent(3,0.5f,true), ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 6 * 20, 2), 1.0f)).build()));
    public static final Item JAM = registerItem("jam", Item::new, new Item.Settings());
    public static final Item JAM_PANCAKE = registerItem("jam_pancake", Item::new, new Item.Settings().food(new FoodComponent(3,0.5f,true),ConsumableComponent.builder().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 6 * 20, 2), 1.0f)).build()));
    public static final Item JAM_BREAD = registerItem("jam_bread", Item::new, new Item.Settings().food(new FoodComponent(5,2f,false)));


    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FoodPlus.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModItems() {
        FoodPlus.LOGGER.info("Registering Mod Items for " + FoodPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GRILLED_BROWN_MUSHROOM);
            fabricItemGroupEntries.add(GRILLED_RED_MUSHROOM);
            fabricItemGroupEntries.add(GRILLED_CARROT);
            fabricItemGroupEntries.add(VEGETABLE_SKEWERS);
            fabricItemGroupEntries.add(GRILLED_VEGETABLE_SKEWERS);
            fabricItemGroupEntries.add(HONEY_BREAD);
            fabricItemGroupEntries.add(SCRAMBLED_EGGS);
            fabricItemGroupEntries.add(COOKED_SCRAMBLED_EGGS);
            fabricItemGroupEntries.add(FRIED_EGG);
            fabricItemGroupEntries.add(PANCAKE);
            fabricItemGroupEntries.add(HONEY_PANCAKE);
            fabricItemGroupEntries.add(JAM);
            fabricItemGroupEntries.add(JAM_PANCAKE);
            fabricItemGroupEntries.add(JAM_BREAD);

        });
    }
}
