public class User {
	String nome;
	int idade;

public static void main (String args[]) {
	User obj1 = new User();
	obj1.nome = "Bruno";
	obj1.idade = 37;

	System.out.println("Meu nome é " + obj1.nome + " e minha idade é " + obj1.idade + " anos .");
    }
}