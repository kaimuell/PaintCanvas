import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String[] args){

        SwingUtilities.invokeLater(()->{MainFrame mf = new MainFrame(new Settings(1.0f, new Color(255,255,255)));});
    }
}
