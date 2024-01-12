public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        int missing = 0;
        for (int i = 0; i <= array.length; i++) {
            boolean isMissing = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    isMissing = false;
                    continue;
                }
            }
            if (isMissing) {
                missing = i;
                continue;
            }
        }
        return missing;
    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int max = array[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] >= secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        for (int i = 0; i < array1.length; i++) {
            boolean exists = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    exists = true;
                    continue;
                }
            }
            if (!exists) {
                return false;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            boolean exists = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    exists = true;
                    continue;
                }
            }
            if (!exists) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        if (array.length == 0) {
            return true;
        }
        int difference = array[0];
        boolean isPositive = false, isNegative = false;
        for (int i = 1; i < array.length; i++) {
            difference -= array[i];
            if (difference > 0) {
                isPositive = true;
            }
            if (difference < 0) {
                isNegative = true;
            }
        }
        return !(isPositive && isNegative);
    }

}
