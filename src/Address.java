public class Address {

      private String city;
      private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public static  void addresses(){
        String telAviv ="Allenby, Tel Aviv";
        String netanya = "Eli cohen, Netanya";
        String kfarSava = "Harav gold, Kfar - sava";
        String ashkelon = "Izhak ben zvi , Ashkelon";
        String jerusalem = "Yehuda, Jerusalem";
        String rehovot = "Hamada, Rehovot";
        String qiryatGat = "Harimon, Qiryat Gat";
        String eilat = "Hamasger, Eilat";
        String bneiBrak = "Rabi akiva, Bnei brak";

        System.out.println(telAviv+ '\n' +netanya + '\n'+ kfarSava+ ashkelon
                +'\n'+ jerusalem + '\n'+ rehovot + '\n'+ qiryatGat + '\n'+ eilat + '\n'+ bneiBrak );
    }

    public static String[]  cities(){
        String [] array = {"Tel Aviv", "Netanya", "Kfar - sava","Ashkelon","Jerusalem",
                "Rehovot", "Qiryat Gat", "Eilat", "Bnei brak"};


        return array;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
