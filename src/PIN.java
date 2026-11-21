void main() {
    String PIN = IO.readln("PIN-i i ri (4 shifra): ").trim();

    if (PIN.length() != 4) {
        IO.println("PIN-i duhet ti kete saktsisht 4 shifra.");
        return;
    }
    if (PIN.startsWith("+") || PIN.startsWith("-")) {
        IO.println("PIN-i ka vetem shifra,pa + ose -.");
        return;
    }
    if (PIN.charAt(0) >= '0' && PIN.charAt(0) <= '9' &&
        PIN.charAt(1) >= '0' && PIN.charAt(1) <= '9' &&
        PIN.charAt(2) >= '0' && PIN.charAt(2) <= '9' &&
        PIN.charAt(3) >= '0' && PIN.charAt(3) <= '9')
    {
    }else{
        IO.println("PIN-i ka vetem shifra.");
    }
    int pin = Integer.parseInt(PIN);
    int nr =0;
    double perqindja = 0;

    if (pin == 1234 || pin == 0000 || pin == 1111 || pin == 1212){
        nr = 1;
    } else if (String.valueOf(pin).startsWith("19") || String.valueOf(pin).startsWith("20")) {
        nr = 2;
        perqindja = nr/3.0;
    } else if (String.valueOf(pin).charAt(0) == String.valueOf(pin).charAt(1) ||String.valueOf(pin).charAt(2) == String.valueOf(pin).charAt(3)) {
        nr = 2;
        perqindja = nr/3.0;
    } else{
        nr = 3;
        perqindja = nr/3.0;
    }

    switch(nr){
        case 3-> {
            System.out.printf("Fort: "+ "%.2f%%%n",perqindja*100);
            IO.println("PIN-i pranohet.");
        }
        case 2-> {
            System.out.printf("Mesatare: "+  "%.2f%%%n",perqindja*100);
            IO.println("Zgjidhni nje PIN tjeter.");
        }
        default -> IO.println("I dobet: Ky PIN provohet i pari.");
    }
}