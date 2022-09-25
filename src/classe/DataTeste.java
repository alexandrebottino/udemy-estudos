package classe;

public class DataTeste {
    public static void main(String[] args) throws Exception {

        Data d1 = new  Data();
        // d1.dia = 10;
        // d1.mes = 03;
        // d1.ano = 2014;

        Data d2 = new Data(22, 7, 1995);

        //System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        //System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);

        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());

    }

}
