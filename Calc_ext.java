import java.util.*

public class Calc_ext {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("Valor 1 \n");
        a = in.nextDouble();
        System.out.print("Valor 2  \n");
        b = in.nextDouble();
        System.out.print("Escolha a operação  " +
              "\n1.Adição" +
        		"\n2.Subtração" +
        		"\n3.Multiplicação" +
        		"\n4.Divisão" +
        		"\n#Número da operação \n");
        double somethin = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;
        if (somethin == addition) {
        	c = a + b;  
        	System.out.println(a + " + " + b + " = " + c);  }
        else if (somethin == subtraction)  {
        	c = a - b;  
        	System.out.println(a + " - " + b + " = " + c);	}
        else if (somethin == multiplication)	{
        	c = a * b;   
        	System.out.println(a + " * " + b + " = " + c);	}
        else if (somethin == division)   {
        	c = a / b;  
        	System.out.println(a + " / " + b + " = " + c);	}
        
    }
}