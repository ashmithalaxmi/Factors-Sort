import java.util.Scanner;

public class FactorsSort {
    public void sortByFactors(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int count1 = countFactors(arr[i]);
                int count2 = countFactors(arr[j]);

                if (count1 > count2 || (count1 == count2 && arr[i] < arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();
        FactorsSort obj = new FactorsSort();
        obj.sortByFactors(arr);
        for (int x: arr) {
            System.out.println(x);
        }
    }
}
