package net.thefluffycart.barrel_boats.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thefluffycart.barrel_boats.AverysBarrelBoats;

public class ModItems {
    //BARREL BOAT IDS
    public static final Identifier ACACIA_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "acacia_barrel_boat");
    public static final Identifier BAMBOO_BARREL_RAFT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "bamboo_barrel_raft");
    public static final Identifier BIRCH_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "birch_barrel_boat");
    public static final Identifier CHERRY_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "cherry_barrel_boat");
    public static final Identifier DARK_OAK_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "dark_oak_barrel_boat");
    public static final Identifier JUNGLE_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "jungle_barrel_boat");
    public static final Identifier MANGROVE_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "mangrove_barrel_boat");
    public static final Identifier OAK_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "oak_barrel_boat");
    public static final Identifier SPRUCE_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "spruce_barrel_boat");
    public static final Identifier PALE_OAK_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "pale_oak_barrel_boat");

    //WARPED AND CRIMSON BOAT IDS
    public static final Identifier CRIMSON_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "crimson");
    public static final Identifier CRIMSON_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "crimson_barrel_boat");
    public static final Identifier WARPED_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "warped");
    public static final Identifier WARPED_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "warped_barrel_boat");
    public static final Identifier BAMBOO_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "bamboo");
    public static final Identifier BAMBOO_BARREL_BOAT_ID = Identifier.of(AverysBarrelBoats.MOD_ID, "bamboo_barrel_boat");

    //REGISTER BARREL BOAT ITEMS
    public static final Item ACACIA_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(ACACIA_BARREL_BOAT_ID, true);
    public static final Item BAMBOO_BARREL_RAFT = TerraformBoatItemHelper.registerBoatItem(BAMBOO_BARREL_RAFT_ID, true, true);
    public static final Item BIRCH_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(BIRCH_BARREL_BOAT_ID, true);
    public static final Item CHERRY_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(CHERRY_BARREL_BOAT_ID, true);
    public static final Item DARK_OAK_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(DARK_OAK_BARREL_BOAT_ID, true);
    public static final Item JUNGLE_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(JUNGLE_BARREL_BOAT_ID, true);
    public static final Item MANGROVE_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(MANGROVE_BARREL_BOAT_ID, true);
    public static final Item OAK_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(OAK_BARREL_BOAT_ID, true);
    public static final Item SPRUCE_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(SPRUCE_BARREL_BOAT_ID, true);
    public static final Item PALE_OAK_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(PALE_OAK_BOAT_ID, true);

    //WARPED AND CRIMSON BOATS
    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(CRIMSON_BOAT_ID, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(CRIMSON_BOAT_ID, true);
    public static final Item CRIMSON_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(CRIMSON_BARREL_BOAT_ID, true);
    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(WARPED_BOAT_ID, false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(WARPED_BOAT_ID, true);
    public static final Item WARPED_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(WARPED_BARREL_BOAT_ID, true);
    public static final Item BAMBOO_BOAT = TerraformBoatItemHelper.registerBoatItem(BAMBOO_BOAT_ID, false);
    public static final Item BAMBOO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(BAMBOO_BOAT_ID, true);
    public static final Item BAMBOO_BARREL_BOAT = TerraformBoatItemHelper.registerBoatItem(BAMBOO_BARREL_BOAT_ID, true);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AverysBarrelBoats.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AverysBarrelBoats.LOGGER.info("Registering Mod Items for " + AverysBarrelBoats.MOD_ID);

    }
}
