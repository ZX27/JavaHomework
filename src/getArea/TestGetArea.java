package getArea;

public class TestGetArea
{
    public static void main(String[] args)
    {
        Triangle aTriangle = new Triangle(3, 4, 5);
        aTriangle.getTriangle();
        System.out.println("三角形的面积为：" + aTriangle.getArea());

        Rectangle aRecrangle = new Rectangle(4, 5);
        aRecrangle.getRectangle();
        System.out.println("矩形面积为：" + aRecrangle.getArea());
    }
}
