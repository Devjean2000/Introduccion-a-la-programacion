public class Coche{
    int puerta;
    int segunda_puerta;
    int tercera_puerta;
    int cuarta_puerta;
    Coche MiCoche = new Coche();
   
    public static void main() {
        
    }
    public void MiCoche() {
        this.puerta = 1;
        this.segunda_puerta = 2;
        this.tercera_puerta = 3;
        this.cuarta_puerta = puerta + segunda_puerta + tercera_puerta++;
        System.out.println(cuarta_puerta);

        
    }
    
    
    }   
    
    
 

    