// Structure of the patient is defined here
class patient{
    int id;
    String name;
    int age;
    long phone_number;

    public patient(int id,String name,int age,long phone_number){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
    }
    

    public String toString(){
        return "\nID: " + id + "\nName: "+ name + "\nAge: " + age + "\nPhone_number : " + phone_number;
    }
}
// 