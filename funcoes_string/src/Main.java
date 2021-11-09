
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC Abc DeFgH    ";
		
		String s01 = original.toLowerCase(); //tudo em minusculo
		String s02 = original.toUpperCase(); //tudo em maisculo
		String s03 = original.trim(); //elimina o espaços no canto da String
		String s04 = original.substring(2); //recortar a partir do 2
		String s05 = original.substring(2, 9); // recorde de 2 a 9
		String s06 = original.replace('a', 'x'); //trocar o a minusculo por x
		String s07 = original.replace("abc", "xy"); // trocar uma substring
		int i = original.indexOf("bc"); //primeira ocorrência do bc
		int j = original.lastIndexOf("bc"); //ultima ocorrência do bc
		
		System.out.println("Original: - " + original + "-");
		System.out.println("toLowerCase: - " + s01 + "-");
		System.out.println("toUpperCase: - " + s02 + "-");
		System.out.println("trim: - " + s03 + "-");
		System.out.println("substring(2): - " + s04 + "-");
		System.out.println("substring(2, 9): - " + s05 + "-");
		System.out.println("replace('a', 'x'): - " + s06 + "-");
		System.out.println("replace(abc, xy): - " + s07 + "-");
		System.out.println("index Of(bc): " + i);
		System.out.println("last Index Of(bc): " + j);
		System.out.println("");
		
		// Operação split (recortar por posições)
		String s = "potate apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}

}
