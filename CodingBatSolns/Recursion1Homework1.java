@author Macy Ramos

//Task 1: Factorial
  
public int factorial(int n) {
 if (n==1)
 {
   return 1;
 }
 return n*factorial(n-1);
}

//Task 2: BunnyEars
public int bunnyEars(int bunnies) {
  if(bunnies==0)
    return 0;
  return 2+bunnyEars(bunnies-1);  
    
}

//Task 3: Fibonacci
public int fibonacci(int n) {
  if(n<2)
    return n;
  else
    return fibonacci(n-1) + fibonacci(n-2);
}
