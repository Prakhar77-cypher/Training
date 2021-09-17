import java.util.Scanner;
 public class Test{
     
     public static int f(int a[], int t)
    {
 

        int len = a.length;
        int i = 0;
 
        
        while (i < len) {
 
            if (a[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    
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
        System.out.print("Enter the elemnt whose position to find");
        int o=sc.nextInt();
        System.out.println("Index position is: "
                           + f(a, o));
 
        
}
}