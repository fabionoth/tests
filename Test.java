/*
* 
* Questão de Concurso interessante 
* Verificar este código, e identificar a saída: 
* Saída correta é: Java
* Explicação: 
	** Caso estivesse print(s.concat(" SE 7")) então a saída seria concatenada. 
	** Ou estive s = s.concat(" SE 7"))
*/


class Test{
	public static void main(String [] args){
		String s = "Java";
		s.concat(" SE 7");
		System.out.print(s);
	}
}
