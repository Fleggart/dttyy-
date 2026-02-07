package your.package.name;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item cornSeed;
    public static Item corn;

    public static void init() {
        cornSeed = new Item()
            .setUnlocalizedName("corn_seed")
            .setRegistryName("corn_seed");
        corn = new Item()
            .setUnlocalizedName("corn")
            .setRegistryName("corn");

        GameRegistry.register(cornSeed);
        GameRegistry.register(corn);
    }
}
