package MyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class MyListUtils<T>{

    /**Метод заполняет элементы списка переданным значением, начиная со старта и заканчивая (но не включая) конечной позицией.
     Метод меняет исходный список!
     Метод принимает следующие параметры:
     coll – список List, элементы которого будут заполнены
     element – значение, которым будут заполнены элементы списка
     begin – стартовая позиция. Не обязательный параметр. Если стартовая позиция не передана, заполнение будет происходить с начала списка.
     end – конечная позиция. Не обязательный параметр. Если конечная позиция не передана, заполнение будет происходить до конца списка.
     Метод работает только с неотрицательными индексами*/
    /*public static <T> void fill(List coll, T element, int begin, int end) throws IllegalArgumentException{
        var collLength = coll.size();

        var normalizedBegin = begin > collLength ? end : begin;
        var normalizedEnd = end;

        if (end > collLength) {
            normalizedEnd = collLength;
        } else if (end < 0) {
            normalizedEnd = end + collLength;
        }

        if (begin < 0) {
            throw new IllegalArgumentException("Begin index should NOT be negative!");
        }
        *//*if (normalizedBegin > normalizedEnd) {
            throw new IllegalArgumentException("Begin index should NOT be more than end index!");
        }*//*

        for (int i = normalizedBegin; i < normalizedEnd; i++) {
            coll.remove(i);
            coll.add(i, element);
        }
    }
    public static <T> void fill(List coll, T element) {
        fill(coll, element, 0, coll.size());
    }

    public static <T> void fill(List coll, T element, int begin) {
        fill(coll, element, begin, coll.size());
    }*/

    public static <T> void fill(List<T> coll, T element, int begin, int end) {
        if (begin >= end) {
            return;
        }

        var collLength = coll.size();
        var normalizedBegin = begin > collLength ? end : begin;
        var normalizedEnd = end > collLength ? collLength : end;

        for (var i = normalizedBegin; i < normalizedEnd; i++) {
            coll.set(i, element);
        }
    }

    public static <T> void fill(List<T> coll, T element, int begin) {
        fill(coll, element, begin, coll.size());
    }

    public static <T> void fill(List<T> coll, T element) {
        fill(coll, element, 0, coll.size());
    }





    /**Метод add() добавляет в список, переданный первым аргументом, элемент по указанному индексу.

     - Если в списке уже есть элемент по такому индексу, то он и все следующие элементы сдвигаются вправо.
     - Если индекс не передан, элемент добавляется в конец списка.
     - В случае успешного изменения коллекции метод возвращает true.
     - Метод меняет переданный список

     Метод принимает три параметра:
     Первый – список List, в который нужно добавить элемент
     Второй – добавляемый элемент
     Третий (необязательный) - индекс, по которому будет вставлен элемент. Если индекс не передан, элемент будет добавлен в конец списка.
     В случае, если индекс элемента выходит за пределы длины массива (index < 0 || index > size()), будет выброшено исключение IndexOutOfBoundsException. */
    public static <T> boolean add (List<T> list, T element, int index) throws IndexOutOfBoundsException{
        int listSize = list.size();
        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException();
        }
        list.add(index, element);
        return list.get(index) == element;
    }
    public boolean add(List<T> list, T element) {

        return list.add(element);
    }


    public List<T> merge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public List<T> copy(List<T> listToCopy) {
        var copyList = new ArrayList<T>(listToCopy);
        return copyList;
    }

    public static <P extends Number> List<P> filter(List<P> list, Predicate<P> p) {
        ArrayList<P> filteredList = new ArrayList<>();
        for (P element : list) {
            if ((p.test(element))) {
                filteredList.add(element);
            }
        };
        return filteredList;
    }

    /*public static <T extends Human> int findFirstIndex(List<T> elements, String index) {
        int indexLength = index.length();
        for (T element : elements) {
            String elementName = element.getName();
            if (elementName.substring(0, indexLength).equals(index)) {
                return elements.indexOf(element);
            }
        }
        return -1;
    }*/
    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        var collLength = coll.size();
        if (collLength == 0) {
            return -1;
        }

        var normalisedIndex = fromIndex;
        if (normalisedIndex < 0) {
            if (-normalisedIndex > collLength) {
                normalisedIndex = 0;
            } else {
                normalisedIndex += collLength;
            }
        }

        var index = -1;
        for (int i = normalisedIndex; i < collLength; i++) {
            var current = coll.get(i);
            if (current.equals(value)) {
                return i;
            }
        }
        return index;
    }

    public static <T> int indexOf(List<T> coll, T value) {
        return coll.indexOf(value);
    }
}
