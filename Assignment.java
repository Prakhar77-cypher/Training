import java.util.Scanner;
 public class Test{
    
    public static void main(String[] args)
    {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of element");
        n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("In asscening order");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
     
    }
}

        