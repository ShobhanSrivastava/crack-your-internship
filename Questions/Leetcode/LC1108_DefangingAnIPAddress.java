public class LC1108_DefangingAnIPAddress {
    public static void main(String[] args) {
        String IP = "1.1.1.1";
        String defangedIP = defangIPaddress(IP);
        System.out.println(defangedIP);
    }

    public static String defangIPaddress(String address) {
        StringBuilder str = new StringBuilder();

        char[] defang = {'[','.',']'};

        for(int i=0 ; i<address.length() ; i++){
            if(address.charAt(i)=='.'){
                str.append(defang);
            }
            else{
                str.append(address.charAt(i));
            }
        }

        return str.toString();
    }
}
