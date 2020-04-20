public class Main {

    public static void main(String[] args) {
	// write your code here
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 1;
        int toplam2 = 1;
        for(int i=2;i<sayi1;i++){
            if(sayi1 % i == 0){
                toplam1 += i;
            }
        }
        for(int i=2;i<sayi2;i++){
            if(sayi2 % i == 0){
                toplam2 += i;
            }
        }
        if(toplam1 == sayi2 && toplam2 == sayi1){
            System.out.println("Arkadas sayi");
        }
        else{
            System.out.println("Arkadas sayi degil");
        }
    }
}
