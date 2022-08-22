
public abstract class Conta {

    protected double saldo;
    private  int agencia;
    private int numero;
    private Cliente titular ;
    private static int total;

    
   
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("total de contas  " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
       // System.out.println("ok, estou criando uma conta " + this.numero);
    }



    
    //metado para depositar dinheiro
    public abstract void deposita(double valor);
        
    
    
    //metado para sacar dinheiro
    public boolean saca(double valor){

        //vendo se tem saldo suficiente
        if(this.saldo >= valor){
            this.saldo -= valor;
                return true;
        }

            return false;
        
        
    }

    //metado para trasferir dinheiro
   public boolean transfere(double valor, Conta destino){

        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }

        return false;        
   }

   // metados para mostrar e modificar o saldo, agencia , numero e titular
        public double getSaldo(){
          return this.saldo;
        }

                public int getNumero(){
                      return this.numero;
                }

                public void setNumero(int numero){
                    if(numero <=0){
                        System.out.println("não pode valor igual ou menor que zero");
                    }
                this.numero = numero;
              }
                

        public int getAgencia() {
            return this.agencia;
        }

        public void setAgencia(int agencia) {

            if(agencia <= 0){
                System.out.println("Não pode valor igual ou menor que zero");

                return;
            }
            this.agencia = agencia;
        }

              public void setTitular(Cliente titular) {
                  this.titular = titular;
              }

              public Cliente getTitular() {
                  return titular;
              }

    public static int getTotal() {
        return Conta.total;
    }
}

