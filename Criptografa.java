
public class Criptografa {
	 
	public static void main(String [] args) {
		String criptografada = "sr xli mrxivrix, rsfshc orsaw csy evi e hsk. tixiv wximriv";
		int casas = 4;				
			criptografada.toLowerCase();
				char[] charArray = criptografada.toCharArray();
				for (char c : charArray) {
					String d = String.valueOf(c);
					int numeroAscii = d.charAt(0);
						if(numeroAscii >= 101) {
							numeroAscii = numeroAscii - casas;
						}else if (numeroAscii < 101 && numeroAscii >= 97) {
							numeroAscii = numeroAscii + 22;
						}else {
						}
					String novo = new Character((char)numeroAscii).toString();
					System.out.print(novo);
				}
				
			}
		}
