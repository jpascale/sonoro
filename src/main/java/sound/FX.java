package sound;

public enum FX {
    CLICK("output_cubase/CLICK.ogg"),
    DEATH("output_cubase/death.ogg"),
    HEALTH("output_cubase/health.ogg"),
    LOSE("output_cubase/lose.ogg"),
    POWER_UP("output_cubase/powerup.ogg"),
    STAB("output_cubase/stab.ogg"),
    STEP_LEFT("output_cubase/stepleft.ogg"),
    STEP_RIGHT("output_cubase/stepright.ogg"),
    USE_SWORD("output_cubase/usesword.ogg"),
    WIN("output_cubase/win.ogg"),
    MUSIC("resources/map.ogg");

    private final String text;

    private FX(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
    /*
            CLICK = "output_cubase/CLICK.ogg";
    public static String DEATH      = "output_cubase/death.ogg";
    public static String HEALTH     = "output_cubase/health.ogg";
    public static String LOSE       = "output_cubase/lose.ogg";
    public static String POWER_UP   = "output_cubase/powerup.ogg";
    public static String STAB       = "output_cubase/stab.ogg";
    public static String STEP_LEFT  = "output_cubase/stepleft.ogg";
    public static String STEP_RIGHT = "output_cubase/stepright.ogg";
    public static String USE_SWORD  = "output_cubase/usesword.ogg";
    public static String WIN        = "output_cubase/win.ogg";*/

}
