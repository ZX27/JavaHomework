package testArray;

public class ArraySort
{
    int[] sim;

    public ArraySort(int length)
    {
        for (int i = 0; i < length - 1; i++)
        {
            this.sim[i] = 0;
        }
    }

    public ArraySort(int[] sim)
    {
        this.sim = sim;
    }

    //冒泡排序
    public void setOrder()
    {
        int length = this.sim.length;
        int temp;

        for (int i = 0; i < length-1; i++)
        {
            for (int j = length-1; j > i; j--)
            {
                if (this.sim[j] < this.sim[j - 1])
                {
                    temp = this.sim[j];
                    this.sim[j] = this.sim[j - 1];
                    this.sim[j - 1] = temp;
                }
            }
        }
    }

    public void getArray()
    {
        for (int i : sim)
            System.out.print("\t" + i);
    }
}
