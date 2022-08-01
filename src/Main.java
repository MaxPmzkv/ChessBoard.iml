public class Main {
    public static void main(String[] args) {
        String x = "ABCDEFGH";
        String y = "87654321";

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                chessBoard[i][j] = (Character.toString(x.charAt(j)) + y.charAt(i));
            }
        }
        printArray(chessBoard);
        System.out.println();

        rotateArray(chessBoard);
        printArray(chessBoard);
        System.out.println();
        rotateArray(chessBoard);
        printArray(chessBoard);
        System.out.println();
        rotateArray(chessBoard);
        printArray(chessBoard);
        System.out.println();
        rotateArray(chessBoard);
        printArray(chessBoard);
        System.out.println();

    }


    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static String[][] rotateArray(String[][] array){
        String temp;
        int length = array.length;
        for (int i = 0; i < length / 2; i++){
            for (int j = i; j < length - 1 - i;  j++){
                temp = array[i][j];
                array[i][j] = array[j][length - 1 - i];
                array[j][length - 1 - i] = array[length - 1 - i][length - 1 - j];
                array[length - 1 - i][length - 1 - j] = array[length - 1 - j][i];
                array[length - 1 - j][i] = temp;
            }

        }
        return array;

    }
}