
/**
 * that looks through each element of the chosen row and returns the smallest integer from that row.
 *
 * Ahmed
 * may 11
 */
public class Arraypractice1
 {
  public static void main(String[] args) {
     int[] testArr = {12,32,45,435,-1,345,0,564,-10,234,25};
    findMin(testArr);
  }
  public static int findMin(int[] arr) {

    int result = findMinAux(arr,arr.length-1,arr.length-1);
    System.out.println(result);
    return result;
  }
  public static int findMinAux(int[] arr, int startIndex, int smallest) {

    if(arr[startIndex]<smallest) {

        smallest = arr[startIndex];

    }
    startIndex--;
    if(startIndex>=0) {

        findMinAux(arr,startIndex,smallest);

    }
    return smallest;
  }
}
