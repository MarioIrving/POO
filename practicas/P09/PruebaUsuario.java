
public class PruebaUsuario {

    public static void main(String[] args) {
        
        Usuario usuario1=new Usuario();
        Usuario usuario2=new Usuario("Mario Morales", "Black Mamba");
        Usuario usuario3=new Usuario("Javier Hernandez", "Chicharito", "55-55-55-55");
          
        //Datos Usuario 1
        usuario1.setNombre("Agapito Rodriguez");
        usuario1.setTelefono("55-23-62-86");
        usuario1.setDireccion("Flor del canto 32 Col. Nativitas");
        usuario1.setMail("arodriguez@hotmail.com");
        usuario1.setNickName("Amarrado");
        usuario1.setFechaNacimiento("20-01-2000");
        
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getTelefono());
        System.out.println(usuario1.getDireccion());
        System.out.println(usuario1.getMail());
        System.out.println(usuario1.getNickName());
        System.out.println(usuario1.getFechaNacimiento());
        System.out.println(" ");
        
        //Datos usuario 2
        usuario2.setTelefono("55-62-57-19");
        usuario2.setDireccion("Tintoreto 10 Col. Pintores");
        usuario2.setMail("mario.morales@gmail.com");
        usuario2.setFechaNacimiento("19-01-1973");
        
        System.out.println(usuario2.getNombre());
        System.out.println(usuario2.getTelefono());
        System.out.println(usuario2.getDireccion());
        System.out.println(usuario2.getMail());
        System.out.println(usuario2.getNickName());
        System.out.println(usuario2.getFechaNacimiento());
        System.out.println(" ");
        
        //Datos usuario 3
        usuario3.setDireccion("Horacio Cazarin 14 Col. Futbolistas");
        usuario3.setMail("chicharito14@hotmail.com");
        usuario3.setFechaNacimiento("01-06-1988");
        
        System.out.println(usuario3.getNombre());
        System.out.println(usuario3.getTelefono());
        System.out.println(usuario3.getDireccion());
        System.out.println(usuario3.getMail());
        System.out.println(usuario3.getNickName());
        System.out.println(usuario3.getFechaNacimiento());
        System.out.println(" ");
        
        //@overide del metodo To String
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
       
    }
    
}
