import java.util.*; 
class nonarrduplicate{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int f[]=new int[n];
     for(int i=0;i<n;i++){
f[i]=0;
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i!=j){
if(a[i]==a[j]){
f[i]++;
}
}
}
}
for(int i=0;i<n;i++){
if(f[i]==0){
System.out.print(a[i]+" ");
}
}   
}
}