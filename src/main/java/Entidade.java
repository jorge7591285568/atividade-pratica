public class Entidade {

    public static void main(String[] args) {
        Carro carro = new Carro("wxy4f34", "Fiat", "Beetle", 2020, "Vermelho", 30, sim);
        Carro carro1 = new Carro("wxy4f32", "Volks", "gol", 2000, "Amarelo", 20, sim);
        Carro carro2 = new Carro("wxy4f33", "Hunday", "hylux", 2010, "Branca", 50, sim);
        

        Cliente cliente = new Cliente("jorge", "12345678901", "75999990101", "jorge75999990101@hotmail.com");
        Cliente cliente1 = new Cliente("jorge1", "12345678902", "75999990102", "jorge75999990102@hotmail.com");
        Cliente cliente2 = new Cliente("jorge2", "12345678903", "75999990103", "jorge75999990103@hotmail.com");

        Reserva reserva = new Reserva(cliente, carro, dataInicio, dataFim, valorTotal);

        reserva.calcularValorTotal((dataFim - dataInicio)*Diaria);

        System.out.println(reserva);
    }

}
