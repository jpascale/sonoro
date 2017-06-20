package sound;


import javax.swing.*;
import java.io.FileInputStream;

public class SoundMaker {

    private static SoundMaker instance = null;
    private OggClip music;
    private OggClip effect;
    private OggClip step;
    private boolean booleanStep;

    private SoundMaker(){

    }

    public static SoundMaker getInstance(){
        if (instance == null) {
            instance = new SoundMaker();
        }

        return instance;
    }

    public void effect(FX effect){
        System.out.println(String.valueOf(effect));
        try {
            this.effect = new OggClip(new FileInputStream(String.valueOf(effect)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar audio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.effect.play();
    }

    public void music(FX music) {
        try {
            this.music = new OggClip(new FileInputStream(String.valueOf(music)));
            this.music.loop();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar audio", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void stopMusic(){
        if (this.music != null)
            this.music.stop();
    }


}
