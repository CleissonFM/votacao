package idsolucoes.com.votacao.model;

import javax.persistence.*;

@Entity
public class DDDBrasil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ddd;
    private String cidade;
    private String areaAbrangencia;

    public Integer getDdd() {
        return ddd;
    }

    public String getCidade() {
        return cidade;
    }

    public String getAreaAbrangencia() {
        return areaAbrangencia;
    }
}
