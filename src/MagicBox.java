import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    private String nameBox;


    public MagicBox(String nameBox, int size) {
        this.nameBox = nameBox;
        this.items = (T[]) new Object[size];
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Еще есть место. Осталось заполнить", items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return items[randomInt];
    }
}

