import java.util.stream.Stream;
public class Transpose {
    public String transpose(String StringMatrix ){
        String[] word = StringMatrix.split("\\n");
        StringBuilder fMatrix = new StringBuilder();
        int maximumLength = Stream.of(word).mapToInt(String::length).max().getAsInt();
        for (int index = 0; index < maximumLength; index++) {
            StringBuilder matrixLine = new StringBuilder();
            for (int num = 0; num < word.length; num++) {
                if (index < word[num].length()) {
                    matrixLine.append(word[num].charAt(index));
                } else {
                    boolean Space = false;
                    for (int i = num + 1; i < word.length && !Space; i++) {
                        if (index < word[i].length()) {
                            Space = true;
                        }
                    }
                    if (Space) {
                        matrixLine.append(" ");
                    }
                }
            }
            fMatrix.append(matrixLine);
            if (index != maximumLength - 1) {
                fMatrix.append("\n");
            }
        }
        return fMatrix.toString();
    }
}
