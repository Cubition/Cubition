package net.cubition.minecraft.item;

import net.cubition.api.API;
import net.cubition.api.TranslatableResource;
import net.cubition.api.item.ToolItem;
import net.cubition.api.network.NetworkIDResource;
import net.cubition.api.tool.ToolType;
import net.cubition.minecraft.tool.ToolHoe;

public class ItemDiamondHoe extends ToolItem implements NetworkIDResource,
        TranslatableResource {

    @Override
    public String getNetworkID() {
        return "293";
    }

    @Override
    public String getTranslatableName() {
        return "item.hoeDiamond";
    }

    @Override
    public String getTranslatableName(byte damage) {
        return "item.hoeDiamond";
    }

    @Override
    public int maxStackSize() {
        return 1;
    }

    @Override
    public ToolType getToolType() {
        return API.getToolTypeRegister().get(ToolHoe.class.getName());
    }
}
