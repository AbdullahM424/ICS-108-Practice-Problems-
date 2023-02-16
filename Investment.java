import java.util.*;
public class Investment {
    public static double futureInvestmentValue(double InvestmentAmount,double monthlyInterestRate,int years){
        double sum=0;
        int i=1;
        double InvestValue=0;
        for(i=1;i<=years;i++){
             InvestValue= InvestmentAmount*(Math.pow(1+((monthlyInterestRate/100)/12), 12*(double)i));
            System.out.print(i+"  "+InvestValue);
            System.out.println();
            sum+=InvestValue;
        }
        return InvestValue;
    }
    public static void main(String[] args){
        double amount, Rate;
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("The amount invested: ");
        amount= input.nextDouble();
        System.out.print("Annual interest rate: ");
        Rate= input.nextDouble();
        System.out.print("Number of years: ");
        year= input.nextInt();
        
        double result= futureInvestmentValue(amount, Rate, year);
        

        
    }
}
