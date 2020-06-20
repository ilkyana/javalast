class Stock{
String symbol;
String name;
double previousClosingPrice ;
double currentPrice;
 Stock(){
 symbol = "$";
 name = "Swati";
}
double getChangePercentage(){
return ((currentPrice-previousClosingPrice)/currentPrice) * 100 ;
}

}
