
public class Cidade {
	
	//Atributos
	private int Codigo;
	private String Descricao;
	private String UF;
	private int qtdEstudante;
	
	//Construtor
	public Cidade(int codigo, String desc, String uf) {
		this.Codigo = codigo;
		this.Descricao = desc;
		this.UF = uf;
	}
	
	//getters
	public int getCodigo() {
		return Codigo;
	}
	
	public String getDescricao() {
		return Descricao;
	}
	
	public String getUF() {
		return UF;
	}
	
	//setters
	public void setDescricao(String desc) {
		this.Descricao = desc;
	}
	
	public void setUF(String uf) {
		this.UF = uf;
	}
	
	//Adiciona Estudante
	public void adicionaNovoEstudante() {
		this.qtdEstudante += 1;
	}
		
	//exibe dados
	public void exibeDados() {
		System.out.println("Código: " + Codigo);
		System.out.println("Descrição: " + Descricao);
		System.out.println("UF: " + UF);
		System.out.println("Quantidade de Estudantes: " + qtdEstudante);
	}
}
