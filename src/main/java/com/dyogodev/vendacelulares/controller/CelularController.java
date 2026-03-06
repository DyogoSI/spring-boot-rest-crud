package com.dyogodev.vendacelulares.controller;

import com.dyogodev.vendacelulares.model.Celular;
import com.dyogodev.vendacelulares.repository.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/celulares")
public class CelularController {

    @Autowired
    private CelularRepository repository;

    // Listar todos os celulares (GET)
    @GetMapping
    public List<Celular> listar() {
        return repository.findAll();
    }

    // Adicionar um novo celular/venda (POST)
    @PostMapping
    public Celular adicionar(@RequestBody Celular celular) {
        return repository.save(celular);
    }

    // APAGA O CELULAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}") // EDITA O CELULAR
    public Celular editar(@PathVariable Long id, @RequestBody Celular celularAtualizado) {
        return repository.findById(id).map(celular -> {
            celular.setModelo(celularAtualizado.getModelo());
            celular.setMarca(celularAtualizado.getMarca());
            celular.setPreco(celularAtualizado.getPreco());
            return repository.save(celular);
        }).orElse(null);
    }
}