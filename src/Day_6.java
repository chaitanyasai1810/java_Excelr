public class Day_6
{
    // for(int i=0;i<4;i++)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print("a");
        //     }
        //     System.out.println();
        // }
    public static int[] twoSum(int arr[],int Target)
    {
        int result[]=new int[2];
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            {
                if(arr[i]+arr[j]==Target)
                {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) 
    {
        int arr[]={2,7,11,15};
        int Target=9;  
        int result[]=twoSum(arr, Target);
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}
    
