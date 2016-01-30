public class Caesar {
    public String s = "abcdefghijklmnopqrstuvwxyz";
    public char c;
    public int key;
    public char encriptedChar;

    public char Caesar(char c, int key){
        this.c = c;
        this.key=key;
        int i = 0;
        while (i < 26) {
            // extra +26 below because key might be negative
            if (c == s.charAt(i)) encriptedChar=s.charAt((i + key + 26)%26);
            i++;
        }
        return encriptedChar;
    }

}
