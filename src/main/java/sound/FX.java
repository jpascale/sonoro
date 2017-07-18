package sound;

public enum FX {
    CLICK("output_cubase/CLICK.ogg"),
    DEATH("output_cubase/death.ogg"),
    //HEALTH("output_cubase/health.ogg"),
    HEALTH("output_cubase/powerup1.ogg"),
    LOSE("output_cubase/lose.ogg"),
    POWER_UP("output_cubase/powerup.ogg"),
    STAB("output_cubase/attack.ogg"),
    STAB1("output_cubase/stab.ogg"),
    STEP_LEFT("output_cubase/stepleft.ogg"),
    STEP_RIGHT("output_cubase/stepright.ogg"),
    STEP("output_cubase/step.ogg"),
    USE_SWORD("output_cubase/usesword.ogg"),
    USE_SHIELD("output_cubase/getSword.ogg"),
    WIN("output_cubase/win.ogg"),
    ENEMY("output_cubase/enemigofinal.ogg"),
    MUSIC("resources/map.ogg"),
    POWER_UPP("resources/powerup1.ogg");

    private final String text;

    private FX(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
