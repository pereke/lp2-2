public class Aluno{
	String name, nummat;
	int age;
	
	public void imprimirDadosCadastrais (){
		System.out.println (" Nome: " +this.name);
		System.out.println (" Numero de Matricula: " +this.nummat);
		System.out.println (" Idade: " +this.age);
	}
	
	public static void main (String [] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		System.out.println (""); 
		
		a1.name = "Sid";
		a1.nummat = "8487329";
		a1.age = 17;
		
		a2.name = "Diego";
		a2.nummat = "3499234";
		a2.age = 17;
		
		a3.name = "Manfred";
		a3.nummat = "8423499";
		a3.age = 17;
		
		a4.name = "Scrat";
		a4.nummat = "493842";
		a4.age = 17;
		
		a1.imprimirDadosCadastrais(); 		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		a2.imprimirDadosCadastrais(); 
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		a3.imprimirDadosCadastrais(); 
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		a4.imprimirDadosCadastrais(); 
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		
		
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
		System.out.println (""); //Melhora a visualizacao do programa durante a execucao
	}
}
