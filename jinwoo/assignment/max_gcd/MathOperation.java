package jinwoo.assignment.max_gcd;

abstract class MathOperation{
    protected MathOperation() {}

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
            int[][] result = new int[][]{};
            System.out.println(e.getMessage());
            return result;
        }
    }

    protected static <T> T reduce(BinaryOperation<T> binaryOperation, T[] arr){
        try {
            if(arr.length < 2) throw new IllegalArgumentException("MathOperation.reduce : Required at least two values.");
            T result = arr[0];
            for (int i = 0; i < arr.length; i++) {
                result = binaryOperation.calculate(result, arr[i]);
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
