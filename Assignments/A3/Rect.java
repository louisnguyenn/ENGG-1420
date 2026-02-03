public class Rect {
    private int x;   // length
    private int y;   // width

    public Rect(int x, int y)   // initialize class
    {
        this.x = x;
        this.y = y;
    }

    public int getPerimeter()
    {
        int perimeter = 2*this.x + 2*this.y;

        return perimeter;
    }

    public int getArea()
    {
        int area = this.x * this.y;

        return area;
    }

    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void changeSize(int n)
    {
        this.x = n;
        this.y = n;
    }

    public void print()
    {
        System.out.format("Coordinates: (x, y): (%d, %d)\n", x, y);
        System.out.println("Length: " + x);
        System.out.println("Width: " + y);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}