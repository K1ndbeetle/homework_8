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

        //task №2
        System.out.println("Задача №2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("Минимальная сумма затрат за день " + min + " рублей");
        System.out.println("Максимальная сумма затрат за день " + max + " рублей");
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        double averageCosts = amount / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей");
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