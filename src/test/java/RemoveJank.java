public class RemoveJank {

    public static void main(String[] args) {

//        String s = "^&%&^%^&%&*^^ test 19998 test )(&(&(&)70& Selenium";
//        System.out.println(s);
////        Remove by Regular Expression: [^a-zA-Z0-9]
//        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(s);

        String s = "%%&^%^&%& Hello*&^&^ World )(*)2020";
        System.out.println(s);
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);


    }

}
