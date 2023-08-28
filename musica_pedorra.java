import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class musica_pedorra extends Thread{

    @Override
    public void run(){
         try {
             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("o95.wav").getAbsoluteFile());
             Clip clip = AudioSystem.getClip();
             clip.open(audioInputStream);
            clip.start();
             
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
              System.out.println(ex);
            }
        

    }

}
