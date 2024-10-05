import java.util.Arrays;

public class squaredarray {

    public static int[] sortedSquaredArray(int[] array) {

        int n = array.length;

        int[] squaredArray = new int[n];

        for (int i = 0; i < n; i++) {

            squaredArray[i] = array[i] * array[i];

        }

        Arrays.sort(squaredArray);

        return squaredArray;

    }

 

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6, 8, 9};

        int[] output = sortedSquaredArray(array);

        System.out.println(Arrays.toString(output));  

    }

}

