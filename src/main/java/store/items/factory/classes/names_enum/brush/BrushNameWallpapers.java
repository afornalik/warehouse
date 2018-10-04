package store.items.factory.classes.names_enum.brush;

public enum BrushNameWallpapers  implements BrushName{

    T70(4060),T90(4061),T110(4062),T130(4063),T140(4064),T150(4065);

    private int code;

    BrushNameWallpapers (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
