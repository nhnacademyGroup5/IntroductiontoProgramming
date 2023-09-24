package jinwoo.assignment.maxGCD;

public class MaxGCD {
    private MaxGCD() {}
    public static int[][] combination(int[] numbers){
        try {
            int arrLength = numbers.length;
            int row = arrLength * (arrLength - 1) / 2;
            // Error
            if(row > Integer.MAX_VALUE) throw new OutOfMemoryError("Composition : Cannot calculate.");
            int[][] result = new int[row][0];
            int count = 0;
            // Pre-Condition (Post-Condition = true)
            if(numbers.length < 2) throw new IllegalArgumentException("Compostion : Not enough index");
            for (int i = 0; i < arrLength; i++) {
                for (int j = i+1; j < arrLength; j++) {
                    int[] arr = {numbers[i], numbers[j]};
                    result[count] = arr;
                    count++;
                }
            }
            return result;
        } catch (IllegalArgumentException | OutOfMemoryError e) {
            e.getMessage();
            return null;
        }
    }
}
