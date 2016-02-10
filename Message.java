import java.io.Serializable;

public class Message implements Serializable{
	private static int count = 0;
	private int id;
	private String contenu;
	private String pseudoAuteur;
	public Message(String content, String author){
		id = ++count;
		contenu = content;
		pseudoAuteur = author;
	}
}
