package cs.thiss;


class FiledA{

    int a;
    int b;

    void init(int m, int n){
        a=m;
        b=n;
    }
}

class FiledB{
    int m;
    int n;

    void init(int m, int n){
        this.m=m;  // this.m => 필드 m => 지역 변수
        this.n=n;
    }
}

public class Main {
    public static void main(String[] args) {
        FiledA filedA = new FiledA();
        FiledB filedB = new FiledB();

        filedA.init(2,3 );
        System.out.println(filedA.a); // 지역 변수에 다시 지역 변수값을 다시 대입하는 형태
        System.out.println(filedA.b);

        filedB.init(2,3 );
        System.out.println(filedB.m); // 지역 변수의 값을 필드 m,n에 대입하는 형태
        System.out.println(filedB.n);
    }
}
