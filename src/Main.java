public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №3 Условный оператор ");

        System.out.println("___________________________________Задача 1___________________________________");

        int age = 21;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 2___________________________________");

        int temperature = 13;
        if (temperature < 5)
        {
            System.out.println("На улице " + temperature + " радусов, наденьте шапку");
        } else {
            System.out.println("На улице " + temperature + " радусов, не надевайте шапку");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 3___________________________________");

        int speed = 55;
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 4___________________________________");

        int years = 17;
        if (years >= 2 && years <= 6)
        {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад.");
        }
        if (years >= 7 && years <= 17)
        {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу.");
        }
        if (years >= 18 && years <= 24)
        {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в университет.");
        }
        if (years >= 25)
        {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить на работу.");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 5___________________________________");

        int old = 11;
        if (old < 5)
        {
            System.out.println("Если возраст ребенка равен " + old + " то ему нельзя кататься на аттракционе.");
        }
        if (old > 5 && old < 14)
        {
            System.out.println("Если возраст ребенка равен " + old + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (old > 14)
        {
            System.out.println("Если возраст ребенка равен " + old + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 6___________________________________");

        int placeSitting = 60;
        int place = 102;
        int people = 82;
        if (people < placeSitting)
        {
            System.out.println("В вагоне имеется сидячее место");
        } else if (people > placeSitting && people < place)
        {
            System.out.println("В вагоне имеется стоячее место");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }

        System.out.println("________________________________________________________________________________");


        System.out.println("___________________________________Задача 7___________________________________");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three)
        {
            System.out.println(one);
        } else if (two > one && two > three)
        {
            System.out.println(two);
        } else
        {
            System.out.println(three);
        }
        System.out.println("________________________________________________________________________________");





    }
}