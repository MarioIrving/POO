
public class Usuario {

    private String nombre;
    private String telefono;
    private String direccion;
    private String mail;
    private String nickName;
    private String fechaNacimiento;
    private String contrasena;

    public Usuario(){
           
        this.nombre="Sin dato";
        this.telefono="Sin dato";
        this.direccion="Sin dato";
        this.mail="Sin dato";
        this.nickName="Sin dato";
        this.fechaNacimiento="Sin dato";
    }
    
    public Usuario(String nombre_param, String nickName_param){
        this.nombre=nombre_param;
        this.nickName=nickName_param;
    }
    
    public Usuario(String nombre_param, String nickName_param, String telefono_param){
        this.nombre=nombre_param;
        this.nickName=nickName_param; 
        this.telefono=telefono_param;   
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre_param) {
        this.nombre = nombre_param;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono_param) {
        this.telefono = telefono_param;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion_param) {
        this.direccion = direccion_param;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail_param) {
        this.mail = mail_param;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName_param) {
        this.nickName = nickName_param;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento_param) {
        this.fechaNacimiento = fechaNacimiento_param;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena_param) {
        this.contrasena = contrasena_param;
    }
    
    public String toString(){
        return ("El nombre es: " + this.nombre + "\n")+("El apodo es: " + this.nickName+ "\n")
                +("EL telefono es: " + this.telefono+ "\n");
    }

    
}
