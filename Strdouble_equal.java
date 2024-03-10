class Strdouble_equal{
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        // == always checks address/reference of a string 
        if(s1==s2){
            System.out.println("references are equal");
        }
        else{
            System.out.println("references are not equal");
        }
    }
    
}