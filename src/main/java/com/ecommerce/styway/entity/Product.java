package com.ecommerce.styway.entity;

import com.ecommerce.styway.enums.Sex;
import com.ecommerce.styway.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "products")
@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 100)
    private Type type;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private Sex sex;
    private String age;
    private String size;
    private String cloth;
}