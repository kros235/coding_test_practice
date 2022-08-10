package input_output_arithmetic_operation;

import java.util.Scanner;

public class Q_3003 {
    public static void main(String args[]) {
        int king, queen, rook, bishop, knight, pawn;
        Scanner input = new Scanner(System.in);

        king = input.nextInt();
        queen = input.nextInt();
        rook = input.nextInt();
        bishop = input.nextInt();
        knight = input.nextInt();
        pawn = input.nextInt();

        if (king < 0 || king > 10
                || queen < 0 || queen > 10
                || rook < 0 || rook > 10
                || bishop < 0 || bishop > 10
                || knight < 0 || knight > 10
                || pawn < 0 || pawn > 10) {
        } else {
            System.out.println((1 - king) + " " + (1 - queen) + " "
                    + (2 - rook) + " " + (2 - bishop) + " "
                    + (2 - knight) + " " + (8 - pawn));
        }
    }
}
