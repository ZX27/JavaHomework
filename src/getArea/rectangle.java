package getArea;

public class rectangle
{
    private int length;
    private int width;

    public rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void getRectangle()
    {
        System.out.println("length = " + this.length + " , width = " + this.width);
    }
    public int grtArea()
    {
        return this.length * this.width;
    }

}
