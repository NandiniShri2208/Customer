import java.util.Scanner;

public class total_fees {
    int original_fees;
    int min_amt;
    double dis=0;
  double final_fee;
    total_fees(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fees greater than or equal to 50,000");
         original_fees=sc.nextInt();
        System.out.println("enter minimum amt to deposit");
         min_amt=sc.nextInt();
    }
    void cal_fees(){
        if(min_amt >= original_fees/2){
            dis=0.05*original_fees;

        }
        final_fee=original_fees-dis +original_fees-0.1*original_fees+original_fees-0.05*original_fees;

        System.out.println(final_fee);
    }
}
class original_fees{
    public static void main(String[] args) {
       total_fees obj=new total_fees();
       obj.cal_fees();

    }
}
