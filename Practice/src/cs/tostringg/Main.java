package cs.tostringg;
class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company =company;
        this.os = os;
    }


    public String toString(){
        return company + " 그리고 "+ os;
    }
}
public class Main {


    public static void main(String[] args) {
        SmartPhone myphone =new SmartPhone("삼성", "갤럭시");

        String strObj =myphone.toString(); // toString 메소드 호출
        System.out.println(strObj);

        System.out.println(myphone); // toString 메소드 호출

        System.out.println(myphone.hashCode());
    }
}