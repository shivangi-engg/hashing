//making a hash table using quadratic probing as collision resolution tech.
import java.util.*;
import java.lang.*;
public class QuadraticProbing
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("total no. of keys:");
		int n = sc.nextInt();
		//taking the keys as input in form of an array
		int [] input = new int[n];
		System.out.println("enter the key values:");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			input[i] = ele;
		}
		System.out.println("enter modulo:");
		int m = sc.nextInt();
		//hash table
		//making array to store hash values, initializing all elements as -1
		int []hash = new int[n];
		for(int i=0;i<n;i++)
		{
			hash[i] = -1;
		}
		int size=0;
		for(int i=0;i<n;i++)
		{
			int v=1;
			if(size==n)
			{
				continue;
			}
			int key = input[i];
			int j = key%m;
			int k = j;
			while(hash[j]!=-1 && hash[j]!=key)
			{	
				j=(k+(v*v))%n;
				v++;
			}
			if(hash[j]==key)
			{
				continue;
			}
			else
			{
				hash[j]=key;
				size++;
			}
		}

		//printing hash table
		System.out.println("hash table:");
		for(int i=0; i<n;i++)
		{
			System.out.println(i+"--->"+hash[i]);
		}
	}
}