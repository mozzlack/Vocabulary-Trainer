import java.util.ArrayList;
import java.util.List;

public class VocabSet {
    private String fromLanguage, toLanguage;
    private List<Vocab> vocabList = new ArrayList<>();


    private VocabSet(String fromLanguage, String toLanguage) {
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
    }

    public void addVocab(Vocab toAdd) {
        vocabList.add(toAdd);
    }

    public Vocab removeVocab(Vocab toRemove) {
        Vocab returnVocab;
        try {
            returnVocab = vocabList.get(vocabList.size()-1);
            vocabList.remove(toRemove);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return returnVocab;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vocab vocab:
             vocabList) {
            sb.append("Front: " + vocab.getFront() + " | Back: " + vocab.getBack() + "\n");
        }
        return sb.toString();
    }
}
