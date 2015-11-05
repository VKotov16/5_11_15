
public class Free {

    public static void main(String[] args) {
        //int i = 10;
        int[] arr;
        arr = new int[]{1, 2, 3};
        //int[] test = new int[20];
        System.out.println(arr.length);

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

        for(int k : arr) //foreach
        {
            System.out.println(k);
        }
    }
}