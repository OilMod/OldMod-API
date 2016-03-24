package de.sirati97.oilmod.api.items.crafting;

import de.sirati97.oilmod.api.items.OilBukkitItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by sirati97 on 24.03.2016.
 */
public class VanillaOilCraftingResult implements OilCraftingResult {
    private final ItemStack result;


    public VanillaOilCraftingResult(ItemStack result) {
        if (result instanceof OilBukkitItemStack) {
            throw new IllegalStateException("Itemstack is not a vanilla itemstack.");
        }
        this.result = result;
    }

    public VanillaOilCraftingResult(Material material) {
        this(new ItemStack(material));
    }

    public VanillaOilCraftingResult(Material material, int amount) {
        this(new ItemStack(material, amount));
    }

    public VanillaOilCraftingResult(Material material, int amount, short data) {
        this(new ItemStack(material, amount, data));
    }

    @Override
    public ItemStack getResult(ItemStack[] matrix, boolean shaped, int width, int height) {
        return result.clone();
    }
}