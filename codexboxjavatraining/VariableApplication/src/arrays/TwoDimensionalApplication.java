package arrays;

public class TwoDimensionalApplication {
    public static void main(String[] args)
    {
        int a [][] = new int[][]{{1,2,3},{3,4,6},{4,5,9}};
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.println("two dimensional array elements are:"+a[i][j]);
            }
        }




    }
}
