import java.awt.*;

public class SelectPanel extends Panel {
    Choice c, s;

    SelectPanel() {
        this.setSize(400, 100);
        //Farbauswahl
        this.c = new Choice();
        c.add("BLUE");
        c.add("CYAN");
        c.add("RED");
        c.add("MAGENTA");
        c.add("GREEN");
        c.add("YELLOW");
        c.add("ORANGE");
        c.add("WHITE");
        c.add("BLACK");
        this.add(c);

        //Strokeauswahl
        this.s = new Choice();
        s.add("1");
        s.add("3");
        s.add("5");
        s.add("10");
        s.add("20");
        s.add("40");
        s.add("80");

        this.add(s);

        this.setVisible(true);
    }

    public Color getSelectedColor(){
        switch (c.getSelectedItem()) {
            case "BLUE":
                return Color.BLUE;
            case "CYAN":
                return Color.CYAN;
            case "RED":
                return Color.RED;
            case "MAGENTA":
                return Color.MAGENTA;
            case "GREEN":
                return Color.GREEN;
            case "YELLOW":
                return Color.YELLOW;
            case "ORANGE" :
                return Color.ORANGE;
            case "WHITE":
                return Color.WHITE;
            case "BLACK" :
                return Color.BLACK;
            default :
            return Color.WHITE;
        }
    }

    public BasicStroke getSelectedStroke(){
        switch (s.getSelectedItem()) {
            case "1":
                return new BasicStroke(1.0f);
            case "3":
                return new BasicStroke(3.0f);
            case "5":
                return new BasicStroke(5.0f);
            case "10":
                return new BasicStroke(10.0f);
            case "20":
                return new BasicStroke(20.0f);
            case "40":
                return new BasicStroke(40.0f);
            case "80":
                return new BasicStroke(80.0f);
            default :
                return new BasicStroke(3.0f);
        }
    }
}
