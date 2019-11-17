class RaindropConverter {

    String convert(int number) {
        String soundofnumbers = "";
        int[] numberstocheck = 
            {3,5,7};

        for (int item : numberstocheck)
        {
            if (( number % item) == 0 && item ==3)
            {
                soundofnumbers = soundofnumbers + "Pling";
            } 
            else if (( number % item ) == 0 && item ==5) 
            {
                soundofnumbers = soundofnumbers + "Plang";
            } 
            else if (( number % item ) == 0 && item ==7) 
            {
                soundofnumbers = soundofnumbers + "Plong";
            } 
        }

        if (soundofnumbers == "")
        {
            soundofnumbers = soundofnumbers + number;
        }

        return soundofnumbers ;
    }

}
