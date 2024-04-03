package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x and y coordinates for point 1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("Enter x and y coordinates for point 2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Details of point 1: " + p1.getDetails());
        System.out.println("Details of point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Points are at the same position.");
        } else {
            System.out.println("Points are at different positions.");
            System.out.println("Distance between point 1 and point 2: " + p1.calculateDistance(p2));
        }

        scanner.close();
    }
}
