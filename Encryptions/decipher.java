public class decipher {
    private String encrypted;
    private String keyword;
    public decipher (String encryptedword, String keyw) {
        encrypted = encryptedword;
        keyword = keyw;
    }
    public String decrypt(String encryptedword, String keyw) {
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] charencrypt = encrypted.toLowerCase().toCharArray();
        char[] charkeyword = keyword.toLowerCase().toCharArray();
        int keywordIndex;
        char[] result = new char [charencrypt.length];
        for (int i = 0; i<charencrypt.length;i++) {
            keywordIndex=i%(charencrypt.length);
            char key= charkeyword[keywordIndex%charkeyword.length];
            char enc = charencrypt[i];
            int keynum = (int)key;
            int encnum = (int) enc;
            result[i] = alphabet[(encnum-keynum+26)%26];
        }
        return String.valueOf(result);
    }
}