public class If {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

         if (anoDeLancamento >= 2022) {
             System.out.println("lançamento");
         }else{
            System.out.println("antigo");
         }

         if(incluidoNoPlano == true || tipoPlano.equals("Plus")){
             System.out.println("Filme liberado");
         }else {
             System.out.println("deve pagar locação");
         }
    }
}
