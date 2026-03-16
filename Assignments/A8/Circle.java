public class Circle implements Comparable {
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public int compareTo(Object object) {
        int res = 0;

        if (object instanceof Circle) {
            Circle circle = (Circle) object;

            if (this.radius < circle.getRadius()) {
                res = -1;
            } else if (this.radius > circle.getRadius()) {
                res = 1;
            }
        }

        return res;
    }
}
