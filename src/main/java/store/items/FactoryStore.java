package store.items;


import store.items.factory.StoreItems;
import store.items.factory.StoreItemsBrush;
import store.items.factory.StoreItemsRoller;
import store.items.factory.classes.StoreAbstractFactory;
import store.items.factory.classes.StoreBrushFactory;
import store.items.factory.classes.StoreRollerFactory;


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
