public class MethodsLab2 {
    public static void forloop(int start, int stop, int incrementation){
        for (int i = start; i < stop; i = i + incrementation){
            System.out.println(i);
        }
    }

    public static void whileloop(int num){
        int i = num;
        int digits = 0;
        int total = 0;

        while (i > 0){
            digits++;
            total += i%10;
            i /= 10;
        }

        System.out.println(digits + " digits totaling " + total);
    }

    public static void addHyphen(String words){
        words = words.toUpperCase();
        System.out.println(words);

        words = words.replace(" ", "-");
        System.out.println(words);
    }
    public static void main(String[] args){
        forloop(2,90,5);
        whileloop(234);
        addHyphen("Hello World");
    }
}