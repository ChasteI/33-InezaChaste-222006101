public class mymethod {
    public static int addnumbers( int a,int b){
        return a+b;
    }
    public static void main(String [] args){
        int c=5;
        int d=5;
        int result=addnumbers(c, d);
        System.out.println("the sum of " + c+ "and"+ d +"is" + result);
    }
}
