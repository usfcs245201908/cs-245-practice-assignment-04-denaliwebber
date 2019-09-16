public class BubbleSort implements SortingAlgorithm
{
	public void swap(int [] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public void sort (int [] a)
	{
		for (int i=0; i< a.length; i++)
		{
			for (int j=0; j< a.length-i-1; j++)
			{
				if (a[j]>a[j+1])
					swap(a, j, j+1);
			}
		}
	}
}