package tech.devinhouse.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.service.PessoaService;

import java.util.List;

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
    @GetMapping
    public List<PessoaEntity> buscarTudo(){
        return  pessoaService.buscarTodasAsPessoas();
    }
    @GetMapping("/{id}")
    public PessoaEntity buscarPorId(@PathVariable("id") Long id){
        return pessoaService.buscaPessoaPorId(id);
    }
@GetMapping("/status-true")
    public List<PessoaEntity> buscarStatusTrue(){
        return pessoaService.buscarPessoaPorStatusTrue();
    }
    }

