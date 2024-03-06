package br.com.fiap.springpjmotos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_2TDSPJ_VEICULO")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_VEICULO")
    @SequenceGenerator(name = "SQ_VEICULO",
            sequenceName = "SQ_VEICULO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_VEICULO")
    private Long id;

    @Column(name = "NM_VEICULO")
    private String nome;

    @Column(name = "CR_VEICULO")
    private String cor;

    @Column(name = "PC_VEICULO")
    private Double preco;

    @Column(name = "CD_VEICULO")
    private Short cilindradas;

    @ManyToMany
    @JoinColumn(
            name = "LOJA",
            referencedColumnName = "ID_LOJA",
            foreignKey = @ForeignKey(name = "FK_VEICULO")
    )
    private Loja loja;

}