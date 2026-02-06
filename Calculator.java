class Calculator{
    public static int add(int a,int b){
        return a+b;

    }
    public static int multiply(int a,int b){
        return a*b;

    }
    public static int square(int a){
        return a*a;

    }
    public static void main(String[] args) {
        int part1 = multiply(3,4);
        int part2 = multiply(5,7);
        int part3 = add(part1,part2);
        int answer1 = square(part3);
        System.out.println(answer1);


        int part4 = add(4,7);
        int part5 = add(8,3);
        int part6 = square(part4);
        int part7 = square(part5);
        int answer2 = add(part6,part7);
        System.out.println(answer2);
    }
}
