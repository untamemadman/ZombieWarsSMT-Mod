package pw.untamemadman.modding.zombiemod.item;

import net.minecraft.item.ItemFood;
import pw.untamemadman.modding.zombiemod.creativetab.CreativeTabZombieMod;
import pw.untamemadman.modding.zombiemod.reference.Reference;

public class ItemChocolate extends ItemFood
{
    public ItemChocolate()
    {
        super(5, 1.0F, false);
        this.setUnlocalizedName("Chocolate");
        this.setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(CreativeTabZombieMod.ZOMBIEMOD_TAB);
    }
}