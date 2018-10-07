package store.items.factory.store_interface;

import store.items.factory.StoreItems;

public interface StoreItemsRoller extends StoreItems {


    String getNameByCode(int code);

    int getCodeByName(String name);


    String[] getRollerNames();

}
