package de.sirati97.oilmod.api.items;

import java.util.Collections;
import java.util.List;

/**
 * Created by sirati97 on 13.03.2016.
 */
public class ItemDescription {
    private int lastSize = 0;
    private List<String> lines;
    private List<String> linesReadOnly;
    private NMSItemStack itemStack;

    public ItemDescription(List<String> lines, NMSItemStack itemStack) {
        this.lines = lines;
        this.linesReadOnly = Collections.unmodifiableList(lines);
        this.itemStack = itemStack;
        this.lastSize = lines.size();

    }

    public void init() {
        if (!itemStack.hasLore() && lines.size() > 0) {
//            System.out.println("setted lore first time for " + itemStack.toString() + " " + lines.get(0));
//            Compound tag = itemStack.getTagCompound();
//            System.out.println(tag != null);
//            if (tag != null) {
//                boolean hasDisplay = tag.containsKey("display");
//                System.out.println(hasDisplay);
//                if (hasDisplay) {
//                    Compound display = tag.getCompound("display");
//                    boolean hasLore = tag.containsKey("Lore");
//                    System.out.println(hasLore);
//                }
//            }

            itemStack.updateItemDescription(0, linesReadOnly);
        }
    }

    public int getSize() {
        return lastSize;
    }

    public int getVirtualSize() {
        return lines.size();
    }

    public List<String> getLines() {
        return linesReadOnly;
    }

    public void removeLine(int index, boolean update) {
        lines.remove(index);
        if (update) {
            forceUpdate();
        }
    }

    public String getLine(int index) {
        return lines.get(index);
    }

    public void setLine(int index, String line, boolean update) {
        lines.set(index, line);
        if (update) {
            forceUpdate();
        }

    }

    public void insertLine(int index, String line, boolean update) {
        lines.add(index, line);
        if (update) {
            forceUpdate();
        }

    }

    public void appendLine(String line, boolean update) {
        lines.add(line);
        if (update) {
            forceUpdate();
        }
    }

    public void forceUpdate() {
        itemStack.updateItemDescription(lastSize, linesReadOnly);
        lastSize = lines.size();
    }


}
