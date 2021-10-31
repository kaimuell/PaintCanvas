import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {

    MainFrame(Settings settings){
        super("PaintCanvas");
        this.setPreferredSize(new Dimension(600, 600));
        SelectPanel sp = new SelectPanel(settings);
        MyCanvas lw = new MyCanvas(settings);
        this.add(lw, BorderLayout.NORTH);
        this.add(sp, BorderLayout.SOUTH);
        Button resetButton = new Button("RESET");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lw.reset();
            }
        });
        sp.add(resetButton);
        this.setVisible(true);
        this.setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();
    }
}
