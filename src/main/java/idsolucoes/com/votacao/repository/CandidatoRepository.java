package idsolucoes.com.votacao.repository;

import idsolucoes.com.votacao.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {

 Candidato getCandidatoById(Integer id);

}
