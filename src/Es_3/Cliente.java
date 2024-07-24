package Es_3;

import java.time.LocalDateTime;

public class Cliente {
    private long codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDateTime dataIscrizione;

    public Cliente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.codiceCliente = Math.round(Math.random());
        this.dataIscrizione = LocalDateTime.now();

    }

    public long getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataIscrizione() {
        return dataIscrizione;
    }
}
