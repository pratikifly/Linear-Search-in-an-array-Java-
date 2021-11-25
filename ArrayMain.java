public class ArrayMain {
    private int[] arr;

    public ArrayMain(int size)
    {
        arr=new int[size];
    }
    public void setElem(int index, int elems)
    {
        arr[index]=elems;
    }
    public int getElem(int index)
    {
        return arr[index];
    }
    
}
