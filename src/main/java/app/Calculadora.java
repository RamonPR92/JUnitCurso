package app;

public class Calculadora {

    private int ans;

    public Calculadora(){
        ans = 0;
    }


    public int sumar(int a, int b){
        ans = a + b;
        return ans;
    }

    public int restar(int a, int b){
        ans = a - b;
        return ans;
    }

    public int dividir(int a, int b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a /b;
    }

    public int operacionLarga(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int add(int v){
        ans += v;
        return ans;
    }

    public  int sub(int v){
        ans -= v;
        return ans;
    }

    public int getAns(){
        return ans;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Calculadora calculadora = (Calculadora) obj;
        return ans == calculadora.ans;
    }
}
