package store.items.factory.classes;

import store.items.factory.StoreItemsBrush;
import store.items.factory.StoreItemsRoller;
import store.items.factory.classes.name_class.brushclass.*;

public class StoreBrushFactory extends StoreAbstractFactory {

    @Override
    public StoreItemsBrush getBrushKind(String kind) {
        kind = kind.toLowerCase();
        switch (kind) {
            case "english" : {
                return new BrushClassNameEnglish();
            }
            case "halfenglish" : {
                return new BrushClassNameHalfEnglish();
            }
            case "radiator" : {
                return new BrushClassNameRadiator();
            }
            case "varnished" : {
                return new BrushClassNameVarnished();
            }
            case "wallpaper" : {
                return new BrushClassNameWallpapers();
            }
            case "wide" : {
                return new BrushClassNameWide();
            }
            default : {
                return null;
            }
        }
    }

    @Override
    public StoreItemsRoller getRollerKind(String kind) {
        return null;
    }
}
