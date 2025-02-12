package NLP;

import java.io.IOException;
import java.util.LinkedList;
import questionaireprocessing.FileManager;

/**
 *
 * @author USER
 */
public class StopwordRemoval {

    static LinkedList<String> stopwords;
    static final String PATH = "stopword-list-en.txt";

    public StopwordRemoval() throws IOException {
        FileManager fileManager = new FileManager();
        stopwords = fileManager.readFileContent(PATH);
    }

    public LinkedList<String> removeStopwords(LinkedList<String> wordList) {
        LinkedList<String> curatedWordList = new LinkedList<>();

        return curatedWordList;
    }

// Comenteafafsa


    I never imagined this was 
    possible, but “The Dictionary of Obscure Sorrows” 
    is now a New York Times bestseller! 

    There are no words for how grateful I feel, 
    knowing that I’m not alone. If you’re thinking of 
    gifts for anyone you know who’s creative, thoughtful,
     or going through confusing times, you might want to 
     order them a copy now:

}
