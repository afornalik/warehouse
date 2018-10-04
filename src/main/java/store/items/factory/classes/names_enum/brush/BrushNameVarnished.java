package store.items.factory.classes.names_enum.brush;

public enum BrushNameVarnished implements BrushName {

    PRO1(4050),PRO2(4051),PRO3(4052),PRO4(4053),PRO5(4054),PRO6(4055),PRO7(4056);

    private int code;

    BrushNameVarnished(int code) {

        this.code = code;

    }

    public int getCode() {
        return code;
    }
}
