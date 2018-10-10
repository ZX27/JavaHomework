package pptHomework.PointTest;

public class Point
{
     int x;
     int y;

    public Point(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public void setX(int a)
    {
        this.x = a;
    }

    public void setY(int b)
    {
        this.y = b;
    }

    public void setPoint(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

    public void getPoint()
    {
        System.out.println("(" + this.x + ", " + this.y);
    }

    public void movePoint(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

}
