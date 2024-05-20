package org.example;

public class Main {
    public static void main(String[] args) {

        // Надає значення 4 полям типу int.
        int firstNumber = 11;
        int secondNumber = 3;
        int thirdNumber = 2;
        int fourthNumber = 5;

        // Сумує їх попарно.
        int firstSum = firstNumber + secondNumber;
        int secondSum = thirdNumber + fourthNumber;

        // Виводить результат порівняння сум (true, якщо перша сума більша).
        System.out.println(firstSum > secondSum);


        // Збільшує першу суму на 1. Другу суму зменшує на 2.
        ++firstSum;
        secondSum -= 2;

        // Виводить результат порівняння (true, якщо перша сума більша).
        String message = firstSum > secondSum ? "true" : "false";
        System.out.println(message);


        // Виводить true, якщо хоча б одна сума кратна 2, інакше – false.
        if ((firstSum % 2) == 0 || (secondSum % 2) == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}