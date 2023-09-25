public class Data{
    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano) {
        if (verificaDataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else{
            System.out.println("Data inválida. Definida para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia){
        if (verificaDataValida(dia, this.mes, this.ano)){
            this.dia = dia;
        }else{
            System.out.println("Dia inválido para o atual mês e ano.");
        }
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        if (verificaDataValida(this.dia, mes, this.ano)){
            this.mes = mes;
        } else {
            System.out.println("Mês inválido para o atual dia e ano.");
        }
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if (verificaDataValida(this.dia, this.mes, ano)){
            this.ano = ano;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto(){
        return(ano % 4 == 0 && ano % 100 !=0) || (ano %400 == 0);
    }

    private boolean verificaDataValida(int dia, int mes, int ano){
        if (mes<1 || mes>12 || dia < 1 || dia > 31){
            return false;
        }

        if (mes == 2){
            if(verificaAnoBissexto()){
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return dia <=30;
        }

        return true;
    }

    public static void main(String[] args) {
        Data data = new Data (29, 2, 2024);
        System.out.println("Data: " + data);

        data.setDia(31);
        data.setMes(4);
        data.setAno(2022);
        System.out.println("Data: " + data);
    }
}