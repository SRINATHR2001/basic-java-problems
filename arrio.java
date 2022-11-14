import java.util.Scanner;
public class arrio
{
public static void main(String[] args)
{
int n, pos, x,loc=0,flag=0;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
n = s.nextInt();
int a[] = new int[n+1];
System.out.println("Enter all the elements:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
char ch=s.next().charAt(0);
switch(ch){
case 'i':
System.out.print("Enter the position where you want to insert element:");
pos = s.nextInt();
System.out.print("Enter the element you want to insert:");
x = s.nextInt();
for(int i = (n-1); i >= (pos-1); i--)
{
a[i+1] = a[i];
}
a[pos-1] = x;
System.out.print("After inserting:");
for(int i = 0; i < n+1; i++)
{
System.out.print(a[i]+" ");
}
break;
case 'o':
System.out.print("Enter the element you want to delete:");
x = s.nextInt();
for (int i = 0; i < n; i++)
{
if(a[i] == x)
{
flag =1;
loc = i;
break;
}
else
{
flag = 0;
}
}
if(flag == 1)
{
for(int i = loc+1; i < n; i++)
{
a[i-1] = a[i];
}
System.out.print("After Deleting:");
for (int i = 0; i < n-2; i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-2]);
}
else
{
System.out.println("Element not found");
}
}
}
}