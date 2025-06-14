package ExercicioArquivoTexto.controle;

import ExercicioArquivoTexto.dominio.Aluno;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaAluno {
    private ArrayList<Aluno> alunos;
    private final String arquivoAlunos = "alunos.txt";

    public ControlaAluno() {
        this.alunos = new ArrayList<>();
        carregarAlunos();
    }

    public void adicionarAluno(int matricula, String nome, double coeficienteRendimento) {
        Aluno aluno = new Aluno(matricula, nome, coeficienteRendimento);
        alunos.add(aluno);
        
        salvarAlunos();
        
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                aluno.mostrarInfo();
            }
        }
    }

    public void alterarAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Novo nome do aluno: ");
            String novoNome = sc.nextLine();
            
            System.out.print("Novo coeficiente de rendimento (CR): ");
            double novoCR = sc.nextDouble();
            
            aluno.setNome(novoNome);
            aluno.setCoeficienteRendimento(novoCR);
            
            salvarAlunos();
            
            System.out.println("Aluno alterado com sucesso!");

            sc.close();

        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void excluirAluno(int matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    private Aluno buscarAlunoPorMatricula(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoAlunos))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.getMatricula() + "; " + aluno.getNome() + "; " + aluno.getCoeficienteRendimento());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos: " + e.getMessage());
        }
    }

    private void carregarAlunos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int matricula = Integer.parseInt(dados[0]);
                
                String nome = dados[1];
                double cr = Double.parseDouble(dados[2]);
                
                alunos.add(new Aluno(matricula, nome, cr));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de alunos não encontrado. Será criado ao salvar novos alunos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar alunos: " + e.getMessage());
        }
    }
}    