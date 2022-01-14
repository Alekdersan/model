package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // условный оператор
        int age = 16;
        if (age >= 18) {                                   // условие, которое должно выполняться
            System.out.println("Ты можешь водить машину"); // что должно произойти. Если True
        } else {
            System.out.println("You cannot drive a car");  // что сделать, если условие не выполнилось - False
        }
        System.out.println();
        int ageAlc = 21;
        if (ageAlc >= 18 && ageAlc < 21) {                 // должны быть выполнены оба условия
            System.out.println("You can drive a car, but you cannot drink alcohol");
        }
        if (ageAlc < 7 || ageAlc > 18) {                   // должно быть выполнено одно из условий или оба сразу
            System.out.println("I think you not go to the school");
        }
        // Conclusion: внутри {} после if можно записать сложное выражение, которое условный оператор использует чтобы понять на какую строку КОДА должна перепрыгнуть программа
        System.out.println();
        // Использование booleam
        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Sky clear");
        }
        System.out.println();
        int ageAlc1 = 5;
        boolean canNotGoToSchool = ageAlc1 < 7 || ageAlc1 > 18;
        if (ageAlc1 >= 18 && ageAlc1 < 21) {                                          // 1 условие, которое должно выполниться
            System.out.println("You can drive a car, but you cannot drink alcohol"); // выводится если 1 условие True
        }
        if (canNotGoToSchool) {                                                      // 2 условие, которое выполняется, если не выполнено 1 условие
            System.out.println("I think you not go to the school");                 // выводится если 2 услоие True (т. е. 1 условие - False)
        }
        System.out.println();
        // продолжаем использовать несколько условных операторов.
        int age2 = 5;
        if (age2 > 18) {
            System.out.println("You should be celebrating");
            if (age2 < 21) {                                    // это Вложенный условный оператор, т.к. находится внутри {} другого условного оператора.
                System.out.println("Have a cream beer");       // Во Вложенный условный оператор лучше не вкладывать еще один, - такие программы сложны для понимания!
            } else {
                System.out.println("Go wherever you want and drink whatever you want");
            }
        } else if (age2 > 7) {                                  // если условный оператор if вложен в блок else, и кроме него там больше ничего нет,
            System.out.println("Go to the school");        // то для читаемости КОДА принято не ставить после блока else фигурные скопки - {}.
        } else {
            System.out.println("Go to the kindergarten");
        }
        System.out.println();
        // применение условного оператор switch
        int ageThree = 25;
        if (ageThree == 18) {
            System.out.println("Congratulations on graduation");
        } else if (ageThree == 21) {
            System.out.println("Now you can drink alcohol");
        } else if (ageThree == 7) {
            System.out.println("It's time for school");
        } else {
            System.out.println("No celebration");
        }
        switch (ageThree) {   // применение условного оператор switch
            case 1:
            case 2:
            case 3:
            case 5:
                System.out.println("Рано в школу");
                break;
            case 8:
            case 10:
            case 17:
                System.out.println("Займись учебой");
                break;
            case 22:
            case 25:
                System.out.println("Пора работать");
                break;
            case 7:
            case 18:
            case 21:
                System.out.println("Поздравляем!");
                break;
            default:
                System.out.println("Так не бывает");
        }

    }
}
