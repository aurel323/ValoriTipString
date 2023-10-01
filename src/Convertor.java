public class Convertor {
    String boolStr = "tRue";
    String byteStr = "120";
    String shortStr = "32000";
    String intStr = "147895632";
    String longStr = "987654321987654321";
    String doubleStr = "4444.5d";
    String floatStr = "2354.56f";

    public void convertor(){
        boolean Bool_ = Boolean.parseBoolean(boolStr);
        System.out.println(Bool_);

        byte Byte_ = Byte.parseByte(byteStr);
        System.out.println(Byte_);

        short Short_ = Short.parseShort(shortStr);
        System.out.println(Short_);

        int Int_ = Integer.parseInt(intStr);
        System.out.println(Int_);

        long Long_ = Long.parseLong(longStr);
        System.out.println(Long_);

        double Double_ = Double.parseDouble(doubleStr);
        System.out.println(Double_);

        float Float_ = Float.parseFloat(floatStr);
        System.out.println(Float_);
    }
}

