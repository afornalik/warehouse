package store.items.factory.classes.name_enum.roller;

public enum RollerNameGirpaint {

    GIRPAINT_7CM(3030),GIRPAINT_11CM(3031),GIRPAINT_15CM(3032),GIRPAINT_11CM_MIDI(3033),GIRPAINT_15CM_MIDI(3034),GIRPAINT_18CM(3011),GIRPAINT_25CM(3012);

    private int code;

    RollerNameGirpaint (int code) {
        this.code = code;
    }

    public int getCode () {
        return this.code;
    }
}
