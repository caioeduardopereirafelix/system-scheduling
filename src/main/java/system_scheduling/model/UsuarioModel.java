package system_scheduling.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UsuarioModel {

    @Id
    @Column(name = "id")
    private UUID idUser;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String number;
}
