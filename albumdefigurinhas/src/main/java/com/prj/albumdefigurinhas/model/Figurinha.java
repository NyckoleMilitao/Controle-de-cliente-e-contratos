package com.prj.albumdefigurinhas.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name = "Figurinha")
@Entity
public class Figurinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFigurinha;

    private String descricao;

    private String tag;

    private byte[] foto;

    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "id")
    private Album album;

    public Figurinha() {
    }

    public Figurinha(Long id, String nomeFigurinha, String descricao, String tag,
            byte[] foto, Album album) {
        this.id = id;
        this.nomeFigurinha = nomeFigurinha;

        this.descricao = descricao;
        this.tag = tag;
        this.foto = foto;
    }

    public Figurinha(String nomeFigurinha, String descricao, String tag, byte[] foto, Album album) {
        this.nomeFigurinha = nomeFigurinha;
        this.descricao = descricao;
        this.tag = tag;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFigurinha() {
        return nomeFigurinha;
    }

    public void setNomeFigurinha(String nomeFigurinha) {
        this.nomeFigurinha = nomeFigurinha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
