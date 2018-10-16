package pptHomework.PointTest;

public class PointTest
{
    public static void main(String[] args)
    {
        Point p= new Point(1, 2);

        System.out.println("该点的初始位置：" + "(" + p.getX() + ", " + p.getY() + ")");

        p.movePoint(10, 20);

        System.out.println("该点移动后的位置：" + "(" + p.getX() + ", " + p.getY() + ")");

    }
}
