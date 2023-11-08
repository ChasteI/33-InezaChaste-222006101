class cities {
    void Africa(){
        System.out.println("LONDON");
        System.out.println("NEW YORK");
        System.out.println("CAPE TOWN");
        
    }
}
class pays extends cities{
public void Asia(){
    System.out.println("TOKYO");
    System.out.println("MANILA");
    System.out.println("BEIJING");
}
}
class Land extends pays{
    void Europe(){
        System.out.println("PARIS");
        System.out.println("ROME");
        System.out.println("MADRID");
    }
}
interface landa{
    void America();
}
class C extends Land implements landa{
   public void America(){
    System.out.println("LOS ANGELES");
    System.out.println("MEXICO CITY");
    System.out.println("BUENOS AIRES");
}
}
 class Inherited {
    public static void main(String[] args) {
        C continento= new C();
        continento.Africa();
        continento.Asia();
        continento.Europe();
        continento.America();

    }
}
