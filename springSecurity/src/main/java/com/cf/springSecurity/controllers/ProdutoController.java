package com.cf.springSecurity.controllers;

import com.cf.springSecurity.models.ProdutoModel;
import com.cf.springSecurity.repositories.ProdutoRepository;
import com.cf.springSecurity.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel salvar(ProdutoModel produtoModel) {
        return produtoService.save(produtoModel);
    }
}
