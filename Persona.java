public class Persona {
  private int edad;
  private String nombre;
  private int telefono;

  public Persona(int edad, String nombre, int telefono) {
    this.edad = edad;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getTelefono() {
    return this.telefono;
  }
}

public class Cliente extends Persona {
  private int credito;

  public Cliente(int edad, String nombre, int telefono, int credito) {
    super(edad, nombre, telefono);
    this.credito = credito;
  }

  public int getCredito() {
    return this.credito;
  }
}

public class Trabajador extends Persona {
  private int salario;

  public Trabajador(int edad, String nombre, int telefono, int salario) {
    super(edad, nombre, telefono);
    this.salario = salario;
  }

  public int getSalario() {
    return this.salario;
  }
}
