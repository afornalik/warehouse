package store.items.factory;

public interface StoreItemsRoller extends StoreItems {


    String getNameByCode(int code);

    int getCodeByName(String name);


    String[] getRollerNames();

}
