public class cinterest {
    
        public static double Interest (double deposit,double rate, double time ){
            
            return deposit*Math.pow(1+rate/12, time*12);
    
        }
        
    
        public static void main(String[] args) {
         double depo= 500000;
         double percentage= 0.18;
         double timePeriod= 3;
         double cinterest = Interest(depo, percentage, timePeriod);
         System.out.println("The compound interest of the deposited amount: " + cinterest);
            
        }
    }
    

