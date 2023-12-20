package com.company.l4collections.set;

public class SimpleSet implements ISet {

    private final int INITIAL_SIZE = 4;
    private Object[] array = new Object[INITIAL_SIZE];
    private int size = 0;

    @Override
    public boolean add(Object o) {
        if (contains(o)) {
            return false;
        }
        if (array.length == size) {
            extendArray();
        }

        array[size] = o;
        size++;
        return true;
    }

    private void extendArray() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override

    public boolean remove(Object o) {
        //если объекта нет, выходим!
        if (!contains(o)) {
            return false;
        }
        //если объект есть, то
        //создаем переменную индекс, который будет представлять собой индекс, где лежит объект, кот.надо удалить
        int index = 0;
        for (int i = index; i < size; i++) {
            if (array[i].equals(o)) {
                //присваиваем индекс
                index = i;
                // когда объект найден, брейк прекращает выполнение цикла, в котором находится и сразу переходит к след.
//              // действиям после цикла
                break;
            }
        }
        //перебираем массив, начиная от ячейки, которую надо удалить и до размера массива на 1 ячейку меньше
        for (int i = index; i < size - 1; i++) {
            //вписываем в итую ячейку старого массива правую от итой ячейки старого массива - следующую от нее
            array[i] = array[i + 1];
            //тело закрывается
        }
        //уменьшаем размер массива на 1
        size--;
        //возвращаем правдку, потому что удалили ячейку, в которой лежал объект
        return true;
    }


    @Override
    public boolean isEmpty() {
//            метод isEmpty() возвращает правду, если массив (используемый множеством) полностью пуст
//            проверяем, если массив array не содержит никаких объектов, все ячейки пусты = размер занятых ячеек 0
        //                то возвращаем правду, если size не равно 0, то переходим сразу на строку 79 return false
        return size == 0;

    }

    @Override

    public int size() {
//      Возвращает размер множества, число присвоенное size
        return size;
    }

    @Override

    public void clear() {
//      ничего не возвращает. Удаляет все, создаем новый объект с количеством ячеек INITIAL_SIZE, который равняется 4
        array = new Object[INITIAL_SIZE];
        size = 0;
    }

}
