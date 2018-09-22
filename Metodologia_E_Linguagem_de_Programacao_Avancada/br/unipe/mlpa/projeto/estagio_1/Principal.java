package br.unipe.mlpa.projeto.estagio_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.unipe.mlpa.exercicioExcecoes.Exceptions.AgenciaInexistente;

public class Principal {
	
	// Criando e instanciando uma variável de entrada de dados do tipo Scanner.
	static Scanner teclado = new Scanner(System.in);
	
	// Criando as instancias do sistema e atribuindo o valor "null" a elas.
	static Agencia agencia = null;
	static Pessoa pessoa = null;
	static PessoaFisica pessoaFisica = null;
	static PessoaJuridica pessoaJuridica = null;
	static Endereco endereco = null;
	static Movimento movimento = null;
	static Conta conta = null;
	
	public static void main(String[] args) throws ParseException {
		
		/* criando e inicializando a variável de condição do menu
		 * variável de nome "opcaoMenu" e tipo inteiro
		 * atribuindo o valor zero (0) a variável "opcaoMenu".
		 */
		int opcaoMenu = 0;
		
		/* Criando um laço de repetição (Do..While)
		 * O loop só será quebrado quando o valor inteiro 4 for informado
		 */
		do {
			menuGerenciarContas();
			opcaoMenu = teclado.nextInt();
			
			switch (opcaoMenu) {
			case 1:
				cadastrarConta();
				break;
			case 2:
				listarContasDeUmaAgencia();
				break;
			case 3:
				acessarUmaConta();
				break;
			case 4:
				System.out.println("Obrigado por utilizar o Unipê Bank!");
				System.out.println("Volte Sempre!");
				break;
			default: 
				System.out.println("Opção Inválida. Tente Novamente!");
				break;
			}
			
		} while (opcaoMenu == 4);
	}
	
	private static void cadastrarConta() throws ParseException {
		
		conta = new Conta();
		System.out.println("------------------------------------------------");
		System.out.println("-----------------Cadastrar Conta----------------");
		System.out.println(" Cadastrar Dados do Cliente                     ");
		System.out.println("Digite:\n(1) Para pessoa física ou \n"
				+ "(2) Para pessoa Jurídica");
		System.out.println("------------------------------------------------");
		int opcaoPessoa = teclado.nextInt();
		
		// atribui a Pessoa que retorna do método cadastrarPessoa a variável pessoa.
		pessoa = cadastrarPessoa(opcaoPessoa);
		
		// encapsula a pessoa na conta.
		conta.setPessoa(pessoa);
		
		// informar numero da conta
		conta.setNumeroConta(agencia.numeroDaContaNaAgencia());
		
		// ativando a conta
		conta.setSituacao(1);
		
		// informando senha para conta
		System.out.println("Senha: ");
		conta.setSenha(teclado.next());
		
		// data de abertura
		System.out.println("Data de Abertura: (OBS.: Formato: dd/MM/yyyy)");
		conta.setDataAbertura(conversorDeDatas(teclado.next()));
		
		// date de fechamento
		//System.out.println("Data de Fechamento: (OBS.: Formato: dd/MM/yyyy)");
		//conta.setDataFechamento(conversorDeDatas(teclado.next()));
		
		
		// numero da Agencia
		System.out.println("Número da Agencia:");
		cadastrarAgencia(teclado.nextInt(), conta);
		
		System.out.println("------------------------------------------------");
		
	}

	private static Pessoa cadastrarPessoa(int opcaoPessoa) throws ParseException {
		
		if (opcaoPessoa == 1) {
			pessoa = cadastrarPessoaFisica();
		} else if (opcaoPessoa == 2) {
			pessoa = cadastrarPessoaJuridica();
		} else {
			cadastrarConta();
		}
		
		return pessoa;
	}

