public class RedGreenPenSwitch {

    // Function to count the number of switches from green pen (odd) to red pen (even)
    public static int countGreenToRedSwitches(int[] numbers) {
        int switchCount = 0;
        boolean isGreen = numbers[0] % 2 != 0; // Check if the first number is odd (true for green)

        // Iterate through the array, starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            boolean currentIsGreen = numbers[i] % 2 != 0; // Check if the current number is odd (green)

            // If there’s a switch from green (odd) to red (even)
            if (isGreen && !currentIsGreen) {
                switchCount++;
            }

            // Update the pen state
            isGreen = currentIsGreen;
        }

        return switchCount;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 8, 11, 14, 17};
        int result = countGreenToRedSwitches(numbers);
        System.out.println("Number of green-to-red switches: " + result);
    }
}
