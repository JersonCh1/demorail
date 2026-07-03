package com.example.demorail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class RestControllerProducto {

    @Autowired
    private RepositoryProducto repo;

    @GetMapping("/productos")
    public List<Producto> listarTodos() {
        return repo.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto consultarPorId(@PathVariable(name = "id") int id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/producto/{id}")
    public void eliminar(@PathVariable(name = "id") int id) {
        repo.deleteById(id);
    }

    @PostMapping("/registrar")
    public Producto registrar(@RequestBody Producto nuevo) {
        return repo.save(nuevo);
    }

    @GetMapping("/buscarPorPrecio/{precio}")
    public List<Producto> buscarPorPrecio(@PathVariable(name = "precio") double precio) {
        return repo.findByPrecio(precio);
    }
}