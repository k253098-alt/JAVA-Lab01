import java.util.Scanner;

public class Lab01Task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int oddSum = 0, evenSum = 0;
        //System.out.println("Enter an inteager (1-100): \n");
        //a = sc.nextInt();

        for(int i=0; i<100; i++){
            if(i%2 == 0){
                evenSum += i;
            }else if(i%2 != 0){
                oddSum += i;
            }
        }

        System.out.printf("Odd Sum = %d\n",oddSum);
        System.out.printf("Even Sum = %d\n",evenSum);
    }
}
