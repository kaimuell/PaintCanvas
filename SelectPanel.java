import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SelectPanel extends Panel {
    Settings settings;

    SelectPanel(Settings settings) {
        this.setSize(400, 100);
        //Farbauswahl
        JButton colorChoiceButton = new JButton("Farbauswahl");
        colorChoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Farbauswahl", settings.getSelectedColor());
                if (color!= null) {
                    settings.setColor(color);
                }
            }
        });

        this.add(colorChoiceButton);

        String[] s = {"1", "3", "5", "10", "20", "40", "80"};
        //Strokeauswahl
        JComboBox strokes = new JComboBox(s);
        strokes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == strokes) {
                    Object o = Objects.requireNonNull(strokes.getSelectedItem());
                    if ("1".equals(o)) {
                        settings.setStrokeSize(1.0f);
                    } else if ("3".equals(o)) {
                        settings.setStrokeSize(3.0f);
                    } else if ("5".equals(o)) {
                        settings.setStrokeSize(5.0f);
                    } else if ("10".equals(o)) {
                        settings.setStrokeSize(10.0f);
                    } else if ("20".equals(o)) {
                        settings.setStrokeSize(20.0f);
                    } else if ("40".equals(o)) {
                        settings.setStrokeSize(40.0f);
                    } else if ("80".equals(o)) {
                        settings.setStrokeSize(80.0f);
                    } else {
                        settings.setStrokeSize(3.0f);
                    }
                }
            }
        });

        this.add(strokes);

        this.setVisible(true);
    }
}
