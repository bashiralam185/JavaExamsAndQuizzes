import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args){
        String number =userGet();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int num= input.nextInt();
        shift(number, num);
    }
    public static String userGet(){
        System.out.println("Enter your numbers, press return to end.");
        Scanner input = new Scanner(System.in);
        String string="";
        while(true){
            String number=input.nextLine();
            try {
                int num= Integer.parseInt(number);
                string=string+num;
            }
            catch (Exception e){
                System.out.println("Not a legal number. Try again!");
            }
//            System.out.println(number);
            if (number.isEmpty()){
                break;
            }
        }
        return string;
    }
    public static void shift(String number, int num){
        for(int j=num; j<number.length(); j++){
            System.out.print(number.charAt(j));
            System.out.print(",");
        }
        for(int i=0; i<num; i++){
            System.out.print(number.charAt(i));
            if(i!=num-1){
                System.out.print(",");
            }
        }
    }
}
