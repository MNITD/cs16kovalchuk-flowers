package enums;

/**
 * Created by Dell on 25.10.2016.
 */
public enum CactusShape {

        SQUARE_ROUND,
        TRIANGLE,
        TRAPEZOID,
        OCTAGON;

        @Override
        public String toString() {
                switch (this) {
                        case SQUARE_ROUND:
                                return "Square round";
                        case TRIANGLE:
                                return "Triangle";
                        case TRAPEZOID:
                                return "Trapezoid";
                        case OCTAGON:
                                return "Octagon";
                        default:
                                return null;
                }
        }

}
