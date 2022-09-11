public class Main {
    public static void main(String[] args){
        System.out.println(dataTypes());
    }

    public static String dataTypes(){
        String text;
        int num;
        float otherNum;
        double anotherNum;
        short variable;
        long anotherNum1;
        byte character;
        boolean oneOrAnother;

        text = "Beautiful person that lives next to the bakery";
        num = 12;
        otherNum = 11;
        anotherNum = 11.3;
        variable = 9;
        anotherNum1 = 2101200;
        character = 1;
        oneOrAnother = true;

        return text + "\n" + (num + otherNum) + "\n" + anotherNum + "\n" + variable + "\n" + anotherNum1 + "\n" + character + "\n" +  oneOrAnother;
    }
}
