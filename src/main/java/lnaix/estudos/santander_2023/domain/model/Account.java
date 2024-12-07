package lnaix.estudos.santander_2023.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(nullable = false)
    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision  = 13, scale = 2)
    private BigDecimal limit;


}
