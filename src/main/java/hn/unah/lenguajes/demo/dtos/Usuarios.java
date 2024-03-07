package hn.unah.lenguajes.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter //Los genera de forma implicita, el getter y setter es un asesor
@Setter 
public class Usuarios {

    private String nombre;
    private String password;
    private String correo;
    private String telefono;


    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Correo: " + this.correo + "\n" +
                "Telefono: " + this.telefono;
    }
}
