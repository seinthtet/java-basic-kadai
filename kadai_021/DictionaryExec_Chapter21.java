package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		String[] wordsToCheck = { "apple", "banana", "grape", "orange" };

		for (String word : wordsToCheck) {
			dictionary.searchWord(word);
		}

	}

}
