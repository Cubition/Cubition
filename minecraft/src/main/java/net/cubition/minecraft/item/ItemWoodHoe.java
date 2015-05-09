package net.cubition.minecraft.item;

import net.cubition.api.API;
import net.cubition.api.TranslatableResource;
import net.cubition.api.item.ToolItem;
import net.cubition.api.network.NetworkIDResource;
import net.cubition.api.tool.ToolType;
import net.cubition.minecraft.tool.ToolShovel;

public class ItemWooden Hoe extends ToolItem implements NetworkIDResource,
		TranslatableResource {

	@Override
	public String getNetworkID() {
		return "290";
	}

	@Override
	public String getTranslatableName() {
		return "item.hoeWood";
	}

	@Override
	public String getTranslatableName(byte damage) {
		return "item.hoeWood";
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
