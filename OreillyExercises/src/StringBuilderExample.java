class StringBuilderExample {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Rohan is awesome and so is Rahul.");
        int valueR = sb.indexOf("Rahul");
        sb.replace(27,32, "Suraj");
        System.out.println(sb);
    }
}  