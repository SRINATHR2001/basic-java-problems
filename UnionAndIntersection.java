// A Java program to print union and intersection
/// of two unsorted arrays
import java.util.*;
 
class UnionAndIntersection {
    // Prints union of arr1[0..m-1] and arr2[0..n-1]
    void printUnion(int arr1[], int arr2[], int m, int n)
    {
        // Before finding union, make sure arr1[0..m-1]
        // is smaller
        if (m> n) {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;
 
            int temp = m;
            m = n;
            n = temp;
        }
 
        // Now arr1[] is smaller
        // Sort the first array and print its elements
        // (these two steps can be swapped as order in
        // output is not important)
        Arrays.sort(arr1);
        for (int i = 0; i <m; i++)
            System.out.print(arr1[i] +" ");
 
        // Search every element of bigger array in smaller
        // array and print the element if not found
        for (int i = 0; i <n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
                System.out.print(arr2[i] +" ");
        }
    }
 
    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    void printIntersection(int arr1[], int arr2[], int m,
                           int n)
    {
        // Before finding intersection, make sure
        // arr1[0..m-1] is smaller
int inter=0;
        if (m> n) {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;
 
            int temp = m;
            m = n;
            n = temp;
        }
 
        // Now arr1[] is smaller
        // Sort smaller array arr1[0..m-1]
        Arrays.sort(arr1);
 
        // Search every element of bigger array in smaller
        // array and print the element if found
        for (int i = 0; i <n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1){
                System.out.print(arr2[i] +" ");
		inter++;
}
        }
    
if(inter==0){
System.out.println("no same elements");
}
}
 
    // A recursive binary search function. It returns
    // location of x in given array arr[l..r] is present,
    // otherwise -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid]> x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present in
        // array
        return -1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        UnionAndIntersection u_i
            = new UnionAndIntersection();
   Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
int m=sc.nextInt();
int []b=new int[m];
for(int i=0;i<m;i++){
b[i]=sc.nextInt();
}
        System.out.println("Union of two arrays is");
        u_i.printUnion(a, b, n, m);
        System.out.println("");
        System.out.println(
           "Intersection of two arrays is");
        u_i.printIntersection(a, b, n, m);
    }
}