import java.util.*;
public class halfsort{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp;
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<(n/2);i++){
for(int j=0;j<(n/2);j++){
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=(n/2);i<n;i++){
for(int j=(n/2);j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}