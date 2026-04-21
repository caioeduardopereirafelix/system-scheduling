package system_scheduling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Agendamento {

    private UUID id;

    private LocalDate horaMarcada;

    private StatusAgendamento statusAgendamento;

    @ManyToOne
    private UsuarioModel usuario;

    private Servico tipoServico;
}
