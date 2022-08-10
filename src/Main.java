import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so phan tu");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao cac phan tu");
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,4));

    }
    public static int binarySearch(int[]array, int value){
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            int mid = (left + right)/2;
            if(array[mid]== value){
                return mid;
            }else if( value>array[mid]){
                left = mid+1;
            }else{
                right = mid - 1;
            }

        }
        return -1;
    }
}
