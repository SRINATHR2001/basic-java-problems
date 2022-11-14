import java.util.*;
public class findind{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int flag=0;
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int x=sc.nextInt();
for(int i=0;i<n;i++){
if(a[i]==x){
System.out.print("the element is in the index "+i);
flag++;
break;
}
}
if(flag==0){
System.out.print("element is not found!");
}
}
}