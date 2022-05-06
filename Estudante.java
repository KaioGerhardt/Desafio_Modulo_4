
public class Estudante {
	
	//Atributos
	private int Codigo;
	private String Nome;
	private String dataNascimento;
	private String Email;
	private String Senha;
	private Cidade Cidade; 
	
	//Construtor
	public Estudante(int codigo, String nome, String datanascimento, String email, String senha, Cidade cidade) {
		this.Codigo = codigo;
		this.Nome = nome;
		this.dataNascimento = datanascimento;
		this.Email = email;
		this.Senha = senha;
		this.Cidade = cidade;
		
		//metodo adionaNovoEstudante da classe cidade
		Cidade.adicionaNovoEstudante();
		
	}
	
	//getters e setters
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String datanascimento) {
		this.dataNascimento = datanascimento;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		this.Senha = senha;
	}
	
	public Cidade getCidade() {
		return Cidade;
	}
	public void setCidade(Cidade cidade) {
		this.Cidade = cidade;
	}
	
	//declara��o de variaveis para o metodo
	String senhaAntiga, novaSenha, confirmaSenha;
	//metodo para alterar a senha
	public void alteraSenha(Estudante estudante) {
		while(true) {
			senhaAntiga = Teclado.leString("Digite a senha antiga: ");
			
			if ((estudante.getSenha()).equals(senhaAntiga)) {
				novaSenha = Teclado.leString("Digite uma nova Senha: ");
				confirmaSenha = Teclado.leString("Digite novamente: ");
	
				if ((novaSenha).equals(confirmaSenha)) {
					estudante.setSenha(novaSenha);
					System.out.println("*** Senha alterada com sucesso! ***");
					break;
				} 
				else {
					System.out.println("Não foi possivel alterar sua senha!\nAs senhas digitadas não conferem!");
				}
			}
			
			else {
				System.out.println("Não foi possivel alterar sua senha, a senha digitada não é igual a cadastrada!");
			}
		}
	}
	
	//exibe dados
	public void exbideDados() {
		System.out.println("Código: " + Codigo);
		System.out.println("Nome: " + Nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Email: " + Email);
		System.out.println("Senha: " + Senha);
		System.out.println("Cidade: " + Cidade.getDescricao());
	}
	
}
