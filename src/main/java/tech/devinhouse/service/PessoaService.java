package tech.devinhouse.service;

import org.springframework.stereotype.Service;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository){
        this.repository = repository;
    }

  public void insert(PessoaEntity pessoa){
        repository.save(pessoa);
  }

}
