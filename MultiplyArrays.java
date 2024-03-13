public class MultiplyArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};

        
        int[] result = multiplyArrays(array1, array2);

        System.out.println("Result: " + java.util.Arrays.toString(result));
    }

    public static int[] multiplyArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }

        return result;
    }
}
