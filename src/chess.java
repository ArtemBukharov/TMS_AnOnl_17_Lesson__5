public class chess {

    //Cоздать программу для раскраски шахматной доски с помощью циклов
    //создать двумерный массив стрингов 8на8
    // с помощью циклов задать значения чёрное белое


    public static void main(String[] args) {
        char[][] chess = new char[8][8];
        char Black = 'B';
        char White = 'W';
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = (i + j) % 2 == 0 ? White : Black;
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}