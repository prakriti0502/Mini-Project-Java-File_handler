package userDefinedDataStructure;

public class DynamicArrayMain {
	

		public static void main(String[] args) {
			
			DynamicArray d = new DynamicArray();
			for(int i=0;i<10;i++)
			{
				d.add(i);
			}
			d.set(10, 34);
			d.set(11, 22);
			while(!d.isEmpty())
			{
				System.out.println(d.removeLast());
			}
		}
	}


