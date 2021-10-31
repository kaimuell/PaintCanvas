import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

//Realisiert ein Feld auf dem mit der Maus gezeichnet werden kann
public class MyCanvas extends JPanel implements MouseListener, MouseMotionListener {
    private Graphics2D g2D;
    private BufferedImage img;

    Point2D startPoint, aktPoint;

    Settings settings;

    public MyCanvas(Settings settings){
        this.setPreferredSize(new Dimension(600,500));
        this.settings = settings;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.img = new BufferedImage(600, 500, BufferedImage.TYPE_INT_RGB);
        this.g2D = img.createGraphics();
        this.g2D.setStroke(settings.getSelectedStroke());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent ev){
        startPoint = ev.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent ev) {
        aktPoint = ev.getPoint();
        g2D.setColor(settings.getSelectedColor());
        g2D.setStroke(settings.getSelectedStroke());
        g2D.drawLine(iX(startPoint.getX()), iY(startPoint.getY()), iX(aktPoint.getX()), iY(aktPoint.getY()));
        startPoint = aktPoint;
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    // Umwandlung der Float in int Werte
    private int iX (double x) {return (int) Math.round(x-1);}
    private int iY (double y) {return (int) Math.round(y-1);}

    //setzt Leinwand zurück
    public void reset(){
        this.img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        this.g2D = img.createGraphics();
        repaint();
    }

    public void paintComponent (Graphics g){
      g.drawImage(img,0,0,null);
    }

}
