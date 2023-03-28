import java.util.Random;

public class Sinistro {
	private int id;
    private String data;
    private String endereco;
    
    
//Constructor
  	public Sinistro(String data, String endereco) {
  		int m = (int) Math.pow(10, 4);
  		this.id = m + new Random().nextInt(9 * m);
  		this.data = data;
  		this.endereco = endereco;
  	}
  	
  	
//Getters e Setters
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
