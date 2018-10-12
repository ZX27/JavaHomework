package TestArray;

public class TestArray
{
    public static void main(String[] args)
    {
        int[] sim = {2, 4, 5, 9, 234, 6, 23};
        ArraySort array = new ArraySort(sim);
        array.setOrder();
        array.getArray();
//        //Arrays.toString(sim);
//        Arrays.sort(sim);
//        for (int e:sim)
//        {
//            System.out.println(e);
//        }
//
//        //int[] copy = Arrays.copyOf(Arrays.sort(sim), sim.length);
//
    }
}
