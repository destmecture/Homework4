import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1

        System.out.println("Task 1");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст ");
        int age = in.nextInt();

        String answer = age>=18 ? "Поздравляем с совершеннолетием":"Возраст совершеннолетия ещё не наступил, и нужно немного подождать";

        System.out.println(answer);

        //task  2
        System.out.println("Task 2");

        Scanner inn = new Scanner(System.in);
        System.out.println("Введите возраст ");
        int personAge = inn.nextInt();

        if (personAge>=7&&personAge<18){
            System.out.println("Ребенок ходит в школу");
        }else if (personAge>=18&&personAge<24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }else if(personAge>24){
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }else{
            System.out.println("Введите другой возраст");
        }
        //task 3
        System.out.println("Task 3");

        Scanner newIn = new Scanner(System.in);
        System.out.println("Введите ваш номер в очереди");
        int vacantSeats = newIn.nextInt();
        if(vacantSeats<=60){
            System.out.println("У вас сидячее место");
        } else if (vacantSeats>60&&vacantSeats<=102) {
            System.out.println("У вас стоячее место");
        }else{
            System.out.println("В вагоне нет мест");
        }

        //second block task1
        System.out.println("Second part, Task 1");

        Scanner ageToPlace = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int placeToGo =ageToPlace.nextInt();

        if(placeToGo>=2 && placeToGo<=6){
            System.out.println("Если ваш возраст "+placeToGo+" лет, то вам нужно ходить в детский сад");
        } else if (placeToGo>=7&&placeToGo<18) {
            System.out.println("Если ваш возраст "+placeToGo+" лет, то вам нужно ходить в школу");
        } else if (placeToGo>=18&&placeToGo<24) {
            System.out.println("Если ваш возраст "+placeToGo+" лет, то вам нужно ходить в университет");
        }else{
            System.out.println("Вам пора ходить на работу");
        }

        //task 2
        System.out.println("Task 2");

        Scanner accessToRide = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int ageToAccess = accessToRide.nextInt();

        if(ageToAccess<5){
            System.out.println("Ты не можешь кататься на аттракционе");
        } else if (ageToAccess>=5 && ageToAccess<14) {
            System.out.println("Ты можешь кататься только в сопровождении взрослого");
        }else{
            System.out.println("ТЫ можешь кататься самостоятельно");
        }
        //task 3
        System.out.println("Task 3");

        Scanner oneFirst = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = oneFirst.nextInt();

        Scanner twoFirst = new Scanner(System.in);
        System.out.println("Введите второе число");
        int two = twoFirst.nextInt();

        Scanner freeFirst = new Scanner(System.in);
        System.out.println("Введите третье число");
        int free = freeFirst.nextInt();

        int maxFirstTwo = Math.max(one, two);
        System.out.println("Максимальное число "+Math.max(maxFirstTwo, free));



    }
}