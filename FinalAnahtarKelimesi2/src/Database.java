/**
 *
 * @author Ibrahim Ali Metin
 */
public class Database { //Class 'ı final yaparsak ondan hiçbir alt sınıf üretemeyiz.
    
    public void baglantiKur(final String userName,final String password){ // Bu değişkenleri final yapmaz isek değişiklik yapılabilir bu sebeple final anahtar kelimesini kullanacağız.
        //methodu final yaparsak bu classı extends ettiğimiz class içerisinde override edemeyiz.
        System.out.println(userName);
        System.out.println(password);
    }
   
}
