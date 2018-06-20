package agendaufrnfw.ufrn.imd.pds.dto;

import java.util.List;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Evaluation;
import agendaufrnfw.ufrn.imd.pds.model.calendar.Task;

public class ClassDTO extends DTO {
	private int id_turma;
	private String local;
	private String descricao_horario;
	private String nome_componente;
	private String codigo_componente;
	private int id_situacao_solicitacao;

	private List<Task> tasks;
	private List<Evaluation> evaluations;

	public ClassDTO() {
		super();
	}

	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao_horario() {
		return descricao_horario;
	}

	public void setDescricao_horario(String descricao_horario) {
		this.descricao_horario = descricao_horario;
	}

	public String getNome_componente() {
		return nome_componente;
	}

	public void setNome_componente(String nome_componente) {
		this.nome_componente = nome_componente;
	}

	public String getCodigo_componente() {
		return codigo_componente;
	}

	public void setCodigo_componente(String codigo_componente) {
		this.codigo_componente = codigo_componente;
	}

	public int getId_situacao_solicitacao() {
		return id_situacao_solicitacao;
	}

	public void setId_situacao_solicitacao(int id_situacao_solicitacao) {
		this.id_situacao_solicitacao = id_situacao_solicitacao;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	@Override
	public ClassDTO toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), ClassDTO.class);
	}

	@Override
	public ClassDTO[] toArrayObject(String json) {
		Gson gson = new Gson();
		// json = trataJson(json);
		return gson.fromJson(json, ClassDTO[].class);
	}
}