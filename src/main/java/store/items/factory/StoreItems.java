package store.items.factory;

public interface StoreItems {

    String[]  getAllNames();

    void setCode(int code);

    int getCode();

    void compareName(String name);

    String getName();

    void setSize(int size);

    int getSize();
}
