package store.items.factory.classes.name_enum.brush;

public enum BrushNameHalfEnglish implements BrushName {

    PA15(4010),PA20(4011),PA25(4012),PA36(4013),PA50(4014),PA63(4015);

    private int code;

    BrushNameHalfEnglish (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
