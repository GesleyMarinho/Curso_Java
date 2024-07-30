package PacoteSet.EX01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class logEntry {
    private String nome;
    private Date moment;

    public logEntry(Date moment, String nome) {
        this.moment = moment;
        this.nome = nome;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        logEntry logEntry = (logEntry) o;
        return Objects.equals(nome, logEntry.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public static Set<logEntry> dadosArquivo(String path) {

        Set<logEntry> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new logEntry(moment, userName));

                line = br.readLine();
            }
            for (logEntry entry : set) {
                System.out.println("User: " + entry.getNome() + "Data: " + entry.getMoment());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage() + "exception aqui ");
            return null;
        }

        return set;
    }
}
