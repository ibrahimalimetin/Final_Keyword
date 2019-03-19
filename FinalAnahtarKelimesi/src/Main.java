

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    /* Final anahtar kelimesi tanımlanan özelliğin değeri bir defa verilir ve başka yerde değiştirilemez. Ya tanımlandığı noktada yada obje oluşturulurken constructor içerisinde verilir.*/
   /*Projede değiştirilmesini istemediğimiz bir yer var ise örn; db şifresi gibi ve bu alanı değiştirmeye çalışırsak java bize hata verir.*/ 
    public static void main(String[] args) {
        
   /* 
    FinalTest f1 = new FinalTest("İsim1");
    FinalTest f2 = new FinalTest("İsim2");
    
        System.out.println("Obje sayısı: " + f1.obje_sayisi);
        System.out.println("Obje sayısı: " + f2.obje_sayisi);
        
    */
   
        //System.out.println(Math.PI);//Pi sayısı static ve final olarak ilk olarak public yapılmış hertaraftan ulaşılabilir. Daha sonra static yapılmış herhnagi bir oble oluşturmadan biz direk ulaşabiliyoruz. Değeri başka bir yerde değiştirmeyelim diye de final eklenmiş.
   
            
        System.out.println("Database Adı: " + Database.password );
    }
}
