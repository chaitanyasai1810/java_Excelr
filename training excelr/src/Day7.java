public class Day7
{
    public static int[] twoSum(int arr[],int Target)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            {
                if(arr[i]+arr[j]==Target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
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
// class Solution{
//     public boolean containsDuplicate(int[] nums)
//     {
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
    
