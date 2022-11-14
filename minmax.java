import java.util.*;
public class minmax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int max=a[0],min=a[0];
for(int i=0;i<n;i++){
if(max<a[i]){
max=a[i];
}
}
for(int i=0;i<n;i++){
if(min>a[i]){
min=a[i];
}
}
System.out.println("max "+max);
System.out.println("min "+min);
}
} 