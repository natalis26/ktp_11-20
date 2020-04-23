public class task2 {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        int[] array = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(array));
        int[] array1 = {1, 3};
        System.out.println(isAvgWhole(array1));
        int[] array2 = {1, 2, 3};
        int[] res = new int[array2.length];
        res = cumulativeSum(array2);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        System.out.println();
        System.out.println(getDecimalPlaces("3.14"));
        System.out.println(Fibonacci(3));
        System.out.println(isValid("59001"));
        System.out.println(isStrangePair("",""));
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(boxSeq(5));
    }
    public static String repeat(String A, int B) {
        String sum = "";
        for (int i = 0; i < A.length(); i++)
            for (int j = 0; j < B; j++)
                sum += A.charAt(i);
        return sum;
    }
    public static int differenceMaxMin(int[] array) {
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
            else if (max < array[i])
                max = array[i];
        }
        return (max - min);
    }
    public static boolean isAvgWhole(int[] array) {
        double ave = 0;
        for (int i = 0; i < array.length; i++)
            ave += array[i];
        if (ave/array.length % 1 == 0)
            return true;
        else
            return false;
    }
    public static int[] cumulativeSum(int[] array) {
        int s = 0;
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            s += array[i];
            res[i] = s;
        }
        return (res);
    }
    public static int getDecimalPlaces(String A) {
        boolean point = false;
        int count = 0;
            for (int i = 0; i < A.length(); i++) {
                if (point == false) {
                    if (A.charAt(i) == '.')
                        point = true;
                }
                else
                    count++;
            }
            return count;
    }
    public static int Fibonacci(int N) {
        int s = 0;
        for (int i = 1; i < N; i++)
            s = s + i;
        return(s);
    }
    public static boolean isValid(String A) {
        if (A.length() == 5) {
            for (int i = 0; i < 5; i++) {
                if (A.charAt(i) < '0' || A.charAt(i) > '9')
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    public static boolean isStrangePair(String A, String B) {
        if (A == "" || B == "")
            return true;
        else if ((A.charAt(0) == B.charAt(B.length() - 1)) && (A.charAt(A.length() - 1) == B.charAt(0)))
            return true;
        else
            return false;
    }
    public static boolean isPrefix(String A, String B) {
        for (int i = 0; i < B.length() - 1; i++) {
            if (A.charAt(i) != B.charAt(i))
                return false;
        }
        return true;
    }
    public static boolean isSuffix(String A, String B) {
        for (int i = B.length() - 1; i > 0; i--) {
            if (A.charAt(A.length() - B.length() + i) != B.charAt(i))
                return false;
        }
        return true;
    }
    public static int boxSeq(int A) {
        int s = 0;
        if (A == 0)
            return 0;
        for (int i = 1; i <= A; i++) {
            switch (i % 2) {
                case 1:
                    s += 3;
                    break;
                case 0:
                    s -= 1;
                    break;
            }
        }
        return s;
    }
}