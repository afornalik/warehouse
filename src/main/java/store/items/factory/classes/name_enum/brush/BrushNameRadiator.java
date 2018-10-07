package store.items.factory.classes.name_enum.brush;

public enum BrushNameRadiator implements BrushName{

    K25(4040),K36(4041),K50(4042),K63(4043);

    private int code;

    BrushNameRadiator (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
