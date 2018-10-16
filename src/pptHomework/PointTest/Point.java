package pptHomework.PointTest;

import java.lang.annotation.Retention;

public class Point
{
     private int x;
     private int y;

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

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void movePoint(int a, int b)
    {
        this.x = a;
        this.y = b;
    }

}
