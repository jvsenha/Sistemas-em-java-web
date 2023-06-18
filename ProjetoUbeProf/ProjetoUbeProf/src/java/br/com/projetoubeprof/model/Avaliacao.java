
package br.com.projetoubeprof.model;

public class Avaliacao {
     
    private Integer idAvaliacao;
    private Integer notaAvaliacao;
    private String comentarioAvaliacao;
    private String clienteAvaliacao;
    private Integer idProfessor;
    private Integer idCliente;
    private Double notaMedia;

    public Avaliacao() {
    }

    public Avaliacao(Integer idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Avaliacao(Integer idAvaliacao, Integer notaAvaliacao, String comentarioAvaliacao, String clienteAvaliacao, Integer idProfessor, Integer idCliente, Double notaMedia) {
        this.idAvaliacao = idAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
        this.comentarioAvaliacao = comentarioAvaliacao;
        this.clienteAvaliacao = clienteAvaliacao;
        this.idProfessor = idProfessor;
        this.idCliente = idCliente;
        this.notaMedia = notaMedia;
    }

    public Integer getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(Integer idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public Integer getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(Integer notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getComentarioAvaliacao() {
        return comentarioAvaliacao;
    }

    public void setComentarioAvaliacao(String comentarioAvaliacao) {
        this.comentarioAvaliacao = comentarioAvaliacao;
    }

    public String getClienteAvaliacao() {
        return clienteAvaliacao;
    }

    public void setClienteAvaliacao(String clienteAvaliacao) {
        this.clienteAvaliacao = clienteAvaliacao;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    
    
    
}
