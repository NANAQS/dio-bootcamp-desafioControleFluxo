class ParametrosInvalidosException  extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

public class DesafioControleFluxo {

    public static void main(String[] args) {
      int arg0 = Integer.parseInt(args[0]);
      int arg1 = Integer.parseInt(args[1]);

      try {
        if (arg0 <= arg1) {
            for (int i = arg0; i <= arg1; i++) {
                System.out.println(String.format("Imprimindo o número %d", i));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
      } catch (ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
      }
    }
}