package idsolucoes.com.votacao.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "enquete", indexes = {@Index(name = "enquetes", columnList = "id")})
public class Enquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome_enquete;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Integer getId() {
        return id;
    }

    public String getNome_enquete() {
        return nome_enquete;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }
}