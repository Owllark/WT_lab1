package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        System.out.println(checkFigure(x, y));
    }
    public static boolean checkFigure(int x, int y){
        return checkBottomPart(x, y) || checkTopPart(x, y);
    }

    public static boolean checkBottomPart(int x, int y){
        return (x >= -6 && x <= 6) && ( y>= -3 && y <= 0);
    }

    public static boolean checkTopPart(int x, int y){ return (x >= -4 && x <= 4 ) && (y >= 0 && y <= 5);}
}
