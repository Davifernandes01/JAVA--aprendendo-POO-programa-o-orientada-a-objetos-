

public class TesteTributos {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222,333);
		
		cc.deposita(100.0);
		
		SeguroDeVida Seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(Seguro);
		
		System.out.println(calc.getTotalImposto());

	}

	
}
