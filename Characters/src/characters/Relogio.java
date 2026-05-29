package characters;

import java.util.Scanner;

public class Relogio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo os inputs do usuário
        System.out.print("Digite a hora atual (0-23): ");
        int horaInicial = scanner.nextInt();

        System.out.print("Digite os minutos atuais (0-59): ");
        int minutoInicial = scanner.nextInt();

        System.out.print("Digite os segundos atuais (0-59): ");
        int segundoInicial = scanner.nextInt();

        System.out.println("\nIniciando o relógio...\n");

        // O 'while' garante que o relógio rode infinitamente, reiniciando após as 23:59:59
        while (true) {
            
            // O 'for' gerencia a contagem das horas
            for (int h = horaInicial; h < 24; h++) {
                
                // O 'for' gerencia a contagem dos minutos
                for (int m = minutoInicial; m < 60; m++) {
                    
                    // O 'for' gerencia a contagem dos segundos
                    for (int s = segundoInicial; s < 60; s++) {
                        
                        // Formata o tempo para ter sempre dois dígitos (ex: 09:05:02)
                        String tempo = String.format("%02d:%02d:%02d", h, m, s);
                        
                        // O \r (Carriage Return) retorna o cursor ao início da linha
                        // O System.out.print (sem 'ln') é crucial aqui para não quebrar a linha
                        System.out.println(tempo); // O 'ln' faz pular a linha;
                        
                        try {
                            // Pausa a execução por 1000 milissegundos (1 segundo)
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Erro na thread: " + e.getMessage());
                        }
                    }
                    // Após completar 60 segundos, os segundos devem voltar a 0 para o próximo minuto
                    segundoInicial = 0;
                }
                // Após completar 60 minutos, os minutos devem voltar a 0 para a próxima hora
                minutoInicial = 0;
            }
            // Após completar 24 horas, o loop 'while' recomeça, então a hora inicial deve ser 0 (00:00:00)
            horaInicial = 0;
        }
    }
}