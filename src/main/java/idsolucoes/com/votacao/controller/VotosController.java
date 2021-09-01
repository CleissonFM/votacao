package idsolucoes.com.votacao.controller;

import idsolucoes.com.votacao.model.Votos;
import idsolucoes.com.votacao.repository.CandidatoRepository;
import idsolucoes.com.votacao.repository.DDDBrasilRepository;
import idsolucoes.com.votacao.repository.EnqueteRepository;
import idsolucoes.com.votacao.repository.VotosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

@RestController
public class VotosController {

    private final VotosRepository votosRepository;
    private final EnqueteRepository enqueteRepository;
    private final CandidatoRepository candidatoRepository;
    private final DDDBrasilRepository dddBrasilRepository;

    public VotosController(VotosRepository votosRepository,
                           EnqueteRepository enqueteRepository,
                           CandidatoRepository candidatoRepository,
                           DDDBrasilRepository dddBrasilRepository) {
        this.votosRepository = votosRepository;
        this.enqueteRepository = enqueteRepository;
        this.candidatoRepository = candidatoRepository;
        this.dddBrasilRepository = dddBrasilRepository;
    }

    @PostMapping("enquete/{enqueteId}/candidato/{candidatoId}/ddd/{dddId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void setVoto(@PathVariable Integer enqueteId,
                        @PathVariable Integer candidatoId,
                        @PathVariable Integer dddId){

        String ip = null;
        var enquete = enqueteRepository.getEnqueteById(enqueteId);
        var canditato = candidatoRepository.getCandidatoById(candidatoId);
        var ddd = dddBrasilRepository.getDDDBrasilByddd(dddId);

        /*Capturar ip*/
        try(final DatagramSocket socket = new DatagramSocket()){
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            ip = socket.getLocalAddress().getHostAddress();
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        }

        var voto = new Votos(
                null,
                enquete,
                ddd,
                canditato,
                ip

        );

        votosRepository.save(voto);
    }
}
