package com.dyogodev.vendacelulares.service;

import com.dyogodev.vendacelulares.model.Celular;
import com.dyogodev.vendacelulares.repository.CelularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CelularService {

    @Autowired
    private CelularRepository repository;

    // Regra de Negócio: Filtra apenas quem está com estoque baixo
    public List<Celular> verificarItensAbaixoDoMinimo() {
        return repository.findAll().stream()
                .filter(c -> c.getQuantidadeEstoque() != null && c.getEstoqueMinimo() != null)
                .filter(c -> c.getQuantidadeEstoque() < c.getEstoqueMinimo())
                .collect(Collectors.toList());
    }

    public List<Celular> listarTodos() { return repository.findAll(); }
    public Celular salvar(Celular celular) { return repository.save(celular); }
    public void deletar(Long id) { repository.deleteById(id); }
}