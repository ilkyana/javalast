 class ractangle{
double width;
double height;
ractangle(){
width = 1.0;
height = 1.0;
}
ractangle(double newwidth , double newheight){
width = newwidth;
height = newheight;
}
double getArea(){
return width*height ;
}
double getPerimeter(){
return 2*(width + height);
}

}
