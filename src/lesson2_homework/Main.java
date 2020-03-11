package lesson2_homework;

public class Main {
    public static void main(String[] args) {

        CreatArr arr1 = new CreatArr(new String [][] {{"1", "4", "5", "4"},{"1", "1", "5", "4"},{"1", "r", "1", "4"},{"4", "2", "7", "4"}});
        arr1.creatArr();
        arr1.checkArr(arr1.strings);
    }
}

