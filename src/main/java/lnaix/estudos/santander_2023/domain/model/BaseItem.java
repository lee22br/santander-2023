package lnaix.estudos.santander_2023.domain.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String icon;

    @Column
    private String description;
}
