package com.example.cwiczenie2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TableRepository extends JpaRepository <Tabela, Long>
{
    List<Tabela> findTabelaByVal2(String str);
}
