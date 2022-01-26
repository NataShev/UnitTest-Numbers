public class Main {
    public static int count = 0;

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] numbersOne = evenNumbers(numbers);
        int[] numbersTwo = positivNumbers(numbersOne);
        sortBubble(numbersTwo);
        printNumbers(numbersTwo);
    }

    public static int[] sortBubble(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length - 1; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
        return massiv;
    }

    public static void printNumbers(int[] massiv) {
        for (int x : massiv) {
            System.out.println(x);
        }
    }

    public static int[] evenNumbers(int mas1[]) {
        int mean = 0;
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                mean = mean + mas1[i];
                count++;
            }
        }
        mean = mean / count;
        count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                count++;
            }
        }
        int[] mas2 = new int[count];
        int count2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[count2] = mas1[i];
                count2++;
            }
        }
        return mas2;
    }

    public static int[] positivNumbers(int mas1[]) {
        int mean = 0;
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > 0) {
                mean = mean + mas1[i];
                count++;
            }
        }
        mean = mean / count;
        count = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > 0) {
                count++;
            }
        }
        int[] mas2 = new int[count];
        int count2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] > 0) {
                mas2[count2] = mas1[i];
                count2++;
            }
        }
        return mas2;
    }

}
