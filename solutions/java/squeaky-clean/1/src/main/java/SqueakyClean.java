class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder text = new StringBuilder();
        char[] identifierArray = identifier.toCharArray();
        int i = 0;
        while(i < identifierArray.length){
            char ch = identifierArray[i];
            if(ch == ' '){
                text.append('_');
                i++;
            }else if(ch == '-'){
                String upperText = identifierArray[i+1] + "";
                text.append(upperText.toUpperCase());
                i+=2;
            }else if(Character.isDigit(ch)){
                switch (ch) {
                    case '4':
                        text.append('a');
                        break;
                    case '3':
                        text.append('e');
                        break;
                    case '0':
                        text.append('o');
                        break;
                    case '1':
                        text.append('l');
                        break;
                    case '7':
                        text.append('t');
                        break;
                }
                i++;
            }else if(!Character.isLetter(ch)){
                i++;
            }else{
                text.append(ch);
                i++;
            }
        }

        return text.toString();
    }
}
