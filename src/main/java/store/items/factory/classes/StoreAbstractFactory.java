package store.items.factory.classes;

import store.items.factory.StoreItemsBrush;
import store.items.factory.StoreItemsRoller;

public abstract class StoreAbstractFactory {

    abstract StoreItemsBrush getBrushKind();

    abstract StoreItemsRoller getRollerKind();







}
