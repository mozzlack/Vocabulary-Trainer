public class Main {
    public static void main(String[] args) {
        VocabSet set = new VocabSet("english", "german");
        Vocab a = new Vocab("door", "Tür");
        Vocab b = new Vocab("door", "Tür");
        set.addVocab(new Vocab("door", "Tür"));
        set.addVocab(new Vocab("house", "Haus"));
        System.out.println(set);
        System.out.println();

        VocabFrame frame = new VocabFrame();
        frame.setVisible(true);



    }
}