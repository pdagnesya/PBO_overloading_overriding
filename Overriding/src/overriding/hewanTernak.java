
package overriding;

public class hewanTernak {
    String makan;
    String gerak;
    
    public hewanTernak(){
        System.out.println("Hewan Ternak milik Agnesya");
    }
    public void greeting(){
        System.out.println("~~WELCOME~~");
    }
    public void makan(){
        System.out.println("makanan : rumput dan biji");
    }
    public void gerak(){
        System.out.println("berjalan");
    }
    
    public static void main(String[] args) {
        System.out.println("[PUTRI DWI AGNESYA / 21081010142]");
        System.out.println("");
        
        hewanTernak a = new hewanTernak();
        a.greeting();
        a.makan();
        a.gerak();
        System.out.println("");
        Unggas b = new Unggas();
        b.greeting();
        b.makan();
        b.bulu();
        b.kembangbiak();
        System.out.println("");
        ayam c = new ayam();
        c.greeting();
        c.makan();
        c.gerak();
        c.bulu();
        c.kembangbiak();
        c.sound();
        System.out.println("");
        
        
    }
}
class Unggas extends hewanTernak{
    String bulu;
    String kembangbiak;
    public Unggas(){
        super();
    }
    public void greeting(){
        System.out.println("Hewan Ternak UNGGAS ");
    }
    public void makan(){
        System.out.println("makanan : biji");
    }
    public void bulu(){
        System.out.println("Bulu : ada");
    }
    public void kembangbiak(){
        System.out.println("Berkembangbiak dengan : ovipar / bertelur");
    }
}

class ayam extends Unggas{
    String sound;
    public ayam(){
        super();
    }
    public void greeting(){
        System.out.println("Hewan Ternak AYAM ");
    }
    public void makan(){
        System.out.println("makanan : biji");
    }
    public void gerak(){
        System.out.println("gerak : berjalan, berlari, melompat");
    }
    public void bulu(){
        System.out.println("Bulu : ada");
    }
    public void kembangbiak(){
        System.out.println("Berkembangbiak dengan : ovipar / bertelur");
    }
    public void sound(){
        System.out.println("sound : petok-petok");
    }
    
}
    
