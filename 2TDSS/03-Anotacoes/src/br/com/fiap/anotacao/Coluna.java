package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Código Java (.java) --Compilar--> Bytecode (.class) --Interpretar JVM--> Executar
//Retention -> define até quando a anotação será mantida
@Retention(RetentionPolicy.RUNTIME) //Execução
//Target -> define onde a anotação pode ser utilizada
@Target({ElementType.FIELD, ElementType.METHOD}) //Atributos
public @interface Coluna {
	
	String nome(); //Parâmetro da anotação
	boolean chave() default false; //valor padrão, o parâmetro não é obrigatório
	int tamanho() default 0;
}