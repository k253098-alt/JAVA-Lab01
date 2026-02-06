package Lab01Task01;

import java.util.Scanner;

public class Lab01Task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter an integer to print table till 10: ");
        x = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.printf("%d * %d = %d\n",x ,i ,x*i);
        }


    }
}
