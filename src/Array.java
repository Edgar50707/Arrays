public class Array {
    public static void main(String[] args) {
        int[] array = {360, 11, 105, 36, 89};
        int max = array[0];
        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        System.out.println(maxIndex + "   " + minIndex);
        System.out.println(max + " " + min);

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myArray.length / 2; i++) {
            int x = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = x;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");

        }

    }
}
