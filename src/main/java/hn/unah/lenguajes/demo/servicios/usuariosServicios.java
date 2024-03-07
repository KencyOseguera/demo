package hn.unah.lenguajes.demo.servicios;

import hn.unah.lenguajes.demo.dtos.Usuarios;


public interface usuariosServicios {

    public String agregarUsuario(Usuarios usuariosDto);

    public Usuarios obtenerUsuariosPorCorreo(String correo);

}
