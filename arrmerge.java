import java.util.*;
public class arrmerge {
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int m=sc.nextInt();
int []b=new int[m];
for(int i=0;i<m;i++){
b[i]=sc.nextInt();
}
        int o=n+m;
        int[] c = new int[o];
        System.arraycopy(a, 0, c, 0, n);
        System.arraycopy(b, 0, c, n, m);
for(int i=0;i<o;i++){
System.out.print(c[i]+" ");
}
        
    }
}