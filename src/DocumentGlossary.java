import java.util.ArrayList;
public class DocumentGlossary extends ArrayList<GlossaryEntry> {
    public DocumentGlossary(){
        super();
    }
    public DocumentGlossary(int length){
        super();
    }
    public void addWord(String word, int num){
        GlossaryEntry word2 = new GlossaryEntry(word);
    }
}