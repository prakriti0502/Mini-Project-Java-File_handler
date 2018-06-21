package userDefinedDataStructure;

public class DynamicArray {
	private int data[];
	private int nextIndex;
	public DynamicArray()
	{
		data = new int[5];
		
	}
	public void add(int element)
	{
		if(nextIndex==data.length) {
			restructure();
		}
		data[nextIndex]=element;
		nextIndex++;
	}
	public void restructure()
	{
		int temp[] = data;
		int d = (int) (data.length*1.5);
		data = new int[d];
		for(int i=0;i<temp.length;i++)
		{
			data[i] = temp[i];
		}
	}
	public void set(int index,int element)
	{
		if(index > nextIndex) {
			System.out.println("Enter a valid Index");
		}
		else if(index == nextIndex)
		{
			add(element);
		}
		else
		{
			data[index] = element;
		}
	}
	public boolean isEmpty() {
		if(size()==0)
			return true;
		else
			return false;
	}
	public int size() {
		return nextIndex;
	}
	public int removeLast()
	{
		if(nextIndex < 1) {
			return -1;
		}
		int val = data[nextIndex - 1];
		nextIndex--;
		return val;
	}
}