	private static PessoaJuridica cadastrarPessoaJuridica() {
		
		pessoaJuridica = new PessoaJuridica();
		
		System.out.println("------------------------------------------------");
		System.out.println("Informe o nome do Cliente: ");
		pessoaJuridica.setNome(teclado.next());
		System.out.println("Informe o CNJP: ");
		pessoaJuridica.setCnpj(teclado.nextLong());
		System.out.println("Informe a Renda da Empresa: ");
		pessoaJuridica.setRendaPessoa(teclado.nextFloat());
		
		pessoaJuridica.setSituacaoPessoa(1);
		
		pessoaJuridica.setEndereco(cadastrarEndereco());
		
		return pessoaJuridica;
	}

	@SuppressWarnings("unused")
	private static PessoaFisica cadastrarPessoaFisica() {
		
		pessoaFisica = new PessoaFisica();
		
		System.out.println("------------------------------------------------");
		System.out.println("Informe o nome do Cliente: ");
		pessoaFisica.setNome(teclado.next());
		System.out.println("Informe o CPF: ");
		pessoaFisica.setCpf(teclado.nextLong());
		System.out.println("Informe o RG: ");
		pessoaFisica.setRg(teclado.nextLong());
		System.out.println("Informe a Renda da Empresa: ");
		pessoaFisica.setRendaPessoa(teclado.nextFloat());
		
		pessoaFisica.setSituacaoPessoa(1);
		
		pessoaFisica.setEndereco(cadastrarEndereco());
		
		return pessoaFisica;
	}

	private static void cadastrarAgencia(int numeroDeAgencia, Conta conta) {
		if (agencia == null) {
			agencia = new Agencia();
			agencia.setNumero(numeroDeAgencia);
			agencia.setEndereco(cadastrarEndereco());
			agencia.cadastrarConta(conta);
		} else if (agencia.getNumero() == numeroDeAgencia) {
			agencia.cadastrarConta(conta);
		}
	}
	
	private static Endereco cadastrarEndereco() {
		endereco = new Endereco();
		
		System.out.println("------------------------------------------------");
		System.out.println("ENDEREÇO");
		System.out.println("------------------------------------------------");
		System.out.println("Logradouro: ");
		endereco.setRua(teclado.next());
		System.out.println("Número: ");
		endereco.setNumero(teclado.nextInt());
		System.out.println("Bairro: ");
		endereco.setBairro(teclado.next());
		System.out.println("Cidade: ");
		endereco.setCidade(teclado.next());
		System.out.println("CEP: ");
		endereco.setCep(teclado.nextLong());
		
		System.out.println("------------------------------------------------");
		
		return endereco;
	}
	
	private static List<Conta> listarContasDeUmaAgencia() {
		if (agencia == null)
			
		return agencia.getContas();	
	}

	public static void menuGerenciarContas() {
		
		System.out.println("------------------------------------------------");
		System.out.println("|           Gerenciamento de Contas            |");
		System.out.println("|  1 - Cadastrar Conta                         |");
		System.out.println("|  2 - Listar Contas                           |");
		System.out.println("|  3 - Acessar uma Conta                       |");
		System.out.println("|  4 - Sair                                    |");
		System.out.println("|                                              |");
		System.out.println("|  Escolha uma das opções acima:               |");
		System.out.println("------------------------------------------------");
		
	}
	
	public static void acessarUmaConta() {
		System.out.println("------------------------------------------------");
		System.out.println("Digite o número da CONTA:");
		int numero = teclado.nextInt();
		Conta conta = agencia.acessarConta(numero);
		
		if (conta != null) {
			movimentacaoConta();
		} else {
			System.out.println("Não existe a conta de número: " + numero);
			System.out.println("Tente novamente!");
			acessarUmaConta();
		}
	}
	
	private static void movimentacaoConta() {
		menuMovimentarConta();
		
	}

	private static void menuMovimentarConta() {
		
		
	}

	public static Date conversorDeDatas(String data) throws ParseException {
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formatar.parse(data);
		
		return dataFormatada;
	}
}
