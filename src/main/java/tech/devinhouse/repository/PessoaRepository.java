package tech.devinhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.devinhouse.entity.PessoaEntity;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {


    List<PessoaEntity> findByStatus(Boolean status);

    @Query(value = "SELECT * FROM pessoas WHERE name LIKE %:filter% OR email LIKE %:filter%", nativeQuery = true)
    List<PessoaEntity> buscarPessoasPorNomeOuEmail(String filter);
}
