package TFG;

public class Usuario {
	 private static int idRegistro;
    private static String nombre;
    private static String contraseña;
    private static String correo;
   
    // Constructor sin parámetros
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombre, String contraseña, String correo, int idRegistro) {
        Usuario.nombre = nombre;
        Usuario.contraseña = contraseña;
        Usuario.correo = correo;
        Usuario.idRegistro = idRegistro;
    }
    
    
    public static int getIdRegistro() {
        return idRegistro;
    }

    public static void setIdRegistro(int idRegistro) {
        Usuario.idRegistro = idRegistro;
    }
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }

    public static String getContraseña() {
        return contraseña;
    }

    public static void setContraseña(String contraseña) {
        Usuario.contraseña = contraseña;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Usuario.correo = correo;
    }


}
