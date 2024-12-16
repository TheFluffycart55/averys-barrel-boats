package net.thefluffycart.barrel_boats;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.thefluffycart.barrel_boats.block.ModBlocks;
import net.thefluffycart.barrel_boats.item.ModItems;

public class AverysBarrelBoatsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THEFLUFFYCART_PLUSHIE, RenderLayer.getCutout());
        TerraformBoatClientHelper.registerModelLayers(ModItems.ACACIA_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.BAMBOO_BARREL_RAFT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.BIRCH_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.CHERRY_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.DARK_OAK_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.JUNGLE_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.MANGROVE_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.OAK_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.SPRUCE_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.PALE_OAK_BOAT_ID);

        TerraformBoatClientHelper.registerModelLayers(ModItems.CRIMSON_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.CRIMSON_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.WARPED_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.WARPED_BARREL_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.BAMBOO_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(ModItems.BAMBOO_BARREL_BOAT_ID);

    }
}
