package StormCloud.madengineering.item;

import StormCloud.madengineering.MadEngineering;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class ItemUpgradeableSword extends ItemSword {

	public ItemUpgradeableSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(MadEngineering.MODID, unlocalizedName));
	}

}