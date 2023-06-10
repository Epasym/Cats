
public class Main {
    public static void main(String[] args) {

        Cat Ratu = new Cat(2,'m'); //Creating a new cat without a name
        Ratu.investigateKitty();     //Investigating cat. This will prompt the user to name the cat.
        Ratu.investigateKitty();    //Investigating again. This time the cat knows its name and tells it to the user.
        for(int i=0;i<5;i++){Ratu.silly();}

    }
}