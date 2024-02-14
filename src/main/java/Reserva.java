import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    public Reserva(Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, double valorTotal) {
        this.cliente = cliente;
        this.carro = carro;
        dataInicio = dataInicio;
        dataFim = dataFim;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
      /* public void disponivel() {
            if (this.getCarro() == true) {
                System.out.println("Modelo: " + this.getModelo());
                System.out.println("Cor: " + this.getCor());
                System.out.println("Placa: " + this.getPlaca());
                System.out.println("O veiculo alugado com sucesso!");
            } else {
                System.out.println("O veiculo ja esta alugado! ");
                System.out.println("Modelo: " + this.getModelo());
                System.out.println("Cor: " + this.getCor());
                System.out.println("Placa: " + this.getPlaca());
            }
        }*/
    @Override
    public String toString() {
        return "Reserva [cliente=" + cliente + ", carro=" + carro + ", dataInicio=" + dataInicio + ", dataFim="
                + dataFim + ", valorTotal=" + valorTotal + "]";
    }

}
