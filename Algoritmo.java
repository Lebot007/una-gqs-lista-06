public class Algoritmo {

    public static void main(String[] args) {
        // Distância média entre a Terra e Marte (km)
        double distanciaKm = 225_000_000.0;

        // Velocidade média estimada de uma nave espacial (km/h)
        double velocidadeKmH = 39_600.0;

        // Cálculo do tempo em horas
        double tempoHoras = distanciaKm / velocidadeKmH;

        // Conversões de tempo
        double tempoDias = tempoHoras / 24.0;
        double tempoMeses = tempoDias / 30.0;

        // Exibição dos resultados
        System.out.println("=== Estimativa de Viagem para Marte ===");
        System.out.printf("Distância considerada: %.0f km%n", distanciaKm);
        System.out.printf("Velocidade da nave: %.0f km/h%n", velocidadeKmH);
        System.out.println("-----------------------------------");
        System.out.printf("Tempo estimado em horas: %.1f horas%n", tempoHoras);
        System.out.printf("Tempo estimado em dias: %.1f dias%n", tempoDias);
        System.out.printf("Tempo estimado em meses: %.1f meses%n", tempoMeses);
    }
}
