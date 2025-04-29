
import java.util.Scanner;

class Student {

    String name;
    int score;
}

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter your number of rows in matrix 1");
        int r1 = sc.nextInt();

        System.err.println("enter your number of cols in matrix 1");
        int c1 = sc.nextInt();

        System.err.println("enter your number of rows in matrix 2");
        int r2 = sc.nextInt();

        System.err.println("enter your number of cols in matrix 2");
        int c2 = sc.nextInt();
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int result[][] = new int[r2][c2];
        int product[][] = new int[r1][c2];
        // if (c1 != c2 || r1 != r2) {
        //     System.out.print("not possible");

        // } else {
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             System.out.print("enter element for" + "a[" + (i + 1) + "]" + "[" + (j + 1) + "]");
        //             a[i][j] = sc.nextInt();
        //         }
        //     }
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             System.out.print("enter element for" + "b[" + i + 1 + "]" + "[" + j + 1 + "]");
        //             b[i][j] = sc.nextInt();
        //         }
        //     }
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             result[i][j] = a[i][j] + b[i][j];
        //         }
        //     }
        //     System.out.println("reslt of sum is \n");
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             System.out.print(" " + result[i][j] + " ");
        //         }
        //         System.out.println(" ");
        //     }
        //     System.out.println("reslt of product is \n");
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             for (int k = 0; k < c1; k++) {
        //                 product[i][k] += a[i][k] + b[k][j];
        //             }
        //         }
        //     }
        //     for (int i = 0; i < r1; i++) {
        //         for (int j = 0; j < c1; j++) {
        //             System.out.print(" " + product[i][j] + " ");
        //         }
        //         System.out.println(" ");
        //     }
        // }
        Student s1 = new Student();
        s1.name = "Asif";
        s1.score = 90;
        Student s2 = new Student();
        s2.name = "Asifdsg";
        s2.score = 902;
        Student s3 = new Student();
        s3.name = "sAsiddf";
        s3.score = 9110;

        Student students[] = new Student[3];

        for (Student student : students) {
            System.out.println("student name" + student.name + "score" + student.score);
        }
    }
}
