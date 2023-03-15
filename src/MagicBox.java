

public class MagicBox<T> {
    public T spaceBox; // устанавливаем максимальное количество места
    public T[] objects; // место в коробке
    public String nameBox;


    public MagicBox(String nameBox, int size) {
        this.nameBox = nameBox;
        T[] items = (T[]) new Object[size];
    }


    boolean add(T item) {
//        T[] items = null;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException("Еще есть место. Осталось заполнить", items.length - i);
            }
        }

        for (obj : objects) {
            
        }
    }
}
