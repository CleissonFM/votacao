package idsolucoes.com.votacao.repository;

import idsolucoes.com.votacao.model.DDDBrasil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DDDBrasilRepository extends JpaRepository<DDDBrasil, Integer> {
    @Query("select d from DDDBrasil d where d.ddd = ?1")
    DDDBrasil getDDDBrasilByddd(Integer ddd);
}
