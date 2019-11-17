class IsogramChecker {

    boolean isIsogram(String phrase) {
        if(phrase.length() == 0){
            return true;
            }

        else{
            for(int i=0; i < (phrase.length()); i++){
                String ichar = phrase.substring(i,i+1);
                for(int j= i+1; j < (phrase.length());j++){
                    String jchar = phrase.substring(j,j+1);
                    if(ichar.compareToIgnoreCase(" ") == 0 || ichar.compareToIgnoreCase("-") == 0){
                        continue;
                    }
                    if(ichar.compareToIgnoreCase(jchar) == 0){
                        return false;
                    }
                }
            };
            return true;
        }
        }

}
