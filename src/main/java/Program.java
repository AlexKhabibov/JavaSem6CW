import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
//        Разработать класс, исполняющий функционал класса HashSet без использования сетов вообще. Храним целые числа
//        Реализовать метод добавления элемента учитывающий особенности множеств. Сигнатура метода public boolean add(Integer i)
//        Реализовать метод удаления элемента учитывающий особенности множеств. Сигнатура метода boolean remove(Object o)
//        Реализовать метод удаления всех элементов множества. Сигнатура метода void clear()

        Myset mySet = new Myset();
        System.out.println(mySet.add(1));
        System.out.println(mySet.add(1));
        System.out.println(mySet.remove(1));
        System.out.println(mySet.remove(1));
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        Iterator<Integer> iter = mySet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

class Myset /*implements Iterator<Integer>*/ {
    private HashMap<Integer, Object> map = new HashMap<>();
    private static final Object PRESENT = new Object();
    private int count = 0;

    public boolean add(Integer i) {
        return map.put(i, PRESENT) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    public void clear() {
        map.clear();
    }

//    @Override
//    public boolean hasNext() {
//        return map.size() > count;
//    }
//
//    @Override
//    public Integer next() {
//        return (Integer) map.keySet().toArray()[count++];
//    }

    public Iterator<Integer> iterator() {
        return map.keySet().iterator();
    }
}