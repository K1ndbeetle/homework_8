public class Main {
    public static void main(String[] args) {
        //task №1
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int amount = 0;
        for (int i : arr) {
            amount += i;
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей.");
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}