import apple.*;

public class Main {
    public static void main(String[] args) {

        ListDirection list2 = new ListDirection();

        list2.add(new Apple("Красный", 55, "Антоновка", 120));
        list2.add(new Apple("Зелёный", 60, "Грени", 100));
        list2.add(new Apple("Жёлтый", 80, "Голден", 130));
        list2.add(new Apple("Сливовый", 75, "Спартан", 90));
        list2.add(new Apple("Алый", 70, "Гала", 150));
        list2.add(new Apple("Красно-белый", 65, "Башкирская красавица", 120));

        list2.print();
        System.out.println("\n");

        list2.add(3,new Apple("Зелёный", 64, "Семеринская", 110));
        list2.print();
        System.out.println("\n");

        System.out.println(list2.pop());
        System.out.println("\n");

        list2.print();
        System.out.println("\n");

        list2.remove(2);
        list2.print();
        System.out.println("\n");

        list2.printReverse();
        System.out.println("\n");

        list2.sort();
        list2.print();
    }




}
