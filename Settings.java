import java.awt.*;

public class Settings {
    float strokeSize;
    private Color color;

    public Settings(float strokeSize, Color color) {
        this.strokeSize = strokeSize;
        this.color = color;
    }

    public void setStrokeSize(float strokeSize) {
        this.strokeSize = strokeSize;
    }

    public Color getSelectedColor() {
        return this.color;
    }

    public Stroke getSelectedStroke() {
        return new BasicStroke(strokeSize);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
