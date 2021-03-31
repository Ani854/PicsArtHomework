public class Homework {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 5, d = 234, e = 4;
        System.out.println("a + b : " + (a + b));
        System.out.println("b - c : " + (b - c));
        System.out.println("a * b : " + (a * b));
        System.out.println("b / c : " + (b / c));
        System.out.println("a++ - --d : " + (a++ - --d));
        System.out.println("++b * --c : " + (++b * --c));
        System.out.println("a % 2 : " + (a % 2));
        System.out.println("a == b || c > b : " + (a == b || c > b));
        System.out.println("a != b && c == e : " + (a != b && c == e));
        System.out.println("c <= d : " + (c <= d));
        System.out.println("a & b : " + (a & b));
        System.out.println("c | a : " + (c | a));
        System.out.println("c ^ b : " + (c ^ b));
        System.out.println("c >>> e : " + (c >>> e));
        System.out.println("d << 1 : "+(d << 1));
        System.out.println("a = a + b : "+(a += b));
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 4;
        arr1[2] = 7;
        System.out.println(arr1[2]);
        int[] arr2 = {1, 3, 7775, 43, 788, 31, 57, 8, 1, 2, 3, 7, 4, 2, 8, 0};
        System.out.println(arr2.length);

        if (a % 2 == 0) {
            System.out.println("The number is even ");
        } else
            System.out.println("The number is odd");
        System.out.println(a > 0 ? "Positive" : "Negative");
    }

}
