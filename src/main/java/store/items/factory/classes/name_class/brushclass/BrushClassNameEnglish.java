package store.items.factory.classes.name_class.brushclass;

import store.items.factory.store_interface.StoreItemsBrush;
import store.items.factory.classes.name_class.StringFormat;
import store.items.factory.classes.name_enum.brush.BrushNameEnglish;

public class BrushClassNameEnglish implements StoreItemsBrush {


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

        String[] brushNames = new String[BrushNameEnglish.values().length];
        int i = 0;

        for (BrushNameEnglish bne : BrushNameEnglish.values()) {
            brushNames[i] = StringFormat.writeDescription("English",bne.name(),bne.getCode());
            i++;
        }

        return brushNames;
    }


    @Override
    public String[] getAllNames() {
        return new String[0];
    }
}
