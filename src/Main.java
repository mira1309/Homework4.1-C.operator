public class Main {
    public static void main(String[] args) {
        //task1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        //task2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //task3
        int speed = 59;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        //task4
        int myAge = 62;
        if (myAge < 2) {
            System.out.println("Если возраст человека равен " + myAge + " пора спать");
        } else if (myAge >= 2 && myAge <= 6) {
            System.out.println("Если возраст человека равен " + myAge + " то ему нужно ходить в детский сад");
        } else if (myAge >= 7 && myAge <= 18) {
            System.out.println("Если возраст человека равен " + myAge + " то ему нужно ходить в школу");
        } else if (myAge > 18 && myAge < 24) {
            System.out.println("Если возраст человека равен " + myAge + " то ему нужно ходить в университет");
        } else if (myAge >= 24 && myAge <=60) {
            System.out.println("Если возраст человека равен " + myAge + " то ему пора на работу");
        } else {
            System.out.println("Если возраст человека равен " + myAge + " то ему пора отдохнуть");
        }
        //task5
        int childAge = 16;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge<14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе без сопровождения");
    }
        int passengers = 102;
        if (passengers <60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (passengers >= 60 && passengers <102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("В вагоне мест нет");
        }
        //task7
        int one = 3;
        int two = 7;
        int three = 10;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two >= one) {
            if (two > three) {
                System.out.println("Максимальное число - " + two);
            } else if (three > two) {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one>three) {
            System.out.println("Максимальное число - " + one);
        } else if (three>one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Числа " + one + " и " + three + " равны");
            }
        }
    }
}