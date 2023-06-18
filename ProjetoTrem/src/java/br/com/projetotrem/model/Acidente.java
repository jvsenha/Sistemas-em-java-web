package br.com.projetotrem.model;

public class Acidente {
    private int idAcd;
    private Trem idTrem;
    private Empresa idEmp;
    private Maquinista idMaq;
    private String emailAcd;
    private String senhaAcd;
    private String msgAcd;
    private String localAcd;

    public Acidente() {
    }

    public Acidente(int idAcd) {
        this.idAcd = idAcd;
    }

    public Acidente(int idAcd, Trem idTrem, Empresa idEmp, Maquinista idMaq, String emailAcd, String senhaAcd, String msgAcd, String localAcd) {
        this.idAcd = idAcd;
        this.idTrem = idTrem;
        this.idEmp = idEmp;
        this.idMaq = idMaq;
        this.emailAcd = emailAcd;
        this.senhaAcd = senhaAcd;
        this.msgAcd = msgAcd;
        this.localAcd = localAcd;
    }

    public int getIdAcd() {
        return idAcd;
    }

    public void setIdAcd(int idAcd) {
        this.idAcd = idAcd;
    }

    public Trem getIdTrem() {
        return idTrem;
    }

    public void setIdTrem(Trem idTrem) {
        this.idTrem = idTrem;
    }

    public Empresa getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Empresa idEmp) {
        this.idEmp = idEmp;
    }

    public Maquinista getIdMaq() {
        return idMaq;
    }

    public void setIdMaq(Maquinista idMaq) {
        this.idMaq = idMaq;
    }

    public String getEmailAcd() {
        return emailAcd;
    }

    public void setEmailAcd(String emailAcd) {
        this.emailAcd = emailAcd;
    }

    public String getSenhaAcd() {
        return senhaAcd;
    }

    public void setSenhaAcd(String senhaAcd) {
        this.senhaAcd = senhaAcd;
    }

    public String getMsgAcd() {
        return msgAcd;
    }

    public void setMsgAcd(String msgAcd) {
        this.msgAcd = msgAcd;
    }

    public String getLocalAcd() {
        return localAcd;
    }

    public void setLocalAcd(String localAcd) {
        this.localAcd = localAcd;
    }
    
}
