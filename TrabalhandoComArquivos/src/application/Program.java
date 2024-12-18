package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/*
		// Ler um arquivo já existente:
		String arqiuvoString = "C:\\Users\\JOOVIT~1\\AppData\\Local\\Temp\\Textos\\testeTxt.txt";

		try (BufferedReader leitorDoArquivo = new BufferedReader(new FileReader(arqiuvoString))){ 
			// instância um BufferedReader(ele lê arquivos de forma mais rápido, em bytes) a partir de um FileReader(é quem recebe o arquivo)
				String lerLinha = leitorDoArquivo.readLine(); // lê linha por linha
				
				while(lerLinha != null) {
					System.out.println(lerLinha); // mostra a linha caso não for nula
					lerLinha = leitorDoArquivo.readLine(); // passa pra próxima linha
			}
		}
		catch(IOException exception) { //excecão caso não consiga abrir o arquivo 
			System.out.println("Erro: " + exception.getMessage());
		}
		*/
		
		
		/*
		// Criar um novo arquivo de texto com algumas coisas escrito 
		
		String caminhoDoArquivo = "C:\\Users\\JoãoVitorDuarteSanto\\Documents\\criar.txt"; 
		// caminho onde será criado o novo arquivo ou então onde será adicionado mais texto
		String[] arrayComTexto = new String[] {"Linha 1", "Linha 2", "Linha 3", "FIM"};
		
		try (BufferedWriter criarArquivo = new BufferedWriter(new FileWriter(caminhoDoArquivo))){ // criei um arquivo no caminho especificado
			
			for(String linha : arrayComTexto) {
				criarArquivo.write(linha); // escrevendo linha por linha no novo arquivo
				criarArquivo.newLine(); // passando pra próxima linha
			}
			System.out.println("\nArquivo finalizado!");
		} 
		catch (IOException exception) {
			exception.printStackTrace();
		}
		*/
		
		
		// Ver pastas dentro de uma pasta
		String pastaString = "C:\\Users\\JoãoVitorDuarteSanto";
		File minhaPasta = new File(pastaString);
		
		File [] pastas = minhaPasta.listFiles(File::isDirectory);
		System.out.println("Pastas dentro da pasta " + minhaPasta);
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		// Ver arquivos dentro de uma pasta
		File [] arquivos = minhaPasta.listFiles(File::isFile);
		System.out.println("\n\nArquivos dentro da pasta " + minhaPasta);
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		
		// criar uma nova pasta 
		String caminhoDaPasta = "C:\\Users\\JoãoVitorDuarteSanto\\Documents\\";
		boolean criacaoDaPasta =  new File(caminhoDaPasta + "\\NovaPasta").mkdir(); // "mkdir" cria uma nova pasta
		System.out.println("Pasta criada: " + criacaoDaPasta); // mostra se foi criada com sucesso, se já existir uma pasta com esse nome dará falso
		
		
	}
}









