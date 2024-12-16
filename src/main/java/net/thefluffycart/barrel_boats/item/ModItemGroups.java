package net.thefluffycart.barrel_boats.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thefluffycart.barrel_boats.AverysBarrelBoats;
import net.thefluffycart.barrel_boats.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BARREL_BOAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AverysBarrelBoats.MOD_ID, "barrel_boats"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.barrel_boats"))
                    .icon(() -> new ItemStack(ModItems.SPRUCE_BARREL_BOAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OAK_BARREL_BOAT);
                        entries.add(ModItems.SPRUCE_BARREL_BOAT);
                        entries.add(ModItems.BIRCH_BARREL_BOAT);
                        entries.add(ModItems.JUNGLE_BARREL_BOAT);
                        entries.add(ModItems.DARK_OAK_BARREL_BOAT);
                        entries.add(ModItems.ACACIA_BARREL_BOAT);
                        entries.add(ModItems.MANGROVE_BARREL_BOAT);
                        entries.add(ModItems.CHERRY_BARREL_BOAT);
                        entries.add(ModItems.BAMBOO_BARREL_RAFT);
                        entries.add(ModItems.PALE_OAK_BARREL_BOAT);
                        entries.add(ModItems.CRIMSON_BOAT);
                        entries.add(ModItems.CRIMSON_BARREL_BOAT);
                        entries.add(ModItems.CRIMSON_CHEST_BOAT);
                        entries.add(ModItems.WARPED_BOAT);
                        entries.add(ModItems.WARPED_BARREL_BOAT);
                        entries.add(ModItems.WARPED_CHEST_BOAT);
                        entries.add(ModItems.BAMBOO_BOAT);
                        entries.add(ModItems.BAMBOO_BARREL_BOAT);
                        entries.add(ModItems.BAMBOO_CHEST_BOAT);
                        entries.add(ModBlocks.THEFLUFFYCART_PLUSHIE);

                    }).build());
    public static void registerItemGroups() {
        AverysBarrelBoats.LOGGER.info("Registering Item Groups for " + AverysBarrelBoats.MOD_ID);
    }
}

