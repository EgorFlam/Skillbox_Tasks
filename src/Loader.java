import java.net.NoRouteToHostException;

public class Loader {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Cat1 = " + cat1.getWeight());
        cat1.feed(10.00);
        System.out.println("Cat1 (after the feed) = " + cat1.getWeight());
        System.out.println("Cat1 (after the feed) = " + cat1.getStatus());

        Cat cat2 = new Cat();
        System.out.println("Cat2 = " + cat2.getWeight());
        while (cat2.getWeight() >= 1000) {
            cat2.meow();
        }

        Cat cat3 = new Cat();
        System.out.println("Cat3 = " + cat3.getWeight());
        cat3.feed(30.0);
        cat3.meow();
        System.out.println("Cat3 = " + cat3.getWeight());
        cat3.getEatenCount();
        System.out.println("Cat3's eatenFood = " + cat3.getEatenCount());


        Cat cat4 = new Cat();
        System.out.println("Cat4 = " + cat4.getWeight());
        cat4.feed(150.0);
        cat4.pee();
        cat4.drink(300.00);
        cat4.getEatenCount();
        System.out.println("Cat4 eaten Amount Of Food= " + cat4.getEatenCount());
        System.out.println("Cat4 = " + cat4.getWeight());

        Cat cat5 = new Cat();
        System.out.println("Cat5 = " + cat5.getWeight());
        while (cat5.getWeight() <= 9000) {
            cat5.drink(1000.0);
        }
        System.out.println("===========================================");

        Cat Murka = new Cat();
        System.out.println("Murka weight: " + Murka.getWeight());
        Cat Vasya = new Cat();
        System.out.println("Vasya weight: " + Vasya.getWeight());
        Cat Misha = new Cat();
        System.out.println("Misha weight: " + Misha.getWeight());
        Cat Anton = new Cat();
        System.out.println("Anton weight: " + Anton.getWeight());
        Cat Sergey = new Cat();
        System.out.println("Sergey weight: " + Sergey.getWeight());

        Sergey.pee();
        while (Sergey.getWeight() > 1000) {
            Sergey.pee();
        }
        Murka.feed(15000.0);
        Vasya.meow();
        Anton.drink(100.0);
        while (Misha.getWeight() > 1000 ) {
            Misha.meow();
        }
        System.out.println("===========================================");
        System.out.println("Cat1 = " + cat1.getStatus());
        System.out.println("Cat2 = " + cat2.getStatus());
        System.out.println("Cat3 = " + cat3.getStatus());
        System.out.println("Cat4 = " + cat4.getStatus());
        System.out.println("Cat5 = " + cat5.getStatus());
        System.out.println("===========================================");
        System.out.println("Anton 1 = " + Anton.getStatus());
        System.out.println("Sergey 2 = : " + Sergey.getStatus());
        System.out.println("Мурка 3 = : " + Murka.getStatus());
        System.out.println("Misha 4 = :" + Misha.getStatus());
        System.out.println("Vasya 5 = :" + Vasya.getStatus());
        System.out.println("===========================================");
        System.out.println(Cat.getCount());
        System.out.println("===========================================");

//  Урок 5. Научиться создавать объекты, используя перегруженные конструкторы.
// Что нужно сделать
//1.	Сделайте в классе Cat ещё один конструктор, чтобы можно было создать кошку с весом, переданным в конструктор.
//2.	Создайте в главном классе Loader метод генерации котёнка private static Cat getKitten().
//      Он должен возвращать кошку с весом 1100.00 грамм с помощью конструктора, в который передаём
//      вес кошки. Используйте описание из видеоурока.
//3.	Создайте два объекта класса Cat в методе main(), используя метод getKitten().

        Cat kitten1 = getKitten();
        System.out.println("kitten1 weight: " + kitten1.getWeight());
        Cat kitten2 = getKitten();
        System.out.println("kitten2 weight: " + kitten1.getWeight());
        System.out.println("===========================================");

        Cat cat45 = new Cat(1100.0);
        System.out.println("Cat45:" + "\nWeight: " + cat45.getWeight());
        System.out.println("===========================================");
        Cat cat46 = new Cat(1100.0, "Gena");
        System.out.println("Cat46:" + "\nWeight: " + cat46.getWeight() + "\nName: " + cat46.getName());
        System.out.println("===========================================");
        Cat cat47 = new Cat(1100.0, "Maks", "Green");
        System.out.println("Cat47:" + "\nWeight: " + cat47.getWeight() + "\nName: " + cat47.getName() + "\nColor: " + cat47.getColor());
        System.out.println("===========================================");

//    Урок 7. Копирование объектов
//    Цель задания
//    Научиться копировать параметры объекта с помощью геттеров и сеттеров.
//    Что нужно сделать:
//    Сделайте метод создания «глубокой» копии кошки. Это означает, что все параметры
//    одной кошки равны параметрам другой. Используйте для этого метод копирования или конструктор копирования.

        Cat clone = new Cat(); //Shallow copy
        clone.setWeight(cat47.getWeight());
        clone.setName(cat47.getName());
        clone.setColor(cat47.getColor());
        System.out.println("Clone:" + "\nWeight: " + clone.getWeight() + "\nName: " + clone.getName() +
                "\nColor: " + clone.getColor());

    }

    public static Cat getKitten() { //#2
        Cat kitten = new Cat(100 + 50 * Math.random());
        return kitten;
    }
}
