public class Main {
    public static void main(String[] args) {


        System.out.println(CompressString.compress("aaabb"));
        System.out.println(CompressString.compress("abc"));
        System.out.println(CompressString.compress("aaabbaaa"));
        System.out.println(CompressString.compress("  "));
        System.out.println(CompressString.compress(""));


        System.out.println(DecompressString.decompress("a3b2"));
        System.out.println(DecompressString.decompress("a1b1c1"));
        System.out.println(DecompressString.decompress("a1b1c1a3"));
        System.out.println(DecompressString.decompress("   "));
        System.out.println(DecompressString.decompress(""));
    }
}