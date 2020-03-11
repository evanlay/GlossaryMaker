import java.util.ArrayList;

public class GlossaryEntry{
    private String word;
    private ArrayList<Integer> numsList ;
    public GlossaryEntry(String str){
        word = str.toUpperCase();
        numsList = new ArrayList<Integer> ();
    }
    public void add(int num){
        int counter = 0;
        for(int i = 0; i < numsList.size(); i++){
            int index = numsList.get(i);
            if(num == index){
                counter++;
            }
        }
        if(counter > 0){
            counter = 0;
        }
        else{
            numsList.add(num);
        }
    }
    public String getWord(){
        return word;
    }
    public String toString(){
        String numbers = "";
        for(int i = 0; i < numsList.size(); i++){
            numbers += numsList.get(i) + " ";
        }
        String result = getWord() + " " + numbers;
        return result;
    }
    public static void main(String[] args) {
        GlossaryEntry ge = new GlossaryEntry("Hello");
        ge.add(5);
        ge.add(7);
        ge.add(5);
        ge.add(12);
        System.out.println(ge);
    }
}
