package enums;

/**
 * Created by Dell on 25.10.2016.
 */
public enum FlowerColor {

    RED,
    BLUE,
    YELLOW,
    WHITE;

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
            case YELLOW:
                return "Yellow";
            case WHITE:
                return "White";
            default:
                return null;
        }
    }

}
