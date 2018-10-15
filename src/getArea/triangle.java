package getArea;

public class triangle
{
    private int side1;
    private int side2;
    private int side3;


    public triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void getTriangle()
    {
        System.out.println("side1 = " + this.side1 + " , side2 = " + this.side2 + " , side3 = " + this.side3);
    }

    public double getArea()
    {
        int p = (this.side1 + this.side2 + this.side3) / 2;
        double c = Math.sqrt((double) (p) * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return c;
    }
}
