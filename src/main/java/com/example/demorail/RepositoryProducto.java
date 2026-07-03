package com.example.demorail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducto extends JpaRepository<Producto, Integer>{

    List<Producto> findByPrecio(double precio);

}