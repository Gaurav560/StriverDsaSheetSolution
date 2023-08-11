package LearnTheBasics;





public class Basics2 {
    public static int dataTypes(String type){
        return switch (type) {
            case "Float" -> 4;
            case "Long" -> 8;
            case "Integer" -> 4;
            case "Double" -> 8;
            case "Character" -> 2;
            default -> 0;
        };
    }
    public static void main(String[] args) {
int size=dataTypes("Char");
        System.out.println(size);

    }
}
