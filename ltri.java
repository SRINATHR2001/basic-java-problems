import java.util.Scanner;
class ltri{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int [n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int e=0;
int k=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<=k;j++)
{
System.out.print(a[e]+" ");
e++;
i++;
if(i>=n)
break;
}
i--;
k++;
System.out.println();
}
}
}