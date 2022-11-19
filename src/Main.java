import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 1

        System.out.println("Task 1");

        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст ");
        int age = in.nextInt();

        if(age<=18){
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }else{
            System.out.println("Поздравляем с совершеннолетием");
        }

        //task  2
        System.out.println("Task 2");

        Scanner inn = new Scanner(System.in);
        System.out.println("Введите возраст ");
        int personAge = inn.nextInt();

        if (personAge>=7&&personAge<18){
            System.out.println("Ребенок ходит в школу");
        } else if (personAge>=18&&personAge<24) {
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


    }
}