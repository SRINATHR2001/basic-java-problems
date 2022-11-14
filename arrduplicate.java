import java.util.*; 
class arrduplicate{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int arr_size = sc.nextInt();
int []arr=new int[arr_size];
       for(int i=0;i<arr_size;i++){
arr[i]=sc.nextInt();
}
         int i;
        System.out.println("The repeating elements are :");
         
        for (i = 0; i <arr_size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j]>= 0)
                arr[j] = -arr[j];
            else
               System.out.print(j +" ");
    }
}
}
