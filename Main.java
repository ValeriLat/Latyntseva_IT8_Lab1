import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab1 lab = new Lab1();

        int number;
        while (true) {
            System.out.println("Задание 2.1: ");
            System.out.println("Введите число не менее 2 знаков, чтобы узнать сумму 2х последних членов: ");
            number = scanner.nextInt();
            if (number < 10) {
                System.out.println("Ошибка! Число должно содержать не менее 2 знаков. Попробуйте снова.");
            } else {
                break;
            }
        }
        System.out.println("сумма двух последних знаков числа = " + lab.sumLastNums(number));

        System.out.println("Задание 4.1: ");
        System.out.println("Введите число, чтобы узнать, положительное оно или нет: ");
        System.out.println("Положительное - true Отрицательное - false ");
        number = scanner.nextInt();
        System.out.println("Число положительное? = " + lab.isPositive(number));

        System.out.println("Задание 6.1");
        System.out.println("Введите символ a-z или A-Z, чтобы узнать, является ли он большой буквой: ");
        System.out.println("Большая буква - true, не большая буква - false");
        char character = scanner.next().charAt(0);
        System.out.println("Символ является большой буквой? = " + lab.isUpperCase(character));

        System.out.println("Задание 8.1");
        System.out.println("Введите 2 числа и узнайте делит ли одно из чисел другое нацело");
        System.out.println("true - делит false - нет");
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Одно число делит другое нацело? = " + lab.isDivisor(a, b));

        System.out.println("Задание 10.1");
        System.out.println("Введите 5 чисел для последовательного сложения разрядов единиц:");
        int result = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int num = scanner.nextInt();
            result = lab.lastNumSum(result, num);
            System.out.println("Промежуточный результат: " + result);
        }
        System.out.println("Итого: " + result);

        System.out.println("Задание 2.2");
        System.out.println("Введите первое число для безопасного деления без ошибки деления на 0 (x): ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число (y): ");
        int y = scanner.nextInt();
        System.out.println("Результат деления: " + lab.safeDiv(x, y));

        System.out.println("Задание 4.2");
        System.out.println("Введите первое число для сравнения (x): ");
        x = scanner.nextInt();
        System.out.println("Введите второе число для сравнения (y): ");
        y = scanner.nextInt();
        System.out.println("Результат сравнения: " + lab.makeDecision(x, y));

        System.out.println("Задание 6.2");
        System.out.println("Можно ли получить число из суммы 2х других");
        System.out.println(" Да - true нет - false");
        System.out.println("Введите первое число (x): ");
        x = scanner.nextInt();
        System.out.println("Введите второе число (y): ");
        y = scanner.nextInt();
        System.out.println("Введите третье число (z): ");
        int z = scanner.nextInt();
        System.out.println("Результат: " + lab.sum3(x, y, z));

        System.out.println("Задание 8.2");
        System.out.println("Введите возраст (число), чтобы узнать что стоит после него: лет года год: ");
        int age = scanner.nextInt();
        System.out.println("Результат: " + lab.age(age));

        scanner.nextLine(); // Очистка буфера
        System.out.println("Задание 10.2");
        System.out.println("Введите день недели, чтоб получить его и все последующие: ");
        String day = scanner.nextLine();
        lab.printDays(day);

        System.out.println("Задание 2.3");
        System.out.println("Введите число (x), чтобы узнать все числа от х до 0: ");
        number = scanner.nextInt();
        System.out.println("Результат: " + lab.reverseListNums(number));

        System.out.println("Задание 4.3");
        System.out.println("Введите основание - число которое нужно возвести в степень (x): ");
        int base = scanner.nextInt();
        System.out.println("Введите степень (y): ");
        int exponent = scanner.nextInt();
        System.out.println("Результат: " + lab.pow(base, exponent));

        System.out.println("Задание 6.3 ");
        System.out.println("Введите число, чтобы узнать, все ли знаки числа одинаковы: ");
        System.out.println(" true - да false - нет ");
        number = scanner.nextInt();
        System.out.println("Результат: " + lab.equalNum(number));

        System.out.println("Задание 8.3");
        System.out.println("Введите высоту треугольника для его отображения: ");
        int height = scanner.nextInt();
        lab.leftTriangle(height);

        System.out.println("Задание 10.3 (угадайка)");
        lab.guessGame();

        System.out.print("Задание 2.4 (Поиск последнего вхождения элемента х в массив) ");
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска (x): ");
        int searchNumber = scanner.nextInt();
        int searchResult = lab.findLast(array, searchNumber);
        System.out.println("Индекс последнего вхождения: " + searchResult);

        System.out.print("Задание 4.4 (Добавление элемента в массив) ");
        System.out.print("Введите размер исходного массива: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите число для добавления (x): ");
        int numberToAdd = scanner.nextInt();
        System.out.print("Введите позицию для добавления (pos): ");
        int position = scanner.nextInt();
        int[] addResult = lab.add(array, numberToAdd, position);
        System.out.print("Результат: [");
        for (int i = 0; i < addResult.length; i++) {
            System.out.print(addResult[i]);
            if (i < addResult.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Задание 6.4 (реверс массива) ");
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Исходный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        lab.reverse(array);
        System.out.print("Перевернутый массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Задание 8.4 (Объединение массивов) ");
        System.out.print("Введите размер первого массива: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Введите размер второго массива: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] concatResult = lab.concat(array1, array2);
        System.out.print("Объединенный массив: [");
        for (int i = 0; i < concatResult.length; i++) {
            System.out.print(concatResult[i]);
            if (i < concatResult.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Задание 10.4 (Удаление отрицательных чисел из массива) ");
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Исходный массив: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] deleteResult = lab.deleteNegative(array);
        System.out.print("Массив без отрицательных элементов: [");
        for (int i = 0; i < deleteResult.length; i++) {
            System.out.print(deleteResult[i]);
            if (i < deleteResult.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}