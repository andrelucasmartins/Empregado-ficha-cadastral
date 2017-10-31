public class Empregado {

    private String nome;
    private String cpf;
    private String cargo;
    private double salarioBruto;
    private boolean valeRefeicao;
    private boolean planoSaude;
    private int dependente;
//Construtor 01
// tipo: ex" String" + parametro: "nome"

    public Empregado(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }
//Construtor 02
// tipo: ex" String" + parametro: "nome"

    public Empregado(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salarioBruto = salario;
    }
// pega valor

    public int getDependente() {
        return dependente;
    }
// seta valor

    public void setDependente(int dependente) {
        this.dependente = dependente;
    }

    public double getSalario() {
        return this.salarioBruto;
    }

    public boolean setSalario(double s) {
        if (s > 0) {
            this.salarioBruto = s;
            return true;
        } else {
            return false;
        }
    }

    public boolean getValeRefeicao() {
        return this.valeRefeicao;
    }

    public void setValeRefeicao(boolean opcao) {
        this.valeRefeicao = opcao;
    }

    public boolean getPlanoSaude() {
        return this.planoSaude;
    }

    public void setPlanoSaude(boolean opcao) {
        this.planoSaude = opcao;
    }


    public void fichaCadastral() {
        System.out.println("*** Cadastro de Empregado ***");
        System.out.println("CPF......:" + this.cpf);
        System.out.println("Nome......:" + this.nome);
        System.out.println("Cargo......:" + this.cargo);
        System.out.println("Plano Saúde....:" + this.planoSaude);
        System.out.println("Vale Refeição....:" + this.valeRefeicao);
        System.out.printf("Salario Bruto.....: %.2f %n", this.salarioBruto);
        System.out.printf("Salario Liquido:...: %.2f %n", calcLiquido());
        System.out.printf("Alíquota de imposto à pagar...: %.2f %n", aliquota());
        System.out.println("Dependente...: "+ getDependente()+"\n");
    }

    private double calcLiquido() {
        double salLiquido = this.salarioBruto;
        if (this.planoSaude) {
            salLiquido = salLiquido - salLiquido * 0.01;
        }
        if (this.valeRefeicao) {
            salLiquido = salLiquido - salLiquido * 0.01;
        }
        //conta o numero de depentendes
        if (getDependente() > 0){
        	salLiquido = salLiquido + (getDependente() * 50);
        }
  
        return salLiquido;
    }
    
    private double aliquota(){
        double aliquotaSal = 0;
	   if(this.salarioBruto > 0.00 || this.salarioBruto <= 5000.00){
	      aliquotaSal = 0 * this.salarioBruto;
	   }
	  
	   if(this.salarioBruto > 5000.00 && this.salarioBruto <= 10000.00){
	      aliquotaSal = (this.salarioBruto*3)/100;
	   }
	  
	   if(this.salarioBruto > 10000.00){
	      aliquotaSal = (this.salarioBruto * 7)/100;
	   }
      
       return aliquotaSal;
    }
}