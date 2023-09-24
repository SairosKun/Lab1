public class Loja {
    private String nome;
    private int quantidadeFuncionario;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionario, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionario() {
        return this.quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Não é possível calcular
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario + "]";
    }
}

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }


    public String getNomeDaRua() {
        return this.nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco [nomeDaRua=" + nomeDaRua + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais +
                ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
    }

}

public class Data{
    private int dia;
    private String mes;
    private int ano;


    public Data(int dia, String mes, int ano) {
        if (verificaDataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else{
            System.out.println("Data inválida. Definida para 1/1/2000.");
            this.dia = 1;
            this.mes = "1";
            this.ano = 2000;
        }
    }


    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return this.mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }

    private boolean verificaDataValida(int dia, String mes, int ano){
        int [] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    int mesInt = Integer.parseInt(mes);
    if (mesInt < 1 || mesInt > 12){
        return false;
    }

    if (dia < 1 || dia > diasPorMes[mesInt]){
        return false;
    }

    if (mesInt == 2 && dia == 29 !verificaAnoBissexto()){
        return false;
    }
}