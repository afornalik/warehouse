package store.items.factory.classes.name_class.rollerclass;

import store.items.factory.StoreItemsRoller;
import store.items.factory.classes.names_enum.roller.RollerNameGirpaint;

public class RollerClassNameGirpaint implements StoreItemsRoller {


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
    public String[] getRollerNames() {

        String[] rollerNames = new String[RollerNameGirpaint.values().length];
        int i = 0;

        for (RollerNameGirpaint rn : RollerNameGirpaint.values()) {
            rollerNames[i] = " Name  : " +rn.toString()+"  Catalogue number  : " + rn.getCode();
            i++;
        }

        return rollerNames;
    }


    @Override
    public String[] getAllNames() {
        return new String[0];
    }


}
