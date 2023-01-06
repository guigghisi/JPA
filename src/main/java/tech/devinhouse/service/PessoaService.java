package tech.devinhouse.service;

import org.springframework.stereotype.Service;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public void save(PessoaEntity pessoa) {
        this.repository.save(pessoa);
    }

    public List<PessoaEntity> buscarTodasAsPessoas() {
        return this.repository.findAll();
    }

    public PessoaEntity buscaPessoaPorId(Long id) {
        Optional<PessoaEntity> byId = this.repository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    public List<PessoaEntity> buscarPessoaPorStatusTrue() {
        return this.repository.findByStatus(true);
    }

    public void deletePorId(Long id) {
        this.repository.deleteById(id);
    }

    public List<PessoaEntity> filtrarPessoas(String filter) {
        return this.repository.buscarPessoasPorNomeOuEmail(filter);
    }
}

