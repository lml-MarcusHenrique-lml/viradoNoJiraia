package AprimorandoConhecimentos;

public class EstruturasCondicionaisIfElse00 {

    public static void main(String[] args) {
	// write your code here
    //Se idade menor que 15 = categoria infantil
    //Se idade maior que 16 = categoria juvenil
    //Se idade maior que 18 = categoria adulto

        int idade = 14;
    // String res = idade<15 ? res ="infantil": idade >=15 && idade <=17? res = "Juvenil": "Adulto";
    // System.out.println(res);
    if (idade < 15) {
      System.out.println("Categoria Infantil!");
    }else if (idade >= 15 && idade < 18) {
        System.out.println("Categoria Juvenil!");
        }else System.out.println("Categoria Adulto!");
    }
}
