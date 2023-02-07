public class Array2
{
    public static void main(String[]args)
    {
        int arr[][]={
            {2,3,4},
            {7,8,9,10},
            {5,6,4,3,1}
        };
        for(int i=0; i<3; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}