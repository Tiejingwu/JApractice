package firstshangji;
class Person{
    public String Bh; //���
    public String Xm; //����
    public Person(){}
    public Person(String bh,String xm){
        this.Bh=bh;
        this.Xm=xm;
    }
    public void talk(){
        System.out.println("I am��"+Xm+",my number is:"+Bh);
    }
}
class Teacher extends Person{
    public String Zc; //ְ��
    public String Bm; //����
    public Teacher(){}
    public Teacher(String bh,String xm,String zc,String bm){
        super(bh,xm);
        this.Zc=zc;
        this.Bm=bm;
    }
    public void talk(){
        super.talk();
        System.out.println("title is:"+Zc+",work at"+Bm);
    }
}
class Student extends Person{
    public String Bj; //�༶
    public int Cj;  //�ɼ�
    public Student(){}
    public Student(String bh,String xm,String bj,int cj){
        super(bh,xm);
        this.Bj=bj;
        this.Cj=cj;
    }
    public void talk(){
        super.talk();
        System.out.println("Class number is:"+Bj+",grade="+Cj);
    }
}
public class Inheritance {
    public static void main(String args[]){
         
        //Person�����
        System.out.println("PersonTest");
        Person p1=new Person("P1","first person");
        Person p2=new Person("P2","second person");
        p1.talk();
        p2.talk();
         
        //Teacher�����
        System.out.println("\nTeacherTest");
        Teacher t1=new Teacher("T1","first teacher","Associate Professor","CS");
        Teacher t2=new Teacher("T2","second teacher","Professor","CS");
        t1.talk();
        t2.talk();
         
        //Student�����
        System.out.println("\nStudentTest");
        Student s1=new Student("S1","first student","1713013",95);
        Student s2=new Student("S2","second student","1713013",90);
        s1.talk();
        s2.talk();
    }
}
