public class Main {
    public static void main(String[] args) {
        MagicBox box1 = new MagicBox<Integer>("redbox", 4);
        box1.add(15);
        box1.add(3);
        box1.add(7);
        box1.add(9);

        System.out.println(box1.pick());

        MagicBox box2 = new MagicBox<String>("bluebox", 4);
        box2.add("Вася");
        box2.add("Петя");
        box2.add("Стас");
        box2.add("Алеша");

        System.out.println(box2.pick());
    }
}
