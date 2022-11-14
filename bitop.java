import java.util.*;
class bitop{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int b[]=new int[n];
for(int i=0;i<n;i++){
b[i]=sc.nextInt();
}
int []c=new int[n];
for(int i=0;i<n;i++){
c[i]=a[i]&b[i];
}
System.out.println("bitwise and result");
for(int i=0;i<n;i++){
System.out.print(c[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++){
c[i]=a[i]|b[i];
}
System.out.println("bitwise or result");
for(int i=0;i<n;i++){
System.out.print(c[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++){
c[i]=a[i]^b[i];
}
System.out.println("bitwise exor result");
for(int i=0;i<n;i++){
System.out.print(c[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++){
c[i]=a[i]<<b[i];
}
System.out.println("leftshift result");
for(int i=0;i<n;i++){
System.out.print(c[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++){
c[i]=a[i]>>b[i];
}
System.out.println("rightshift result");
for(int i=0;i<n;i++){
System.out.print(c[i]+" ");
}
}
}



