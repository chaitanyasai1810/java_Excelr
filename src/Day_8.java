public class Day_8 {
    
}
// public class CountOfDigits {

// 	public static void main(String[] args) {
// 		long arr[]= {9891123123L,9891767123L,9891128888L,9867543123L,9898769123L};
// 		int oddcounter,evencounter,r;
// 		for(int i=0;i<arr.length;i++) 
// 		{	
// 			long n=arr[i];
// 			oddcounter=0;
// 			evencounter=0;
// 			while(n>0)
// 			{		
// 				r=(int)n%10;
// 				if(r%2==0)
// 					evencounter++;
// 				else
// 					oddcounter++;
// 				n=n/10;			
// 			}
// System.out.print(String.format("Mobile Number %d has %d odd digits and %d even digits",(i+1),oddcounter,evencounter));

// 		if(oddcounter>evencounter)
// 			System.out.println(" ODD Biased Number");
// 		else if(oddcounter<evencounter)
// 			System.out.println(" EVEN Biased Number");
// 		else
// 			System.out.println(" Neutral Number");
// 		}						
// 	}
// }
// public class SumOfTwoNumbers {

// 	public static void main(String[] args) {
// 		int arr[]= {10,20,40,100,150};
// 		int sum=170;
// 		int flag=0;
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			for(int j=0;j<arr.length;j++)
// 			{
// 				if(arr[i]+arr[j]==sum && arr[i]<arr[j])
// 				{
// 					System.out.println("["+arr[i]+","+arr[j]+"]");
// 					flag=1;
// 					break;
// 				}
// 			}
// 		}
// 		if(flag==0)
// 		{
// 			System.out.println("NO PAIR FOUND");
// 		}
// 	}
// }