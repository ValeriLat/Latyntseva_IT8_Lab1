import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    // задание 2.1
    public int sumLastNums(int x) {
        int last = x % 10;
        int second = (x / 10) % 10;
        return last + second;
    }

    // задание 4.1
    public boolean isPositive(int x) {
        return x > 0;
    }

    // задание 6.1
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // задание 8.1
    public boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    // задание 10.1
    public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    // задание 2.2
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    // задание 4.2
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "==" + y;
        }
    }

    // задание 6.2
    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    // задание 8.2
    public String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        } else if (lastDigit == 1) {
            return x + " год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    // задание 10.2
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // задание 2.3
    public String reverseListNums(int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            if (i != 0) {
                result += i + " ";
            } else {
                result += i;
            }
        }
        return result;
    }

    // задание 4.3
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // задание 6.3
    public boolean equalNum(int x) {
        if (x < 10) {
            return true;
        }

        int lastDigit = x % 10;
        int temp = x / 10;

        while (temp > 0) {
            int currentDigit = temp % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            temp = temp / 10;
        }

        return true;
    }

    // задание 8.3
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 10.3
    public void guessGame() {
        Random random = new Random();

        int secretNumber = random.nextInt(10);
        int attempts = 0;
        int userGuess;

        System.out.println("Введите число от 0 до 9:");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, введите число от 0 до 9:");
            }
        }

        System.out.println("Вы отгадали число за " + attempts + " попытки");
    }

    // задание 2.4
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // задание 4.4
    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    // задание 6.4
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // задание 8.4
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // задание 10.4
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}