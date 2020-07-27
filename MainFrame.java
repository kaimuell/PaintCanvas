import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {

    MainFrame(){
        super("PaintCanvas");
        this.setPreferredSize(new Dimension(400, 550));
        SelectPanel sp = new SelectPanel();
        Leinwand lw = new Leinwand(sp);
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
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pack();
    }

    public static void main (String[] args){
        MainFrame mf = new MainFrame();
    }
}
