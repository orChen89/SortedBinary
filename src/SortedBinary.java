import java.util.Arrays;

public class SortedBinary {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};

        printSortedArr(sortedArr(arr));
    }

static void printSortedArr(int [] arr){

           System.out.println(Arrays.toString(sortedArr(arr)));
    }

    static int [] sortedArr(int [] arr){

        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                arr[j++] = 0;
            }
        }
        for (int i = j; i < arr.length ; i++) {
            arr[j++] = 1;
        }
        return arr;
    }
}
