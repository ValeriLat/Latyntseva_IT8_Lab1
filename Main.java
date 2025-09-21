import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            while (true) {
                System.out.println("Задание 2.1: ");
                System.out.println("Введите число не менее 2 знаков, чтобы узнать сумму 2х последних членов: ");
                x = scanner.nextInt();
                if (x < 10) {
                    System.out.println("Ошибка! Число должно содержать не менее 2 знаков. Попробуйте снова.");
                } else {
                    break;
                }
            }

            Lab1 q = new Lab1();

            System.out.println("сумма двух последних знаков числа = " + q.sumLastNums(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.println("Задание 4.1: ");
            System.out.println("Введите число, чтобы узнать, положительное оно или нет: ");
            System.out.println("Положительное - true Отрицательное - false ");
            x = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Число положительное? = " + q.isPositive(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            char x;
            System.out.println("Задание 6.1");
            System.out.println("Введите символ a-z или A-Z, чтобы узнать, является ли он большой буквой: ");
            System.out.println("Большая буква - true, не большая буква - false");
            x = scanner.next().charAt(0);
            Lab1 q = new Lab1();

            System.out.println("Символ является большой буквой? = " + q.isUpperCase(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            int a;
            int b;
            System.out.println("Задание 8.1");
            System.out.println("Введите 2 числа и узнайте делит ли одно из чисел другое нацело");
            System.out.println("true - делит false - нет");
            System.out.println("Введите первое число: ");
            a = scanner.nextInt();
            System.out.println("Введите второе число: ");
            b = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Одно число делит другое нацело? = " + q.isDivisor(a, b));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 10.1");
            System.out.println("Введите 5 чисел для последовательного сложения разрядов единиц:");
            Lab1 q = new Lab1();

            int result = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Введите число " + (i + 1) + ": ");
                int num = scanner.nextInt();
                result = q.lastNumSum(result, num);
                System.out.println("Промежуточный результат: " + result);
            }

            System.out.println("Итого: " + result);
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 2.2");
            System.out.println("Введите первое число для безопасного деления без ошибки деления на 0 (x): ");
            int x = scanner.nextInt();
            System.out.println("Введите второе число (y): ");
            int y = scanner.nextInt();

            Lab1 q = new Lab1();

            System.out.println("Результат деления: " + q.safeDiv(x, y));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 4.2");
            System.out.println("Введите первое число для сравнения (x): ");
            int x = scanner.nextInt();
            System.out.println("Введите второе число для сравнения (y): ");
            int y = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Результат сравнения: " + q.makeDecision(x, y));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 6.2");
            System.out.println("Можно ли получть число из суммы 2х других");
            System.out.println(" Да - true нет - false");
            System.out.println("Введите первое число (x): ");
            int x = scanner.nextInt();
            System.out.println("Введите второе число (y): ");
            int y = scanner.nextInt();
            System.out.println("Введите третье число (z): ");
            int z = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Результат: " + q.sum3(x, y, z));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 8.2");
            System.out.println("Введите возвраст (число), чтобы узнать что стоит после него: лет года год: ");
            int x = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Результат: " + q.age(x));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 10.2");
            System.out.println("Введите день недели, чтоб получить его и все последующие: ");
            String day = scanner.nextLine();
            Lab1 q = new Lab1();

            q.printDays(day);
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 2.3");
            System.out.println("Введите число (x), чтобы узнать все числа от х до 0: ");
            int x = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Результат: " + q.reverseListNums(x));
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 q = new Lab1();

            System.out.println("Задание 4.3");
            System.out.println("Введите основание - число которое нужно возвести в степень (x): ");
            int x = scanner.nextInt();
            System.out.println("Введите степень (y): ");
            int y = scanner.nextInt();

            System.out.println("Результат: " + q.pow(x, y));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 6.3 ");
            System.out.println("Введите число, чтобы узнать, все ли знаки числа одинаковы: ");
            System.out.println(" true - да false - нет ");
            int x = scanner.nextInt();
            Lab1 q = new Lab1();

            System.out.println("Результат: " + q.equalNum(x));
        }
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Задание 8.3");
            System.out.println("Введите высоту треугольника для его отображения: ");
            int x = scanner.nextInt();
            Lab1 q = new Lab1();

            q.leftTriangle(x);
        }
        {
            System.out.println("Задание 10.3 (угадайка)");
            Lab1 q = new Lab1();
            q.guessGame();
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 q = new Lab1();

            System.out.print("Задание 2.4 (Поиск последнего вхождения элемента х в массив) ");
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Введите число для поиска (x): ");
            int x = scanner.nextInt();

            int result = q.findLast(arr, x);

            System.out.println("Индекс последнего вхождения: " + result);
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 q = new Lab1();

            System.out.print("Задание 4.4 (Добавление элемента в массив) ");
            System.out.print("Введите размер исходного массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Введите число для добавления (x): ");
            int x = scanner.nextInt();

            System.out.print("Введите позицию для добавления (pos): ");
            int pos = scanner.nextInt();

            int[] result = q.add(arr, x, pos);

            System.out.print("Результат: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 q = new Lab1();

            System.out.print("Задание 6.4 (реверс массива) ");
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            System.out.print("Исходный массив: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            q.reverse(arr);

            System.out.print("Перевернутый массив: [");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        {
            Scanner scanner = new Scanner(System.in);
            Lab1 q = new Lab1();

            System.out.print("Задание 8.4 (Объединение массивов) ");
            System.out.print("Введите размер первого массива: ");
            int size1 = scanner.nextInt();
            int[] arr1 = new int[size1];

            System.out.println("Введите элементы первого массива:");
            for (int i = 0; i < size1; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr1[i] = scanner.nextInt();
            }

            System.out.print("Введите размер второго массива: ");
            int size2 = scanner.nextInt();
            int[] arr2 = new int[size2];

            System.out.println("Введите элементы второго массива:");
            for (int i = 0; i < size2; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr2[i] = scanner.nextInt();
            }

            int[] result = q.concat(arr1, arr2);

            System.out.print("Объединенный массив: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        Scanner scanner = new Scanner(System.in);
        Lab1 q = new Lab1();

        System.out.print("Задание 10.4 (Удаление отрицательных чисел из массива) ");
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Исходный массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] result = q.deleteNegative(arr);

        System.out.print("Массив без отрицательных элементов: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}