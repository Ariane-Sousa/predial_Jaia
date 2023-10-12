package com.dataTeam.jaia.jaia.repository;

import com.dataTeam.jaia.jaia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select u from Cliente u where u.nome = ?1")
    public Optional<Cliente> buscarPeloNome(String nome);

    @Query("select u from Cliente u where u.nome like %?1%")
    public List<Cliente> buscarPeloNomeParecido(String nome);

    public Optional<Cliente> findByCnpj(Integer cnpj);

}
