package store.items.factory.classes.names_enum.brush;

public enum BrushNameVarnished implements BrushName {

    PROFI1(4050),PROFI1_5(4051),PROFI2(4052),PROFI2_5(4053),PROFI3(4054),PROFI3_5(4055),PROFI4(4056);

    private int code;

    BrushNameVarnished(int code) {

        this.code = code;

    }

    public int getCode() {
        return code;
    }
}
