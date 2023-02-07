class Array
{
    public static void main(String[]args){
        int a[]={1,2,3,4};
        int nums[]=new int[5];
        a[3]=9;
        for(int i=0; i<4; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        nums[0]=2;
        nums[1]=5;
        nums[2]=6;
        nums[3]=9;
        nums[4]=11;
        for (int i : nums) {
            System.out.print(i+" ");            
        }
        System.out.println();
        int array[];
        array= new int[3];
        System.out.println(array[1]);
    }
}