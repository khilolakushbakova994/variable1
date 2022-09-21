public class    Main {
    public static void main(String[] args) {
        double dog = 5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);



        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);



        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров  " + totalWeight + "  кг");
        var difference = firstBoxer - secondBoxer;
        System.out.println("Разница между весами  " + difference + "   кг");
        var more = secondBoxer - firstBoxer;
        System.out.println( "Один тяжелее другого на   " + more + "   кг");
        var bigger = secondBoxer % firstBoxer;
        System.out.println( "Разница между борцами   " + bigger + "  кг");



        var totalHours = 640;
        var hourPerperson = 8;
        var personalNumber = totalHours / hourPerperson;
        System.out.println( "Всего работников в компании   " + personalNumber + "  человек");

        var additionalPersonal = 94;
        var personalAmount = additionalPersonal + personalNumber;
        System.out.println( "Если в компании работает   " + personalAmount + "  человек, то всего ");

        var totalTime = personalAmount * hourPerperson;
        System.out.println( totalTime + "   часов работы может быть поделено между сотрудниками    ");
    }

        }