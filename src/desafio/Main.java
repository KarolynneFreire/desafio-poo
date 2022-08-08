package desafio;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
	
	public static void main (String[]arg) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso.js");
		curso1.setDescricao("curso js");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso.java");
		curso2.setDescricao("curso java");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria.js");
		mentoria1.setDescricao("mentoria js");
		mentoria1.setDate(LocalDate.now());
		
		/*System.out.print(curso1);
		System.out.print(curso2);
		System.out.print(mentoria1);*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Java");
		bootcamp.setDescricao("curso Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev devKarol = new Dev();
		devKarol.setNome("Karol");
		devKarol.inscreveBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de Karol" + devKarol.getConteudosInscritos());
		devKarol.progredir();
		System.out.println("----");
		System.out.println("Conteudos Inscritos de Karol" + devKarol.getConteudosInscritos());
		System.out.println("Conteudos Concluidos de Karol" + devKarol.getConteudosConcluidos());
		System.out.println("----");
		System.out.println("XP" + devKarol.calcularTotalXp());

			
		
		
		
	}

}
