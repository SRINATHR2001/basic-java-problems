import java.util.*;

public class digitoccurence{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int count=0;
int x=sc.nextInt();
for(int i=0;i<n;i++){
if(a[i]==x){
count++;
}
}
if(count!=0){
System.out.println("the number has a ocurence of "+count);
}
else{
System.out.println("the number is not found");
}
}
}