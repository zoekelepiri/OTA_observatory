package gr.alexc.otaobservatory.entity.ota;

import gr.alexc.otaobservatory.entity.CadastralRegistrationStatus;
import gr.alexc.otaobservatory.entity.OTA;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
// Κατάσταση Κτηματογράφισης
public class CadastralRegistrationStatusOTA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CadastralRegistrationStatus status;

    private LocalDate createDate;

    private LocalDate updateDate;

    private LocalDate lastCheckDate;

    @ManyToOne
    private OTA ota;
}