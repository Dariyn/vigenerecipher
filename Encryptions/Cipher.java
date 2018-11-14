public class Cipher {
    private String userInput;
    private String userKeyword;
    public Cipher(String input, String keyword) {
        userInput = input;
        userKeyword = keyword;
    }
    public String encrypt(String input, String keyword) {
        //char[][] table = new char[26][26];
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        /*for(int i = 0; i < 26; i++) {
            for (int j = 0; j<26;j++) {
                table[i][j]= alphabet[(i+j)%26];
            }
        }*/
        char[] charInput = userInput.toLowerCase().toCharArray();
        char[] charKeyword = userKeyword.toLowerCase().toCharArray();
        int keywordIndex;
        char[] result = new char[charInput.length];
        for (int i = 0; i < charInput.length;i++) {
            keywordIndex=i%(charInput.length);
            char key= charKeyword[keywordIndex%charKeyword.length];
            char user = charInput[i];
            int keynum = (int)key; 
            int usernum = (int)user;
            result[i]= alphabet[(usernum + keynum-97*2)%26];
        }
        return String.valueOf(result);
    }
}
