/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marco.junior
 */
public class Ocr_Camera {
    
    private String id_lane;
    private String id_equipamento_space;
    private String ip;
    private String usuario_ftp;
    private String senha_ftp;
    private String diretorio_ftp;
    private String direcao;
    private String diretorio_armazena_imagem;
    private String url_armazena_imagem;
    private String id_tipo_camera;
    private String camera_porta;
    private String mac;

    public Ocr_Camera() {
    }

    public Ocr_Camera(String id_lane, String id_equipamento_space, String ip, String usuario_ftp, String senha_ftp, String diretorio_ftp, String direcao, String diretorio_armazena_imagem, String url_armazena_imagem, String id_tipo_camera, String camera_porta, String mac) {
        this.id_lane = id_lane;
        this.id_equipamento_space = id_equipamento_space;
        this.ip = ip;
        this.usuario_ftp = usuario_ftp;
        this.senha_ftp = senha_ftp;
        this.diretorio_ftp = diretorio_ftp;
        this.direcao = direcao;
        this.diretorio_armazena_imagem = diretorio_armazena_imagem;
        this.url_armazena_imagem = url_armazena_imagem;
        this.id_tipo_camera = id_tipo_camera;
        this.camera_porta = camera_porta;
        this.mac = mac;
    }

    public String getId_lane() {
        return id_lane;
    }

    public void setId_lane(String id_lane) {
        this.id_lane = id_lane;
    }

    public String getId_equipamento_space() {
        return id_equipamento_space;
    }

    public void setId_equipamento_space(String id_equipamento_space) {
        this.id_equipamento_space = id_equipamento_space;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUsuario_ftp() {
        return usuario_ftp;
    }

    public void setUsuario_ftp(String usuario_ftp) {
        this.usuario_ftp = usuario_ftp;
    }

    public String getSenha_ftp() {
        return senha_ftp;
    }

    public void setSenha_ftp(String senha_ftp) {
        this.senha_ftp = senha_ftp;
    }

    public String getDiretorio_ftp() {
        return diretorio_ftp;
    }

    public void setDiretorio_ftp(String diretorio_ftp) {
        this.diretorio_ftp = diretorio_ftp;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getDiretorio_armazena_imagem() {
        return diretorio_armazena_imagem;
    }

    public void setDiretorio_armazena_imagem(String diretorio_armazena_imagem) {
        this.diretorio_armazena_imagem = diretorio_armazena_imagem;
    }

    public String getUrl_armazena_imagem() {
        return url_armazena_imagem;
    }

    public void setUrl_armazena_imagem(String url_armazena_imagem) {
        this.url_armazena_imagem = url_armazena_imagem;
    }

    public String getId_tipo_camera() {
        return id_tipo_camera;
    }

    public void setId_tipo_camera(String id_tipo_camera) {
        this.id_tipo_camera = id_tipo_camera;
    }

    public String getCamera_porta() {
        return camera_porta;
    }

    public void setCamera_porta(String camera_porta) {
        this.camera_porta = camera_porta;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    
}
