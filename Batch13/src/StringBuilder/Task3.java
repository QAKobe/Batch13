package StringBuilder;

public class Task3 {
    /*
    s-e-l-e-n-i-u-m
    remove dashes from given stringBuilder
     */

    private static void remove(StringBuilder name) {

        for (int i = 0; i < name.length(); i++) {
            if ('-' == name.charAt(i)) {
                name.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(name);

    }

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("s-e--l---e-n---i---u-m");

        remove(builder);

//        builder.reverse();
//        System.out.println(builder);
        StringBuilder builder1 = new StringBuilder();

        for (int i = builder.length() - 1; i >= 0; i--) {

            builder1.append(builder.charAt(i));
        }
        System.out.println(builder1);

        String[] name = {"w","o","r","d","s","h","e","r","e"};
        String reversed = "";
        for (int i = name.length-1; i >= 0; i--){

            reversed += name[i];
        }
        System.out.println(reversed);

    }

}
