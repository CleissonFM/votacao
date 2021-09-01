package idsolucoes.com.votacao.repository;

import idsolucoes.com.votacao.model.Votos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotosRepository extends JpaRepository<Votos, Integer> {
}
