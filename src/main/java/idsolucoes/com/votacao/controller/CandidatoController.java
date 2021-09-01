package idsolucoes.com.votacao.controller;

import idsolucoes.com.votacao.model.Candidato;
import idsolucoes.com.votacao.repository.CandidatoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatoController {

    private final CandidatoRepository repository;

    public CandidatoController(CandidatoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cadidato/{candidatoId}")
    public Candidato getCadidato(
            @PathVariable Integer candidatoId){
        return repository.getCandidatoById(candidatoId);
    }
}
