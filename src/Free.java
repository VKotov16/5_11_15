
public class Free {

    public static void main(String[] args) {
//        int i = 10;
//        int[] arr;
//        arr = new int[]{1, 2, 3};
//        int[] test = new int[20];
//        System.out.println(arr.length);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("*");
                } else if (i % 2 != 0 && j%2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("\n");
        }
    }

}