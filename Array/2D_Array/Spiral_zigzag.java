public class Main
{
	public static void main(String[] args) {
			int r = 3, c = 5;

		int mat[][] = { {1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15}};

		printSpiral1(r , c , mat);
	}
		static void printSpiral1(int row, int col, int a[][])
	{
		int ev1 = 0; 
		int od1 = 1;
		while (ev1 < row){
			for (int i = 0; i < col; i++)	{
			
				System.out.print(a[ev1][i] + " ");
			}
			ev1 = ev1 + 2;
			
			if(od1 < row)
			{
			for (int i = col - 1; i >= 0; i--)
			{
			
				System.out.print(a[od1][i] + " ");
			}}
			od1 = od1 + 2;
		}}}
