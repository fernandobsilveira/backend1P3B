package com.alunoonline.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Define a classe como sendo uma tabela para o spring
@Data //Utiliza o lombok pra gerar gets e sets
@AllArgsConstructor //Utiliza o lombok para criar um construtor passando todas as varaveis como argmentos
@NoArgsConstructor //Utiliza o lombok para criar um construtor sem argumentos (default)
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Regra que o id é acrescido +1 a cada objeto gerado
    private Long id;
    private String nome;
    private String email;
    private String curso;
    
}
