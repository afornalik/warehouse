package store.items.factory.classes.name_enum.brush;

public enum BrushNameWide implements BrushName {


    L110(4080),L130(4081),L140(4082),L150(4083),L170(4084),L180(4085),L190(4086),L195(4087);

    private int code;

    BrushNameWide (int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
