package TestArray;

public class TestArray
{
    public static void main(String[] args)
    {
        int[] sim = {2, 4, 5, 9, 234, 6, 23};

        //初始化
        ArraySort array = new ArraySort(sim);

        array.setOrder();
        array.getArray();
    }
}
