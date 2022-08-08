package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate date;
	
	
	
	
	public Mentoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", date=" + date + "]";
	}


	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	

}
