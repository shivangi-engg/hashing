//creating hash table using open chainning
import java.util.*;
import java.lang.*;
public class HashTable
{
	public static void main(String[] args) 
	{
		//getting the key values from user and entering them into an array to continue:
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of keys you want to enter:");
		int kn = sc.nextInt();
		int [] keys = new int[kn];
		System.out.println("enter the key values:");
		for(int i=0; i<kn; i++)
		{
			int key_value = sc.nextInt();
			keys[i] = key_value;
		}
		System.out.println("the keys entered by user are:");
		for(int x: keys)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//entering key values in hash table
		//create arraylist of linked list to create a hash table
		//set length of hash table = no. of keys added 
		ArrayList<LinkedList<Integer>> hashTable = new ArrayList<LinkedList<Integer>>(kn);
		for(int i=0; i<kn; i++)
		{
			hashTable.add(new LinkedList<Integer>());
		}
		//adding elements in the hash table 
		for(int i=0; i<kn;i++)
		{
				int index;
				int key = keys[i];
				index = key%7;
				//********
				hashTable.get(index).add(key);
		}

		System.out.println("Hash Table:");
		for(int i=0; i<kn; i++)
		{
			int size;

			Iterator<Integer> it = hashTable.get(i).iterator();
			while(it.hasNext())
			{
				System.out.print("--->"+it.next());
			}
			System.out.println();
		}
	}
}



							