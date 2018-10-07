package store.items.factory.classes;

import store.items.factory.store_interface.StoreItemsBrush;
import store.items.factory.store_interface.StoreItemsRoller;

public abstract class StoreAbstractFactory {

    public abstract StoreItemsBrush getBrushKind(String kind);

    public abstract StoreItemsRoller getRollerKind(String kind);







}
