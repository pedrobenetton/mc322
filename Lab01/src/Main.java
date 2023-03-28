public class Main {

	public static void main(String[] args) {
		
		//Registrando um veículo:
		String placa = "EKZ-4378";
		String marca = "Ferrari";
		String modelo = "F50";
		Veiculo veiculo = new Veiculo(placa, marca, modelo);
		
		//Mostrando que, com os setters, podemos alterar os dados do veiculo:
		String nova_placa = "EKZ-4379";
		veiculo.setPlaca(nova_placa);
		
		//Printando os dados do veiculo usando os getters:
		System.out.println("Dados do veiculo:");
		System.out.println("Placa: " + veiculo.getPlaca());
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println(System.lineSeparator());
		
		
		//Fazemos as mesmas operacoes para o cliente:
		String nome_cliente = "Jorge";
		String cpf = "308.325.798-82";
		String data_nascimento_cliente = "17/09/1999";
		int idade_cliente = 23;
		String endereco_cliente = "Casa do Jorge";
		Cliente cliente = new Cliente(nome_cliente, cpf, data_nascimento_cliente, idade_cliente, endereco_cliente);
		cliente.setNome("Jorge da Silva");
		System.out.println("Dados do cliente:");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
		System.out.println("Idade: " + String.valueOf(cliente.getIdade()));
		System.out.println("Endereco: " + cliente.getEndereco());
		
		//alem disso, verificamos se o cpf eh verdadeiro:
		if (cliente.validarCPF(cliente.getCpf()) == true) {
			System.out.println("CPF verificado com sucesso!");
		} else {
			System.out.println("CPF invalido!");
		}
		
		//veja o que acontece se setamos um cpf falso:
		cliente.setCpf("308.325.798-00");
		if (cliente.validarCPF(cliente.getCpf()) == true) {
			System.out.println("CPF verificado com sucesso!");
		} else {
			System.out.println("CPF invalido!");
		}
		System.out.println(System.lineSeparator());
		
		
		
		//Fazemos o mesmo procedimento para a seguradora:
		String nome_seguradora = "Pedro Seguros";
		String email = "pedro@gmail.com";
		String telefone = "(19) 3256-8151";
		String endereco = "Rua Fulano de Tal";
		Seguradora seguradora = new Seguradora(nome_seguradora, email, telefone, endereco);
		seguradora.setNome("Pedro Seguros LTDA");
		
		System.out.println("Dados da seguradora:");
		System.out.println("Nome: " + seguradora.getNome());
		System.out.println("Email: " + seguradora.getEmail());
		System.out.println("Telefone: " + seguradora.getTelefone());
		System.out.println("Endereco: " + seguradora.getEndereco());
		System.out.println(System.lineSeparator());
		
		
		
		
		
		//Fazemos o mesmo procedimento para o sinistro:
		//Alem disso, um ID aleatorio de 5 digitos eh gerado:
		String data_sinistro_1 = "25/03/2023";
		String endereco_sinistro_1 = "Rua Acidente";
		Sinistro sinistro_1 = new Sinistro(data_sinistro_1, endereco_sinistro_1);		
		
		System.out.println("Dados do sinistro:");
		System.out.println("Data: " + sinistro_1.getData());
		System.out.println("Endereço: " + sinistro_1.getEndereco());
		System.out.println("O ID desse sinistro eh: " + String.valueOf(sinistro_1.getId()));
		
		
		//Podemos gerar um outro sinistro para obter um outro ID
		
		String data_sinistro_2 = "26/03/2023";
		String endereco_sinistro_2 = "Rua Acidente 2";
		Sinistro sinistro_2 = new Sinistro(data_sinistro_2, endereco_sinistro_2);		
		System.out.println("O ID do novo sinistro eh: " + String.valueOf(sinistro_2.getId()));
		
		
	}
}
