package store.items.factory.classes.name_class.brushclass;

import store.items.factory.StoreItemsBrush;
import store.items.factory.classes.names_enum.brush.BrushNameWallpapers;

public class BrushClassNameWallpapers implements StoreItemsBrush {


    /* Return Name if you know catalogue number */

    @Override
    public String getNameByCode(int code) {
        return null;
    }

    /* Return catalogue number if you know name */

    @Override
    public int getCodeByName(String name) {
        return 0;
    }

    /* Get all brush names of one kind. */

    @Override
    public String[] getBrushNames() {

        String[] brushNames = new String[BrushNameWallpapers.values().length];
        int i = 0;

        for (BrushNameWallpapers bne : BrushNameWallpapers.values()) {
            brushNames[i] = " Name  : " +bne.toString()+"  Catalogue number  : " + bne.getCode();
            i++;
        }

        return brushNames;
    }


    @Override
    public String[] getAllNames() {
        return new String[0];
    }
}
