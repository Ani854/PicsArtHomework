public class Homework {
    public static void main(String[] args) {
        System.out.println("Task 1 : Create an array and fill it 2 number ");
        int[] arr1 = {2, 2, 2, 2,};


        System.out.println("Task 2 : Create an array and fill it with numbers from 1:1000");
        int[] arr2 = new int[1000];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }


        System.out.println("Task 3 :Create an array and fill it with odd numbers from -20:20");
        System.out.println("Solution 1");
        int a = -20, b = 20, count1 = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                count1++;
            }
        }
        int[] arr3 = new int[count1];
        int j = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                arr3[j] = i;
                j++;
            }
        }


        System.out.println("Solution 2");
        int[] arr = new int[20];
        for (int i = -19, k = 0; i < 20; i += 2, k++) {
            arr[k] = i;
        }


        System.out.println("Task 4 : Create an array and fill it .Print all elements which can be divided by 5");
        int[] arr4 = {2, 3, 5, 34, 25, 10, 64, 55};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5 == 0) {
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Task 5 : Create an array and fill it.Print all elements which are between 24.12 and 467.23");
        double[] arr5 = {12.5, 1, 25, 278.6, 123, 456.7, 777.1, 564, 789, 4};
        double minInt = 24.12, maxInt = 467.23;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > minInt && arr5[i] < maxInt) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Task 6 : Create an array and fill it.print count of elements which can be divided by 2");

        int[] arr6 = {1, 2, 5, 4, 8, 12, 34, 25, 77, 64, 72, 100};
        int count = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Task 7 : Given an integer , 0 < N < 21 ,print its first 10 multiples. ");

        int N = 5;
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %d = %d", N, i, N * i);
            System.out.println();
        }
    }
}
