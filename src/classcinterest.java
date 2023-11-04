public class classcinterest{
    double deposit;

    public  classcinterest(double d){
      deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*Math.pow(1+rate/12, time*12);
    }
    

        public static void main(String[] args) {

            classcinterest myInterest= new classcinterest(500000);
            double newAmount=myInterest.Amount( 0.18, 3);
            System.out.println("the compound interest is: " + newAmount);

            
        }
    }


