package org.oilmod.api.items.type;

import org.oilmod.api.items.EnchantmentType;

public interface IHelmet extends IArmor {

    @Override
    int getItemEnchantability();

    @Override
    default EnchantmentType getEnchantmentType() {
        return EnchantmentType.ARMOR_HELMET;
    }


    default ImplementationProvider getImplementationProvider() {
        return ImplementationProvider.ARMOR_HELMET;
    }
}