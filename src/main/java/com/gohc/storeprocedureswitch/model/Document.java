package com.gohc.storeprocedureswitch.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CNJC_MX_MAE_REPO_DOCUMENTAL")
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer idJuicio;
    private Integer idEtapa;

    public Document(){
    }
   /* private String tipoArchivo;
    private String nombreArchivo;
    private Date fechaCarga;
    private String usuarioCarga;
    private String comentario;
    private byte[] documento;
*/

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
/*
    @Column(name = "COD_TIPO_ARCHIVO")
    public String getTipoArchivo() {
        return tipoArchivo;
    }
    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    @Column(name = "NOM_ARCHIVO")
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Column(name = "FCH_FECHA_CARGA")
    public Date getFechaCarga() {
        return fechaCarga;
    }
    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    @Column(name = "ID_USR_CARGA")
    public String getUsuarioCarga() {
        return usuarioCarga;
    }
    public void setUsuarioCarga(String usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    @Column(name = "TXT_COMENTARIO")
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Lob
    @Column(name = "BLB_ARCHIVO",columnDefinition="BLOB")
    public byte[] getDocumento() {
        return documento;
    }
  public void setDocumento(byte[] documento) {
        this.documento = documento;
    }*/
}
