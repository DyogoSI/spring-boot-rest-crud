package com.dyogodev.vendacelulares.controller;

import com.dyogodev.vendacelulares.model.Celular;
import com.dyogodev.vendacelulares.service.CelularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/celulares")
public class CelularController {

    @Autowired
    private CelularService service; // Mudamos de repository para service

    @GetMapping
    public List<Celular> listar() {
        return service.listarTodos();
    }

    // NOVO ENDPOINT para o TCC: Lista apenas os alertas
    @GetMapping("/alertas-estoque")
    public List<Celular> listarAlertas() {
        return service.verificarItensAbaixoDoMinimo();
    }

    @PostMapping
    public Celular adicionar(@RequestBody Celular celular) {
        return service.salvar(celular);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public Celular editar(@PathVariable Long id, @RequestBody Celular celularAtualizado) {
        celularAtualizado.setId(id);
        return service.salvar(celularAtualizado);
    }
}