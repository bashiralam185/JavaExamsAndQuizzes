public class Acronym {
    private String string;
    public Acronym(String phrase) {
        this.string = phrase;
    }
    public String get(){
        String str = string.trim();
        String result = "";
        String[] words = str.split(" ");
        for (int k = 0; k < words.length; k++) {
            char chr = words[k].charAt(0);
            if((((int)chr) >=65 && ((int)chr) <=90) || (((int)chr) >=97 && ((int)chr) <=122)){
                result+=Character.toUpperCase(chr);
            }
            else{
                int count = 0;
                while (count<words[k].length()-1){
                    char ch1 = words[k].charAt(count);
                    if((((int)ch1) >=65 && ((int)ch1) <=90) || (((int)ch1) >=97 && ((int)ch1) <=122)){
                        result+=Character.toUpperCase(ch1);
                        break;
                    }
                    count++;


                }
            }
        }
        return result;
    }
}