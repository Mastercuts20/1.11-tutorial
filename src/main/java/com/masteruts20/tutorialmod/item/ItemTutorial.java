package com.masteruts20.tutorialmod.item;

import com.masteruts20.tutorialmod.Tutorial;
import com.masteruts20.tutorialmod.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class ItemTutorial extends Item{

@Override
public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand)
{
    player.addChatMessage(new TextComponentString("you used my item"));
    return super.onItemRightClick(world, player, hand);

}
@Override
public String getUnlocalizedName(ItemStack stack) {

    return "item." + Tutorial.RESOURCE_PREFIX + Names.TUTORIAL_ITEM; // item.tutorial:tutorial_item
}
}
