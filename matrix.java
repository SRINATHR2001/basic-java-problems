import java.util.Scanner;
class matrix{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];

for(int i=0;i<n;i++)
a[i]=sc.nextInt();

int c=sc.nextInt();
for(int j=0;j<n;j++)
{

for(int i=0;i<c;i++)
{
System.out.print(a[j]+" ");
j++;
if(j>=n)
break;
}
j--;
System.out.println();
}
}
}