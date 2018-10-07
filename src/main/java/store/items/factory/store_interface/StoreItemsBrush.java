package store.items.factory.store_interface;


import store.items.factory.StoreItems;

public interface StoreItemsBrush extends StoreItems {



    String getNameByCode(int code);

    int getCodeByName(String name);


    String[] getBrushNames();
}
