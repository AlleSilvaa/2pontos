package br.com.fiap.springpjmotos.entity;

        import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_2TDSPJ_LOJA")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_LOJA")
    @SequenceGenerator(name = "SQ_LOJA",
            sequenceName = "SQ_LOJA",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_LOJA")
    private Long id;

    @Column(name = "NM_LOJA")
    private String nome;

}