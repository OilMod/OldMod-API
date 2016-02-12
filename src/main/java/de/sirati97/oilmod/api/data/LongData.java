package de.sirati97.oilmod.api.data;

import de.sirati97.oilmod.api.config.Compound;

/**
 * Created by sirati97 on 17.01.2016.
 */
public class LongData extends IPrimaryDataBase<Long> {
    private long data;

    public LongData(String name, DataParent dataParent) {
        super(name, dataParent);
    }

    public void saveTo(Compound parent, String name) {
        parent.setLong(name, data);
    }

    public void loadFrom(Compound parent, String name) {
        this.data = parent.getLong(name);
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }
}
