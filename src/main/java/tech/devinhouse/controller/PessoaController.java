package tech.devinhouse.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(@RequestBody PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public void save(PessoaEntity pessoa) {

    }

    @GetMapping
    public List<PessoaEntity> buscarTudo() {
        return pessoaService.buscarTodasAsPessoas();
    }

    @GetMapping("/{id}")
    public PessoaEntity buscarPorId(@PathVariable("id") Long id) {
        return pessoaService.buscaPessoaPorId(id);
    }

    @GetMapping("/status-true")
    public List<PessoaEntity> buscarStatusTrue() {
        return pessoaService.buscarPessoaPorStatusTrue();
    }

    @PutMapping
    public void updatePessoa(@RequestBody PessoaEntity pessoa) {
        pessoaService.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletePessoaPorId(@PathVariable("id") Long id) {
        pessoaService.deletePorId(id);
    }
}

