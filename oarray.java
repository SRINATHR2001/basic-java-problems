import java.util.*;
public class oarray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int flag=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();

}
for(int i=0;i<n;i++){
if(a[i]>=0 && a[i]<=7){
continue;
}
else{
flag++;
System.out.println("the array is not octal");
break;
}
}
if(flag==0){
System.out.println("it is a octal array");
}
}
}