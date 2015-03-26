public class Calculadora{
	int soma, sub, mult, n1, n2;
	float div;
	
	public void soma (){
		System.out.println (" A soma dos dois numeros e: " +this.soma);
	}

	public void sub (){
		System.out.println (" A subtracao dos dois numeros e: " +this.sub);
	}

	public void mult (){
		System.out.println (" A multiplicacao dos dois numeros e: " +this.mult);
	}
	
	public void div (){
		System.out.println (" A divisao dos dois numeros e: " +this.div);
	}
	
	public static void main(String [] args){
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();
		
		c1.n1 = 8;
		c1.n2 = 2;
		c1.soma = c1.n1 + c1.n2;
		c1.sub = c1.n1 - c1.n2;
		c1.mult = c1.n1 * c1.n2;
		c1.div = c1.n1 / c1.n2;
		
		c2.n1 = 16;
		c2.n2 = 4;
		c2.soma = c2.n1 + c2.n2;
		c2.sub = c2.n1 - c2.n2;
		c2.mult = c2.n1 * c2.n2;
		c2.div = c2.n1 / c2.n2;
		
		c3.n1 = 36;
		c3.n2 = 12;
		c3.soma = c3.n1 + c3.n2;
		c3.sub = c3.n1 - c3.n2;
		c3.mult = c3.n1 * c3.n2;
		c3.div = c3.n1 / c3.n2;
		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		c1.soma();
		c1.sub();
		c1.mult();
		c1.div();
		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		c2.soma();
		c2.sub();
		c2.mult();
		c2.div();
		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		c3.soma();
		c3.sub();
		c3.mult();
		c3.div();
	}
}
