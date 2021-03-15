import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x= input.nextInt();
        if (x>1 && x<31){
            number(x);

        }
    }
    public static void number(int num){
        for (int i=0; i<num;i++){
            int count=1;
            for(int j=0;j<i; j++){
                System.out.print("  ");
            }
            for(int k=i; k<num; k++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}
