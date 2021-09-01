package idsolucoes.com.votacao.model;

import javax.persistence.*;

@Entity
@Table(name = "votos", indexes = {@Index(name = "voto", columnList = "id")})
public class Votos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "enquente_id")
    private Enquete enquete;

    @OneToOne
    @JoinColumn(name = "id_ddd_brasil")
    private DDDBrasil ddd;

    @OneToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    private String ipVotacao;

    public Integer getId() {
        return id;
    }

    public Enquete getEnquete() {
        return enquete;
    }

    public DDDBrasil getDdd() {
        return ddd;
    }

    public Candidato getCantidato() {
        return candidato;
    }

    public String getIpVotacao() {
        return ipVotacao;
    }
}
