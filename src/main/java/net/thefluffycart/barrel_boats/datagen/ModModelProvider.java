package net.thefluffycart.barrel_boats.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.thefluffycart.barrel_boats.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    //Push 2
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ACACIA_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_BARREL_RAFT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_OAK_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNGLE_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGROVE_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OAK_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPRUCE_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALE_OAK_BARREL_BOAT, Models.GENERATED);

        //WARPED AND CRIMSON ITEM MODELS
        itemModelGenerator.register(ModItems.CRIMSON_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_BARREL_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_CHEST_BOAT, Models.GENERATED);
    }
}