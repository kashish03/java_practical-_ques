//Practical Question - 3

class Array {

	private int arr[];
	private int count;

	public Array(int length) 
    { 
        arr = new int[length]; 
    }

	public void printArray()
	{
		for (int i = 0; i < count; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public void insert(int element)
	{
		if (arr.length == count) {

			int newArr[] = new int[2 * count];

			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}

			arr = newArr;
		}

		arr[count++] = element;
	}
}

public class PracQues3 {

	public static void main(String[] args)
	{

		Array numbers = new Array(3);

		numbers.insert(10);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);

		numbers.printArray();
	}
}
