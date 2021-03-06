package br.ufrpe.sigava.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private String email;
    private char sexo;
    private LocalDate dataNascimento;
    private String senha;
    private String cpf;

    public Pessoa(String nome, String email, char sexo, LocalDate dataNascimento, String senha, String cpf){
        this.setNome(nome);
        this.setEmail(email);
        this.setSexo(sexo);
        this.setDataNascimento(dataNascimento);
        this.setSenha(senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome = '" + this.getNome() + '\'' +
                ", e-mail = '" + this.getEmail() + '\'' +
                ", Sexo = " + this.getSexo() +
                ", Data de nascimento = " + this.getDataNascimento().format(formatter) +
                ", CPF = '" + this.getCpf() + '\'';

    }

    public boolean equals(Pessoa anotherPessoa){
        boolean equals = false;
        if (this.getCpf().equals(anotherPessoa.getCpf())){
            equals = true;
        }else equals = false;
        return equals;
    }
}