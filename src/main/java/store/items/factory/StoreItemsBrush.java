package store.items.factory;



public interface StoreItemsBrush extends StoreItems {



    String getNameByCode(int code);

    int getCodeByName(String name);


    String[] getBrushNames();
}
