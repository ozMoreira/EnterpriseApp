package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {

	public static void main(String[] args) {
		
		//Criar um calendar com a data atual
		Calendar hoje = Calendar.getInstance();
		
		//Criar um calendar com a data da apresentação da challenge 22/02/2022 21:00
											//ano, mes, dia, hora, minutos
		Calendar abertura = new GregorianCalendar(2022, Calendar.FEBRUARY, 22, 21, 0);
		
		//Criar o formatador de Date
											//dia/mes/ano horas:minutos:segundos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir as datas
		System.out.println(sdf.format(hoje.getTime()));
		System.out.println(sdf.format(abertura.getTime()));
		
		//Datas API Java 8
		//Criar uma data atual
		LocalDate dataHoje = LocalDate.now();
		
		//Criar a data de apresentação para a banca 25/05/2022
		LocalDate dataApresentacao = LocalDate.of(2022, Month.MAY, 25);
		
		//Criar a hora atual
		LocalTime horaAtual = LocalTime.now();
		
		//Criar a hora do começo do intervalo 21:00
		LocalTime horaIntervalo = LocalTime.of(21, 0);
		
		//Criar a data e hora atuais
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		//Criar a data de colação de grau 27/03/2023 18:00
		LocalDateTime dataColacao = LocalDateTime.of(2023, 3, 27, 18, 0);
		
		//Exibir as datas
		//Formatador de data
		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataHoje.format(formataData));
		System.out.println(dataApresentacao.format(formataData));
		
		DateTimeFormatter formataHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(horaAtual.format(formataHora));
		System.out.println(horaIntervalo.format(formataHora));
		
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(dataHoraAtual.format(formataDataHora));
		System.out.println(dataColacao.format(formataDataHora));
		
	}//main
}//class
