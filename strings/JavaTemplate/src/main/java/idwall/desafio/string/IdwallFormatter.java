package idwall.desafio.string;



public class IdwallFormatter extends StringFormatter {

    /**
     * Should format as described in the challenge
     *
     * @param text
     * @return
     */
    @Override
    public String format(String text) {
    	String fortmated;
    	StringBuilder novoTexto = new StringBuilder();
 
	     String[] palavras = text.split(" ");

	     int qntLetras = 0;
	     int limiteLinha = 40;
	     
	     for (String palavra : palavras) {

	       if(qntLetras + palavra.length() >= limiteLinha) {
	         qntLetras = 0;
	         novoTexto.append('\n');
	       }

	       novoTexto.append(palavra);
	       novoTexto.append(' ');
	       qntLetras += palavra.length() + 1;
	     }     
	    
        fortmated = novoTexto.toString();
	   
        return fortmated;
    }
}
