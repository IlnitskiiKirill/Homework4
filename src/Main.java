//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("Задача №1");
            int ageMan = 18;
            if (ageMan >= 18) {
                System.out.println("Если возраст человека равен либо больше " + ageMan + " лет, то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека меньше " + ageMan + " лет, то он не достиг совершеннолетия и нужно немного подождать");
            }
            System.out.println("Задача №2");
            int temp = 7;
            if (temp < 5) {
                System.out.println("На улице " + temp + " градусов. Нужно надеть шапку");
            } else {
                System.out.println("На улице " + temp + " градусов. Можно идти без шапки");
            }
            System.out.println("Задача №3");
            int speed = 50;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
            }
            System.out.println("Задача №4");
            int age = 40;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад");
            } else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу");
            } else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет");
            } else if (age > 24) {
                System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу");
            }
            System.out.println("Задача №5");
            int childAge = 13;
            boolean adult = true;
            if (childAge < 5) {
                System.out.println("Если возраст ребёнка меньше " + childAge + " лет, то ему нельзя кататься на атракционе");
            } else if (childAge >= 5 && childAge < 14) {
                if  (adult) {
                    System.out.println("Если возраст ребёнка равен " + childAge + " лет, то ему можно кататься на атракционе только в сопровождении взрослого");
                } else{
                    System.out.println("Если возраст ребёнка равен " + childAge + " лет, то ему нельзя кататься на атракционе без сопровождения взрослого");
                }
            } else {
                    System.out.println("Если возраст ребёнка равен " + childAge + " лет, то ему можно кататься на атракционе без сопровождении взрослого");
                }
                System.out.println("Задача №7");
                int plasesTrain = 120;
                if (plasesTrain < 60) {
                    System.out.println("В вагоне поезда есть сидячие места");
                } else if (plasesTrain >= 60 && plasesTrain < 120) {
                    System.out.println("В вагоне поезда есть только стоячие места");
                } else if (plasesTrain == 120) {
                    System.out.println("Вагон поезда полностью забит");
                }
                System.out.println("Задача №8");
                int one = 10;
                int two = 8;
                int three = 3;
                if (three > two && three > one) {
                    System.out.println("Число " + three + " больше, чисел " + two + " и " + one);
                } else if (two > one && two > three) {
                    System.out.println("Число " + two + " больше, чисел " + three + " и " + one);
                } else if (one > two && one > three) {
                    System.out.println("Число " + one + " больше, чисел " + three + " и " + two);
                }


            }
        }
    }
