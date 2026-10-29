   
class ArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {

        // Sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Find the difference
        int difference = arr[1] - arr[0];

        // Check the differences
        for (int m = 0; m < arr.length - 1; m++) {
            if (arr[m + 1] - arr[m] != difference) {
                return false;
            }
        }

        return true;
    }
}

