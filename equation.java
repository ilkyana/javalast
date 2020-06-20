import java.lang.*; 
class  QuadraticEquation{
private double a;
private double b;
private double c;
QuadraticEquation(){
}
double geta(){
return a;
}
double getb(){
return b;
}
double getc(){
return c;
}
double getDiscriminant(){
return b*b - 4*a*c ;
}
double getRoot1(){
return ((-b)+Math.sqrt(b*b-4*a*c))/4*a ;
}
double getRoot2(){
return ((-b)-Math.sqrt(b*b-4*a*c))/4*a ;
}
}
