public class Array_2d {
    public static void main(String[]args){
        int array[][]=new int[3][2];
        array[0][0]=2;
        array[0][1]=4;
        array[1][0]=6;
        array[1][1]=8;
        array[2][0]=10;
        array[2][1]=12;
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(int a[]:array){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}