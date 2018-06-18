package agendaufrnfw.ufrn.imd.pds.model;

import java.util.List;

import agendaufrnfw.ufrn.imd.pds.dto.ClassDTO;

public class Professor extends User {

	private String nome;
	private String cpf;
	private String cargo;
	private String siape;
	private String unidade;
	private long data_admissao;
	private int id_docente;

	private List<ClassDTO> classes;

	public Professor() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public long getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(long data_admissao) {
		this.data_admissao = data_admissao;
	}

	public int getId_docente() {
		return id_docente;
	}

	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}

	public List<ClassDTO> getClasses() {
		return classes;
	}

	public void setClasses(List<ClassDTO> classes) {
		this.classes = classes;
	}
}
