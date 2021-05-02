package com.gohc.storeprocedureswitch.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="CNJC_MX_MAE_REPO_DOCUMENTAL")
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DOCUMENTO_PK")
    private Long id;
    @Column(name = "ID_JUICIO_FK")
    private Integer idJuicio;
    @Column(name = "ID_ETAPA_FK")
    private Integer idEtapa;

    @Column(name = "COD_TIPO_ARCHIVO")
    private String tipoArchivo;
    @Column(name = "NOM_ARCHIVO")
    private String nombreArchivo;
    @Column(name = "FCH_FECHA_CARGA")
    private Date fechaCarga;
    @Column(name = "ID_USR_CARGA")
    private String usuarioCarga;
    @Column(name = "TXT_COMENTARIO")
    private String comentario;
    @Lob
    @Column(name = "BLB_ARCHIVO",columnDefinition="BLOB")
    private byte[] documento;

    public Document(){
    }


    //@GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdJuicio() {
        return idJuicio;
    }
    public void setIdJuicio(Integer idJuicio) {
        this.idJuicio = idJuicio;
    }

    public Integer getIdEtapa() {
        return idEtapa;
    }
    public void setIdEtapa(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }
    public String getTipoArchivo() {
        return tipoArchivo;
    }
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public Date getFechaCarga() {
        return fechaCarga;
    }
    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
    public String getUsuarioCarga() {
        return usuarioCarga;
    }
    public void setUsuarioCarga(String usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public byte[] getDocumento() {
        return documento;
    }
  public void setDocumento(byte[] documento) {
        this.documento = documento;
    }
}
