import java.util.*; 
public class Principal {
     
    public static void main(String[] args) {
         
        
        int telefonoPersona=0;
        String nombrePersona="";
        int edadPersona=0;
         
    
        Scanner lectura=new Scanner(System.in);
         
        
        do {
             
            System.out.println("Introduce un telefono:");
            telefonoPersona=lectura.nextLine();
             
        }while(telefonoPersona.equalsIgnoreCase("")
                || telefonoPersona.length()<=10);
         
        
        do {
             
            System.out.println("Introduce un nombre:");
            nombrePersona=lectura.nextLine();
             
        }while(nombrePersona.equalsIgnoreCase(""));
         
       
        do {
             
            System.out.println("Introduce una edad:");
            edadPersona=lectura.nextInt();
             
        }while(edadPersona==0);
         
        
        Persona nuevaPersona=new Persona(telefonoPersona,nombrePersona,edadPersona);
         
        
        nuevaPersona.setTelefono(telefonoPersona);
        nuevaPersona.setNombre(nombrePersona);
        nuevaPersona.setEdad(edadPersona);
         
        
        System.out.println("Tu telefono es: " + nuevaPersona.getTelefono());
        System.out.println("El nombre es: " + nuevaPersona.getNombre());
        System.out.println("La edad es: " + nuevaPersona.getEdad());    
    }
}
