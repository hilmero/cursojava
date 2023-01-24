class ejemploJava3 {

	public static void main(String args[]) {
  //
  // Operadores aritmeticos
  // 	
	System.out.println("\nOperadores aritmeticos");
  double suma, resta, multiplica, divide;
  int resto;

  suma=2+2;
  resta=5-2;
	multiplica=3*3;
	divide=4/2;
	resto=5%3;
	
	System.out.println("suma:"+suma);
	System.out.println("resta:"+resta);	
	System.out.println("multiplica:"+multiplica);	
	System.out.println("divide:"+divide);	
	System.out.println("resto:"+resto);	
  //
  // Operadores unarios
  // 		
	int i =3;
	System.out.println("\nOperadores unarios");
	System.out.println(i++);
	System.out.println(i);
	i=3;
	System.out.println(++i);
	System.out.println(i);
  //
  // Operadores relacionales
  // 	
  System.out.println("\nOperadores relacionales");
  System.out.println(resto!=i);  // true
  System.out.println(5==3);      // false
  System.out.println(5!=3);      // true
   //
	// Operadores logicos
	//
	System.out.println("\nOperadores logicos");
  System.out.println((5 == 3)&&(5 > 3) );    // false
  System.out.println((5 == 3)||(5 > 3) );    // true
	//
	// Prioridades de los operadores
	//
	System.out.println("\nPrioridad de los Operadores");
	double y, j=2;
	y= 4/j+7*3;              // 23
  System.out.println(y);    
	y= 4/(j+7)*3;            // 1.3
  System.out.println(y);   
	y= 4/++j+7*3; 			     // 22.33
  System.out.println(y);   
	}
}
