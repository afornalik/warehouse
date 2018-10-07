package store.items.factory.classes;

import store.items.factory.StoreItemsBrush;
import store.items.factory.StoreItemsRoller;

public abstract class StoreAbstractFactory {

    public abstract StoreItemsBrush getBrushKind(String kind);

    public abstract StoreItemsRoller getRollerKind(String kind);







}
