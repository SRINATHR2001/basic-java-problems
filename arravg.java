import java.util.*;
public class arravg{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float sum=0;
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
sum+=a[i];
}
System.out.println(sum/n);
}
}