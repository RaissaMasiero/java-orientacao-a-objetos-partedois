package model.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String usuario;
    private Date instante;

    public LogEntry(String usuario, Date instante) {
        this.usuario = usuario;
        this.instante = instante;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;

        return Objects.equals(usuario, logEntry.usuario);
    }

    @Override
    public int hashCode() {
        return usuario != null ? usuario.hashCode() : 0;
    }
}
