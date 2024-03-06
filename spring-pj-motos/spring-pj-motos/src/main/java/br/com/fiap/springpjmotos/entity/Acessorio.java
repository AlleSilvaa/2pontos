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
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_Acessorio")
    @SequenceGenerator(name = "SQ_Acessorio",
            sequenceName = "SQ_Acessorio",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_Acessorio")
    private Long id;

    @Column(name = "NM_Acessorio")
    private String nome;

    @Column(name = "PC_VEICULO")
    private Double preco;

    @ManyToMany
    @JoinColumn(
            name = "VEICULO",
            referencedColumnName = "ID_VEICULO",
            foreignKey = @ForeignKey(name = "FK_ACESSORIO")
    )
    private Veiculo veiculo;

}