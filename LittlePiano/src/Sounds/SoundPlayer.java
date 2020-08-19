
package Sounds;

import PianoSwing.Piano;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class SoundPlayer {
    
    private final String PIANO_A = "resource/a.wav";
    private final String PIANO_B = "resource/b.wav";
    private final String PIANO_ASHARP = "resource/a#.wav";
    private final String PIANO_CSHARP = "resource/c#.wav";
    private final String PIANO_C = "resource/c.wav";
    private final String PIANO_D = "resource/d.wav";
    private final String PIANO_E = "resource/e.wav";
    private final String PIANO_DSHARP = "resource/d#.wav";
    private final String PIANO_FSHARP = "resource/f#.wav";
    private final String PIANO_F = "resource/f.wav";
    private final String PIANO_GSHARP = "resource/g#.wav";
    private final String PIANO_G = "resource/g.wav";

    public String getPIANO_A() {
        return PIANO_A;
    }

    public String getPIANO_B() {
        return PIANO_B;
    }

    public String getPIANO_ASHARP() {
        return PIANO_ASHARP;
    }

    public String getPIANO_CSHARP() {
        return PIANO_CSHARP;
    }

    public String getPIANO_C() {
        return PIANO_C;
    }

    public String getPIANO_D() {
        return PIANO_D;
    }

    public String getPIANO_E() {
        return PIANO_E;
    }

    public String getPIANO_DSHARP() {
        return PIANO_DSHARP;
    }

    public String getPIANO_FSHARP() {
        return PIANO_FSHARP;
    }

    public String getPIANO_F() {
        return PIANO_F;
    }

    public String getPIANO_GSHARP() {
        return PIANO_GSHARP;
    }

    public String getPIANO_G() {
        return PIANO_G;
    }

    public void playSound(String wav) {
             
        try {
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(wav));
            
            Clip clip = AudioSystem.getClip();
            
            clip.open(audioStream);
            clip.start();
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            JOptionPane.showMessageDialog(new Piano(), "Cannot Found "+ wav);
        }
    }
}