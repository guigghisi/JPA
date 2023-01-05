package tech.devinhouse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(@RequestBody PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }
    @PostMapping
    public void save(PessoaEntity pessoa){

    }
}
