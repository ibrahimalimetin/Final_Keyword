/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ibrahim Ali Metin
 */
public class FinalTest {

    public final int obje_sayisi; 
    private static int say = 0 ; //static olduğundan sadece class 'a ait 'dir. 
    private final String isim; 

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }

    public FinalTest(String isim ) {
       this.isim = isim; 
       say++; 
       obje_sayisi = say; 
    }
    
    
}
