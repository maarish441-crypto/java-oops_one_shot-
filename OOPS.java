class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }

}

class student{
    String name;
    int age;

    public void printinfo(String name){  // polymorphism
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name , int age){
        System.out.println(name + " " + age);
    }

    // public void printinfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);

    //     // by default ek constructor hota hai java me
    // }
    // // student(String name , int age){       // parameterised constructor(compile time )
    // //     this.name = name;
    // //     this.age = age;
    // // }

    // student(student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
}


public class OOPS{
    public static void main(String args[]) {
        student s1 = new student(); 
        s1.name = "aarish";
        s1.age = 20;

        s1.printinfo(s1.name,s1.age);


        

        // student s2 = new student(s1);
        // s2.printinfo();
    }
}


// public class OOPS{
//     public static void main(String args[]){
//         student s1 = new student();
//         s1.name = "aarish";
//         s1.age = 20;

//         s1.printinfo();
//     }
// }

// public class OOPS{
//     public static void main(String args[]){
//         pen pen1 = new pen();
//         pen1.color = "blue";
//         pen1.type = "Gel";

//         pen pen2 = new pen();
//         pen2.color = "green";
//         pen2.type = "gel";

//         pen1.printcolor();
//         pen2.printcolor();

//     }

// }

