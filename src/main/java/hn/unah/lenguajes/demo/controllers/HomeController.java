package hn.unah.lenguajes.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.demo.dtos.Usuarios;
import hn.unah.lenguajes.demo.servicios.impl.usuariosServiciosImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController    //
@RequestMapping("/home")   //

public class HomeController {

    @Autowired //Para instanciar el objeto automaticamente

    //El servicio lo va a utilizar el controlador
    //Le pasamos la implementacion porque ya tiene los metodos implemantados
    private usuariosServiciosImpl usuarioService;

    //Agregamos el metodo
    @PostMapping("/usuario/agregar")
    public String agregarUsuario(@RequestBody Usuarios usuariosDto){
        return this.usuarioService.agregarUsuario(usuariosDto);
    }

    @GetMapping("/usuario/buscar/{correo}")
    public Usuarios buscarPorCorreo(@PathVariable String correo){
        return this.usuarioService.obtenerUsuariosPorCorreo(correo);
    }

/*----------------------- */

    @GetMapping("/saludo") //indicamos la ruta y el metodo get
    public String saludo(){
        return "hola";
    }

    @GetMapping("/saludo/{nombre}") //indicamos la ruta y el metodo get
    public String saludo(@PathVariable String nombre){  //Cuando usamos pathVariable, el parametro forma parte de la URL
        return "hola: " + nombre;
    }


    @GetMapping("/saludo/final") //indicamos la ruta y el metodo get
    public String saludoFinal(@RequestParam(name = "titulo") String titulo){  //Cuando usamos RequestParam, el parametro NO forma parte de la URL, usamos postman
        return "Adios: " + titulo;
    }

    @GetMapping("/usuario") //indicamos la ruta y el metodo get
    public String mostrarUsuario(@RequestBody Usuarios usuariosDto){ //RequestBody Toma el JSON y mapea campo a campo el DTO
        return usuariosDto.toString(); //Mapea campo a campo el DTO, implicitamente, proceso de deserializacion
    }

}
