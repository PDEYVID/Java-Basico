public class usuario {
   public static void main(String[] args) {
      Smartv smartv = new Smartv();

      System.out.println("TV ligada ? " + smartv.ligada);
      System.out.println("canal atual: " + smartv.canal);
      System.out.println("volume a tual: " + smartv.volume);

      smartv.ligada();
      System.out.println("Novo Status -> TV ligada ? " + smartv.ligada);

      smartv.delisgar();
      System.out.println("Novo Status -> TV ligada ? " + smartv.ligada);

   }
}
