package main.java.principal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import principal.modelo.Pelicula;
import principal.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class Aplicacion implements CommandLineRunner {

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insertar películas de ejemplo
        Pelicula pelicula1 = new Pelicula(1, "Inception", "Christopher Nolan", 2010, 148);
        Pelicula pelicula2 = new Pelicula(2, "The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 136);
        Pelicula pelicula3 = new Pelicula(3, "Interstellar", "Christopher Nolan", 2014, 169);

        // Ejemplo de operaciones CRUD
        peliculaRepositorio.insertar(pelicula1);
        peliculaRepositorio.insertar(pelicula2);
        peliculaRepositorio.insertar(pelicula3);

        // Actualizar una película
        pelicula1.setTitulo("Inception (Updated)");
        peliculaRepositorio.actualizar(pelicula1);

        // Eliminar una película
        peliculaRepositorio.eliminar(2); // Elimina "The Matrix"

        // Mostrar todas las películas
        peliculaRepositorio.obtenerTodas().forEach(System.out::println);
    }
}
