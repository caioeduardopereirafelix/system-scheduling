package system_scheduling.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class Servico {

    @Id
    @Column
    private UUID idServico;

    @Column
    private String nomeServico;

    @Column
    private String descricaoServico;

    @Column
    private LocalDate duracao;

    @Column
    private BigDecimal preco;
}
