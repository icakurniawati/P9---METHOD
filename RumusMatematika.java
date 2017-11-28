public class RumusMatematika {

    double a, t;            //deklarasi variabel
    double l_segitiga;

    public static void main(String args []) {       //method main
        RumusMatematika rm = new RumusMatematika(); //deklarasi objek dg nama rm
        rm.luassegitiga();                          //pemanggilan method luassegitiga

    }

    void luassegitiga(){
        a = 7;
        t = 10;
        l_segitiga = 0.5 * 1 * t;
        System.out.println("Luas Segitiga = "+l_segitiga);
    }
}


/**
*pemanggilan method luassegitiga harus dideklarasikan objek klass nya terlebih dahulu
*karena method luassegitiga tergolong method bukan static.
*/
