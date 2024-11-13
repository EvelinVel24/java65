package main.java.principal.repositorio;

import principal.modelo.Pelicula;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PeliculaRepositorioImpl implements PeliculaRepositorio {

    private final JdbcTemplate jdbcTemplate;

    public PeliculaRepositorioImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Métodos para insertar, obtener, actualizar y eliminar
}
