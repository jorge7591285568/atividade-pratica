public class Reserva {
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    

    public Reserva(Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, double valorTotal) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    @Override
    public String toString() {
        return "Reserva [cliente=" + cliente + ", carro=" + carro + ", dataInicio=" + dataInicio + ", dataFim="
                + dataFim + ", valorTotal=" + valorTotal + "]";
    }


}
