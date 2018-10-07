package store.items;


import store.items.factory.StoreItems;
import store.items.factory.classes.StoreAbstractFactory;
import store.items.factory.factory_class.StoreBrushFactory;
import store.items.factory.factory_class.StoreRollerFactory;


public class FactoryStore {

    private StoreItems storeitems;

    public static StoreAbstractFactory getitems(String kind) {
        switch(kind) {
            case"brush" :
                return new StoreBrushFactory();

            case"roller" :
                return new StoreRollerFactory();
            default:
                return null;

        }



    }
}
