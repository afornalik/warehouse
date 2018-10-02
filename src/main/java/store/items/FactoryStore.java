package store.items;


import store.items.factory.StoreItems;
import store.items.factory.StoreItemsBrush;
import store.items.factory.StoreItemsRoller;
import store.items.factory.classes.StoreBrush;
import store.items.factory.classes.StoreRoller;


public class FactoryStore {

    private StoreItems storeitems;

    public  StoreItems getitems(String kind) {
        switch(kind) {
            case"brush" :
                StoreItemsBrush sib = new StoreBrush();
                storeitems = sib;
                break;
            case"roller" :
                StoreItemsRoller sir = new StoreRoller();
                storeitems = sir;
                break;
            default:
                storeitems = null;

        }
        return storeitems;


    }
}
