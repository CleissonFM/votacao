package idsolucoes.com.votacao.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "candidato", indexes = { @Index(name = "inx_canditatos", columnList = "id")})
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String vice;
    private Integer numero;
    private String partido;
    private String foto;
    private String legenda;
    private LocalDateTime created_at;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getVice() {
        return vice;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPartido() {
        return partido;
    }

    public String getFoto() {
        return foto;
    }

    public String getLegenda() {
        return legenda;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }
}
