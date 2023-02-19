package Collections;

import java.util.Arrays;

public class MyArrayList {
    Object [] massive = new Object [10];
    int capacity = massive.length;
    int size;

    /* дефолтный конструктор, когда capacity 10 */
    MyArrayList () {
        this.massive = massive;
    }

    /* конструктор, когда сами задаём capacity*/

    MyArrayList (int a) {
        this.massive = new Object [a];
    }

    /*метод add
    элементы добавляются по порядку, друг за другом. Т.е. нам нужно найти первый элемент, который null, и его заполнить
    и затем выходим из цикла;

    также учесть вариант, когда массив уже заполнен на 3/4, тогда его сперва нужно увеличить и потом записать
     */

    public void addToArrayList (Object newObject) {

        if (size < capacity*0.75) {
            for (int i = 0; i < capacity; i++) {
                if (massive[i] == null) {
                    massive[i] = newObject;
                    size++;
                    break;
                }
            }

        }
        else if (size >= capacity*0.75) {
            makeBigger();
            massive[size] = newObject;
            size++;
        }
    }


    public void makeBigger () {
        /* нужно, чтобы старый ArrayList ссылался на новый массив
        * создаю новый, более вместительный массив и записываю туда элементы*/

        Object [] temp = Arrays.copyOf(massive, (int)(capacity*1.5));
        massive = temp;
        capacity = temp.length;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "massive=" + Arrays.toString(massive) +
                '}';
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
    }
}
