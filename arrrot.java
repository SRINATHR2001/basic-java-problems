import java.util.*;
class arrrot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int d=sc.nextInt();
int temp[]=new int[n];
int k=0;
for(int i=d;i<n;i++){
temp[k]=a[i];
k++;
}
for(int i=0;i<d;i++){
temp[k]=a[i];
k++;
}
for(int i=0;i<n;i++){
a[i]=temp[i];
}
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}
