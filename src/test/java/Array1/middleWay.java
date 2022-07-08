package Array1;

public class middleWay {

//    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]

    public static void main(String[] args) {
        middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];
        arr[0] = a[a.length / 2];
        arr[1] = b[b.length / 2];
        return arr;
    }
}
