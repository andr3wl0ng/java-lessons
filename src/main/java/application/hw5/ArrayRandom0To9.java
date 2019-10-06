package application.hw5;
/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9]
Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и
выведете это количество на экран на отдельной строке.
*/
public class ArrayRandom0To9 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
            System.out.print(array[i] + " ");
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//
//        }
    }
}
