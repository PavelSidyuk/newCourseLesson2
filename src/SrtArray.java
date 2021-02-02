import java.util.Arrays;

public class SrtArray {


    String[][] strArr = {{"11","4","7","14"},
    {"33","2","6","3"},
    {"77","3","24","99"},
    {"32","23","15","8"}};




    public void initializationArr(String[][] strArr){
        if (strArr.length != 4){
            try {
                throw new MyArraySizeException("Массив не может быть такого размера");
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }

        int[][] convertedArr = new int[4][4];
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                convertedArr[i][j] =Integer.parseInt(strArr[i][j]);
                System.out.println(convertedArr[i][j]);
            }
        }
    }


    @Override
    public String toString () {
        return "SrtArray{" +
                "strArr=" + Arrays.toString(strArr) +
                '}';
    }


}
