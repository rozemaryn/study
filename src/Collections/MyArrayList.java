package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyArrayList {
    Object[] massive = new Object[10];
    int capacity = massive.length;
    int size;

    /* дефолтный конструктор, когда capacity 10 */
    MyArrayList() {
        this.massive = massive;
    }

    /* конструктор, когда сами задаём capacity*/

    MyArrayList(int a) {
        this.massive = new Object[a];
    }

    /*метод add
    элементы добавляются по порядку, друг за другом. Т.е. нам нужно найти первый элемент, который null, и его заполнить
    и затем выходим из цикла;

    также учесть вариант, когда массив уже заполнен на 3/4, тогда его сперва нужно увеличить и потом записать
     */

    public void addToArrayList(Object newObject) {

        if (size < capacity * 0.75) {
            for (int i = 0; i < capacity; i++) {
                if (massive[i] == null) {
                    massive[i] = newObject;
                    size++;
                    break;
                }
            }

        } else if (size >= capacity * 0.75) {
            makeBigger();
            massive[size] = newObject;
            size++;
        }
    }

    public void makeBigger() {
        /* нужно, чтобы старый ArrayList ссылался на новый массив
         * создаю новый, более вместительный массив и записываю туда элементы*/

        Object[] temp = Arrays.copyOf(massive, (int) (capacity * 1.5));
        massive = temp;
        capacity = temp.length;
    }

    /* переписала метод toString, чтобы он не отображал null элементы
    */

    @Override
    public String toString() {
        String joinedString = Arrays
                .stream(massive)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        return "MyArrayList{" +
                "massive=" + joinedString + "}";
    }


//     удаляем элемент из ArrayList
//     сперва обнуляем удаляемый элемент, пч из массива нельзя удалять элементы
//     затем все элементы справа от него сдвигаем влево с помощью цикла

    public void removeFromArrayList(int index) {
        massive[index] = null;
        for (int i = index; i < size; i++) {
            massive[i] = massive[i + 1];
        }
    }

    public void removeFromArrayList(String value) {
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (value.equals(massive[i])) {
                index = i;
            }
        }

        massive[index] = null;
        for (int i = index; i < size; i++) {
            massive[i] = massive[i + 1];
        }
    }
}

class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.addToArrayList(1);
        list.addToArrayList(2);
        list.addToArrayList(3);
        list.addToArrayList(4);
        list.addToArrayList(5);
        list.addToArrayList(6);
        list.addToArrayList(7);
        list.addToArrayList(8);
        list.addToArrayList(9);
        list.addToArrayList(10);
        list.addToArrayList(11);
        list.addToArrayList(12);
        list.addToArrayList(13);

        System.out.println(list);
        System.out.println(list.size);
        System.out.println(list.capacity);

        list.removeFromArrayList(2);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list2);
        list2.size();

        MyArrayList stringList = new MyArrayList();
        stringList.addToArrayList("A");
        stringList.addToArrayList("B");
        stringList.addToArrayList("C");
        stringList.addToArrayList("D");
        stringList.addToArrayList("E");

        System.out.println(stringList);
        stringList.removeFromArrayList("B");
        System.out.println(stringList);


    }
}
