
    

 public class Loan {
    public double principal, rate, time;

    public Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double compoundInterest() {
        return principal * Math.pow((1 + rate / 100), time);
    }

    public static void main(String[] args) {
        Loan loan = new Loan(500000, 18, 36);
        double compoundInterest = loan.compoundInterest();

        System.out.println("The compound interest for Mr. Bob is: " + compoundInterest + " RWF");
    }

}
