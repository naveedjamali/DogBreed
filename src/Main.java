import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DogBreed[] dogBreeds = {
                new DogBreed(10000,"Beagle" ),
                new DogBreed(8500,"Shihtzu"),
                new DogBreed(11300,"Labrador"),
                new DogBreed(12400,"Dalmation"),
                new DogBreed(6500,"German"),
                new DogBreed(15100,"Husky"),
                new DogBreed(18500,"Pomeranian")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dog breed: ");
        String input = scanner.nextLine();

        DogBreed dog = null;
        for (int i=0;i< dogBreeds.length;i++) {
            if(dogBreeds[i]._name.toLowerCase().equals(input.toLowerCase())){
                dog = dogBreeds[i];
            }
        }

        if(dog==null){
            System.out.println("INVALID INPUT");
            return;
        }else{
            System.out.println(dog._name+" - "+dog._price);
        }

        int payment = 0;
        System.out.print("Enter the payment: ");
        payment = scanner.nextInt();

        if(payment>dog._price){
            System.out.print("Change: "+(payment-dog._price));
        }
        else {
            System.out.print("INSUFFICIENT PAYMENT");
        }





    }





    static class DogBreed{
        int _price;
        String _name;

        public DogBreed(int price, String name){
            this._name = name;
            this._price = price;
        }
    }
}
