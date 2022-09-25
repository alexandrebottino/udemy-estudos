package classe;

public class VAlorVersusReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + "" + b);

        Data d1 = new Data(1, 1, 1970);
        Data d2 = d1;

        d1.dia = 31;
        d1.mes = 12;
        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

}
