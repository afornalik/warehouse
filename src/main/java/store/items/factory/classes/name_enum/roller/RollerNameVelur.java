package store.items.factory.classes.name_enum.roller;

public enum RollerNameVelur {

    VELUR_7CM(3035),VELUR_11CM(3036),VELUR_15CM(3037),VELUR_11CM_MIDI(3038),VELUR_15CM_MIDI(3039),VELUR_18CM(3097),VELUR_25CM(3098);

    private int code;

    RollerNameVelur (int code) {
        this.code = code;
    }

    public int getCode () {
        return this.code;
    }
}
