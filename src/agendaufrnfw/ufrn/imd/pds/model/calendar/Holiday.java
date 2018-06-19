package agendaufrnfw.ufrn.imd.pds.model.calendar;

import agendaufrnfw.ufrn.imd.pds.util.DateUtil;

public class Holiday extends Commitment {
	
	private long data_feriado;
	private String descricao;

	public Holiday() {
		super();
	}

	public long getData_feriado() {
		return data_feriado;
	}

	public void setData_feriado(long data_feriado) {
		this.data_feriado = data_feriado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	  

    @Override
    public String toString() {
        String str = String.format("%s \n Data: %s \n", descricao, DateUtil.format(data_feriado));
        return str;
    }
}
