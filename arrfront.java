import java.util.*;
public class arrfront
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[20],n,i,s,k=0,temp=0,b[]=new int[20];
n=sc.nextInt();
for(i=0;i<n;i++)
a[i]=sc.nextInt();
s=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==s)
{
b[k]=a[i];
k++;
}
else
continue;
}
for(i=0;i<k;i++)
System.out.print(b[i]+" ");
for(i=0;i<n;i++)
if(a[i]==s)
continue;
else
System.out.print(a[i]+" ");
}}