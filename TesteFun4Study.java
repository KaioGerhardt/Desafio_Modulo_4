public class TesteFun4Study {
	public static void main(String[] args) {
		//declaração das variaveis
		int contadorCidade = 0;
		int contadorEstudante = 0;
		int resposta = 0;
		int respostaEst = 0;
		int opcaoAlterar = 0;
		int opcaoMenu = 0;
		
		//laco principal (laco cidade)
		do {
			//criação da cidade
			contadorEstudante = 0;
			contadorCidade++;
			System.out.println("==================== CIDADE " + contadorCidade + " ====================");
			Cidade cidade = new Cidade(Teclado.leInt("Digite o Código: "),
										Teclado.leString("Digite a descrição: "),
										Teclado.leString("Digite a UF: "));
			//exibindo os dados da cidade
			System.out.println();
			System.out.println("==================== DADOS DA CIDADE " + contadorCidade + " ====================");
			cidade.exibeDados();
			
			//laco secundario (laco estudante)
			do {
				contadorEstudante++;
				System.out.println();
				System.out.println("==================== ESTUDANTE " + contadorEstudante + " ====================");
				Estudante estudante = new Estudante(Teclado.leInt("Digite o seu Codigo: "),
						Teclado.leString("Digite seu nome: "), Teclado.leString("Digite sua Data de Nascimento: "),
						Teclado.leString("Digite seu e-mail: "), Teclado.leString("Digite uma senha: "), cidade);
				
				//exibindo dados do estudante
				System.out.println();
				System.out.println("==================== DADOS DO ESTUDANTE" + contadorEstudante + "====================");
				estudante.exbideDados();
				
				
				//laço de solicitação de alteração do estudante
				do {
					System.out.println();
					System.out.println("==================== ALTERAR DADOS ====================");
					System.out.println("Deseja alterar algo no estudante criado?\n1 - SIM\n0 - NÃO ");
					opcaoAlterar = Teclado.leInt("Digite a sua escolha: ");
					
					if(opcaoAlterar != 0 && opcaoAlterar != 1) {
						System.out.println("Resposta inválida, insira novamente!");
					}
				}while(opcaoAlterar != 0 && opcaoAlterar != 1);
				
				//menu de alterações (estudante)
				while(opcaoAlterar == 1) {
					System.out.println("************* MENU DE ALTERAÇÕES *************");
					System.out.println("1 - CÓDIGO");
					System.out.println("2 - NOME");
					System.out.println("3 - DATA DE NASCIMENTO");
					System.out.println("4 - EMAIL");
					System.out.println("5 - SENHA");
					opcaoMenu = Teclado.leInt("Digite a opção de alteração que deseja: ");
					
					switch(opcaoMenu) {
						case 1:
							int novoCodigo = Teclado.leInt("Digite o novo código do estudante: ");
							estudante.setCodigo(novoCodigo);
							System.out.println("Código alterado com sucesso!");
							break;
						
						case 2:
							String novoNome = Teclado.leString("Digite o novo nome do estudante: ");
							estudante.setNome(novoNome);
							System.out.println("Nome alterado com sucesso!");
							break;
						
						case 3:
							String novaData = Teclado.leString("Digite a nova data de nascimento do estudante: ");
							estudante.setDataNascimento(novaData);
							System.out.println("Data de nascimento alterada com sucesso!");
							break;
							
						case 4:
							String novoEmail = Teclado.leString("Digie o novo e-mail do estudnate: ");
							estudante.setEmail(novoEmail);
							System.out.println("E-mail alterado com sucesso!");
							break;
							
						case 5:
							estudante.alteraSenha(estudante);
							break;
						
						default:
							System.out.println("Opção inválida!");
					}
					
					//informações do estudante atualizadas
					System.out.println();
					System.out.println("=============== DADOS ATUALIZADOS ESTUDANTE - " + contadorEstudante + " ===============");
					estudante.exbideDados();
					do {
						System.out.println();
						System.out.println("Gostaria de alterar mais alguma coisa? (1-SIM / 0-NÃO)");
						opcaoAlterar = Teclado.leInt("Digite sua escolha: ");
						
						if(opcaoAlterar != 0 && opcaoAlterar !=1) {
							System.out.println("Resposta inválida, insira novamente!");
						}
						
					}while(opcaoAlterar != 0 && opcaoAlterar !=1);
				}
				
				//solicitação de novo estudante e validação da quantidade minima
				do{
					System.out.println();
					System.out.println("==================== CRIAR ESTUDANTE ====================");
					System.out.println("Deseja criar um novo estudante?\n1 - SIM\n0 - NÃO");
					respostaEst = Teclado.leInt("Digite a sua escolha: ");
					
					if (respostaEst == 0 && contadorEstudante < 4) {
						System.out.println();
						System.out.println("==================== !!! WARNING !!! ====================");
						System.out.println("Desculpe, mas você precisa criar ao menos 4 estudantes!");
						System.out.println("==================== !!! WARNING !!! ====================");
						respostaEst = 1;
					}else if (respostaEst !=0 && respostaEst !=1){
						System.out.println("Resposta inválida, insira novamente!");
					}
					
				}while(respostaEst!=0 && respostaEst!=1);
				
			}while(respostaEst != 0);
			
			
			
			//menu cidade
			System.out.println();
			System.out.println("==================== // ====================");
			System.out.println("Deseja criar uma nova cidade?\n1 - SIM\n0 - NÃO");
			resposta = Teclado.leInt("Digite a sua escolha: ");
		}while(resposta != 0);
		
		if (resposta == 0) {
			System.out.println();
			System.out.println("MUITO OBRIGADO POR EXECUTAR MEU PROGRAMA");
			System.out.println("***********by KAIO GERHARDT*************");
		}
	}
}
