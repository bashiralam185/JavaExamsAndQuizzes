import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        try{
            number=input.nextInt();
            if(number<1){
                number=-number;
//                System.out.println(function(number));
            }
            if(number>9){
                System.out.println(function2(number));
            }
            else if(number==0){
                System.out.println(function3(number));
            }
            else{
                System.out.print(function(number));

            }
        }
        catch (Exception e){
            System.out.println("error");
        }

    }
    public static String function(int number){
        int tenthValue= (number*10)+number;
        int hundValue= (number*100)+(tenthValue);
        int total= number+tenthValue+hundValue;
        return number+"+"+tenthValue+"+"+hundValue+"="+total;
    }
    public static String function2(int number){
        int num=(number*100)+number;
        int num2= (number*10000)+num;
        int total= number+num+num2;
        return number+"+"+num+"+"+num2+"="+total;
    }
    public static String function3(int number){
        String one="0";
        String two="00";
        String three="000";
        String total="000000";
        return one+"+"+two+"+"+three+"="+total;
    }
}
