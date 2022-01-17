class MagicDictionary {
    String dictionary[];
    public MagicDictionary() {
        
    }
    
    public void buildDict(String[] dictionary) {
        this.dictionary = dictionary;
    }
    
    public boolean match(String str, String searchWord){
        if(str.length()!=searchWord.length())   
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=searchWord.charAt(i)){
                return str.substring(i+1).equals(searchWord.substring(i+1));
            }
        }
        return false;
    }
    public boolean search(String searchWord) {
        for(int i=0;i<this.dictionary.length;i++){
            if(match(this.dictionary[i], searchWord))
                return true;
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */