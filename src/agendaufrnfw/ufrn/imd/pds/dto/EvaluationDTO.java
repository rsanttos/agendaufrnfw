package agendaufrnfw.ufrn.imd.pds.dto;

/**
 * Created by f202359 on 13/04/2018.
 */

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.util.DateUtil;
import agendaufrnfw.ufrn.imd.pds.dto.DTO;

/**
 * Created by f202359 on 13/04/2018.
 */
public class EvaluationDTO extends DTO {

    private int id_avaliacao;
    private String nomeComponente;
    private long data;
    private String hora;
    private String descricao;

    public EvaluationDTO() {
        super();
    }

    public String getNomeComponente() {
        return nomeComponente;
    }

    public void setNomeComponente(String nomeComponente) {
        this.nomeComponente = nomeComponente;
    }

    public int getId_avaliacao() {
        return id_avaliacao;
    }

    public void setId_avaliacao(int id_avaliacao) {
        this.id_avaliacao = id_avaliacao;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    @Override
    public EvaluationDTO toObject(String json) {
        Gson gson = new Gson();

        return gson.fromJson(trataJson(json), EvaluationDTO.class);
    }

    @Override
    public EvaluationDTO[] toArrayObject(String json) {
        Gson gson = new Gson();
        //json = trataJson(json);
        return gson.fromJson(json, EvaluationDTO[].class);
    }

    @Override
    public String toString(){
        String str = nomeComponente + "\n";
        str += descricao + "\n";
        str += "Dia " + DateUtil.format(data) + "\n";
        return str;
    }
}