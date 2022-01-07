public class Codec {
    HashMap<String, String> encodeMap = new HashMap<>();
    HashMap<String, String> decodeMap = new HashMap<>();
    String baseUrl = "https://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int extraChar = encodeMap.size() + 1;
        if(!encodeMap.containsKey(longUrl)){
            encodeMap.put(longUrl, baseUrl+extraChar);
            decodeMap.put(baseUrl+extraChar, longUrl);
        }
        return baseUrl+extraChar;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodeMap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));