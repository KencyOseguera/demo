package hn.unah.lenguajes.demo.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hn.unah.lenguajes.demo.dtos.Usuarios;
import hn.unah.lenguajes.demo.servicios.usuariosServicios;

//implementar la clase con implements - nombre del servicio
@Service //
public class usuariosServiciosImpl implements usuariosServicios {

    //Agregamos una lista con el tipo Usuarios
    private List<Usuarios> lstUsuarios = new ArrayList();


    @Override
    public String agregarUsuario(Usuarios usuariosDto) {
        lstUsuarios.add(usuariosDto);
        return usuariosDto.toString();
    }

    @Override
    public Usuarios obtenerUsuariosPorCorreo(String correo) {
        for (Usuarios usuarios : lstUsuarios){
            if (usuarios.getCorreo().equals(correo))
            return usuarios;
        }
        return null;
    } //agregar implements usuariosServicios
    


}
