public class Cliente {
	private String nome;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private String endereco;
    
//Construtor
	public Cliente(String nome, String cpf, String dataNascimento, int idade, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
	}
	
//Getters e Setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean validarCPF (String cpf) {
		
		//remover caracteres que nao sao numeros:
		cpf = cpf.replaceAll("\\D+", "");
		
		//verificar se o CPF possui menos que 11 digitos:
		if (cpf.length()<11) {
      		return false;
      	}
		
		
		//verificar se pelo menos um digito eh diferente dos demais:
		boolean eh_igual = true;
		for (int i = 0; i < 10; i++) {
			if (cpf.substring(i, i+1) != cpf.substring(i+1, i+2)) {
	      		eh_igual = false;
	      	}
		}
		if (eh_igual) {
			return false;
		}
		
		//calculo dos digitos verificadores:
		//calculo do primeiro digito verificador:
		int num = 0;
		int multiplicador = 10;
		for (int i = 0; i < 9; i++) {
			num = num + Integer.valueOf(cpf.substring(i, i+1))*(multiplicador);
			multiplicador = multiplicador-1;
			}
		int dig1 = 0;
		int r = (num % 11);
        if ((r != 0) & (r != 1)) {
        	dig1 = 11 - r;
        	}
        
        
      //calculo do segundo digito verificador:
        num = 0;
        multiplicador = 10;
        for (int i = 1; i < 9; i++) {
			num = num + Integer.valueOf(cpf.substring(i, i+1))*(multiplicador);
			multiplicador = multiplicador-1;
			}
        num = num + multiplicador*dig1;
        r = (num % 11);
        int dig2 = 0;
        if ((r != 0) & (r != 1)) {
        	dig2 = 11 - r;
        	}
        
        //comparamos os digitos calculados com os digitos do CPF:
        if ((dig1 != Integer.valueOf(cpf.substring(9, 10)) ) || (dig2 != Integer.valueOf(cpf.substring(10, 11)))) {
        	
        	return false;
        	}
		
		//se todas as instancias foram satisfeitas, podemos retornar true:
		return true;	
	}

}
