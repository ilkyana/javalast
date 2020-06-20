
import java.lang.*;
class RegularPolygon{
private int n;
private double side;
private double x ;
private double y ;
RegularPolygon(){
n = 3;
side = 1;
x = 0 ;
y = 0;
}
RegularPolygon( int newn){
newx = 0 ; 
newy = 0 ;
x = newx;
y = newy;
n = newn;
}
RegularPolygon(int newn , int newx , int newy ){
newn = n ;
newy = y;
newx = x;
}
int getn(){
return n;
}
double getx(){
return x;
}
double gety(){
return y;
}
double getside(){
return side;
}
void setx(int newx){
x = xnew;
}
void setn(int newn){
n = nnew;
}
void sety(int newy){
y = ynew;
}
void setside(double newside){
side = newside;
}
double getPerimeter(){
  return n * side;
}
double angle= Math.toRadians(180/n);
angle=Math.tan(angle); 
double getArea(){
return (n*side*side)/4*angle ; 

}
}
