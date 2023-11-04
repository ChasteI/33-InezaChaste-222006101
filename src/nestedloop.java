public class nestedloop {
    public static void main(String [] args){
        int rows=10;
        int columns=10;
        for(int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                System.out.println(i * j + "\t");
            }
            System.out.println();
        }
    }
}
