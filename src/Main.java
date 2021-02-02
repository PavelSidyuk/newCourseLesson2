
import java.util.Arrays;

public class Main {

    public static void main (String[] args) {


     String  [][] strArr = {
                {"11","4","7","14"},
                {"33","2","6","3"},
                {"77","3","24","99"},
                {"32","23","15","8"}
        };

    initializationArr(strArr);
}


    public static void initializationArr (String[][] strArr) {
        if (strArr.length != 4 ) {
            try {
                throw new MyArraySizeException("Массив не может быть такого размера");

            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }

        }else {

            int[][] convertedArr = new int[4][4];
            for (int i = 0; i < strArr.length; i++) {
                for (int j = 0; j < strArr[i].length; j++){

                    convertedArr[i][j] =Integer.parseInt(strArr[i][j]);
                    System.out.print(convertedArr[i][j] + " ");
                }
                System.out.println();
                }
                int conv = convertedArr.length;
                int summ = 0;
            for (int i = 0; i < conv; i++) {
                for (int j = 0; j < conv; j++) {
                    summ+=convertedArr[i][j];

                }
            }
            System.out.println("Сумма всех элементов равна = " +summ);
            }
        }

}