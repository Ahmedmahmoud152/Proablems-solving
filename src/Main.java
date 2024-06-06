import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);

        int []arr=new int[in.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);


        int numOfDays=in.nextInt();
        for (int i = 0; i < numOfDays; i++) {
            binarySearchDrink( arr,  in.nextInt());
        }



    }
    public static void binarySearchDrink(int arr[], int num){
        int low=0,high=arr.length-1,mid;
        int location=1;
         if (num>=arr[high]){location=arr.length;}
             if (num<arr[low]){location=0;}
        while (low<=high && location==1){
            mid=Math.round((low+high)/2);
            if (mid==0){
                location=1;break;
            }
            if (arr[mid]==num){
                location=mid+1;
                break;
            }
            if (arr[mid]>num&&arr[mid-1]<num) {
                location=mid;
               break;
            }
            else if (arr[mid]>num){
                high=mid-1;
            }
            else {low=mid+1;}

        }
        System.out.println(location);
    }
}