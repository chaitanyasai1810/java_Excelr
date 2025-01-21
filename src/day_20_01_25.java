import java.util.Scanner;

public class day_20_01_25 
{
    public static void main(String[] args)
    {
        
    }    
}
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] emp=new int[m + n];
//         int p1=0;
//         int p2=0;
//         int i=0;
//         while(p1<m && p2<n)
//         {
//             if(nums1[p1]<=nums2[p2])
//             {
//                 emp[i++]=nums1[p1++];
//             }
//             else
//             {
//                 emp[i++]=nums2[p2++];
//             }
//         }
//         while(p1<m)
//         {
//             emp[i++]=nums1[p1++];
//         }
//         while(p2<n)
//         {
//             emp[i++]=nums2[p2++];
//         }
//         for(i=0;i<m+n;i++)
//         {
//             nums1[i]=emp[i];
//         }
//     }
// }
// import java.util.*;
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n)
//     {
//         int[] merged=new int[m+n];
//         for(int i=0;i<m;i++)
//         {
//             merged[i]=nums1[i];
//         }
//         for(int i=0;i<n;i++)
//         {
//             merged[m+i]=nums2[i];
//         }
//         Arrays.sort(merged);
//         for(int i=0;i<merged.length;i++)
//         {
//             nums1[i]=merged[i];
//         }
//     }
// }