public class ItemCornSeed extends ItemSeeds {
    public ItemCornSeed(Block crop) {
        super(crop, Blocks.FARMLAND);
        setRegistryName("cropmod", crop.getRegistryName().getResourcePath() + "_seed");
        setTranslationKey("cropmod." + crop.getRegistryName().getResourcePath() + "_seed");
    }
}