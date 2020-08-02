public class MyClass {

    public static void main(String[] args) {

        System.out.println(oneAndFour(new int[] {1, 1, 3, 4, 5, 7, 9}));
        afterFour(new int[] {1, 1, 3, 4, 5, 7, 9});

    }

    public static int[] afterFour(int[] arr) throws RuntimeException{
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    int j = i + 1;
                    int[] newArr = new int[arr.length - j];
                    System.arraycopy(arr, j, newArr, 0, newArr.length);
                    for (int k = 0; k < newArr.length; k++) {
                        System.out.print(newArr[k] + " ");
                    }
                    return newArr;
                }
        }
        throw new RuntimeException("Массив не содержит цифру 4");
    }

    public static boolean oneAndFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one = true;
            }
            if (arr[i] == 4) {
                four = true;
            }
        }
        return one && four;
    }

}
