/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Ocr_Camera;
/**
 *
 * @author marco.junior
 */
public class cameraData {
    ConexaoBd conn;
    
    public boolean inserir(Ocr_Camera ocr) throws Exception
    {
        conn = new ConexaoBd();
        String sql = "insert into ocr_cameras values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql); // executa comandos que necessitam de valores de entrada;
        ps.setString(1, ocr.getId_lane());
        ps.setString(2, ocr.getId_equipamento_space());
        ps.setString(3, ocr.getIp());
        ps.setString(4, ocr.getUsuario_ftp());
        ps.setString(5, ocr.getSenha_ftp());
        ps.setString(6, ocr.getDiretorio_ftp());
        ps.setString(7, ocr.getDirecao());
        ps.setString(8, ocr.getDiretorio_armazena_imagem());
        ps.setString(9 , ocr.getUrl_armazena_imagem());
        ps.setString(10, ocr.getId_tipo_camera());
        ps.setString(11, ocr.getCamera_porta());
        ps.setString(12, ocr.getMac());
                if(ps.executeUpdate() > 0)
        {
            return true;
        }else
        return false;
    }

   public ArrayList<Ocr_Camera> finAll()throws Exception{ // utilizado o metodo findAll() do array
        
        ArrayList<Ocr_Camera> lista = new ArrayList<>(); // Criado um ArrayList de ConfiguracaoBasica com o nome lista
        ConexaoBd con1 = new ConexaoBd();
        con1.getConexao();
        ResultSet rs = null; // Agrupa os Resultados da pesquisa
        Statement stm = null;// Variavel para utilizar comandos básicos
        
        try{
            stm = con1.conexao.createStatement(); // Cria uma instancia do Statement
            rs = stm.executeQuery("SELECT * FROM OCR_CAMERAS order by ID_LANE "); // o rs recebe os resultado da consulta do Statement com o metodo executeQuery;
            
            while(rs.next()) // foi criado um while para procurar todo os registros
            {
            Ocr_Camera ocr_camera = new Ocr_Camera(); // foi criado um objeto configuraçãoBean
            ocr_camera.setId_lane(rs.getString("ID_lane"));
            ocr_camera.setId_equipamento_space(rs.getString("ID_EQUIPAMENTO_SPACE"));
            ocr_camera.setIp(rs.getString("IP"));
            ocr_camera.setUsuario_ftp(rs.getString("USUARIO_FTP"));
            ocr_camera.setSenha_ftp(rs.getString("SENHA_FTP"));
            ocr_camera.setDiretorio_ftp(rs.getString("DIRETORIO_FTP"));
            ocr_camera.setDirecao(rs.getString("DIRECAO"));
            ocr_camera.setDiretorio_armazena_imagem(rs.getString("DIRETORIO_ARMAZENA_IMAGEM"));       
            ocr_camera.setUrl_armazena_imagem(rs.getString("URL_ARMAZENA_IMAGEM"));      
            ocr_camera.setId_tipo_camera(rs.getString("ID_TIPO_CAMERA"));
            ocr_camera.setCamera_porta(rs.getString("CAMERA_PORTA"));
            ocr_camera.setMac(rs.getString("MAC"));// setado no Day_chango o valor pesquisado em rs.getString("Nome da coluna"); 
            lista.add(ocr_camera); // adicionado toda a pesquisa na lista
            }
            return lista;
            
        }catch(SQLException ex)
        {
            System.out.println("Erro : " +ex.getMessage());
        }
      return null;
    }
}
