import java.util.*;
class Combination
{
    public static void main(String[] srgs)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers");
        int [] arr=new int[3];
        for(int i=0;i<3;i++)
        { 
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[j]=arr[i];
                    arr[i]=arr[j];
                }
            }
        }
        System.out.println("All possible combinations are: ");
        if(arr[0]!=arr[1] &&arr[1]!=arr[2] && arr[0]!=arr[2])
        {
            for(int p=0;p<arr.length;p++)
            {
                for(int q=0;q<arr.length;q++)
                {
                    for(int r=0;r<arr.length;r++)
                    {
                        if(p!=q &&q!=r && p!=r)
                        {
                            System.out.println(arr[p]*100+arr[q]*10+arr[r]);
                        }
                    }
                }
            }
         }
        else if(arr[0]==arr[1]&&arr[1]==arr[2])
        {
            System.out.println("all numbers are same so the only possible combination is\n"+(arr[0]*100+arr[1]*10+arr[2]));
        }
        else if(arr[0]==arr[1] || arr[1]==arr[2]|| arr[0]==arr[2])
        {
            for(int p=0;p<arr.length;p++)
            {
                for(int q=0;q<arr.length;q++)
                {
                    for(int r=0;r<arr.length;r++)
                    {
                        if(p!=q &&q!=r )
                        {
                            System.out.println(arr[p]*100+arr[q]*10+arr[r]);
                        }
                    }
                }
            }
        }
    }
}