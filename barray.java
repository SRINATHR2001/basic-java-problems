import java.util.*;
public class barray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int flag=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();

}
for(int i=0;i<n;i++){
if(a[i]==0||a[i]==1){
continue;
}
else{
flag++;
System.out.println("the array is not binary");
break;
}
}
if(flag==0){
System.out.println("it is a binary array");
}
}
}