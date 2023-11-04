public class objmet {
    private double principal, rate, time;

    public objmet(double principal, double rate, double time)
 
{
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double simpleInterest(){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        objmet objmet = new objmet(100000, 5, 5);
        double simpleInterest = objmet.simpleInterest();

        System.out.println("The simple interest for Mr. Bob is: " + simpleInterest + " RWF");
    }
}