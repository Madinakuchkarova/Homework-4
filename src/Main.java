public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил,и нужно подождать!");
        }
        System.out.println("Задание 2");
        int youAre = 6;
        if (youAre >= 7 || youAre <= 18) {
            System.out.println("Вы ходите в школу");
        }
        if (youAre >= 19 || youAre <= 23) {
            System.out.println("Вы учитесь в Университете");
        }
        if (youAre <= 24) {
            System.out.println("Вам пора искать первую работу");
        } else {
            System.out.println("Вам еще рано в школу");
        }
        System.out.println("Задание 3");
        int seatPlace = 60;
        int totalSeats = 102;

        if (seatPlace < 61) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("В вагоне больше нет сидячих мест");
        }
        int standingPlace = totalSeats - 60;
        if (standingPlace < 43) {
        System.out.println("Есть стоячие места ");
        } else {
        System.out.println("В вагоне больше нет стоячих мест");
        }
        if (totalSeats < 103) {
        System.out.println("В вагоне больше нет мест");
        }
        System.out.println("Задание 4");
        int ageForKindergarten = 2;
        if (ageForKindergarten < 7) {
        System.out.println("Если возраст человека равен " + ageForKindergarten + ",то ему нужно ходить в детский сад.");
        }
        int ageForSchool = 15;
        if (ageForSchool < 19) {
        System.out.println("Если возраст человека равен " + ageForSchool + ",то ему нужно ходить в школу.");
        }
        int ageForUniversity = 19;
        if (ageForUniversity < 24) {
        System.out.println("Если возраст человека равен " + ageForUniversity +",то его место в университете.");
        }
        int ageForWork = 25;
        if (ageForWork > 24) {
        System.out.println("Если возраст человека равен " + ageForWork + ",то ему пора холить на работу.");
        }
        System.out.println("Задание 5");
        int ageForRides = 16;
        if (ageForRides <= 5 || ageForRides >= 14) {
        System.out.println("Если ребенку меньше 5,то он не может кататься на аттракционе.");
        } else {
        System.out.println("Если ребенку больше 5,но меньше 14,то он может кататься только в сопрождении взрослого,Если взрослого нет,то кататься нельзя.");
        }
        if(ageForRides > 15) {
        System.out.println("Если ребенок старше 14,то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Задание 3");
        int one = 14;
        int two = 25;
        int free = 165;
        if (free > one && free > two) {
        System.out.println("Большее число " + free);
        } else {
        System.out.println("Большее число  " + free);
        }











    }
}