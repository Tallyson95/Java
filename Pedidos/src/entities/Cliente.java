package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataDeNascimento;

    public Cliente(){
    }
    public Cliente(String nome, String email, String dataDeNascimento){
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = parseData(dataDeNascimento);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataDeNascimento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataDeNascimento);
    }

    private Date parseData(String dataStr) {
        try {
            // Espera formato ddMMyyyy (ex: 27031996)
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            return sdf.parse(dataStr);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Data inválida: " + dataStr);
        }
    }
}
