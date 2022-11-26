package testeWiu;

/* 1) Qual a diferença do .class para o .java? 
 *	R: O .class é a compilação do .java que por sua vez é o que vocÊ escreveu aqui na IDE ou seja, o código.
 * 2) Quais desses programas usamos pra compilar um arquivo .java?
 *	R: B)Javac ou Java compiler
 * 3)O seguinte código está correto?
 *	public class ClasseTeste {
 *		System.out.println("Hello World!!!");
 * 
 *	R: Não, pois falta o método main, "public static void main (String[]args) { 
 * 	}", além disso o comando Sysout deveria estar dentro desse método.
 * 	
 * 4) Sobre variáveis primitvas, explique cada afirmação com detalhes.
 *		A) float, int, byte, char, long e double são variáveis para guardar valores numéricos. 
 *		R: Errado, pois a variável char não consegue guardar valores numéricos e
 *     sim um único caráctere que não consegue fazer operações. 
 *
 *		B) String servem para guardar dados numéricos.
 *	    R: Errado, String é usada para guardar textos, como "Olá, Wiu" ou "1,2,3" 
 *		Porém qualquer valor numérico guardado na String é incapaz de fazer operações.
 *
 *      C) Long, Float, Double são variáveis para guardar valores numéricos.
 *      R: Correto, mas cada uma desempenha um papel único, Long guarda números inteiros até os milhões, Float e Dobulem guarda números decimais. 
 *      (Com diferença de precisão), pesquisei o trecho em parenteses no goggle porquê não lembrei a diferença entre eles.
 *     
 *      D) Existem 8 tipos de variáveis primitivas
 *      R: Exitem 8 tipos de variáveis primitivas sendo elas: 
 *      "int, char, boolean, byte, short, long, float e double."
 *      
 *      E) Não há diferença entre usar as o tipo byte e long, ambos funcionam em todos os cenários possíveis.
 *		R: Errado, exite diferença pois quando se tem recursos limitados como memória, é extremamente importante conservá-la,
 *		então se usaria o tipo byte para guardar um valor numérico menor e conservar a memória, se possível. 
 * 
 * 5) Faça um código capaz de imprimir  o seguinte texto:
 * 
 * Contagem regressiva
 * 9
 * 8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * FOI!
 *  R: Linha 57 À 59.
 *  
 * 6)Faça uma classe capaz de calcular o IMC de uma pessoa.
 *  R: Na classe IMC.java.
 * 
 * 7)Qual a diferença entre  System.out.print(); e System.out.println();?
 *  R: System.out.print(); Imprime o texto que está dentro dos parênteses e aspas duplas sem designar uma linha só para esse texto,
 *  já o System.out.println(); imprime também esse texto mas na próxima linha do console.
 * 
 * 8)//.....
 *	//código oculto
 *	long idade = 13;
 *	long resultado = 2021 - idade;
 *	//.....
 *	//código oculto
 *	
 *  R: o código apresentado acima é usado para calcular o ano resultante da operação de subtração em relação a uma idade predeterminada, no caso "13".
 * 
 * 9)Quais os tipos de variáveis no java, explique elas:
 *  R: Int: Guarda valores numéricos inteiros com limite de -127mil até 127mil.
 *     Byte: Guarda valores numéricos inteiros com limite de -127 até 127.
 *     Short: Guarda valores numéricos inteiros com limite de -32mil até 32mil.
 *     Long: Guarda valores numéricos interiso, não me lembro o seu limite.
 *     Float: Guarda valores numéricos decimais com precisão de até 6 casas.
 *     Double: Guarda valores numéricos inteiros com precisão de até 8 casas.
 *	   Char: Guarda um caractere desde que esteja entra aspas simples.
 *	   String: Guarda textos desde que estejam entre aspas duplas.
 *	   Boolean: Retorna se um valor é verdadeiro ou falso.
 *
 * 10)Explique o seguinte trecho:
 *	
 *	for(int i = 10; i > 0; i--){
 *  	System.out.println("Número " + i);
 *	} 
 *
 *   R: O trecho representa um laço de repetição do tipo for que seria printado no terminal o texto "Número 10", "Número 9" 
 *   e se repetindo até quechegasse ao 1 ou seja, até que a condição "i > 0" se tornasse verdadeira, ou seja 10 vezes.
 *   
 * 11) Explique o seguinte trecho:
 *
 *	for(int i = 0; i > 0; i--){
 *   	System.out.println("Número " + i);
 *	}
 *
 *   R: Nesse caso temos um laço de repetição que não apresenta erros de sintaxe ou no código, porém apresenta o erro de lógico
 *   que não escreverá nada no terminal, pois ao inicializar a variável "i" com o valor de zero e ter como condição para a realização do laço
 *   "i > 0", o laço não vai começar. 
 */
public class Questoes {
	public static void main(String[] args) {
		System.out.println("Contagem regressiva");
		System.out.println("9\n8\n7\n6\n5\n4\n3\n2\n1");
		System.out.println("FOI!!!");
		for (int i = 0; i > 0; i--) {
			System.out.println("Número " + i);
		}
	}

}
