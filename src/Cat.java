public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double eatenCount; // кладем сюда колиство съеденной еды

    // 1) добавим статус. можно конечно и enum, но не обязательно, т.к. статус приватный
    private String status;
    private String name;
    private String color;

    public static int count;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }
    // Урок 6 ============================
    public Cat(Double weight) {
        this.weight = weight;
    }
    public Cat(Double weight,String name) {
        this.weight = weight;
        this.name = name;
    }
    public Cat(Double weight,String name, String color) {
        this.weight = weight;
        this.name = name;
        this.color = color;
    }
//===============================================
    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        eatenCount += amount; // присваиваем коичество съеденной еды к eatenCount
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(double weight) { //добавим сеттер (7 уорок)
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { //добавим сеттер (7 уорок)
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) { //добавим сеттер (7 уорок)
        this.color = color;
    }

    //Урок 2. Метод, параметры, return
//Создать в классе Cat метод, который будет возвращать массу съеденной еды.
    public double getEatenCount() {
        return eatenCount;
    }
    //Создать в классе Cat метод «Сходить в туалет» pee(), который уменьшает вес кошки и что-нибудь печатает.
    public void pee() {
        weight = weight - weight / 100;
        System.out.println("Now, I am fine ");
    }

    public String getStatus() { // прописать условие для статическок переменной,
        // которая будет увеличиваться, если кошку создали, и убывать, если кошка взорвалась или умерла.
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
    //Урок 3. Статические методы и переменные
    //Создать у класса Cat статическую переменную count
    //которая будет увеличиваться, если кошку создали, и убывать, если кошка взорвалась или умерла.

    public static int getCount() {
        System.out.print("Количество котов: ");
        return count;
    }

    //  Урок 5. Научиться создавать объекты, используя перегруженные конструкторы.
// Что нужно сделать
//1.	Сделайте в классе Cat ещё один конструктор, чтобы можно было создать кошку с весом, переданным в конструктор.
//2.	Создайте в главном классе Loader метод генерации котёнка private static Cat getKitten().
//      Он должен возвращать кошку с весом 1100.00 грамм с помощью конструктора, в который передаём
//      вес кошки. Используйте описание из видеоурока.
//3.	Создайте три объекта класса Cat в методе main(), используя метод getKitten().



//    Урок 7. Копирование объектов
//    Цель задания
//    Научиться копировать параметры объекта с помощью геттеров и сеттеров.
//    Что нужно сделать:
//    Сделайте метод создания «глубокой» копии кошки. Это означает, что все параметры
//    одной кошки равны параметрам другой. Используйте для этого метод копирования или конструктор копирования.

//    public String toString() {
//        return name;
//
//    }
//    public Object clone() {
//        return new Cat(weight, name, color);
//    }
//
//    public void setOtherCat(Cat otherCat) {
//        this.otherCat = (Cat) otherCat.clone();
//    }
//    public Cat getOtherCat() {
//        return (Cat) otherCat.clone();
//    }

}
