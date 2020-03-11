package lesson2_homework;

public class CreatArr {
    private static int sum=0;
    public String[][] strings;

   public CreatArr (String[][] strings){
       this.strings=strings;
   }
    public void creatArr() {
        try {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {

                }
            }
            checkArr(strings);
            printArr(strings);
            checkInt(strings);
        } catch (MyArraySizeException e) {
            System.out.println("Указаная неверная размерность массива");
        }
        catch (MyArrayDataException e) {

           System.out.println(e.getMessage());}

    }
    private static void printArr(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {

                System.out.print(strings[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
   public void checkArr(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings.length != 4)  {throw new MyArraySizeException();}
            }
            if (strings[i].length != 4)  {throw new MyArraySizeException();}
        }
    }
    private static void checkInt(String[][] strings) {

            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    try {
                        sum += Integer.parseInt(strings[i][j]);

                    }catch (NumberFormatException | NullPointerException e) {throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] находится тип отличный от int.");}

                }
        }

    System.out.println("Сумма массива = " + sum);

    }


}





