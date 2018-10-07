package store.items.factory.factory_class;

import store.items.factory.store_interface.StoreItemsBrush;
import store.items.factory.store_interface.StoreItemsRoller;
import store.items.factory.classes.StoreAbstractFactory;
import store.items.factory.classes.name_class.rollerclass.RollerClassNameGirpaint;
import store.items.factory.classes.name_class.rollerclass.RollerClassNameVelur;

public class StoreRollerFactory extends StoreAbstractFactory {

    @Override
    public StoreItemsRoller getRollerKind(String kind) {
        kind  = kind.toLowerCase();
        switch  (kind) {
            case "girpaint": {
                return new RollerClassNameGirpaint();

            }
            case "velur": {
                return new RollerClassNameVelur();

            }
            default: {
                return null;

            }
        }

    }

    @Override
    public StoreItemsBrush getBrushKind(String kind) {
        return null;
    }





}
