package idsolucoes.com.votacao.repository;

import idsolucoes.com.votacao.model.Enquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnqueteRepository extends JpaRepository<Enquete, Integer> {
    Enquete getEnqueteById(Integer id);
}
