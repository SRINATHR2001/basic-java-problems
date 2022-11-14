import java.util.*;
public class missing{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int flag=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=1;i<n;i++){
if(a[i]!=a[i-1]+1){
System.out.println("the missing number is "+(a[i-1]+1));
flag=1;
break;
}
else{
continue;
}
}
if(flag==0){
System.out.println("no missing element");
}
}
}
