package main.java.principal.repositorio;

import java.util.List;

public interface PeliculaRepositorio {
    void insertar(Pelicula pelicula);
    Pelicula obtenerPorId(int id);
    List<Pelicula> obtenerTodas();
    void actualizar(Pelicula pelicula);
    void eliminar(int id);
}
