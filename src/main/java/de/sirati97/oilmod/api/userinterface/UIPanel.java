package de.sirati97.oilmod.api.userinterface;

/**
 * Created by sirati97 on 14.06.2016 for OilMod-Api.
 */
public interface UIPanel {
    int size();
    boolean hasForm();
    UIElementResult getUIElement(int index);
}
