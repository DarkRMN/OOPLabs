import java.util.Scanner;

public class Letters {

    private String initialText;
    private String editedText;

    public void enterText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть текст: ");
        initialText = scanner.nextLine();
    }

    public void textEditing() {
        String[] textEdit = initialText.split(" ");

        for (int i = 0; i < textEdit.length; i++) {
            textEdit[i] = textEdit[i].replaceAll("[\\p{Punct}\\p{So}\\p{Sc}0-9]", "");
        }
        editedText = String.join(" ", textEdit);
    }

    public void textOut() {
        System.out.println("Text before editing: " + initialText);
        System.out.println("Text after editing: " + editedText);
    }
}
