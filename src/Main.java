public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        int degrees = -20;
        if (degrees < 5) {
            System.out.println("На улице " + degrees + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + degrees + " градусов, можно идти без шапки.");
        }
        //Задача 3
        int speed = 61;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        //Задача 4
        age = 1;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ребёнок " +
                    "слишком мал, он должен быть с родителями");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
        } else if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age <= 24) {
            System.out.println("Если возраст человека равен " + age +
                    ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то ему нужно ходить на работу");
        }
        //Задача 5
        age = 12;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему " +
                    "нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему " +
                    "можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему " +
                    "можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Задача 6
        int passengers = 63;
        if (passengers >= 102) {
            System.out.println("В вагоне нет мест");
        } else if (passengers > 60) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне есть сидячие места");
        }
        //Задача 7
        int one = 10000;
        int two = 45000;
        int three = 760000;
        if (one > two && one > three) {
            System.out.println(one + " - большее число");
        } else if (two > three) {
            System.out.println(two + " - большее число");
        } else {
            System.out.println(three + " - большее число");
        }
    }
}