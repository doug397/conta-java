package br.com.testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.exemplosteste.conta.ContaEspecial;
import br.com.exemplosteste.conta.ContaSimples;
import br.com.exemplosteste.pessoa.Pessoa;
import br.com.exemplosteste.pessoa.PessoaFisica;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Pessoa douglas= new PessoaFisica("Douglas", 21, new Date("11/11/2011") , "12345");
		
		//douglas.mostraDados();
		
		ContaSimples contasimples= new ContaSimples(12,douglas);
		
		
		contasimples.mostraConta();
		
		System.out.println();
		ContaEspecial contaEspecial= new ContaEspecial(1,douglas);
		contaEspecial.mostraConta();
		
		
		
		
		

		
		
	}

}
